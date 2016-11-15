import org.antlr.v4.runtime.tree.ParseTreeProperty;
import java.util.*;

class varInfo{
	public Integer typeName = -1;
}

class funcInfo{
	public Integer typeName = -1 , retType = -1;
	public ArrayList paras = new ArrayList();
}

class classInfo{
	public Integer typeName = -1;
}

public class mxxCompiler extends mxxBaseListener{
	//public static Map<ParserRuleContext,ASTNode> AST = new HashMap<>();
	public static ParseTreeProperty<ASTNode> AST = new ParseTreeProperty<>();
	public Integer types=3, vars=0;
	mxxParser.CompilationUnitContext Root;
	public static Map<String,Integer> typeOf = new HashMap<>();
	
	@Override public void exitCompilationUnit(mxxParser.CompilationUnitContext ctx){
		//System.out.println("Analysis over.");
		Root = ctx;
		AST.put(ctx,AST.get(ctx.translationUnit()));
	}
	
	@Override public void exitPr_null(mxxParser.Pr_nullContext ctx){
		AST.put(ctx,new nulExpNode());
	}
	
	@Override public void exitPr_new(mxxParser.Pr_newContext ctx){
		typeNameNode lhs = (typeNameNode) AST.get(ctx.typeSpecifier());
		//System.out.println("new");
		//System.out.println(ctx.typeSpecifier().getText());	
		AST.put(ctx,new regNewNode(lhs));
	}
	
	@Override public void exitPr_id(mxxParser.Pr_idContext ctx){
		AST.put(ctx,new identifierNode(ctx.identifier().getText()));
	}
	
	@Override public void exitPr_intconst(mxxParser.Pr_intconstContext ctx){
		AST.put(ctx,new intconstNode(Integer.valueOf(ctx.IntegerLiteral().getText())));
	}
	
	@Override public void exitPr_boolconst(mxxParser.Pr_boolconstContext ctx){
		AST.put(ctx,new boolconstNode(ctx.BoolLiteral().getText()));
	}
	
	@Override public void exitPr_strconst(mxxParser.Pr_strconstContext ctx){
		AST.put(ctx,new strconstNode(ctx.StringLiteral().getText()));
	}
	
	@Override public void exitPr_exp(mxxParser.Pr_expContext ctx){
		AST.put(ctx,AST.get(ctx.expressionseq()));
	}
	
	@Override public void exitExpLinkAssign(mxxParser.ExpLinkAssignContext ctx){
		ExpNode lhs = (ExpNode) AST.get(ctx.expressionseq());
		ExpNode rhs = (ExpNode)	AST.get(ctx.assignmentExpression());
		AST.put(ctx,new expressionNode(lhs,rhs));
	}
	
	@Override public void exitExpToAssign(mxxParser.ExpToAssignContext ctx){
		AST.put(ctx,AST.get(ctx.assignmentExpression()));
	}
	
	@Override public void exitAssToLogicOr(mxxParser.AssToLogicOrContext ctx){
		AST.put(ctx,AST.get(ctx.logicalOrExpression()));
	}
	
	@Override public void exitUnaryLinkAss(mxxParser.UnaryLinkAssContext ctx){
		ExpNode lhs = (ExpNode) AST.get(ctx.unaryExpression());
		ExpNode rhs = (ExpNode) AST.get(ctx.assignmentExpression());
		AST.put(ctx,new assExpressionNode(lhs,rhs));
	}
	
	@Override public void exitSingleArrSuf(mxxParser.SingleArrSufContext ctx){
		AST.put(ctx,AST.get(ctx.indexExp()));
	}
	
	@Override public void exitArrSufSeqs(mxxParser.ArrSufSeqsContext ctx){
		indexExpNode lhs = (indexExpNode) AST.get(ctx.indexExp());
		ExpNode rhs = (ExpNode) AST.get(ctx.arrSufSeq());
		/*System.out.println("Creating sufseq");
		System.out.println(ctx.indexExp().getText());
		System.out.println(ctx.arrSufSeq().getText());
		System.out.println(rhs.getClass().getSimpleName());*/
		AST.put(ctx,new arrSufNode(lhs,rhs));
	}
	
	@Override public void exitEmptyindex(mxxParser.EmptyindexContext ctx){
		AST.put(ctx,new indexExpNode());
	}
	
	@Override public void exitContentindex(mxxParser.ContentindexContext ctx){
		indexExpNode cur = new indexExpNode();
		cur.lsNode = (ExpNode) AST.get(ctx.expressionseq());
		AST.put(ctx,cur);
	}
	
	@Override public void exitPostfixToPrimary(mxxParser.PostfixToPrimaryContext ctx){
		AST.put(ctx,AST.get(ctx.primaryExpression()));
	}
	
	@Override public void exitPostfix_dec(mxxParser.Postfix_decContext ctx){
		ExpNode lhs = (ExpNode) AST.get(ctx.postfixExpression2());
		postOpNode rhs = new postOpNode('-');
		AST.put(ctx,new postExpNode(lhs,rhs,0));
	}

	@Override public void exitPostfix_identi(mxxParser.Postfix_identiContext ctx) { 
		ExpNode lhs = (ExpNode) AST.get(ctx.postfixExpression2());
		if (ctx.LeftParen() == null){
			identifierNode rhs = new identifierNode(ctx.identifier().getText());
			AST.put(ctx,new postExpNode(lhs,rhs,3));
		}
		else{
			funcNameNode rhs = new funcNameNode();
			rhs.funcName = (identifierNode) AST.get(ctx.identifier());
			if (ctx.parameterList() != null)
				rhs.funcPara = (paraList) AST.get(ctx.parameterList());
			AST.put(ctx,new postExpNode(lhs,rhs,4));
		}
	}
	
	@Override public void exitPr_common(mxxParser.Pr_commonContext ctx){
		AST.put(ctx,AST.get(ctx.postfixExpression2()));
	}

	@Override public void exitPostfix_add(mxxParser.Postfix_addContext ctx){
		ExpNode lhs = (ExpNode) AST.get(ctx.postfixExpression2());
		postOpNode rhs = new postOpNode('+');
		AST.put(ctx,new postExpNode(lhs,rhs,0));
	}
	
	@Override public void exitPostfix_exp(mxxParser.Postfix_expContext ctx){
		ExpNode lhs = (ExpNode) AST.get(ctx.postfixExpression2());
		ExpNode rhs = (ExpNode) AST.get(ctx.arrSufSeq());
		AST.put(ctx,new postExpNode(lhs,rhs,1));
	}
	
	@Override public void exitPostfix_argu(mxxParser.Postfix_arguContext ctx){
		ExpNode lhs = (ExpNode) AST.get(ctx.postfixExpression2());
		ExpNode rhs = (ExpNode) AST.get(ctx.argumentExpressionList());
		//System.out.println("create under sit 2");
		//System.out.println(ctx.postfixExpression2().getText());
		//System.out.println(ctx.argumentExpressionList().getText());
		AST.put(ctx,new postExpNode(lhs,rhs,2));
	}
	
	@Override public void exitArguToassign(mxxParser.ArguToassignContext ctx){
		AST.put(ctx,AST.get(ctx.assignmentExpression()));
	}
	
	@Override public void exitArguLinkAssign(mxxParser.ArguLinkAssignContext ctx){
		ExpNode lhs = (ExpNode) AST.get(ctx.argumentExpressionList());
		ExpNode rhs = (ExpNode) AST.get(ctx.assignmentExpression());
		AST.put(ctx,new arguListNode(rhs,lhs));
	}
	
	@Override public void exitUnary_postfix(mxxParser.Unary_postfixContext ctx){
		AST.put(ctx,AST.get(ctx.postfixExpression()));
	}
	
	@Override public void exitUnary_inc(mxxParser.Unary_incContext ctx){
		unaryOpNode lhs = new unaryOpNode('a');
		ExpNode rhs = (ExpNode) AST.get(ctx.unaryExpression());
		AST.put(ctx,new unaryExpNode(lhs,rhs));
	}
	
	@Override public void exitUnary_dec(mxxParser.Unary_decContext ctx){
		unaryOpNode lhs = new unaryOpNode('d');
		ExpNode rhs = (ExpNode) AST.get(ctx.unaryExpression());
		AST.put(ctx,new unaryExpNode(lhs,rhs));
	}
	
	@Override public void exitUnary_other(mxxParser.Unary_otherContext ctx){
		unaryOpNode lhs = (unaryOpNode) AST.get(ctx.unaryOperator());
		ExpNode rhs = (ExpNode) AST.get(ctx.unaryExpression());
		AST.put(ctx,new unaryExpNode(lhs,rhs));
	}
	
	@Override public void exitUnaryOperator(mxxParser.UnaryOperatorContext ctx){
		AST.put(ctx,new unaryOpNode(ctx.getText().charAt(0)));
	}
	
	@Override public void exitMulti_modu(mxxParser.Multi_moduContext ctx){
		ExpNode lhs = (ExpNode) AST.get(ctx.multiplicativeExpression());
		ExpNode rhs = (ExpNode) AST.get(ctx.unaryExpression());
		AST.put(ctx,new multiplicativeExpNode(lhs,rhs,2));
	}
	
	@Override public void exitMultiToUnary(mxxParser.MultiToUnaryContext ctx){
		AST.put(ctx,AST.get(ctx.unaryExpression()));
	}
	
	@Override public void exitMulti_mult(mxxParser.Multi_multContext ctx){
		ExpNode lhs = (ExpNode) AST.get(ctx.multiplicativeExpression());
		ExpNode rhs = (ExpNode) AST.get(ctx.unaryExpression());
		AST.put(ctx,new multiplicativeExpNode(lhs,rhs,0));
	}

	@Override public void exitMulti_div(mxxParser.Multi_divContext ctx){
		ExpNode lhs = (ExpNode) AST.get(ctx.multiplicativeExpression());
		ExpNode rhs = (ExpNode) AST.get(ctx.unaryExpression());
		AST.put(ctx,new multiplicativeExpNode(lhs,rhs,1));
	}
	
	@Override public void exitAdd_minus(mxxParser.Add_minusContext ctx){
		ExpNode lhs = (ExpNode) AST.get(ctx.additiveExpression());
		ExpNode rhs = (ExpNode) AST.get(ctx.multiplicativeExpression());
		AST.put(ctx,new additiveExpNode(lhs,rhs,1));
	}
	
	@Override public void exitAddTomulti(mxxParser.AddTomultiContext ctx){
		AST.put(ctx,AST.get(ctx.multiplicativeExpression()));
	}
	
	@Override public void exitAdd_plus(mxxParser.Add_plusContext ctx){
		ExpNode lhs = (ExpNode) AST.get(ctx.additiveExpression());
		ExpNode rhs = (ExpNode) AST.get(ctx.multiplicativeExpression());
		AST.put(ctx,new additiveExpNode(lhs,rhs,0));
	}
	
	@Override public void exitShiftToAdd(mxxParser.ShiftToAddContext ctx){
		AST.put(ctx,AST.get(ctx.additiveExpression()));
	}
	
	@Override public void exitRightShift(mxxParser.RightShiftContext ctx){
		ExpNode lhs = (ExpNode) AST.get(ctx.shiftExpression());
		ExpNode rhs = (ExpNode) AST.get(ctx.additiveExpression());
		AST.put(ctx,new shiftExpNode(lhs,rhs,1));
	}
	
	@Override public void exitLeftShift(mxxParser.LeftShiftContext ctx){
		ExpNode lhs = (ExpNode) AST.get(ctx.shiftExpression());
		ExpNode rhs = (ExpNode) AST.get(ctx.additiveExpression());
		AST.put(ctx,new shiftExpNode(lhs,rhs,0));
	}
	
	@Override public void exitRela_less(mxxParser.Rela_lessContext ctx){
		ExpNode lhs = (ExpNode) AST.get(ctx.relationalExpression());
		ExpNode rhs = (ExpNode) AST.get(ctx.shiftExpression());
		AST.put(ctx,new relaExpNode(lhs,rhs,0));
	}
	
	@Override public void exitRela_greater(mxxParser.Rela_greaterContext ctx){
		ExpNode lhs = (ExpNode) AST.get(ctx.relationalExpression());
		ExpNode rhs = (ExpNode) AST.get(ctx.shiftExpression());
		AST.put(ctx,new relaExpNode(lhs,rhs,1));
	}
	
	@Override public void exitRelaToShift(mxxParser.RelaToShiftContext ctx){
		AST.put(ctx,AST.get(ctx.shiftExpression()));
	}
	
	@Override public void exitRela_less_equ(mxxParser.Rela_less_equContext ctx){
		ExpNode lhs = (ExpNode) AST.get(ctx.relationalExpression());
		ExpNode rhs = (ExpNode) AST.get(ctx.shiftExpression());
		AST.put(ctx,new relaExpNode(lhs,rhs,2));
	}
	
	@Override public void exitRela_greater_equ(mxxParser.Rela_greater_equContext ctx){
		ExpNode lhs = (ExpNode) AST.get(ctx.relationalExpression());
		ExpNode rhs = (ExpNode) AST.get(ctx.shiftExpression());
		AST.put(ctx,new relaExpNode(lhs,rhs,3));
	}
	
	@Override public void exitEqualSameRela(mxxParser.EqualSameRelaContext ctx){
		ExpNode lhs = (ExpNode) AST.get(ctx.equalityExpression());
		ExpNode rhs = (ExpNode) AST.get(ctx.relationalExpression());
		AST.put(ctx,new equalExpNode(lhs,rhs,0));
	}
	
	@Override public void exitEqualDifRela(mxxParser.EqualDifRelaContext ctx){
		ExpNode lhs = (ExpNode) AST.get(ctx.equalityExpression());
		ExpNode rhs = (ExpNode) AST.get(ctx.relationalExpression());
		AST.put(ctx,new equalExpNode(lhs,rhs,1));		
	}
	
	@Override public void exitEqualToRela(mxxParser.EqualToRelaContext ctx){
		AST.put(ctx,AST.get(ctx.relationalExpression()));
	}
	
	@Override public void exitAndToEqual(mxxParser.AndToEqualContext ctx){
		AST.put(ctx,AST.get(ctx.equalityExpression()));
	}
	
	@Override public void exitAndLinkEqual(mxxParser.AndLinkEqualContext ctx){
		ExpNode lhs = (ExpNode) AST.get(ctx.andExpression());
		ExpNode rhs = (ExpNode) AST.get(ctx.equalityExpression());
		AST.put(ctx,new andExpNode(lhs,rhs));
	}
	
	@Override public void exitEOrLinkAnd(mxxParser.EOrLinkAndContext ctx){
		ExpNode lhs = (ExpNode) AST.get(ctx.exclusiveOrExpression());
		ExpNode rhs = (ExpNode) AST.get(ctx.andExpression());
		AST.put(ctx,new eOrExpNode(lhs,rhs));
	}
	
	@Override public void exitEOrtoAnd(mxxParser.EOrtoAndContext ctx){
		AST.put(ctx,AST.get(ctx.andExpression()));
	}
	
	@Override public void exitIOrToeOr(mxxParser.IOrToeOrContext ctx){
		AST.put(ctx,AST.get(ctx.exclusiveOrExpression()));
	}
	
	@Override public void exitIOrLinkeOr(mxxParser.IOrLinkeOrContext ctx){
		ExpNode lhs = (ExpNode) AST.get(ctx.inclusiveOrExpression());
		ExpNode rhs = (ExpNode) AST.get(ctx.exclusiveOrExpression());
		AST.put(ctx,new iOrExpNode(lhs,rhs));
	}
	
	@Override public void exitLogicAndToiOr(mxxParser.LogicAndToiOrContext ctx){
		AST.put(ctx,AST.get(ctx.inclusiveOrExpression()));
	}
	
	@Override public void exitLogicAndLinkiOr(mxxParser.LogicAndLinkiOrContext ctx){
		ExpNode lhs = (ExpNode) AST.get(ctx.logicalAndExpression());
		ExpNode rhs = (ExpNode) AST.get(ctx.inclusiveOrExpression());
		AST.put(ctx,new logicAndExpNode(lhs,rhs));
	}
	
	@Override public void exitLogicOrLinkAnd(mxxParser.LogicOrLinkAndContext ctx){
		ExpNode lhs = (ExpNode) AST.get(ctx.logicalOrExpression());
		ExpNode rhs = (ExpNode)	AST.get(ctx.logicalAndExpression());
		AST.put(ctx,new logicOrExpNode(lhs,rhs));
	}
	
	@Override public void exitLogicOrToAnd(mxxParser.LogicOrToAndContext ctx){
		AST.put(ctx,AST.get(ctx.logicalAndExpression()));
	}
	
	@Override public void exitType_void(mxxParser.Type_voidContext ctx){
		if (ctx.arrSufSeq() == null) AST.put(ctx,new commonTypeName("void"));
		else{
			identifierNode lhs = new identifierNode("void");
			ExpNode rhs = (ExpNode) AST.get(ctx.arrSufSeq());
			AST.put(ctx,new arrTypeName(lhs,rhs));
		}
	}
	
	@Override public void exitType_int(mxxParser.Type_intContext ctx){
		if (ctx.arrSufSeq() == null) AST.put(ctx,new commonTypeName("int"));
		else{
			identifierNode lhs = new identifierNode("int");
			ExpNode rhs = (ExpNode) AST.get(ctx.arrSufSeq());
			AST.put(ctx,new arrTypeName(lhs,rhs));
		}
	}

	@Override public void exitType_bool(mxxParser.Type_boolContext ctx){
		if (ctx.arrSufSeq() == null) AST.put(ctx,new commonTypeName("bool"));
		else{
			identifierNode lhs = new identifierNode("bool");
			ExpNode rhs = (ExpNode) AST.get(ctx.arrSufSeq());
			AST.put(ctx,new arrTypeName(lhs,rhs));
		}
	}
	
	@Override public void exitType_String(mxxParser.Type_StringContext ctx){
		if (ctx.arrSufSeq() == null) AST.put(ctx,new commonTypeName("string"));
		else{
			identifierNode lhs = new identifierNode("string");
			ExpNode rhs = (ExpNode) AST.get(ctx.arrSufSeq());
			AST.put(ctx,new arrTypeName(lhs,rhs));
		}
	}
	
	@Override public void exitType_Other(mxxParser.Type_OtherContext ctx){
		if (ctx.arrSufSeq() == null) AST.put(ctx,new commonTypeName(ctx.identifier().getText()));
		else{
			identifierNode lhs = (identifierNode) AST.get(ctx.identifier());
			ExpNode rhs = (ExpNode) AST.get(ctx.arrSufSeq());
			AST.put(ctx,new arrTypeName(lhs,rhs));
		}
	}
	
	@Override public void exitTo_comp_stmt(mxxParser.To_comp_stmtContext ctx){
		AST.put(ctx,AST.get(ctx.compoundStatement()));
	}
	
	@Override public void exitTo_exp_stmt(mxxParser.To_exp_stmtContext ctx){
		AST.put(ctx,AST.get(ctx.expressionStatement()));
	}
	
	@Override public void exitTo_select_stmt(mxxParser.To_select_stmtContext ctx){
		AST.put(ctx,AST.get(ctx.selectionStatement()));
	}
	
	@Override public void exitTo_iter_stmt(mxxParser.To_iter_stmtContext ctx){
		AST.put(ctx,AST.get(ctx.iterationStatement()));
	}
	
	@Override public void exitTo_jump_stmt(mxxParser.To_jump_stmtContext ctx){
		AST.put(ctx,AST.get(ctx.jumpStatement()));
	}

	@Override public void exitExpressionStatement(mxxParser.ExpressionStatementContext ctx){
		if (ctx.expressionseq() != null){
			ExpNode lhs = (ExpNode) AST.get(ctx.expressionseq());
			AST.put(ctx,new expStmtNode(lhs,new semiMark()));
		}
		else{
			AST.put(ctx,new semiMark());
		}
	}
	
	@Override public void exitSelectionStatement(mxxParser.SelectionStatementContext ctx){
		selectStmtNode cur = new selectStmtNode();
		cur.condition = (ExpNode) AST.get(ctx.expressionseq());
		cur.lsNode = (StmtNode)	AST.get(ctx.blockItem(0));
		if (ctx.Else()!=null){
			cur.rsNode = (StmtNode) AST.get(ctx.blockItem(1));
		}
		else{
			cur.rsNode = null;
		}
		AST.put(ctx,cur);
	}
	
	@Override public void exitExtraDeclaration(mxxParser.ExtraDeclarationContext ctx){
		exdeclareNode cur = new exdeclareNode();
		cur.lsNode = (typeNameNode)	AST.get(ctx.typeSpecifier());
		cur.rsNode = (identifierNode) AST.get(ctx.identifier());
		if (ctx.Assign()!=null){
			cur.oriKey = (ExpNode) AST.get(ctx.assignmentExpression());
		}
		else{
			cur.oriKey = null;
		}
		AST.put(ctx,cur);
	}
	
	@Override public void exitDeclaration(mxxParser.DeclarationContext ctx){
		declareNode cur = new declareNode();
		cur.lsNode = (typeNameNode)	AST.get(ctx.typeSpecifier());
		cur.rsNode = (identifierNode) AST.get(ctx.identifier());
		if (ctx.Assign()!=null){
			cur.oriKey = (ExpNode) AST.get(ctx.assignmentExpression());
		}
		else{
			cur.oriKey = null;
		}
		AST.put(ctx,cur);
	}

	@Override public void exitBlck_single(mxxParser.Blck_singleContext ctx){
		AST.put(ctx,AST.get(ctx.blockItem()));
	}
	
	@Override public void exitBlck_expand(mxxParser.Blck_expandContext ctx){
		StmtNode lhs = (StmtNode) AST.get(ctx.blockItemList());
		StmtNode rhs = (StmtNode) AST.get(ctx.blockItem());
		AST.put(ctx,new blockListNode(lhs,rhs));
	}
	
	@Override public void exitBlckunit_declare(mxxParser.Blckunit_declareContext ctx){
		AST.put(ctx,AST.get(ctx.declaration()));
	}
	
	@Override public void exitBlckunit_common(mxxParser.Blckunit_commonContext ctx){
		AST.put(ctx,AST.get(ctx.statement()));
	}
	
	@Override public void exitCompoundStatement(mxxParser.CompoundStatementContext ctx){
		AST.put(ctx,new compoundStmtNode((StmtNode) AST.get(ctx.blockItemList()),new doubleBrace()));
	}
	
	@Override public void exitIterationStatement(mxxParser.IterationStatementContext ctx){
		iterStmtNode cur = new iterStmtNode();
		if (ctx.While()!=null){
			cur.iterName = "while";
			cur.exp1 = (ExpNode) AST.get(ctx.assignmentExpression(0));
			cur.exp2 = cur.exp3 = null;
			cur.lsNode = (StmtNode) AST.get(ctx.blockItem());
		}
		else{
			cur.iterName = "for";
			String st = ctx.getText();
			int id = 0, po = 4;
			if	(st.charAt(po) != ';'){	
				cur.exp1 = (ExpNode) AST.get(ctx.assignmentExpression(id));
				//System.out.println("1 "+ctx.assignmentExpression(id).getText()+" "+cur.exp1.getClass().getSimpleName());
				po += ctx.assignmentExpression(id).getText().length() +1;
				id++;
			}
			else{
				cur.exp1 = null;
				po++;
			}
			
			if	(st.charAt(po) != ';'){
				cur.exp2 = (ExpNode) AST.get(ctx.assignmentExpression(id));
				//System.out.println("2 "+ctx.assignmentExpression(1).getText()+" "+cur.exp2.getClass().getSimpleName());
				po += ctx.assignmentExpression(id).getText().length() +1;
				id++;
			}
			else{
				cur.exp2 = null;
				po++;
			}
			
			if	(st.charAt(po) != ')'){
				cur.exp3 = (ExpNode) AST.get(ctx.assignmentExpression(id));
				//System.out.println("3 "+ctx.assignmentExpression(0).getText()+" "+cur.exp3.getClass().getSimpleName());
			}
			else	cur.exp3 = null;
			cur.lsNode = (StmtNode) AST.get(ctx.blockItem());
			//System.out.println(cur.lsNode.getClass().getSimpleName());
			//System.out.println(ctx.statement().getText());
		}
		AST.put(ctx,cur);
	}
	
	@Override public void exitJumpStatement(mxxParser.JumpStatementContext ctx){
		jumpStmtNode cur = new jumpStmtNode();
		cur.retExp = null;
		if (ctx.Continue()!=null){
			cur.jumpType = 0;
		}
		if (ctx.Break()!=null){
			cur.jumpType = 1;
		}
		if (ctx.Return()!=null){
			cur.jumpType = 2;
			cur.retExp = (ExpNode) AST.get(ctx.assignmentExpression());
		}
		AST.put(ctx,cur);
	}

	@Override public void exitTrans_expand(mxxParser.Trans_expandContext ctx){
		transUnitNode cur = new transUnitNode();
		cur.lsNode = (DecNode) AST.get(ctx.translationUnit());
		cur.rsNode = (DecNode) AST.get(ctx.externalDeclaration());
		AST.put(ctx,cur);
	}

	@Override public void exitTrans_unit(mxxParser.Trans_unitContext ctx){
		AST.put(ctx,AST.get(ctx.externalDeclaration()));
	}

	@Override public void exitFuncDef(mxxParser.FuncDefContext ctx){
		AST.put(ctx,AST.get(ctx.functionDefinition()));
	}

	@Override public void exitClassDef(mxxParser.ClassDefContext ctx){
		AST.put(ctx,AST.get(ctx.classDefinition()));
	}

	@Override public void exitVarDef(mxxParser.VarDefContext ctx){
		AST.put(ctx,AST.get(ctx.extraDeclaration()));
	}
	
	@Override public void exitFunctionDefinition(mxxParser.FunctionDefinitionContext ctx){
		funcDefNode cur = new funcDefNode();
		cur.funcType = (typeNameNode) AST.get(ctx.typeSpecifier());
		cur.funcName = (identifierNode) AST.get(ctx.identifier());
		if (ctx.parameterList()!=null){
			cur.funcPara = (DecNode) AST.get(ctx.parameterList());
		}
		else	cur.funcPara = null;
		if	(ctx.blockItemList()!= null)
			cur.funcStmt = (StmtNode) AST.get(ctx.blockItemList());
		else	cur.funcStmt = null;
		AST.put(ctx,cur);
	}
	
	@Override public void exitPara_unit(mxxParser.Para_unitContext ctx){
		AST.put(ctx,AST.get(ctx.parameter()));
	}
	
	@Override public void exitPara_expand(mxxParser.Para_expandContext ctx){
		AST.put(ctx,new paraList((DecNode) AST.get(ctx.parameter()),(DecNode) AST.get(ctx.parameterList())));
	}
	
	@Override public void exitParameter(mxxParser.ParameterContext ctx){
		AST.put(ctx,new paraUnit((typeNameNode) AST.get(ctx.typeSpecifier()),(identifierNode) AST.get(ctx.identifier())));
	}
	
	@Override public void exitClassDefinition(mxxParser.ClassDefinitionContext ctx){
		classDefNode cur = new classDefNode();
		cur.lsNode = (identifierNode) AST.get(ctx.identifier());
		cur.rsNode = (DecNode) AST.get(ctx.classDeclarationList());
		AST.put(ctx,cur);
	}
	
	@Override public void exitClassdef_expand(mxxParser.Classdef_expandContext ctx){
		AST.put(ctx,new classDecList((DecNode)AST.get(ctx.classdeclaration()),(DecNode)AST.get(ctx.classDeclarationList())));
	}
	
	@Override public void exitClassdef_unit(mxxParser.Classdef_unitContext ctx){
		AST.put(ctx,AST.get(ctx.classdeclaration()));
	}
	
	@Override public void exitClassdeclaration(mxxParser.ClassdeclarationContext ctx){
		AST.put(ctx,new classDefUnit((typeNameNode)AST.get(ctx.typeSpecifier()),(identifierNode)AST.get(ctx.identifier())));
	}
	
	@Override public void exitIdentifier(mxxParser.IdentifierContext ctx){
		AST.put(ctx,new identifierNode(ctx.getText()));
	}
}
