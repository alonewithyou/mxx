// Generated from mxx.g4 by ANTLR 4.5
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link mxxParser}.
 */
public interface mxxListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link mxxParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(mxxParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link mxxParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(mxxParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code emptyindex}
	 * labeled alternative in {@link mxxParser#indexExp}.
	 * @param ctx the parse tree
	 */
	void enterEmptyindex(mxxParser.EmptyindexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code emptyindex}
	 * labeled alternative in {@link mxxParser#indexExp}.
	 * @param ctx the parse tree
	 */
	void exitEmptyindex(mxxParser.EmptyindexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code contentindex}
	 * labeled alternative in {@link mxxParser#indexExp}.
	 * @param ctx the parse tree
	 */
	void enterContentindex(mxxParser.ContentindexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code contentindex}
	 * labeled alternative in {@link mxxParser#indexExp}.
	 * @param ctx the parse tree
	 */
	void exitContentindex(mxxParser.ContentindexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleArrSuf}
	 * labeled alternative in {@link mxxParser#arrSufSeq}.
	 * @param ctx the parse tree
	 */
	void enterSingleArrSuf(mxxParser.SingleArrSufContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleArrSuf}
	 * labeled alternative in {@link mxxParser#arrSufSeq}.
	 * @param ctx the parse tree
	 */
	void exitSingleArrSuf(mxxParser.SingleArrSufContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrSufSeqs}
	 * labeled alternative in {@link mxxParser#arrSufSeq}.
	 * @param ctx the parse tree
	 */
	void enterArrSufSeqs(mxxParser.ArrSufSeqsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrSufSeqs}
	 * labeled alternative in {@link mxxParser#arrSufSeq}.
	 * @param ctx the parse tree
	 */
	void exitArrSufSeqs(mxxParser.ArrSufSeqsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pr_id}
	 * labeled alternative in {@link mxxParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPr_id(mxxParser.Pr_idContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pr_id}
	 * labeled alternative in {@link mxxParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPr_id(mxxParser.Pr_idContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pr_intconst}
	 * labeled alternative in {@link mxxParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPr_intconst(mxxParser.Pr_intconstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pr_intconst}
	 * labeled alternative in {@link mxxParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPr_intconst(mxxParser.Pr_intconstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pr_strconst}
	 * labeled alternative in {@link mxxParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPr_strconst(mxxParser.Pr_strconstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pr_strconst}
	 * labeled alternative in {@link mxxParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPr_strconst(mxxParser.Pr_strconstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pr_boolconst}
	 * labeled alternative in {@link mxxParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPr_boolconst(mxxParser.Pr_boolconstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pr_boolconst}
	 * labeled alternative in {@link mxxParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPr_boolconst(mxxParser.Pr_boolconstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pr_exp}
	 * labeled alternative in {@link mxxParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPr_exp(mxxParser.Pr_expContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pr_exp}
	 * labeled alternative in {@link mxxParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPr_exp(mxxParser.Pr_expContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pr_null}
	 * labeled alternative in {@link mxxParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPr_null(mxxParser.Pr_nullContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pr_null}
	 * labeled alternative in {@link mxxParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPr_null(mxxParser.Pr_nullContext ctx);
	/**
	 * Enter a parse tree produced by the {@code postfixToPrimary}
	 * labeled alternative in {@link mxxParser#postfixExpression2}.
	 * @param ctx the parse tree
	 */
	void enterPostfixToPrimary(mxxParser.PostfixToPrimaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code postfixToPrimary}
	 * labeled alternative in {@link mxxParser#postfixExpression2}.
	 * @param ctx the parse tree
	 */
	void exitPostfixToPrimary(mxxParser.PostfixToPrimaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code postfix_dec}
	 * labeled alternative in {@link mxxParser#postfixExpression2}.
	 * @param ctx the parse tree
	 */
	void enterPostfix_dec(mxxParser.Postfix_decContext ctx);
	/**
	 * Exit a parse tree produced by the {@code postfix_dec}
	 * labeled alternative in {@link mxxParser#postfixExpression2}.
	 * @param ctx the parse tree
	 */
	void exitPostfix_dec(mxxParser.Postfix_decContext ctx);
	/**
	 * Enter a parse tree produced by the {@code postfix_identi}
	 * labeled alternative in {@link mxxParser#postfixExpression2}.
	 * @param ctx the parse tree
	 */
	void enterPostfix_identi(mxxParser.Postfix_identiContext ctx);
	/**
	 * Exit a parse tree produced by the {@code postfix_identi}
	 * labeled alternative in {@link mxxParser#postfixExpression2}.
	 * @param ctx the parse tree
	 */
	void exitPostfix_identi(mxxParser.Postfix_identiContext ctx);
	/**
	 * Enter a parse tree produced by the {@code postfix_add}
	 * labeled alternative in {@link mxxParser#postfixExpression2}.
	 * @param ctx the parse tree
	 */
	void enterPostfix_add(mxxParser.Postfix_addContext ctx);
	/**
	 * Exit a parse tree produced by the {@code postfix_add}
	 * labeled alternative in {@link mxxParser#postfixExpression2}.
	 * @param ctx the parse tree
	 */
	void exitPostfix_add(mxxParser.Postfix_addContext ctx);
	/**
	 * Enter a parse tree produced by the {@code postfix_exp}
	 * labeled alternative in {@link mxxParser#postfixExpression2}.
	 * @param ctx the parse tree
	 */
	void enterPostfix_exp(mxxParser.Postfix_expContext ctx);
	/**
	 * Exit a parse tree produced by the {@code postfix_exp}
	 * labeled alternative in {@link mxxParser#postfixExpression2}.
	 * @param ctx the parse tree
	 */
	void exitPostfix_exp(mxxParser.Postfix_expContext ctx);
	/**
	 * Enter a parse tree produced by the {@code postfix_argu}
	 * labeled alternative in {@link mxxParser#postfixExpression2}.
	 * @param ctx the parse tree
	 */
	void enterPostfix_argu(mxxParser.Postfix_arguContext ctx);
	/**
	 * Exit a parse tree produced by the {@code postfix_argu}
	 * labeled alternative in {@link mxxParser#postfixExpression2}.
	 * @param ctx the parse tree
	 */
	void exitPostfix_argu(mxxParser.Postfix_arguContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pr_new}
	 * labeled alternative in {@link mxxParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPr_new(mxxParser.Pr_newContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pr_new}
	 * labeled alternative in {@link mxxParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPr_new(mxxParser.Pr_newContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pr_common}
	 * labeled alternative in {@link mxxParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPr_common(mxxParser.Pr_commonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pr_common}
	 * labeled alternative in {@link mxxParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPr_common(mxxParser.Pr_commonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arguToassign}
	 * labeled alternative in {@link mxxParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 */
	void enterArguToassign(mxxParser.ArguToassignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arguToassign}
	 * labeled alternative in {@link mxxParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 */
	void exitArguToassign(mxxParser.ArguToassignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arguLinkAssign}
	 * labeled alternative in {@link mxxParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 */
	void enterArguLinkAssign(mxxParser.ArguLinkAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arguLinkAssign}
	 * labeled alternative in {@link mxxParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 */
	void exitArguLinkAssign(mxxParser.ArguLinkAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unary_postfix}
	 * labeled alternative in {@link mxxParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnary_postfix(mxxParser.Unary_postfixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unary_postfix}
	 * labeled alternative in {@link mxxParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnary_postfix(mxxParser.Unary_postfixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unary_inc}
	 * labeled alternative in {@link mxxParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnary_inc(mxxParser.Unary_incContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unary_inc}
	 * labeled alternative in {@link mxxParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnary_inc(mxxParser.Unary_incContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unary_dec}
	 * labeled alternative in {@link mxxParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnary_dec(mxxParser.Unary_decContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unary_dec}
	 * labeled alternative in {@link mxxParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnary_dec(mxxParser.Unary_decContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unary_other}
	 * labeled alternative in {@link mxxParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnary_other(mxxParser.Unary_otherContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unary_other}
	 * labeled alternative in {@link mxxParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnary_other(mxxParser.Unary_otherContext ctx);
	/**
	 * Enter a parse tree produced by {@link mxxParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOperator(mxxParser.UnaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link mxxParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOperator(mxxParser.UnaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multi_modu}
	 * labeled alternative in {@link mxxParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMulti_modu(mxxParser.Multi_moduContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multi_modu}
	 * labeled alternative in {@link mxxParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMulti_modu(mxxParser.Multi_moduContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiToUnary}
	 * labeled alternative in {@link mxxParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiToUnary(mxxParser.MultiToUnaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiToUnary}
	 * labeled alternative in {@link mxxParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiToUnary(mxxParser.MultiToUnaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multi_mult}
	 * labeled alternative in {@link mxxParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMulti_mult(mxxParser.Multi_multContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multi_mult}
	 * labeled alternative in {@link mxxParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMulti_mult(mxxParser.Multi_multContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multi_div}
	 * labeled alternative in {@link mxxParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMulti_div(mxxParser.Multi_divContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multi_div}
	 * labeled alternative in {@link mxxParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMulti_div(mxxParser.Multi_divContext ctx);
	/**
	 * Enter a parse tree produced by the {@code add_minus}
	 * labeled alternative in {@link mxxParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdd_minus(mxxParser.Add_minusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code add_minus}
	 * labeled alternative in {@link mxxParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdd_minus(mxxParser.Add_minusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addTomulti}
	 * labeled alternative in {@link mxxParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAddTomulti(mxxParser.AddTomultiContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addTomulti}
	 * labeled alternative in {@link mxxParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAddTomulti(mxxParser.AddTomultiContext ctx);
	/**
	 * Enter a parse tree produced by the {@code add_plus}
	 * labeled alternative in {@link mxxParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdd_plus(mxxParser.Add_plusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code add_plus}
	 * labeled alternative in {@link mxxParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdd_plus(mxxParser.Add_plusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code shiftToAdd}
	 * labeled alternative in {@link mxxParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void enterShiftToAdd(mxxParser.ShiftToAddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code shiftToAdd}
	 * labeled alternative in {@link mxxParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void exitShiftToAdd(mxxParser.ShiftToAddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rightShift}
	 * labeled alternative in {@link mxxParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void enterRightShift(mxxParser.RightShiftContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rightShift}
	 * labeled alternative in {@link mxxParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void exitRightShift(mxxParser.RightShiftContext ctx);
	/**
	 * Enter a parse tree produced by the {@code leftShift}
	 * labeled alternative in {@link mxxParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void enterLeftShift(mxxParser.LeftShiftContext ctx);
	/**
	 * Exit a parse tree produced by the {@code leftShift}
	 * labeled alternative in {@link mxxParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void exitLeftShift(mxxParser.LeftShiftContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rela_less}
	 * labeled alternative in {@link mxxParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRela_less(mxxParser.Rela_lessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rela_less}
	 * labeled alternative in {@link mxxParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRela_less(mxxParser.Rela_lessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rela_greater}
	 * labeled alternative in {@link mxxParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRela_greater(mxxParser.Rela_greaterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rela_greater}
	 * labeled alternative in {@link mxxParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRela_greater(mxxParser.Rela_greaterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relaToShift}
	 * labeled alternative in {@link mxxParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelaToShift(mxxParser.RelaToShiftContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relaToShift}
	 * labeled alternative in {@link mxxParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelaToShift(mxxParser.RelaToShiftContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rela_less_equ}
	 * labeled alternative in {@link mxxParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRela_less_equ(mxxParser.Rela_less_equContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rela_less_equ}
	 * labeled alternative in {@link mxxParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRela_less_equ(mxxParser.Rela_less_equContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rela_greater_equ}
	 * labeled alternative in {@link mxxParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRela_greater_equ(mxxParser.Rela_greater_equContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rela_greater_equ}
	 * labeled alternative in {@link mxxParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRela_greater_equ(mxxParser.Rela_greater_equContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalSameRela}
	 * labeled alternative in {@link mxxParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualSameRela(mxxParser.EqualSameRelaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalSameRela}
	 * labeled alternative in {@link mxxParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualSameRela(mxxParser.EqualSameRelaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalDifRela}
	 * labeled alternative in {@link mxxParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualDifRela(mxxParser.EqualDifRelaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalDifRela}
	 * labeled alternative in {@link mxxParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualDifRela(mxxParser.EqualDifRelaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalToRela}
	 * labeled alternative in {@link mxxParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualToRela(mxxParser.EqualToRelaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalToRela}
	 * labeled alternative in {@link mxxParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualToRela(mxxParser.EqualToRelaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andToEqual}
	 * labeled alternative in {@link mxxParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndToEqual(mxxParser.AndToEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andToEqual}
	 * labeled alternative in {@link mxxParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndToEqual(mxxParser.AndToEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andLinkEqual}
	 * labeled alternative in {@link mxxParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndLinkEqual(mxxParser.AndLinkEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andLinkEqual}
	 * labeled alternative in {@link mxxParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndLinkEqual(mxxParser.AndLinkEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eOrLinkAnd}
	 * labeled alternative in {@link mxxParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterEOrLinkAnd(mxxParser.EOrLinkAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eOrLinkAnd}
	 * labeled alternative in {@link mxxParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitEOrLinkAnd(mxxParser.EOrLinkAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eOrtoAnd}
	 * labeled alternative in {@link mxxParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterEOrtoAnd(mxxParser.EOrtoAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eOrtoAnd}
	 * labeled alternative in {@link mxxParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitEOrtoAnd(mxxParser.EOrtoAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code iOrToeOr}
	 * labeled alternative in {@link mxxParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterIOrToeOr(mxxParser.IOrToeOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code iOrToeOr}
	 * labeled alternative in {@link mxxParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitIOrToeOr(mxxParser.IOrToeOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code iOrLinkeOr}
	 * labeled alternative in {@link mxxParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterIOrLinkeOr(mxxParser.IOrLinkeOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code iOrLinkeOr}
	 * labeled alternative in {@link mxxParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitIOrLinkeOr(mxxParser.IOrLinkeOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicAndToiOr}
	 * labeled alternative in {@link mxxParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicAndToiOr(mxxParser.LogicAndToiOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicAndToiOr}
	 * labeled alternative in {@link mxxParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicAndToiOr(mxxParser.LogicAndToiOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicAndLinkiOr}
	 * labeled alternative in {@link mxxParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicAndLinkiOr(mxxParser.LogicAndLinkiOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicAndLinkiOr}
	 * labeled alternative in {@link mxxParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicAndLinkiOr(mxxParser.LogicAndLinkiOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicOrLinkAnd}
	 * labeled alternative in {@link mxxParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicOrLinkAnd(mxxParser.LogicOrLinkAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicOrLinkAnd}
	 * labeled alternative in {@link mxxParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicOrLinkAnd(mxxParser.LogicOrLinkAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicOrToAnd}
	 * labeled alternative in {@link mxxParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicOrToAnd(mxxParser.LogicOrToAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicOrToAnd}
	 * labeled alternative in {@link mxxParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicOrToAnd(mxxParser.LogicOrToAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assToLogicOr}
	 * labeled alternative in {@link mxxParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssToLogicOr(mxxParser.AssToLogicOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assToLogicOr}
	 * labeled alternative in {@link mxxParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssToLogicOr(mxxParser.AssToLogicOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryLinkAss}
	 * labeled alternative in {@link mxxParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryLinkAss(mxxParser.UnaryLinkAssContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryLinkAss}
	 * labeled alternative in {@link mxxParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryLinkAss(mxxParser.UnaryLinkAssContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expLinkAssign}
	 * labeled alternative in {@link mxxParser#expressionseq}.
	 * @param ctx the parse tree
	 */
	void enterExpLinkAssign(mxxParser.ExpLinkAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expLinkAssign}
	 * labeled alternative in {@link mxxParser#expressionseq}.
	 * @param ctx the parse tree
	 */
	void exitExpLinkAssign(mxxParser.ExpLinkAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expToAssign}
	 * labeled alternative in {@link mxxParser#expressionseq}.
	 * @param ctx the parse tree
	 */
	void enterExpToAssign(mxxParser.ExpToAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expToAssign}
	 * labeled alternative in {@link mxxParser#expressionseq}.
	 * @param ctx the parse tree
	 */
	void exitExpToAssign(mxxParser.ExpToAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code type_void}
	 * labeled alternative in {@link mxxParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterType_void(mxxParser.Type_voidContext ctx);
	/**
	 * Exit a parse tree produced by the {@code type_void}
	 * labeled alternative in {@link mxxParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitType_void(mxxParser.Type_voidContext ctx);
	/**
	 * Enter a parse tree produced by the {@code type_int}
	 * labeled alternative in {@link mxxParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterType_int(mxxParser.Type_intContext ctx);
	/**
	 * Exit a parse tree produced by the {@code type_int}
	 * labeled alternative in {@link mxxParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitType_int(mxxParser.Type_intContext ctx);
	/**
	 * Enter a parse tree produced by the {@code type_bool}
	 * labeled alternative in {@link mxxParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterType_bool(mxxParser.Type_boolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code type_bool}
	 * labeled alternative in {@link mxxParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitType_bool(mxxParser.Type_boolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code type_String}
	 * labeled alternative in {@link mxxParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterType_String(mxxParser.Type_StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code type_String}
	 * labeled alternative in {@link mxxParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitType_String(mxxParser.Type_StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code type_Other}
	 * labeled alternative in {@link mxxParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterType_Other(mxxParser.Type_OtherContext ctx);
	/**
	 * Exit a parse tree produced by the {@code type_Other}
	 * labeled alternative in {@link mxxParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitType_Other(mxxParser.Type_OtherContext ctx);
	/**
	 * Enter a parse tree produced by the {@code to_comp_stmt}
	 * labeled alternative in {@link mxxParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterTo_comp_stmt(mxxParser.To_comp_stmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code to_comp_stmt}
	 * labeled alternative in {@link mxxParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitTo_comp_stmt(mxxParser.To_comp_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code to_exp_stmt}
	 * labeled alternative in {@link mxxParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterTo_exp_stmt(mxxParser.To_exp_stmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code to_exp_stmt}
	 * labeled alternative in {@link mxxParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitTo_exp_stmt(mxxParser.To_exp_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code to_select_stmt}
	 * labeled alternative in {@link mxxParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterTo_select_stmt(mxxParser.To_select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code to_select_stmt}
	 * labeled alternative in {@link mxxParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitTo_select_stmt(mxxParser.To_select_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code to_iter_stmt}
	 * labeled alternative in {@link mxxParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterTo_iter_stmt(mxxParser.To_iter_stmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code to_iter_stmt}
	 * labeled alternative in {@link mxxParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitTo_iter_stmt(mxxParser.To_iter_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code to_jump_stmt}
	 * labeled alternative in {@link mxxParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterTo_jump_stmt(mxxParser.To_jump_stmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code to_jump_stmt}
	 * labeled alternative in {@link mxxParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitTo_jump_stmt(mxxParser.To_jump_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link mxxParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(mxxParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link mxxParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(mxxParser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blck_single}
	 * labeled alternative in {@link mxxParser#blockItemList}.
	 * @param ctx the parse tree
	 */
	void enterBlck_single(mxxParser.Blck_singleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blck_single}
	 * labeled alternative in {@link mxxParser#blockItemList}.
	 * @param ctx the parse tree
	 */
	void exitBlck_single(mxxParser.Blck_singleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blck_expand}
	 * labeled alternative in {@link mxxParser#blockItemList}.
	 * @param ctx the parse tree
	 */
	void enterBlck_expand(mxxParser.Blck_expandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blck_expand}
	 * labeled alternative in {@link mxxParser#blockItemList}.
	 * @param ctx the parse tree
	 */
	void exitBlck_expand(mxxParser.Blck_expandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blckunit_declare}
	 * labeled alternative in {@link mxxParser#blockItem}.
	 * @param ctx the parse tree
	 */
	void enterBlckunit_declare(mxxParser.Blckunit_declareContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blckunit_declare}
	 * labeled alternative in {@link mxxParser#blockItem}.
	 * @param ctx the parse tree
	 */
	void exitBlckunit_declare(mxxParser.Blckunit_declareContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blckunit_common}
	 * labeled alternative in {@link mxxParser#blockItem}.
	 * @param ctx the parse tree
	 */
	void enterBlckunit_common(mxxParser.Blckunit_commonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blckunit_common}
	 * labeled alternative in {@link mxxParser#blockItem}.
	 * @param ctx the parse tree
	 */
	void exitBlckunit_common(mxxParser.Blckunit_commonContext ctx);
	/**
	 * Enter a parse tree produced by {@link mxxParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(mxxParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link mxxParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(mxxParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link mxxParser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void enterSelectionStatement(mxxParser.SelectionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link mxxParser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void exitSelectionStatement(mxxParser.SelectionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link mxxParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterIterationStatement(mxxParser.IterationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link mxxParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitIterationStatement(mxxParser.IterationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link mxxParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void enterJumpStatement(mxxParser.JumpStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link mxxParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void exitJumpStatement(mxxParser.JumpStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code trans_expand}
	 * labeled alternative in {@link mxxParser#translationUnit}.
	 * @param ctx the parse tree
	 */
	void enterTrans_expand(mxxParser.Trans_expandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code trans_expand}
	 * labeled alternative in {@link mxxParser#translationUnit}.
	 * @param ctx the parse tree
	 */
	void exitTrans_expand(mxxParser.Trans_expandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code trans_unit}
	 * labeled alternative in {@link mxxParser#translationUnit}.
	 * @param ctx the parse tree
	 */
	void enterTrans_unit(mxxParser.Trans_unitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code trans_unit}
	 * labeled alternative in {@link mxxParser#translationUnit}.
	 * @param ctx the parse tree
	 */
	void exitTrans_unit(mxxParser.Trans_unitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcDef}
	 * labeled alternative in {@link mxxParser#externalDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFuncDef(mxxParser.FuncDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcDef}
	 * labeled alternative in {@link mxxParser#externalDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFuncDef(mxxParser.FuncDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code classDef}
	 * labeled alternative in {@link mxxParser#externalDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDef(mxxParser.ClassDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code classDef}
	 * labeled alternative in {@link mxxParser#externalDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDef(mxxParser.ClassDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varDef}
	 * labeled alternative in {@link mxxParser#externalDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDef(mxxParser.VarDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varDef}
	 * labeled alternative in {@link mxxParser#externalDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDef(mxxParser.VarDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link mxxParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(mxxParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link mxxParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(mxxParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link mxxParser#extraDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterExtraDeclaration(mxxParser.ExtraDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link mxxParser#extraDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitExtraDeclaration(mxxParser.ExtraDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link mxxParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(mxxParser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link mxxParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(mxxParser.FunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code para_unit}
	 * labeled alternative in {@link mxxParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterPara_unit(mxxParser.Para_unitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code para_unit}
	 * labeled alternative in {@link mxxParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitPara_unit(mxxParser.Para_unitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code para_expand}
	 * labeled alternative in {@link mxxParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterPara_expand(mxxParser.Para_expandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code para_expand}
	 * labeled alternative in {@link mxxParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitPara_expand(mxxParser.Para_expandContext ctx);
	/**
	 * Enter a parse tree produced by {@link mxxParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(mxxParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link mxxParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(mxxParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link mxxParser#classDefinition}.
	 * @param ctx the parse tree
	 */
	void enterClassDefinition(mxxParser.ClassDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link mxxParser#classDefinition}.
	 * @param ctx the parse tree
	 */
	void exitClassDefinition(mxxParser.ClassDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code classdef_unit}
	 * labeled alternative in {@link mxxParser#classDeclarationList}.
	 * @param ctx the parse tree
	 */
	void enterClassdef_unit(mxxParser.Classdef_unitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code classdef_unit}
	 * labeled alternative in {@link mxxParser#classDeclarationList}.
	 * @param ctx the parse tree
	 */
	void exitClassdef_unit(mxxParser.Classdef_unitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code classdef_expand}
	 * labeled alternative in {@link mxxParser#classDeclarationList}.
	 * @param ctx the parse tree
	 */
	void enterClassdef_expand(mxxParser.Classdef_expandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code classdef_expand}
	 * labeled alternative in {@link mxxParser#classDeclarationList}.
	 * @param ctx the parse tree
	 */
	void exitClassdef_expand(mxxParser.Classdef_expandContext ctx);
	/**
	 * Enter a parse tree produced by {@link mxxParser#classdeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassdeclaration(mxxParser.ClassdeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link mxxParser#classdeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassdeclaration(mxxParser.ClassdeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link mxxParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(mxxParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link mxxParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(mxxParser.IdentifierContext ctx);
}