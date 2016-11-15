// Generated from F:/mxx/src\mxx.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link mxxParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface mxxVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link mxxParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(mxxParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pr_id}
	 * labeled alternative in {@link mxxParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPr_id(mxxParser.Pr_idContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pr_intconst}
	 * labeled alternative in {@link mxxParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPr_intconst(mxxParser.Pr_intconstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pr_strconst}
	 * labeled alternative in {@link mxxParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPr_strconst(mxxParser.Pr_strconstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pr_boolconst}
	 * labeled alternative in {@link mxxParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPr_boolconst(mxxParser.Pr_boolconstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pr_exp}
	 * labeled alternative in {@link mxxParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPr_exp(mxxParser.Pr_expContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pr_null}
	 * labeled alternative in {@link mxxParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPr_null(mxxParser.Pr_nullContext ctx);
	/**
	 * Visit a parse tree produced by the {@code postfixToPrimary}
	 * labeled alternative in {@link mxxParser#postfixExpression2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixToPrimary(mxxParser.PostfixToPrimaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code postfix_dec}
	 * labeled alternative in {@link mxxParser#postfixExpression2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfix_dec(mxxParser.Postfix_decContext ctx);
	/**
	 * Visit a parse tree produced by the {@code postfix_identi}
	 * labeled alternative in {@link mxxParser#postfixExpression2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfix_identi(mxxParser.Postfix_identiContext ctx);
	/**
	 * Visit a parse tree produced by the {@code postfix_add}
	 * labeled alternative in {@link mxxParser#postfixExpression2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfix_add(mxxParser.Postfix_addContext ctx);
	/**
	 * Visit a parse tree produced by the {@code postfix_exp}
	 * labeled alternative in {@link mxxParser#postfixExpression2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfix_exp(mxxParser.Postfix_expContext ctx);
	/**
	 * Visit a parse tree produced by the {@code postfix_argu}
	 * labeled alternative in {@link mxxParser#postfixExpression2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfix_argu(mxxParser.Postfix_arguContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pr_new}
	 * labeled alternative in {@link mxxParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPr_new(mxxParser.Pr_newContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pr_common}
	 * labeled alternative in {@link mxxParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPr_common(mxxParser.Pr_commonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arguToassign}
	 * labeled alternative in {@link mxxParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguToassign(mxxParser.ArguToassignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arguLinkAssign}
	 * labeled alternative in {@link mxxParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguLinkAssign(mxxParser.ArguLinkAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unary_postfix}
	 * labeled alternative in {@link mxxParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_postfix(mxxParser.Unary_postfixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unary_inc}
	 * labeled alternative in {@link mxxParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_inc(mxxParser.Unary_incContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unary_dec}
	 * labeled alternative in {@link mxxParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_dec(mxxParser.Unary_decContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unary_other}
	 * labeled alternative in {@link mxxParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_other(mxxParser.Unary_otherContext ctx);
	/**
	 * Visit a parse tree produced by {@link mxxParser#unaryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOperator(mxxParser.UnaryOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multi_modu}
	 * labeled alternative in {@link mxxParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulti_modu(mxxParser.Multi_moduContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiToUnary}
	 * labeled alternative in {@link mxxParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiToUnary(mxxParser.MultiToUnaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multi_mult}
	 * labeled alternative in {@link mxxParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulti_mult(mxxParser.Multi_multContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multi_div}
	 * labeled alternative in {@link mxxParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulti_div(mxxParser.Multi_divContext ctx);
	/**
	 * Visit a parse tree produced by the {@code add_minus}
	 * labeled alternative in {@link mxxParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_minus(mxxParser.Add_minusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addTomulti}
	 * labeled alternative in {@link mxxParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddTomulti(mxxParser.AddTomultiContext ctx);
	/**
	 * Visit a parse tree produced by the {@code add_plus}
	 * labeled alternative in {@link mxxParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_plus(mxxParser.Add_plusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code shiftToAdd}
	 * labeled alternative in {@link mxxParser#shiftExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftToAdd(mxxParser.ShiftToAddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rightShift}
	 * labeled alternative in {@link mxxParser#shiftExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRightShift(mxxParser.RightShiftContext ctx);
	/**
	 * Visit a parse tree produced by the {@code leftShift}
	 * labeled alternative in {@link mxxParser#shiftExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftShift(mxxParser.LeftShiftContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rela_less}
	 * labeled alternative in {@link mxxParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRela_less(mxxParser.Rela_lessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rela_greater}
	 * labeled alternative in {@link mxxParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRela_greater(mxxParser.Rela_greaterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relaToShift}
	 * labeled alternative in {@link mxxParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelaToShift(mxxParser.RelaToShiftContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rela_less_equ}
	 * labeled alternative in {@link mxxParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRela_less_equ(mxxParser.Rela_less_equContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rela_greater_equ}
	 * labeled alternative in {@link mxxParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRela_greater_equ(mxxParser.Rela_greater_equContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalSameRela}
	 * labeled alternative in {@link mxxParser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualSameRela(mxxParser.EqualSameRelaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalDifRela}
	 * labeled alternative in {@link mxxParser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualDifRela(mxxParser.EqualDifRelaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalToRela}
	 * labeled alternative in {@link mxxParser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualToRela(mxxParser.EqualToRelaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andToEqual}
	 * labeled alternative in {@link mxxParser#andExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndToEqual(mxxParser.AndToEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andLinkEqual}
	 * labeled alternative in {@link mxxParser#andExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndLinkEqual(mxxParser.AndLinkEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eOrLinkAnd}
	 * labeled alternative in {@link mxxParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEOrLinkAnd(mxxParser.EOrLinkAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eOrtoAnd}
	 * labeled alternative in {@link mxxParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEOrtoAnd(mxxParser.EOrtoAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code iOrToeOr}
	 * labeled alternative in {@link mxxParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIOrToeOr(mxxParser.IOrToeOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code iOrLinkeOr}
	 * labeled alternative in {@link mxxParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIOrLinkeOr(mxxParser.IOrLinkeOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicAndToiOr}
	 * labeled alternative in {@link mxxParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicAndToiOr(mxxParser.LogicAndToiOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicAndLinkiOr}
	 * labeled alternative in {@link mxxParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicAndLinkiOr(mxxParser.LogicAndLinkiOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicOrLinkAnd}
	 * labeled alternative in {@link mxxParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicOrLinkAnd(mxxParser.LogicOrLinkAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicOrToAnd}
	 * labeled alternative in {@link mxxParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicOrToAnd(mxxParser.LogicOrToAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assToLogicOr}
	 * labeled alternative in {@link mxxParser#assignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssToLogicOr(mxxParser.AssToLogicOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryLinkAss}
	 * labeled alternative in {@link mxxParser#assignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryLinkAss(mxxParser.UnaryLinkAssContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expLinkAssign}
	 * labeled alternative in {@link mxxParser#expressionseq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpLinkAssign(mxxParser.ExpLinkAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expToAssign}
	 * labeled alternative in {@link mxxParser#expressionseq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpToAssign(mxxParser.ExpToAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code type_void}
	 * labeled alternative in {@link mxxParser#typeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_void(mxxParser.Type_voidContext ctx);
	/**
	 * Visit a parse tree produced by the {@code type_int}
	 * labeled alternative in {@link mxxParser#typeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_int(mxxParser.Type_intContext ctx);
	/**
	 * Visit a parse tree produced by the {@code type_bool}
	 * labeled alternative in {@link mxxParser#typeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_bool(mxxParser.Type_boolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code type_String}
	 * labeled alternative in {@link mxxParser#typeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_String(mxxParser.Type_StringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code type_Other}
	 * labeled alternative in {@link mxxParser#typeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_Other(mxxParser.Type_OtherContext ctx);
	/**
	 * Visit a parse tree produced by the {@code emptyindex}
	 * labeled alternative in {@link mxxParser#indexExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyindex(mxxParser.EmptyindexContext ctx);
	/**
	 * Visit a parse tree produced by the {@code contentindex}
	 * labeled alternative in {@link mxxParser#indexExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContentindex(mxxParser.ContentindexContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleArrSuf}
	 * labeled alternative in {@link mxxParser#arrSufSeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleArrSuf(mxxParser.SingleArrSufContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrSufSeqs}
	 * labeled alternative in {@link mxxParser#arrSufSeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrSufSeqs(mxxParser.ArrSufSeqsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code to_comp_stmt}
	 * labeled alternative in {@link mxxParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTo_comp_stmt(mxxParser.To_comp_stmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code to_exp_stmt}
	 * labeled alternative in {@link mxxParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTo_exp_stmt(mxxParser.To_exp_stmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code to_select_stmt}
	 * labeled alternative in {@link mxxParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTo_select_stmt(mxxParser.To_select_stmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code to_iter_stmt}
	 * labeled alternative in {@link mxxParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTo_iter_stmt(mxxParser.To_iter_stmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code to_jump_stmt}
	 * labeled alternative in {@link mxxParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTo_jump_stmt(mxxParser.To_jump_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link mxxParser#compoundStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStatement(mxxParser.CompoundStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blck_single}
	 * labeled alternative in {@link mxxParser#blockItemList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlck_single(mxxParser.Blck_singleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blck_expand}
	 * labeled alternative in {@link mxxParser#blockItemList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlck_expand(mxxParser.Blck_expandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blckunit_declare}
	 * labeled alternative in {@link mxxParser#blockItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlckunit_declare(mxxParser.Blckunit_declareContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blckunit_common}
	 * labeled alternative in {@link mxxParser#blockItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlckunit_common(mxxParser.Blckunit_commonContext ctx);
	/**
	 * Visit a parse tree produced by {@link mxxParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(mxxParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link mxxParser#selectionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectionStatement(mxxParser.SelectionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link mxxParser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterationStatement(mxxParser.IterationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link mxxParser#jumpStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJumpStatement(mxxParser.JumpStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code trans_expand}
	 * labeled alternative in {@link mxxParser#translationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrans_expand(mxxParser.Trans_expandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code trans_unit}
	 * labeled alternative in {@link mxxParser#translationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrans_unit(mxxParser.Trans_unitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcDef}
	 * labeled alternative in {@link mxxParser#externalDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDef(mxxParser.FuncDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code classDef}
	 * labeled alternative in {@link mxxParser#externalDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDef(mxxParser.ClassDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varDef}
	 * labeled alternative in {@link mxxParser#externalDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDef(mxxParser.VarDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link mxxParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(mxxParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link mxxParser#extraDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtraDeclaration(mxxParser.ExtraDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link mxxParser#functionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinition(mxxParser.FunctionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code para_unit}
	 * labeled alternative in {@link mxxParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPara_unit(mxxParser.Para_unitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code para_expand}
	 * labeled alternative in {@link mxxParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPara_expand(mxxParser.Para_expandContext ctx);
	/**
	 * Visit a parse tree produced by {@link mxxParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(mxxParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link mxxParser#classDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDefinition(mxxParser.ClassDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code classdef_unit}
	 * labeled alternative in {@link mxxParser#classDeclarationList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassdef_unit(mxxParser.Classdef_unitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code classdef_expand}
	 * labeled alternative in {@link mxxParser#classDeclarationList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassdef_expand(mxxParser.Classdef_expandContext ctx);
	/**
	 * Visit a parse tree produced by {@link mxxParser#classdeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassdeclaration(mxxParser.ClassdeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link mxxParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(mxxParser.IdentifierContext ctx);
}