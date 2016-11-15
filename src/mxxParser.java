// Generated from mxx.g4 by ANTLR 4.5
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class mxxParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, Break=2, Char=3, Const=4, Continue=5, Class=6, Do=7, Else=8, For=9, 
		If=10, Int=11, New=12, Return=13, Static=14, String=15, Struct=16, Void=17, 
		While=18, Null=19, Bool=20, LeftParen=21, RightParen=22, LeftBracket=23, 
		RightBracket=24, LeftBrace=25, RightBrace=26, Less=27, LessEqual=28, Greater=29, 
		GreaterEqual=30, LeftShift=31, RightShift=32, Plus=33, PlusPlus=34, Minus=35, 
		MinusMinus=36, Star=37, Div=38, Mod=39, And=40, Or=41, AndAnd=42, OrOr=43, 
		Caret=44, Not=45, Tilde=46, Question=47, Colon=48, Semi=49, Comma=50, 
		Assign=51, Equal=52, NotEqual=53, Dot=54, BoolLiteral=55, Identifier=56, 
		IntegerLiteral=57, StringLiteral=58, Whitespace=59, Newline=60, BlockComment=61, 
		LineComment=62;
	public static final int
		RULE_compilationUnit = 0, RULE_indexExp = 1, RULE_arrSufSeq = 2, RULE_primaryExpression = 3, 
		RULE_postfixExpression2 = 4, RULE_postfixExpression = 5, RULE_argumentExpressionList = 6, 
		RULE_unaryExpression = 7, RULE_unaryOperator = 8, RULE_multiplicativeExpression = 9, 
		RULE_additiveExpression = 10, RULE_shiftExpression = 11, RULE_relationalExpression = 12, 
		RULE_equalityExpression = 13, RULE_andExpression = 14, RULE_exclusiveOrExpression = 15, 
		RULE_inclusiveOrExpression = 16, RULE_logicalAndExpression = 17, RULE_logicalOrExpression = 18, 
		RULE_assignmentExpression = 19, RULE_expressionseq = 20, RULE_typeSpecifier = 21, 
		RULE_statement = 22, RULE_compoundStatement = 23, RULE_blockItemList = 24, 
		RULE_blockItem = 25, RULE_expressionStatement = 26, RULE_selectionStatement = 27, 
		RULE_iterationStatement = 28, RULE_jumpStatement = 29, RULE_translationUnit = 30, 
		RULE_externalDeclaration = 31, RULE_declaration = 32, RULE_extraDeclaration = 33, 
		RULE_functionDefinition = 34, RULE_parameterList = 35, RULE_parameter = 36, 
		RULE_classDefinition = 37, RULE_classDeclarationList = 38, RULE_classdeclaration = 39, 
		RULE_identifier = 40;
	public static final String[] ruleNames = {
		"compilationUnit", "indexExp", "arrSufSeq", "primaryExpression", "postfixExpression2", 
		"postfixExpression", "argumentExpressionList", "unaryExpression", "unaryOperator", 
		"multiplicativeExpression", "additiveExpression", "shiftExpression", "relationalExpression", 
		"equalityExpression", "andExpression", "exclusiveOrExpression", "inclusiveOrExpression", 
		"logicalAndExpression", "logicalOrExpression", "assignmentExpression", 
		"expressionseq", "typeSpecifier", "statement", "compoundStatement", "blockItemList", 
		"blockItem", "expressionStatement", "selectionStatement", "iterationStatement", 
		"jumpStatement", "translationUnit", "externalDeclaration", "declaration", 
		"extraDeclaration", "functionDefinition", "parameterList", "parameter", 
		"classDefinition", "classDeclarationList", "classdeclaration", "identifier"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'[]'", "'break'", "'char'", "'const'", "'continue'", "'class'", 
		"'do'", "'else'", "'for'", "'if'", "'int'", "'new'", "'return'", "'static'", 
		"'string'", "'struct'", "'void'", "'while'", "'null'", "'bool'", "'('", 
		"')'", "'['", "']'", "'{'", "'}'", "'<'", "'<='", "'>'", "'>='", "'<<'", 
		"'>>'", "'+'", "'++'", "'-'", "'--'", "'*'", "'/'", "'%'", "'&'", "'|'", 
		"'&&'", "'||'", "'^'", "'!'", "'~'", "'?'", "':'", "';'", "','", "'='", 
		"'=='", "'!='", "'.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "Break", "Char", "Const", "Continue", "Class", "Do", "Else", 
		"For", "If", "Int", "New", "Return", "Static", "String", "Struct", "Void", 
		"While", "Null", "Bool", "LeftParen", "RightParen", "LeftBracket", "RightBracket", 
		"LeftBrace", "RightBrace", "Less", "LessEqual", "Greater", "GreaterEqual", 
		"LeftShift", "RightShift", "Plus", "PlusPlus", "Minus", "MinusMinus", 
		"Star", "Div", "Mod", "And", "Or", "AndAnd", "OrOr", "Caret", "Not", "Tilde", 
		"Question", "Colon", "Semi", "Comma", "Assign", "Equal", "NotEqual", "Dot", 
		"BoolLiteral", "Identifier", "IntegerLiteral", "StringLiteral", "Whitespace", 
		"Newline", "BlockComment", "LineComment"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "mxx.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public mxxParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CompilationUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(mxxParser.EOF, 0); }
		public TranslationUnitContext translationUnit() {
			return getRuleContext(TranslationUnitContext.class,0);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).exitCompilationUnit(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Class) | (1L << Int) | (1L << String) | (1L << Void) | (1L << Bool) | (1L << Identifier))) != 0)) {
				{
				setState(82);
				translationUnit(0);
				}
			}

			setState(85);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexExpContext extends ParserRuleContext {
		public IndexExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexExp; }
	 
		public IndexExpContext() { }
		public void copyFrom(IndexExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ContentindexContext extends IndexExpContext {
		public ExpressionseqContext expressionseq() {
			return getRuleContext(ExpressionseqContext.class,0);
		}
		public ContentindexContext(IndexExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).enterContentindex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).exitContentindex(this);
		}
	}
	public static class EmptyindexContext extends IndexExpContext {
		public EmptyindexContext(IndexExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).enterEmptyindex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).exitEmptyindex(this);
		}
	}

	public final IndexExpContext indexExp() throws RecognitionException {
		IndexExpContext _localctx = new IndexExpContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_indexExp);
		try {
			setState(92);
			switch (_input.LA(1)) {
			case T__0:
				_localctx = new EmptyindexContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				match(T__0);
				}
				break;
			case LeftBracket:
				_localctx = new ContentindexContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				match(LeftBracket);
				setState(89);
				expressionseq(0);
				setState(90);
				match(RightBracket);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrSufSeqContext extends ParserRuleContext {
		public ArrSufSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrSufSeq; }
	 
		public ArrSufSeqContext() { }
		public void copyFrom(ArrSufSeqContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArrSufSeqsContext extends ArrSufSeqContext {
		public IndexExpContext indexExp() {
			return getRuleContext(IndexExpContext.class,0);
		}
		public ArrSufSeqContext arrSufSeq() {
			return getRuleContext(ArrSufSeqContext.class,0);
		}
		public ArrSufSeqsContext(ArrSufSeqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).enterArrSufSeqs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).exitArrSufSeqs(this);
		}
	}
	public static class SingleArrSufContext extends ArrSufSeqContext {
		public IndexExpContext indexExp() {
			return getRuleContext(IndexExpContext.class,0);
		}
		public SingleArrSufContext(ArrSufSeqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).enterSingleArrSuf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).exitSingleArrSuf(this);
		}
	}

	public final ArrSufSeqContext arrSufSeq() throws RecognitionException {
		ArrSufSeqContext _localctx = new ArrSufSeqContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_arrSufSeq);
		try {
			setState(98);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new SingleArrSufContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				indexExp();
				}
				break;
			case 2:
				_localctx = new ArrSufSeqsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				indexExp();
				setState(96);
				arrSufSeq();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
	 
		public PrimaryExpressionContext() { }
		public void copyFrom(PrimaryExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Pr_boolconstContext extends PrimaryExpressionContext {
		public TerminalNode BoolLiteral() { return getToken(mxxParser.BoolLiteral, 0); }
		public Pr_boolconstContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).enterPr_boolconst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).exitPr_boolconst(this);
		}
	}
	public static class Pr_expContext extends PrimaryExpressionContext {
		public ExpressionseqContext expressionseq() {
			return getRuleContext(ExpressionseqContext.class,0);
		}
		public Pr_expContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).enterPr_exp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).exitPr_exp(this);
		}
	}
	public static class Pr_nullContext extends PrimaryExpressionContext {
		public TerminalNode Null() { return getToken(mxxParser.Null, 0); }
		public Pr_nullContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).enterPr_null(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).exitPr_null(this);
		}
	}
	public static class Pr_idContext extends PrimaryExpressionContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Pr_idContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).enterPr_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).exitPr_id(this);
		}
	}
	public static class Pr_intconstContext extends PrimaryExpressionContext {
		public TerminalNode IntegerLiteral() { return getToken(mxxParser.IntegerLiteral, 0); }
		public Pr_intconstContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).enterPr_intconst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).exitPr_intconst(this);
		}
	}
	public static class Pr_strconstContext extends PrimaryExpressionContext {
		public TerminalNode StringLiteral() { return getToken(mxxParser.StringLiteral, 0); }
		public Pr_strconstContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).enterPr_strconst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).exitPr_strconst(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_primaryExpression);
		try {
			setState(109);
			switch (_input.LA(1)) {
			case Identifier:
				_localctx = new Pr_idContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				identifier();
				}
				break;
			case IntegerLiteral:
				_localctx = new Pr_intconstContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				match(IntegerLiteral);
				}
				break;
			case StringLiteral:
				_localctx = new Pr_strconstContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(102);
				match(StringLiteral);
				}
				break;
			case BoolLiteral:
				_localctx = new Pr_boolconstContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(103);
				match(BoolLiteral);
				}
				break;
			case LeftParen:
				_localctx = new Pr_expContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(104);
				match(LeftParen);
				setState(105);
				expressionseq(0);
				setState(106);
				match(RightParen);
				}
				break;
			case Null:
				_localctx = new Pr_nullContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(108);
				match(Null);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostfixExpression2Context extends ParserRuleContext {
		public PostfixExpression2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpression2; }
	 
		public PostfixExpression2Context() { }
		public void copyFrom(PostfixExpression2Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PostfixToPrimaryContext extends PostfixExpression2Context {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public PostfixToPrimaryContext(PostfixExpression2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).enterPostfixToPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).exitPostfixToPrimary(this);
		}
	}
	public static class Postfix_decContext extends PostfixExpression2Context {
		public PostfixExpression2Context postfixExpression2() {
			return getRuleContext(PostfixExpression2Context.class,0);
		}
		public Postfix_decContext(PostfixExpression2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).enterPostfix_dec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).exitPostfix_dec(this);
		}
	}
	public static class Postfix_identiContext extends PostfixExpression2Context {
		public PostfixExpression2Context postfixExpression2() {
			return getRuleContext(PostfixExpression2Context.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(mxxParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(mxxParser.RightParen, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public Postfix_identiContext(PostfixExpression2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).enterPostfix_identi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).exitPostfix_identi(this);
		}
	}
	public static class Postfix_addContext extends PostfixExpression2Context {
		public PostfixExpression2Context postfixExpression2() {
			return getRuleContext(PostfixExpression2Context.class,0);
		}
		public Postfix_addContext(PostfixExpression2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).enterPostfix_add(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).exitPostfix_add(this);
		}
	}
	public static class Postfix_expContext extends PostfixExpression2Context {
		public PostfixExpression2Context postfixExpression2() {
			return getRuleContext(PostfixExpression2Context.class,0);
		}
		public ArrSufSeqContext arrSufSeq() {
			return getRuleContext(ArrSufSeqContext.class,0);
		}
		public Postfix_expContext(PostfixExpression2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).enterPostfix_exp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).exitPostfix_exp(this);
		}
	}
	public static class Postfix_arguContext extends PostfixExpression2Context {
		public PostfixExpression2Context postfixExpression2() {
			return getRuleContext(PostfixExpression2Context.class,0);
		}
		public ArgumentExpressionListContext argumentExpressionList() {
			return getRuleContext(ArgumentExpressionListContext.class,0);
		}
		public Postfix_arguContext(PostfixExpression2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).enterPostfix_argu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).exitPostfix_argu(this);
		}
	}

	public final PostfixExpression2Context postfixExpression2() throws RecognitionException {
		return postfixExpression2(0);
	}

	private PostfixExpression2Context postfixExpression2(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PostfixExpression2Context _localctx = new PostfixExpression2Context(_ctx, _parentState);
		PostfixExpression2Context _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_postfixExpression2, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new PostfixToPrimaryContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(112);
			primaryExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(138);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(136);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new Postfix_expContext(new PostfixExpression2Context(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression2);
						setState(114);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(115);
						arrSufSeq();
						}
						break;
					case 2:
						{
						_localctx = new Postfix_identiContext(new PostfixExpression2Context(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression2);
						setState(116);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(117);
						match(Dot);
						setState(118);
						identifier();
						setState(124);
						switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
						case 1:
							{
							setState(119);
							match(LeftParen);
							setState(121);
							_la = _input.LA(1);
							if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Int) | (1L << String) | (1L << Void) | (1L << Bool) | (1L << Identifier))) != 0)) {
								{
								setState(120);
								parameterList();
								}
							}

							setState(123);
							match(RightParen);
							}
							break;
						}
						}
						break;
					case 3:
						{
						_localctx = new Postfix_arguContext(new PostfixExpression2Context(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression2);
						setState(126);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(127);
						match(LeftParen);
						setState(129);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << New) | (1L << Null) | (1L << LeftParen) | (1L << Plus) | (1L << PlusPlus) | (1L << Minus) | (1L << MinusMinus) | (1L << Not) | (1L << Tilde) | (1L << BoolLiteral) | (1L << Identifier) | (1L << IntegerLiteral) | (1L << StringLiteral))) != 0)) {
							{
							setState(128);
							argumentExpressionList(0);
							}
						}

						setState(131);
						match(RightParen);
						}
						break;
					case 4:
						{
						_localctx = new Postfix_addContext(new PostfixExpression2Context(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression2);
						setState(132);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(133);
						match(PlusPlus);
						}
						break;
					case 5:
						{
						_localctx = new Postfix_decContext(new PostfixExpression2Context(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression2);
						setState(134);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(135);
						match(MinusMinus);
						}
						break;
					}
					} 
				}
				setState(140);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PostfixExpressionContext extends ParserRuleContext {
		public PostfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpression; }
	 
		public PostfixExpressionContext() { }
		public void copyFrom(PostfixExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Pr_newContext extends PostfixExpressionContext {
		public TerminalNode New() { return getToken(mxxParser.New, 0); }
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public Pr_newContext(PostfixExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).enterPr_new(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).exitPr_new(this);
		}
	}
	public static class Pr_commonContext extends PostfixExpressionContext {
		public PostfixExpression2Context postfixExpression2() {
			return getRuleContext(PostfixExpression2Context.class,0);
		}
		public Pr_commonContext(PostfixExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).enterPr_common(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).exitPr_common(this);
		}
	}

	public final PostfixExpressionContext postfixExpression() throws RecognitionException {
		PostfixExpressionContext _localctx = new PostfixExpressionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_postfixExpression);
		try {
			setState(144);
			switch (_input.LA(1)) {
			case New:
				_localctx = new Pr_newContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				match(New);
				setState(142);
				typeSpecifier();
				}
				break;
			case Null:
			case LeftParen:
			case BoolLiteral:
			case Identifier:
			case IntegerLiteral:
			case StringLiteral:
				_localctx = new Pr_commonContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				postfixExpression2(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentExpressionListContext extends ParserRuleContext {
		public ArgumentExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentExpressionList; }
	 
		public ArgumentExpressionListContext() { }
		public void copyFrom(ArgumentExpressionListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArguToassignContext extends ArgumentExpressionListContext {
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ArguToassignContext(ArgumentExpressionListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).enterArguToassign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).exitArguToassign(this);
		}
	}
	public static class ArguLinkAssignContext extends ArgumentExpressionListContext {
		public ArgumentExpressionListContext argumentExpressionList() {
			return getRuleContext(ArgumentExpressionListContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ArguLinkAssignContext(ArgumentExpressionListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).enterArguLinkAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).exitArguLinkAssign(this);
		}
	}

	public final ArgumentExpressionListContext argumentExpressionList() throws RecognitionException {
		return argumentExpressionList(0);
	}

	private ArgumentExpressionListContext argumentExpressionList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArgumentExpressionListContext _localctx = new ArgumentExpressionListContext(_ctx, _parentState);
		ArgumentExpressionListContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_argumentExpressionList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ArguToassignContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(147);
			assignmentExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(154);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArguLinkAssignContext(new ArgumentExpressionListContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_argumentExpressionList);
					setState(149);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(150);
					match(Comma);
					setState(151);
					assignmentExpression();
					}
					} 
				}
				setState(156);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class UnaryExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
	 
		public UnaryExpressionContext() { }
		public void copyFrom(UnaryExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Unary_decContext extends UnaryExpressionContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public Unary_decContext(UnaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).enterUnary_dec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).exitUnary_dec(this);
		}
	}
	public static class Unary_otherContext extends UnaryExpressionContext {
		public UnaryOperatorContext unaryOperator() {
			return getRuleContext(UnaryOperatorContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public Unary_otherContext(UnaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).enterUnary_other(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).exitUnary_other(this);
		}
	}
	public static class Unary_postfixContext extends UnaryExpressionContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public Unary_postfixContext(UnaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).enterUnary_postfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).exitUnary_postfix(this);
		}
	}
	public static class Unary_incContext extends UnaryExpressionContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public Unary_incContext(UnaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).enterUnary_inc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).exitUnary_inc(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_unaryExpression);
		try {
			setState(165);
			switch (_input.LA(1)) {
			case New:
			case Null:
			case LeftParen:
			case BoolLiteral:
			case Identifier:
			case IntegerLiteral:
			case StringLiteral:
				_localctx = new Unary_postfixContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				postfixExpression();
				}
				break;
			case PlusPlus:
				_localctx = new Unary_incContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
				match(PlusPlus);
				setState(159);
				unaryExpression();
				}
				break;
			case MinusMinus:
				_localctx = new Unary_decContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(160);
				match(MinusMinus);
				setState(161);
				unaryExpression();
				}
				break;
			case Plus:
			case Minus:
			case Not:
			case Tilde:
				_localctx = new Unary_otherContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(162);
				unaryOperator();
				setState(163);
				unaryExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryOperatorContext extends ParserRuleContext {
		public UnaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).enterUnaryOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).exitUnaryOperator(this);
		}
	}

	public final UnaryOperatorContext unaryOperator() throws RecognitionException {
		UnaryOperatorContext _localctx = new UnaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_unaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Plus) | (1L << Minus) | (1L << Not) | (1L << Tilde))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
	 
		public MultiplicativeExpressionContext() { }
		public void copyFrom(MultiplicativeExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Multi_moduContext extends MultiplicativeExpressionContext {
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public Multi_moduContext(MultiplicativeExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).enterMulti_modu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).exitMulti_modu(this);
		}
	}
	public static class MultiToUnaryContext extends MultiplicativeExpressionContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public MultiToUnaryContext(MultiplicativeExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).enterMultiToUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).exitMultiToUnary(this);
		}
	}
	public static class Multi_multContext extends MultiplicativeExpressionContext {
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public Multi_multContext(MultiplicativeExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).enterMulti_mult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).exitMulti_mult(this);
		}
	}
	public static class Multi_divContext extends MultiplicativeExpressionContext {
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public Multi_divContext(MultiplicativeExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).enterMulti_div(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).exitMulti_div(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		return multiplicativeExpression(0);
	}

	private MultiplicativeExpressionContext multiplicativeExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, _parentState);
		MultiplicativeExpressionContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_multiplicativeExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new MultiToUnaryContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(170);
			unaryExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(183);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(181);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new Multi_multContext(new MultiplicativeExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(172);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(173);
						match(Star);
						setState(174);
						unaryExpression();
						}
						break;
					case 2:
						{
						_localctx = new Multi_divContext(new MultiplicativeExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(175);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(176);
						match(Div);
						setState(177);
						unaryExpression();
						}
						break;
					case 3:
						{
						_localctx = new Multi_moduContext(new MultiplicativeExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(178);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(179);
						match(Mod);
						setState(180);
						unaryExpression();
						}
						break;
					}
					} 
				}
				setState(185);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
	 
		public AdditiveExpressionContext() { }
		public void copyFrom(AdditiveExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Add_minusContext extends AdditiveExpressionContext {
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public Add_minusContext(AdditiveExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).enterAdd_minus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).exitAdd_minus(this);
		}
	}
	public static class AddTomultiContext extends AdditiveExpressionContext {
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public AddTomultiContext(AdditiveExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).enterAddTomulti(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).exitAddTomulti(this);
		}
	}
	public static class Add_plusContext extends AdditiveExpressionContext {
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public Add_plusContext(AdditiveExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).enterAdd_plus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).exitAdd_plus(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		return additiveExpression(0);
	}

	private AdditiveExpressionContext additiveExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, _parentState);
		AdditiveExpressionContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_additiveExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new AddTomultiContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(187);
			multiplicativeExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(197);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(195);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new Add_plusContext(new AdditiveExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(189);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(190);
						match(Plus);
						setState(191);
						multiplicativeExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new Add_minusContext(new AdditiveExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(192);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(193);
						match(Minus);
						setState(194);
						multiplicativeExpression(0);
						}
						break;
					}
					} 
				}
				setState(199);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ShiftExpressionContext extends ParserRuleContext {
		public ShiftExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftExpression; }
	 
		public ShiftExpressionContext() { }
		public void copyFrom(ShiftExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ShiftToAddContext extends ShiftExpressionContext {
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public ShiftToAddContext(ShiftExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).enterShiftToAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).exitShiftToAdd(this);
		}
	}
	public static class RightShiftContext extends ShiftExpressionContext {
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public RightShiftContext(ShiftExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).enterRightShift(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).exitRightShift(this);
		}
	}
	public static class LeftShiftContext extends ShiftExpressionContext {
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public LeftShiftContext(ShiftExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).enterLeftShift(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).exitLeftShift(this);
		}
	}

	public final ShiftExpressionContext shiftExpression() throws RecognitionException {
		return shiftExpression(0);
	}

	private ShiftExpressionContext shiftExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ShiftExpressionContext _localctx = new ShiftExpressionContext(_ctx, _parentState);
		ShiftExpressionContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_shiftExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ShiftToAddContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(201);
			additiveExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(211);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(209);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new LeftShiftContext(new ShiftExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(203);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(204);
						match(LeftShift);
						setState(205);
						additiveExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new RightShiftContext(new ShiftExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(206);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(207);
						match(RightShift);
						setState(208);
						additiveExpression(0);
						}
						break;
					}
					} 
				}
				setState(213);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class RelationalExpressionContext extends ParserRuleContext {
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
	 
		public RelationalExpressionContext() { }
		public void copyFrom(RelationalExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Rela_lessContext extends RelationalExpressionContext {
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public Rela_lessContext(RelationalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).enterRela_less(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).exitRela_less(this);
		}
	}
	public static class Rela_greaterContext extends RelationalExpressionContext {
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public Rela_greaterContext(RelationalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).enterRela_greater(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).exitRela_greater(this);
		}
	}
	public static class RelaToShiftContext extends RelationalExpressionContext {
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public RelaToShiftContext(RelationalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).enterRelaToShift(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).exitRelaToShift(this);
		}
	}
	public static class Rela_less_equContext extends RelationalExpressionContext {
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public Rela_less_equContext(RelationalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).enterRela_less_equ(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).exitRela_less_equ(this);
		}
	}
	public static class Rela_greater_equContext extends RelationalExpressionContext {
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public Rela_greater_equContext(RelationalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).enterRela_greater_equ(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).exitRela_greater_equ(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		return relationalExpression(0);
	}

	private RelationalExpressionContext relationalExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, _parentState);
		RelationalExpressionContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_relationalExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new RelaToShiftContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(215);
			shiftExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(231);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(229);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new Rela_lessContext(new RelationalExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(217);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(218);
						match(Less);
						setState(219);
						shiftExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new Rela_greaterContext(new RelationalExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(220);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(221);
						match(Greater);
						setState(222);
						shiftExpression(0);
						}
						break;
					case 3:
						{
						_localctx = new Rela_less_equContext(new RelationalExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(223);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(224);
						match(LessEqual);
						setState(225);
						shiftExpression(0);
						}
						break;
					case 4:
						{
						_localctx = new Rela_greater_equContext(new RelationalExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(226);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(227);
						match(GreaterEqual);
						setState(228);
						shiftExpression(0);
						}
						break;
					}
					} 
				}
				setState(233);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class EqualityExpressionContext extends ParserRuleContext {
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
	 
		public EqualityExpressionContext() { }
		public void copyFrom(EqualityExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EqualSameRelaContext extends EqualityExpressionContext {
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public EqualSameRelaContext(EqualityExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).enterEqualSameRela(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).exitEqualSameRela(this);
		}
	}
	public static class EqualDifRelaContext extends EqualityExpressionContext {
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public EqualDifRelaContext(EqualityExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).enterEqualDifRela(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).exitEqualDifRela(this);
		}
	}
	public static class EqualToRelaContext extends EqualityExpressionContext {
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public EqualToRelaContext(EqualityExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).enterEqualToRela(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).exitEqualToRela(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		return equalityExpression(0);
	}

	private EqualityExpressionContext equalityExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, _parentState);
		EqualityExpressionContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_equalityExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new EqualToRelaContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(235);
			relationalExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(245);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(243);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new EqualSameRelaContext(new EqualityExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(237);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(238);
						match(Equal);
						setState(239);
						relationalExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new EqualDifRelaContext(new EqualityExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(240);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(241);
						match(NotEqual);
						setState(242);
						relationalExpression(0);
						}
						break;
					}
					} 
				}
				setState(247);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AndExpressionContext extends ParserRuleContext {
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
	 
		public AndExpressionContext() { }
		public void copyFrom(AndExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AndToEqualContext extends AndExpressionContext {
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public AndToEqualContext(AndExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).enterAndToEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).exitAndToEqual(this);
		}
	}
	public static class AndLinkEqualContext extends AndExpressionContext {
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public AndLinkEqualContext(AndExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).enterAndLinkEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).exitAndLinkEqual(this);
		}
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		return andExpression(0);
	}

	private AndExpressionContext andExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, _parentState);
		AndExpressionContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_andExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new AndToEqualContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(249);
			equalityExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(256);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndLinkEqualContext(new AndExpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_andExpression);
					setState(251);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(252);
					match(And);
					setState(253);
					equalityExpression(0);
					}
					} 
				}
				setState(258);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExclusiveOrExpressionContext extends ParserRuleContext {
		public ExclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusiveOrExpression; }
	 
		public ExclusiveOrExpressionContext() { }
		public void copyFrom(ExclusiveOrExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EOrLinkAndContext extends ExclusiveOrExpressionContext {
		public ExclusiveOrExpressionContext exclusiveOrExpression() {
			return getRuleContext(ExclusiveOrExpressionContext.class,0);
		}
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public EOrLinkAndContext(ExclusiveOrExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).enterEOrLinkAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).exitEOrLinkAnd(this);
		}
	}
	public static class EOrtoAndContext extends ExclusiveOrExpressionContext {
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public EOrtoAndContext(ExclusiveOrExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).enterEOrtoAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).exitEOrtoAnd(this);
		}
	}

	public final ExclusiveOrExpressionContext exclusiveOrExpression() throws RecognitionException {
		return exclusiveOrExpression(0);
	}

	private ExclusiveOrExpressionContext exclusiveOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExclusiveOrExpressionContext _localctx = new ExclusiveOrExpressionContext(_ctx, _parentState);
		ExclusiveOrExpressionContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_exclusiveOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new EOrtoAndContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(260);
			andExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(267);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new EOrLinkAndContext(new ExclusiveOrExpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_exclusiveOrExpression);
					setState(262);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(263);
					match(Caret);
					setState(264);
					andExpression(0);
					}
					} 
				}
				setState(269);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class InclusiveOrExpressionContext extends ParserRuleContext {
		public InclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusiveOrExpression; }
	 
		public InclusiveOrExpressionContext() { }
		public void copyFrom(InclusiveOrExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IOrToeOrContext extends InclusiveOrExpressionContext {
		public ExclusiveOrExpressionContext exclusiveOrExpression() {
			return getRuleContext(ExclusiveOrExpressionContext.class,0);
		}
		public IOrToeOrContext(InclusiveOrExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).enterIOrToeOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).exitIOrToeOr(this);
		}
	}
	public static class IOrLinkeOrContext extends InclusiveOrExpressionContext {
		public InclusiveOrExpressionContext inclusiveOrExpression() {
			return getRuleContext(InclusiveOrExpressionContext.class,0);
		}
		public ExclusiveOrExpressionContext exclusiveOrExpression() {
			return getRuleContext(ExclusiveOrExpressionContext.class,0);
		}
		public IOrLinkeOrContext(InclusiveOrExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).enterIOrLinkeOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).exitIOrLinkeOr(this);
		}
	}

	public final InclusiveOrExpressionContext inclusiveOrExpression() throws RecognitionException {
		return inclusiveOrExpression(0);
	}

	private InclusiveOrExpressionContext inclusiveOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InclusiveOrExpressionContext _localctx = new InclusiveOrExpressionContext(_ctx, _parentState);
		InclusiveOrExpressionContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_inclusiveOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new IOrToeOrContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(271);
			exclusiveOrExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(278);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new IOrLinkeOrContext(new InclusiveOrExpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_inclusiveOrExpression);
					setState(273);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(274);
					match(Or);
					setState(275);
					exclusiveOrExpression(0);
					}
					} 
				}
				setState(280);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LogicalAndExpressionContext extends ParserRuleContext {
		public LogicalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalAndExpression; }
	 
		public LogicalAndExpressionContext() { }
		public void copyFrom(LogicalAndExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LogicAndToiOrContext extends LogicalAndExpressionContext {
		public InclusiveOrExpressionContext inclusiveOrExpression() {
			return getRuleContext(InclusiveOrExpressionContext.class,0);
		}
		public LogicAndToiOrContext(LogicalAndExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).enterLogicAndToiOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).exitLogicAndToiOr(this);
		}
	}
	public static class LogicAndLinkiOrContext extends LogicalAndExpressionContext {
		public LogicalAndExpressionContext logicalAndExpression() {
			return getRuleContext(LogicalAndExpressionContext.class,0);
		}
		public InclusiveOrExpressionContext inclusiveOrExpression() {
			return getRuleContext(InclusiveOrExpressionContext.class,0);
		}
		public LogicAndLinkiOrContext(LogicalAndExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).enterLogicAndLinkiOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).exitLogicAndLinkiOr(this);
		}
	}

	public final LogicalAndExpressionContext logicalAndExpression() throws RecognitionException {
		return logicalAndExpression(0);
	}

	private LogicalAndExpressionContext logicalAndExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicalAndExpressionContext _localctx = new LogicalAndExpressionContext(_ctx, _parentState);
		LogicalAndExpressionContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_logicalAndExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new LogicAndToiOrContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(282);
			inclusiveOrExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(289);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicAndLinkiOrContext(new LogicalAndExpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_logicalAndExpression);
					setState(284);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(285);
					match(AndAnd);
					setState(286);
					inclusiveOrExpression(0);
					}
					} 
				}
				setState(291);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LogicalOrExpressionContext extends ParserRuleContext {
		public LogicalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOrExpression; }
	 
		public LogicalOrExpressionContext() { }
		public void copyFrom(LogicalOrExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LogicOrLinkAndContext extends LogicalOrExpressionContext {
		public LogicalOrExpressionContext logicalOrExpression() {
			return getRuleContext(LogicalOrExpressionContext.class,0);
		}
		public LogicalAndExpressionContext logicalAndExpression() {
			return getRuleContext(LogicalAndExpressionContext.class,0);
		}
		public LogicOrLinkAndContext(LogicalOrExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).enterLogicOrLinkAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).exitLogicOrLinkAnd(this);
		}
	}
	public static class LogicOrToAndContext extends LogicalOrExpressionContext {
		public LogicalAndExpressionContext logicalAndExpression() {
			return getRuleContext(LogicalAndExpressionContext.class,0);
		}
		public LogicOrToAndContext(LogicalOrExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).enterLogicOrToAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).exitLogicOrToAnd(this);
		}
	}

	public final LogicalOrExpressionContext logicalOrExpression() throws RecognitionException {
		return logicalOrExpression(0);
	}

	private LogicalOrExpressionContext logicalOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicalOrExpressionContext _localctx = new LogicalOrExpressionContext(_ctx, _parentState);
		LogicalOrExpressionContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_logicalOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new LogicOrToAndContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(293);
			logicalAndExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(300);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicOrLinkAndContext(new LogicalOrExpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_logicalOrExpression);
					setState(295);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(296);
					match(OrOr);
					setState(297);
					logicalAndExpression(0);
					}
					} 
				}
				setState(302);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AssignmentExpressionContext extends ParserRuleContext {
		public AssignmentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExpression; }
	 
		public AssignmentExpressionContext() { }
		public void copyFrom(AssignmentExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssToLogicOrContext extends AssignmentExpressionContext {
		public LogicalOrExpressionContext logicalOrExpression() {
			return getRuleContext(LogicalOrExpressionContext.class,0);
		}
		public AssToLogicOrContext(AssignmentExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).enterAssToLogicOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).exitAssToLogicOr(this);
		}
	}
	public static class UnaryLinkAssContext extends AssignmentExpressionContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode Assign() { return getToken(mxxParser.Assign, 0); }
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public UnaryLinkAssContext(AssignmentExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).enterUnaryLinkAss(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).exitUnaryLinkAss(this);
		}
	}

	public final AssignmentExpressionContext assignmentExpression() throws RecognitionException {
		AssignmentExpressionContext _localctx = new AssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_assignmentExpression);
		try {
			setState(308);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				_localctx = new AssToLogicOrContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(303);
				logicalOrExpression(0);
				}
				break;
			case 2:
				_localctx = new UnaryLinkAssContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(304);
				unaryExpression();
				setState(305);
				match(Assign);
				setState(306);
				assignmentExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionseqContext extends ParserRuleContext {
		public ExpressionseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionseq; }
	 
		public ExpressionseqContext() { }
		public void copyFrom(ExpressionseqContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExpLinkAssignContext extends ExpressionseqContext {
		public ExpressionseqContext expressionseq() {
			return getRuleContext(ExpressionseqContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ExpLinkAssignContext(ExpressionseqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).enterExpLinkAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).exitExpLinkAssign(this);
		}
	}
	public static class ExpToAssignContext extends ExpressionseqContext {
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ExpToAssignContext(ExpressionseqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).enterExpToAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).exitExpToAssign(this);
		}
	}

	public final ExpressionseqContext expressionseq() throws RecognitionException {
		return expressionseq(0);
	}

	private ExpressionseqContext expressionseq(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionseqContext _localctx = new ExpressionseqContext(_ctx, _parentState);
		ExpressionseqContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_expressionseq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ExpToAssignContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(311);
			assignmentExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(318);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpLinkAssignContext(new ExpressionseqContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expressionseq);
					setState(313);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(314);
					match(Comma);
					setState(315);
					assignmentExpression();
					}
					} 
				}
				setState(320);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TypeSpecifierContext extends ParserRuleContext {
		public TypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSpecifier; }
	 
		public TypeSpecifierContext() { }
		public void copyFrom(TypeSpecifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Type_boolContext extends TypeSpecifierContext {
		public TerminalNode Bool() { return getToken(mxxParser.Bool, 0); }
		public ArrSufSeqContext arrSufSeq() {
			return getRuleContext(ArrSufSeqContext.class,0);
		}
		public Type_boolContext(TypeSpecifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).enterType_bool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).exitType_bool(this);
		}
	}
	public static class Type_voidContext extends TypeSpecifierContext {
		public TerminalNode Void() { return getToken(mxxParser.Void, 0); }
		public ArrSufSeqContext arrSufSeq() {
			return getRuleContext(ArrSufSeqContext.class,0);
		}
		public Type_voidContext(TypeSpecifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).enterType_void(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).exitType_void(this);
		}
	}
	public static class Type_intContext extends TypeSpecifierContext {
		public TerminalNode Int() { return getToken(mxxParser.Int, 0); }
		public ArrSufSeqContext arrSufSeq() {
			return getRuleContext(ArrSufSeqContext.class,0);
		}
		public Type_intContext(TypeSpecifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).enterType_int(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).exitType_int(this);
		}
	}
	public static class Type_StringContext extends TypeSpecifierContext {
		public TerminalNode String() { return getToken(mxxParser.String, 0); }
		public ArrSufSeqContext arrSufSeq() {
			return getRuleContext(ArrSufSeqContext.class,0);
		}
		public Type_StringContext(TypeSpecifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).enterType_String(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).exitType_String(this);
		}
	}
	public static class Type_OtherContext extends TypeSpecifierContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ArrSufSeqContext arrSufSeq() {
			return getRuleContext(ArrSufSeqContext.class,0);
		}
		public Type_OtherContext(TypeSpecifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).enterType_Other(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).exitType_Other(this);
		}
	}

	public final TypeSpecifierContext typeSpecifier() throws RecognitionException {
		TypeSpecifierContext _localctx = new TypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_typeSpecifier);
		try {
			setState(341);
			switch (_input.LA(1)) {
			case Void:
				_localctx = new Type_voidContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(321);
				match(Void);
				setState(323);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(322);
					arrSufSeq();
					}
					break;
				}
				}
				break;
			case Int:
				_localctx = new Type_intContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(325);
				match(Int);
				setState(327);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(326);
					arrSufSeq();
					}
					break;
				}
				}
				break;
			case Bool:
				_localctx = new Type_boolContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(329);
				match(Bool);
				setState(331);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(330);
					arrSufSeq();
					}
					break;
				}
				}
				break;
			case String:
				_localctx = new Type_StringContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(333);
				match(String);
				setState(335);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(334);
					arrSufSeq();
					}
					break;
				}
				}
				break;
			case Identifier:
				_localctx = new Type_OtherContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(337);
				identifier();
				setState(339);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(338);
					arrSufSeq();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class To_select_stmtContext extends StatementContext {
		public SelectionStatementContext selectionStatement() {
			return getRuleContext(SelectionStatementContext.class,0);
		}
		public To_select_stmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).enterTo_select_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).exitTo_select_stmt(this);
		}
	}
	public static class To_iter_stmtContext extends StatementContext {
		public IterationStatementContext iterationStatement() {
			return getRuleContext(IterationStatementContext.class,0);
		}
		public To_iter_stmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).enterTo_iter_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).exitTo_iter_stmt(this);
		}
	}
	public static class To_jump_stmtContext extends StatementContext {
		public JumpStatementContext jumpStatement() {
			return getRuleContext(JumpStatementContext.class,0);
		}
		public To_jump_stmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).enterTo_jump_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).exitTo_jump_stmt(this);
		}
	}
	public static class To_comp_stmtContext extends StatementContext {
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public To_comp_stmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).enterTo_comp_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).exitTo_comp_stmt(this);
		}
	}
	public static class To_exp_stmtContext extends StatementContext {
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public To_exp_stmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).enterTo_exp_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).exitTo_exp_stmt(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_statement);
		try {
			setState(348);
			switch (_input.LA(1)) {
			case LeftBrace:
				_localctx = new To_comp_stmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(343);
				compoundStatement();
				}
				break;
			case New:
			case Null:
			case LeftParen:
			case Plus:
			case PlusPlus:
			case Minus:
			case MinusMinus:
			case Not:
			case Tilde:
			case Semi:
			case BoolLiteral:
			case Identifier:
			case IntegerLiteral:
			case StringLiteral:
				_localctx = new To_exp_stmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(344);
				expressionStatement();
				}
				break;
			case If:
				_localctx = new To_select_stmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(345);
				selectionStatement();
				}
				break;
			case For:
			case While:
				_localctx = new To_iter_stmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(346);
				iterationStatement();
				}
				break;
			case Break:
			case Continue:
			case Return:
				_localctx = new To_jump_stmtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(347);
				jumpStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompoundStatementContext extends ParserRuleContext {
		public TerminalNode LeftBrace() { return getToken(mxxParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(mxxParser.RightBrace, 0); }
		public BlockItemListContext blockItemList() {
			return getRuleContext(BlockItemListContext.class,0);
		}
		public CompoundStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).enterCompoundStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).exitCompoundStatement(this);
		}
	}

	public final CompoundStatementContext compoundStatement() throws RecognitionException {
		CompoundStatementContext _localctx = new CompoundStatementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_compoundStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			match(LeftBrace);
			setState(352);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Break) | (1L << Continue) | (1L << For) | (1L << If) | (1L << Int) | (1L << New) | (1L << Return) | (1L << String) | (1L << Void) | (1L << While) | (1L << Null) | (1L << Bool) | (1L << LeftParen) | (1L << LeftBrace) | (1L << Plus) | (1L << PlusPlus) | (1L << Minus) | (1L << MinusMinus) | (1L << Not) | (1L << Tilde) | (1L << Semi) | (1L << BoolLiteral) | (1L << Identifier) | (1L << IntegerLiteral) | (1L << StringLiteral))) != 0)) {
				{
				setState(351);
				blockItemList(0);
				}
			}

			setState(354);
			match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockItemListContext extends ParserRuleContext {
		public BlockItemListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockItemList; }
	 
		public BlockItemListContext() { }
		public void copyFrom(BlockItemListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Blck_singleContext extends BlockItemListContext {
		public BlockItemContext blockItem() {
			return getRuleContext(BlockItemContext.class,0);
		}
		public Blck_singleContext(BlockItemListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).enterBlck_single(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).exitBlck_single(this);
		}
	}
	public static class Blck_expandContext extends BlockItemListContext {
		public BlockItemListContext blockItemList() {
			return getRuleContext(BlockItemListContext.class,0);
		}
		public BlockItemContext blockItem() {
			return getRuleContext(BlockItemContext.class,0);
		}
		public Blck_expandContext(BlockItemListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).enterBlck_expand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).exitBlck_expand(this);
		}
	}

	public final BlockItemListContext blockItemList() throws RecognitionException {
		return blockItemList(0);
	}

	private BlockItemListContext blockItemList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BlockItemListContext _localctx = new BlockItemListContext(_ctx, _parentState);
		BlockItemListContext _prevctx = _localctx;
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_blockItemList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Blck_singleContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(357);
			blockItem();
			}
			_ctx.stop = _input.LT(-1);
			setState(363);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Blck_expandContext(new BlockItemListContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_blockItemList);
					setState(359);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(360);
					blockItem();
					}
					} 
				}
				setState(365);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BlockItemContext extends ParserRuleContext {
		public BlockItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockItem; }
	 
		public BlockItemContext() { }
		public void copyFrom(BlockItemContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Blckunit_declareContext extends BlockItemContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public Blckunit_declareContext(BlockItemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).enterBlckunit_declare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).exitBlckunit_declare(this);
		}
	}
	public static class Blckunit_commonContext extends BlockItemContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Blckunit_commonContext(BlockItemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).enterBlckunit_common(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).exitBlckunit_common(this);
		}
	}

	public final BlockItemContext blockItem() throws RecognitionException {
		BlockItemContext _localctx = new BlockItemContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_blockItem);
		try {
			setState(368);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				_localctx = new Blckunit_declareContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(366);
				declaration();
				}
				break;
			case 2:
				_localctx = new Blckunit_commonContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(367);
				statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionStatementContext extends ParserRuleContext {
		public TerminalNode Semi() { return getToken(mxxParser.Semi, 0); }
		public ExpressionseqContext expressionseq() {
			return getRuleContext(ExpressionseqContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).exitExpressionStatement(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_expressionStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << New) | (1L << Null) | (1L << LeftParen) | (1L << Plus) | (1L << PlusPlus) | (1L << Minus) | (1L << MinusMinus) | (1L << Not) | (1L << Tilde) | (1L << BoolLiteral) | (1L << Identifier) | (1L << IntegerLiteral) | (1L << StringLiteral))) != 0)) {
				{
				setState(370);
				expressionseq(0);
				}
			}

			setState(373);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectionStatementContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(mxxParser.If, 0); }
		public TerminalNode LeftParen() { return getToken(mxxParser.LeftParen, 0); }
		public ExpressionseqContext expressionseq() {
			return getRuleContext(ExpressionseqContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(mxxParser.RightParen, 0); }
		public List<BlockItemContext> blockItem() {
			return getRuleContexts(BlockItemContext.class);
		}
		public BlockItemContext blockItem(int i) {
			return getRuleContext(BlockItemContext.class,i);
		}
		public TerminalNode Else() { return getToken(mxxParser.Else, 0); }
		public SelectionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).enterSelectionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).exitSelectionStatement(this);
		}
	}

	public final SelectionStatementContext selectionStatement() throws RecognitionException {
		SelectionStatementContext _localctx = new SelectionStatementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_selectionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			match(If);
			setState(376);
			match(LeftParen);
			setState(377);
			expressionseq(0);
			setState(378);
			match(RightParen);
			setState(379);
			blockItem();
			setState(382);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(380);
				match(Else);
				setState(381);
				blockItem();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IterationStatementContext extends ParserRuleContext {
		public TerminalNode While() { return getToken(mxxParser.While, 0); }
		public TerminalNode LeftParen() { return getToken(mxxParser.LeftParen, 0); }
		public List<AssignmentExpressionContext> assignmentExpression() {
			return getRuleContexts(AssignmentExpressionContext.class);
		}
		public AssignmentExpressionContext assignmentExpression(int i) {
			return getRuleContext(AssignmentExpressionContext.class,i);
		}
		public TerminalNode RightParen() { return getToken(mxxParser.RightParen, 0); }
		public BlockItemContext blockItem() {
			return getRuleContext(BlockItemContext.class,0);
		}
		public TerminalNode For() { return getToken(mxxParser.For, 0); }
		public List<TerminalNode> Semi() { return getTokens(mxxParser.Semi); }
		public TerminalNode Semi(int i) {
			return getToken(mxxParser.Semi, i);
		}
		public IterationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).enterIterationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).exitIterationStatement(this);
		}
	}

	public final IterationStatementContext iterationStatement() throws RecognitionException {
		IterationStatementContext _localctx = new IterationStatementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_iterationStatement);
		int _la;
		try {
			setState(405);
			switch (_input.LA(1)) {
			case While:
				enterOuterAlt(_localctx, 1);
				{
				setState(384);
				match(While);
				setState(385);
				match(LeftParen);
				setState(386);
				assignmentExpression();
				setState(387);
				match(RightParen);
				setState(388);
				blockItem();
				}
				break;
			case For:
				enterOuterAlt(_localctx, 2);
				{
				setState(390);
				match(For);
				setState(391);
				match(LeftParen);
				setState(393);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << New) | (1L << Null) | (1L << LeftParen) | (1L << Plus) | (1L << PlusPlus) | (1L << Minus) | (1L << MinusMinus) | (1L << Not) | (1L << Tilde) | (1L << BoolLiteral) | (1L << Identifier) | (1L << IntegerLiteral) | (1L << StringLiteral))) != 0)) {
					{
					setState(392);
					assignmentExpression();
					}
				}

				setState(395);
				match(Semi);
				setState(397);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << New) | (1L << Null) | (1L << LeftParen) | (1L << Plus) | (1L << PlusPlus) | (1L << Minus) | (1L << MinusMinus) | (1L << Not) | (1L << Tilde) | (1L << BoolLiteral) | (1L << Identifier) | (1L << IntegerLiteral) | (1L << StringLiteral))) != 0)) {
					{
					setState(396);
					assignmentExpression();
					}
				}

				setState(399);
				match(Semi);
				setState(401);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << New) | (1L << Null) | (1L << LeftParen) | (1L << Plus) | (1L << PlusPlus) | (1L << Minus) | (1L << MinusMinus) | (1L << Not) | (1L << Tilde) | (1L << BoolLiteral) | (1L << Identifier) | (1L << IntegerLiteral) | (1L << StringLiteral))) != 0)) {
					{
					setState(400);
					assignmentExpression();
					}
				}

				setState(403);
				match(RightParen);
				setState(404);
				blockItem();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JumpStatementContext extends ParserRuleContext {
		public TerminalNode Continue() { return getToken(mxxParser.Continue, 0); }
		public TerminalNode Semi() { return getToken(mxxParser.Semi, 0); }
		public TerminalNode Break() { return getToken(mxxParser.Break, 0); }
		public TerminalNode Return() { return getToken(mxxParser.Return, 0); }
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public JumpStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jumpStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).enterJumpStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).exitJumpStatement(this);
		}
	}

	public final JumpStatementContext jumpStatement() throws RecognitionException {
		JumpStatementContext _localctx = new JumpStatementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_jumpStatement);
		int _la;
		try {
			setState(416);
			switch (_input.LA(1)) {
			case Continue:
				enterOuterAlt(_localctx, 1);
				{
				setState(407);
				match(Continue);
				setState(408);
				match(Semi);
				}
				break;
			case Break:
				enterOuterAlt(_localctx, 2);
				{
				setState(409);
				match(Break);
				setState(410);
				match(Semi);
				}
				break;
			case Return:
				enterOuterAlt(_localctx, 3);
				{
				setState(411);
				match(Return);
				setState(413);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << New) | (1L << Null) | (1L << LeftParen) | (1L << Plus) | (1L << PlusPlus) | (1L << Minus) | (1L << MinusMinus) | (1L << Not) | (1L << Tilde) | (1L << BoolLiteral) | (1L << Identifier) | (1L << IntegerLiteral) | (1L << StringLiteral))) != 0)) {
					{
					setState(412);
					assignmentExpression();
					}
				}

				setState(415);
				match(Semi);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TranslationUnitContext extends ParserRuleContext {
		public TranslationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_translationUnit; }
	 
		public TranslationUnitContext() { }
		public void copyFrom(TranslationUnitContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Trans_expandContext extends TranslationUnitContext {
		public TranslationUnitContext translationUnit() {
			return getRuleContext(TranslationUnitContext.class,0);
		}
		public ExternalDeclarationContext externalDeclaration() {
			return getRuleContext(ExternalDeclarationContext.class,0);
		}
		public Trans_expandContext(TranslationUnitContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).enterTrans_expand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).exitTrans_expand(this);
		}
	}
	public static class Trans_unitContext extends TranslationUnitContext {
		public ExternalDeclarationContext externalDeclaration() {
			return getRuleContext(ExternalDeclarationContext.class,0);
		}
		public Trans_unitContext(TranslationUnitContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).enterTrans_unit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).exitTrans_unit(this);
		}
	}

	public final TranslationUnitContext translationUnit() throws RecognitionException {
		return translationUnit(0);
	}

	private TranslationUnitContext translationUnit(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TranslationUnitContext _localctx = new TranslationUnitContext(_ctx, _parentState);
		TranslationUnitContext _prevctx = _localctx;
		int _startState = 60;
		enterRecursionRule(_localctx, 60, RULE_translationUnit, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Trans_unitContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(419);
			externalDeclaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(425);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Trans_expandContext(new TranslationUnitContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_translationUnit);
					setState(421);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(422);
					externalDeclaration();
					}
					} 
				}
				setState(427);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExternalDeclarationContext extends ParserRuleContext {
		public ExternalDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_externalDeclaration; }
	 
		public ExternalDeclarationContext() { }
		public void copyFrom(ExternalDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ClassDefContext extends ExternalDeclarationContext {
		public ClassDefinitionContext classDefinition() {
			return getRuleContext(ClassDefinitionContext.class,0);
		}
		public ClassDefContext(ExternalDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).enterClassDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).exitClassDef(this);
		}
	}
	public static class VarDefContext extends ExternalDeclarationContext {
		public ExtraDeclarationContext extraDeclaration() {
			return getRuleContext(ExtraDeclarationContext.class,0);
		}
		public VarDefContext(ExternalDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).enterVarDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).exitVarDef(this);
		}
	}
	public static class FuncDefContext extends ExternalDeclarationContext {
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class,0);
		}
		public FuncDefContext(ExternalDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).enterFuncDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).exitFuncDef(this);
		}
	}

	public final ExternalDeclarationContext externalDeclaration() throws RecognitionException {
		ExternalDeclarationContext _localctx = new ExternalDeclarationContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_externalDeclaration);
		try {
			setState(431);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				_localctx = new FuncDefContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(428);
				functionDefinition();
				}
				break;
			case 2:
				_localctx = new ClassDefContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(429);
				classDefinition();
				}
				break;
			case 3:
				_localctx = new VarDefContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(430);
				extraDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode Semi() { return getToken(mxxParser.Semi, 0); }
		public TerminalNode Assign() { return getToken(mxxParser.Assign, 0); }
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			typeSpecifier();
			setState(434);
			identifier();
			setState(437);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(435);
				match(Assign);
				setState(436);
				assignmentExpression();
				}
			}

			setState(439);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExtraDeclarationContext extends ParserRuleContext {
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode Semi() { return getToken(mxxParser.Semi, 0); }
		public TerminalNode Assign() { return getToken(mxxParser.Assign, 0); }
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ExtraDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extraDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).enterExtraDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).exitExtraDeclaration(this);
		}
	}

	public final ExtraDeclarationContext extraDeclaration() throws RecognitionException {
		ExtraDeclarationContext _localctx = new ExtraDeclarationContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_extraDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			typeSpecifier();
			setState(442);
			identifier();
			setState(445);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(443);
				match(Assign);
				setState(444);
				assignmentExpression();
				}
			}

			setState(447);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDefinitionContext extends ParserRuleContext {
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(mxxParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(mxxParser.RightParen, 0); }
		public BlockItemListContext blockItemList() {
			return getRuleContext(BlockItemListContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).enterFunctionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).exitFunctionDefinition(this);
		}
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_functionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
			typeSpecifier();
			setState(450);
			identifier();
			setState(451);
			match(LeftParen);
			setState(453);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Int) | (1L << String) | (1L << Void) | (1L << Bool) | (1L << Identifier))) != 0)) {
				{
				setState(452);
				parameterList();
				}
			}

			setState(455);
			match(RightParen);
			setState(456);
			match(LeftBrace);
			setState(457);
			blockItemList(0);
			setState(458);
			match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterListContext extends ParserRuleContext {
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
	 
		public ParameterListContext() { }
		public void copyFrom(ParameterListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Para_unitContext extends ParameterListContext {
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public Para_unitContext(ParameterListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).enterPara_unit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).exitPara_unit(this);
		}
	}
	public static class Para_expandContext extends ParameterListContext {
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public TerminalNode Comma() { return getToken(mxxParser.Comma, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public Para_expandContext(ParameterListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).enterPara_expand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).exitPara_expand(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_parameterList);
		try {
			setState(465);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				_localctx = new Para_unitContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(460);
				parameter();
				}
				break;
			case 2:
				_localctx = new Para_expandContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(461);
				parameter();
				setState(462);
				match(Comma);
				setState(463);
				parameterList();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterContext extends ParserRuleContext {
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).exitParameter(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			typeSpecifier();
			setState(468);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDefinitionContext extends ParserRuleContext {
		public TerminalNode Class() { return getToken(mxxParser.Class, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LeftBrace() { return getToken(mxxParser.LeftBrace, 0); }
		public ClassDeclarationListContext classDeclarationList() {
			return getRuleContext(ClassDeclarationListContext.class,0);
		}
		public TerminalNode RightBrace() { return getToken(mxxParser.RightBrace, 0); }
		public ClassDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).enterClassDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).exitClassDefinition(this);
		}
	}

	public final ClassDefinitionContext classDefinition() throws RecognitionException {
		ClassDefinitionContext _localctx = new ClassDefinitionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_classDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470);
			match(Class);
			setState(471);
			identifier();
			setState(472);
			match(LeftBrace);
			setState(473);
			classDeclarationList();
			setState(474);
			match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDeclarationListContext extends ParserRuleContext {
		public ClassDeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclarationList; }
	 
		public ClassDeclarationListContext() { }
		public void copyFrom(ClassDeclarationListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Classdef_expandContext extends ClassDeclarationListContext {
		public ClassdeclarationContext classdeclaration() {
			return getRuleContext(ClassdeclarationContext.class,0);
		}
		public ClassDeclarationListContext classDeclarationList() {
			return getRuleContext(ClassDeclarationListContext.class,0);
		}
		public Classdef_expandContext(ClassDeclarationListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).enterClassdef_expand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).exitClassdef_expand(this);
		}
	}
	public static class Classdef_unitContext extends ClassDeclarationListContext {
		public ClassdeclarationContext classdeclaration() {
			return getRuleContext(ClassdeclarationContext.class,0);
		}
		public Classdef_unitContext(ClassDeclarationListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).enterClassdef_unit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).exitClassdef_unit(this);
		}
	}

	public final ClassDeclarationListContext classDeclarationList() throws RecognitionException {
		ClassDeclarationListContext _localctx = new ClassDeclarationListContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_classDeclarationList);
		try {
			setState(480);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				_localctx = new Classdef_unitContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(476);
				classdeclaration();
				}
				break;
			case 2:
				_localctx = new Classdef_expandContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(477);
				classdeclaration();
				setState(478);
				classDeclarationList();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassdeclarationContext extends ParserRuleContext {
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode Semi() { return getToken(mxxParser.Semi, 0); }
		public ClassdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classdeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).enterClassdeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).exitClassdeclaration(this);
		}
	}

	public final ClassdeclarationContext classdeclaration() throws RecognitionException {
		ClassdeclarationContext _localctx = new ClassdeclarationContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_classdeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
			typeSpecifier();
			setState(483);
			identifier();
			setState(484);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(mxxParser.Identifier, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxxListener ) ((mxxListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return postfixExpression2_sempred((PostfixExpression2Context)_localctx, predIndex);
		case 6:
			return argumentExpressionList_sempred((ArgumentExpressionListContext)_localctx, predIndex);
		case 9:
			return multiplicativeExpression_sempred((MultiplicativeExpressionContext)_localctx, predIndex);
		case 10:
			return additiveExpression_sempred((AdditiveExpressionContext)_localctx, predIndex);
		case 11:
			return shiftExpression_sempred((ShiftExpressionContext)_localctx, predIndex);
		case 12:
			return relationalExpression_sempred((RelationalExpressionContext)_localctx, predIndex);
		case 13:
			return equalityExpression_sempred((EqualityExpressionContext)_localctx, predIndex);
		case 14:
			return andExpression_sempred((AndExpressionContext)_localctx, predIndex);
		case 15:
			return exclusiveOrExpression_sempred((ExclusiveOrExpressionContext)_localctx, predIndex);
		case 16:
			return inclusiveOrExpression_sempred((InclusiveOrExpressionContext)_localctx, predIndex);
		case 17:
			return logicalAndExpression_sempred((LogicalAndExpressionContext)_localctx, predIndex);
		case 18:
			return logicalOrExpression_sempred((LogicalOrExpressionContext)_localctx, predIndex);
		case 20:
			return expressionseq_sempred((ExpressionseqContext)_localctx, predIndex);
		case 24:
			return blockItemList_sempred((BlockItemListContext)_localctx, predIndex);
		case 30:
			return translationUnit_sempred((TranslationUnitContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean postfixExpression2_sempred(PostfixExpression2Context _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean argumentExpressionList_sempred(ArgumentExpressionListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean multiplicativeExpression_sempred(MultiplicativeExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 3);
		case 7:
			return precpred(_ctx, 2);
		case 8:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean additiveExpression_sempred(AdditiveExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 2);
		case 10:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean shiftExpression_sempred(ShiftExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 2);
		case 12:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean relationalExpression_sempred(RelationalExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 13:
			return precpred(_ctx, 4);
		case 14:
			return precpred(_ctx, 3);
		case 15:
			return precpred(_ctx, 2);
		case 16:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean equalityExpression_sempred(EqualityExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 17:
			return precpred(_ctx, 2);
		case 18:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean andExpression_sempred(AndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 19:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean exclusiveOrExpression_sempred(ExclusiveOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 20:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean inclusiveOrExpression_sempred(InclusiveOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 21:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean logicalAndExpression_sempred(LogicalAndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 22:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean logicalOrExpression_sempred(LogicalOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 23:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expressionseq_sempred(ExpressionseqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 24:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean blockItemList_sempred(BlockItemListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 25:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean translationUnit_sempred(TranslationUnitContext _localctx, int predIndex) {
		switch (predIndex) {
		case 26:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3@\u01eb\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\5\2"+
		"V\n\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\5\3_\n\3\3\4\3\4\3\4\3\4\5\4e\n\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5p\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\5\6|\n\6\3\6\5\6\177\n\6\3\6\3\6\3\6\5\6\u0084\n\6\3\6"+
		"\3\6\3\6\3\6\3\6\7\6\u008b\n\6\f\6\16\6\u008e\13\6\3\7\3\7\3\7\5\7\u0093"+
		"\n\7\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u009b\n\b\f\b\16\b\u009e\13\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00a8\n\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00b8\n\13\f\13\16\13\u00bb\13"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00c6\n\f\f\f\16\f\u00c9\13"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00d4\n\r\f\r\16\r\u00d7\13"+
		"\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\7\16\u00e8\n\16\f\16\16\16\u00eb\13\16\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\7\17\u00f6\n\17\f\17\16\17\u00f9\13\17\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\7\20\u0101\n\20\f\20\16\20\u0104\13\20\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\7\21\u010c\n\21\f\21\16\21\u010f\13\21\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\7\22\u0117\n\22\f\22\16\22\u011a\13\22\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\7\23\u0122\n\23\f\23\16\23\u0125\13\23\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\7\24\u012d\n\24\f\24\16\24\u0130\13\24\3\25\3"+
		"\25\3\25\3\25\3\25\5\25\u0137\n\25\3\26\3\26\3\26\3\26\3\26\3\26\7\26"+
		"\u013f\n\26\f\26\16\26\u0142\13\26\3\27\3\27\5\27\u0146\n\27\3\27\3\27"+
		"\5\27\u014a\n\27\3\27\3\27\5\27\u014e\n\27\3\27\3\27\5\27\u0152\n\27\3"+
		"\27\3\27\5\27\u0156\n\27\5\27\u0158\n\27\3\30\3\30\3\30\3\30\3\30\5\30"+
		"\u015f\n\30\3\31\3\31\5\31\u0163\n\31\3\31\3\31\3\32\3\32\3\32\3\32\3"+
		"\32\7\32\u016c\n\32\f\32\16\32\u016f\13\32\3\33\3\33\5\33\u0173\n\33\3"+
		"\34\5\34\u0176\n\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35"+
		"\u0181\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u018c\n"+
		"\36\3\36\3\36\5\36\u0190\n\36\3\36\3\36\5\36\u0194\n\36\3\36\3\36\5\36"+
		"\u0198\n\36\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u01a0\n\37\3\37\5\37\u01a3"+
		"\n\37\3 \3 \3 \3 \3 \7 \u01aa\n \f \16 \u01ad\13 \3!\3!\3!\5!\u01b2\n"+
		"!\3\"\3\"\3\"\3\"\5\"\u01b8\n\"\3\"\3\"\3#\3#\3#\3#\5#\u01c0\n#\3#\3#"+
		"\3$\3$\3$\3$\5$\u01c8\n$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\5%\u01d4\n%\3&"+
		"\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\5(\u01e3\n(\3)\3)\3)\3)\3*"+
		"\3*\3*\2\21\n\16\24\26\30\32\34\36 \"$&*\62>+\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPR\2\3\5\2##%%/\60\u020b"+
		"\2U\3\2\2\2\4^\3\2\2\2\6d\3\2\2\2\bo\3\2\2\2\nq\3\2\2\2\f\u0092\3\2\2"+
		"\2\16\u0094\3\2\2\2\20\u00a7\3\2\2\2\22\u00a9\3\2\2\2\24\u00ab\3\2\2\2"+
		"\26\u00bc\3\2\2\2\30\u00ca\3\2\2\2\32\u00d8\3\2\2\2\34\u00ec\3\2\2\2\36"+
		"\u00fa\3\2\2\2 \u0105\3\2\2\2\"\u0110\3\2\2\2$\u011b\3\2\2\2&\u0126\3"+
		"\2\2\2(\u0136\3\2\2\2*\u0138\3\2\2\2,\u0157\3\2\2\2.\u015e\3\2\2\2\60"+
		"\u0160\3\2\2\2\62\u0166\3\2\2\2\64\u0172\3\2\2\2\66\u0175\3\2\2\28\u0179"+
		"\3\2\2\2:\u0197\3\2\2\2<\u01a2\3\2\2\2>\u01a4\3\2\2\2@\u01b1\3\2\2\2B"+
		"\u01b3\3\2\2\2D\u01bb\3\2\2\2F\u01c3\3\2\2\2H\u01d3\3\2\2\2J\u01d5\3\2"+
		"\2\2L\u01d8\3\2\2\2N\u01e2\3\2\2\2P\u01e4\3\2\2\2R\u01e8\3\2\2\2TV\5>"+
		" \2UT\3\2\2\2UV\3\2\2\2VW\3\2\2\2WX\7\2\2\3X\3\3\2\2\2Y_\7\3\2\2Z[\7\31"+
		"\2\2[\\\5*\26\2\\]\7\32\2\2]_\3\2\2\2^Y\3\2\2\2^Z\3\2\2\2_\5\3\2\2\2`"+
		"e\5\4\3\2ab\5\4\3\2bc\5\6\4\2ce\3\2\2\2d`\3\2\2\2da\3\2\2\2e\7\3\2\2\2"+
		"fp\5R*\2gp\7;\2\2hp\7<\2\2ip\79\2\2jk\7\27\2\2kl\5*\26\2lm\7\30\2\2mp"+
		"\3\2\2\2np\7\25\2\2of\3\2\2\2og\3\2\2\2oh\3\2\2\2oi\3\2\2\2oj\3\2\2\2"+
		"on\3\2\2\2p\t\3\2\2\2qr\b\6\1\2rs\5\b\5\2s\u008c\3\2\2\2tu\f\7\2\2u\u008b"+
		"\5\6\4\2vw\f\6\2\2wx\78\2\2x~\5R*\2y{\7\27\2\2z|\5H%\2{z\3\2\2\2{|\3\2"+
		"\2\2|}\3\2\2\2}\177\7\30\2\2~y\3\2\2\2~\177\3\2\2\2\177\u008b\3\2\2\2"+
		"\u0080\u0081\f\5\2\2\u0081\u0083\7\27\2\2\u0082\u0084\5\16\b\2\u0083\u0082"+
		"\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u008b\7\30\2\2"+
		"\u0086\u0087\f\4\2\2\u0087\u008b\7$\2\2\u0088\u0089\f\3\2\2\u0089\u008b"+
		"\7&\2\2\u008at\3\2\2\2\u008av\3\2\2\2\u008a\u0080\3\2\2\2\u008a\u0086"+
		"\3\2\2\2\u008a\u0088\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c"+
		"\u008d\3\2\2\2\u008d\13\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0090\7\16\2"+
		"\2\u0090\u0093\5,\27\2\u0091\u0093\5\n\6\2\u0092\u008f\3\2\2\2\u0092\u0091"+
		"\3\2\2\2\u0093\r\3\2\2\2\u0094\u0095\b\b\1\2\u0095\u0096\5(\25\2\u0096"+
		"\u009c\3\2\2\2\u0097\u0098\f\3\2\2\u0098\u0099\7\64\2\2\u0099\u009b\5"+
		"(\25\2\u009a\u0097\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c"+
		"\u009d\3\2\2\2\u009d\17\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a8\5\f\7"+
		"\2\u00a0\u00a1\7$\2\2\u00a1\u00a8\5\20\t\2\u00a2\u00a3\7&\2\2\u00a3\u00a8"+
		"\5\20\t\2\u00a4\u00a5\5\22\n\2\u00a5\u00a6\5\20\t\2\u00a6\u00a8\3\2\2"+
		"\2\u00a7\u009f\3\2\2\2\u00a7\u00a0\3\2\2\2\u00a7\u00a2\3\2\2\2\u00a7\u00a4"+
		"\3\2\2\2\u00a8\21\3\2\2\2\u00a9\u00aa\t\2\2\2\u00aa\23\3\2\2\2\u00ab\u00ac"+
		"\b\13\1\2\u00ac\u00ad\5\20\t\2\u00ad\u00b9\3\2\2\2\u00ae\u00af\f\5\2\2"+
		"\u00af\u00b0\7\'\2\2\u00b0\u00b8\5\20\t\2\u00b1\u00b2\f\4\2\2\u00b2\u00b3"+
		"\7(\2\2\u00b3\u00b8\5\20\t\2\u00b4\u00b5\f\3\2\2\u00b5\u00b6\7)\2\2\u00b6"+
		"\u00b8\5\20\t\2\u00b7\u00ae\3\2\2\2\u00b7\u00b1\3\2\2\2\u00b7\u00b4\3"+
		"\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba"+
		"\25\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00bd\b\f\1\2\u00bd\u00be\5\24\13"+
		"\2\u00be\u00c7\3\2\2\2\u00bf\u00c0\f\4\2\2\u00c0\u00c1\7#\2\2\u00c1\u00c6"+
		"\5\24\13\2\u00c2\u00c3\f\3\2\2\u00c3\u00c4\7%\2\2\u00c4\u00c6\5\24\13"+
		"\2\u00c5\u00bf\3\2\2\2\u00c5\u00c2\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c5"+
		"\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\27\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca"+
		"\u00cb\b\r\1\2\u00cb\u00cc\5\26\f\2\u00cc\u00d5\3\2\2\2\u00cd\u00ce\f"+
		"\4\2\2\u00ce\u00cf\7!\2\2\u00cf\u00d4\5\26\f\2\u00d0\u00d1\f\3\2\2\u00d1"+
		"\u00d2\7\"\2\2\u00d2\u00d4\5\26\f\2\u00d3\u00cd\3\2\2\2\u00d3\u00d0\3"+
		"\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6"+
		"\31\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00d9\b\16\1\2\u00d9\u00da\5\30"+
		"\r\2\u00da\u00e9\3\2\2\2\u00db\u00dc\f\6\2\2\u00dc\u00dd\7\35\2\2\u00dd"+
		"\u00e8\5\30\r\2\u00de\u00df\f\5\2\2\u00df\u00e0\7\37\2\2\u00e0\u00e8\5"+
		"\30\r\2\u00e1\u00e2\f\4\2\2\u00e2\u00e3\7\36\2\2\u00e3\u00e8\5\30\r\2"+
		"\u00e4\u00e5\f\3\2\2\u00e5\u00e6\7 \2\2\u00e6\u00e8\5\30\r\2\u00e7\u00db"+
		"\3\2\2\2\u00e7\u00de\3\2\2\2\u00e7\u00e1\3\2\2\2\u00e7\u00e4\3\2\2\2\u00e8"+
		"\u00eb\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\33\3\2\2"+
		"\2\u00eb\u00e9\3\2\2\2\u00ec\u00ed\b\17\1\2\u00ed\u00ee\5\32\16\2\u00ee"+
		"\u00f7\3\2\2\2\u00ef\u00f0\f\4\2\2\u00f0\u00f1\7\66\2\2\u00f1\u00f6\5"+
		"\32\16\2\u00f2\u00f3\f\3\2\2\u00f3\u00f4\7\67\2\2\u00f4\u00f6\5\32\16"+
		"\2\u00f5\u00ef\3\2\2\2\u00f5\u00f2\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5"+
		"\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\35\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa"+
		"\u00fb\b\20\1\2\u00fb\u00fc\5\34\17\2\u00fc\u0102\3\2\2\2\u00fd\u00fe"+
		"\f\3\2\2\u00fe\u00ff\7*\2\2\u00ff\u0101\5\34\17\2\u0100\u00fd\3\2\2\2"+
		"\u0101\u0104\3\2\2\2\u0102\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103\37"+
		"\3\2\2\2\u0104\u0102\3\2\2\2\u0105\u0106\b\21\1\2\u0106\u0107\5\36\20"+
		"\2\u0107\u010d\3\2\2\2\u0108\u0109\f\3\2\2\u0109\u010a\7.\2\2\u010a\u010c"+
		"\5\36\20\2\u010b\u0108\3\2\2\2\u010c\u010f\3\2\2\2\u010d\u010b\3\2\2\2"+
		"\u010d\u010e\3\2\2\2\u010e!\3\2\2\2\u010f\u010d\3\2\2\2\u0110\u0111\b"+
		"\22\1\2\u0111\u0112\5 \21\2\u0112\u0118\3\2\2\2\u0113\u0114\f\3\2\2\u0114"+
		"\u0115\7+\2\2\u0115\u0117\5 \21\2\u0116\u0113\3\2\2\2\u0117\u011a\3\2"+
		"\2\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119#\3\2\2\2\u011a\u0118"+
		"\3\2\2\2\u011b\u011c\b\23\1\2\u011c\u011d\5\"\22\2\u011d\u0123\3\2\2\2"+
		"\u011e\u011f\f\3\2\2\u011f\u0120\7,\2\2\u0120\u0122\5\"\22\2\u0121\u011e"+
		"\3\2\2\2\u0122\u0125\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124"+
		"%\3\2\2\2\u0125\u0123\3\2\2\2\u0126\u0127\b\24\1\2\u0127\u0128\5$\23\2"+
		"\u0128\u012e\3\2\2\2\u0129\u012a\f\3\2\2\u012a\u012b\7-\2\2\u012b\u012d"+
		"\5$\23\2\u012c\u0129\3\2\2\2\u012d\u0130\3\2\2\2\u012e\u012c\3\2\2\2\u012e"+
		"\u012f\3\2\2\2\u012f\'\3\2\2\2\u0130\u012e\3\2\2\2\u0131\u0137\5&\24\2"+
		"\u0132\u0133\5\20\t\2\u0133\u0134\7\65\2\2\u0134\u0135\5(\25\2\u0135\u0137"+
		"\3\2\2\2\u0136\u0131\3\2\2\2\u0136\u0132\3\2\2\2\u0137)\3\2\2\2\u0138"+
		"\u0139\b\26\1\2\u0139\u013a\5(\25\2\u013a\u0140\3\2\2\2\u013b\u013c\f"+
		"\3\2\2\u013c\u013d\7\64\2\2\u013d\u013f\5(\25\2\u013e\u013b\3\2\2\2\u013f"+
		"\u0142\3\2\2\2\u0140\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141+\3\2\2\2"+
		"\u0142\u0140\3\2\2\2\u0143\u0145\7\23\2\2\u0144\u0146\5\6\4\2\u0145\u0144"+
		"\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0158\3\2\2\2\u0147\u0149\7\r\2\2\u0148"+
		"\u014a\5\6\4\2\u0149\u0148\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u0158\3\2"+
		"\2\2\u014b\u014d\7\26\2\2\u014c\u014e\5\6\4\2\u014d\u014c\3\2\2\2\u014d"+
		"\u014e\3\2\2\2\u014e\u0158\3\2\2\2\u014f\u0151\7\21\2\2\u0150\u0152\5"+
		"\6\4\2\u0151\u0150\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0158\3\2\2\2\u0153"+
		"\u0155\5R*\2\u0154\u0156\5\6\4\2\u0155\u0154\3\2\2\2\u0155\u0156\3\2\2"+
		"\2\u0156\u0158\3\2\2\2\u0157\u0143\3\2\2\2\u0157\u0147\3\2\2\2\u0157\u014b"+
		"\3\2\2\2\u0157\u014f\3\2\2\2\u0157\u0153\3\2\2\2\u0158-\3\2\2\2\u0159"+
		"\u015f\5\60\31\2\u015a\u015f\5\66\34\2\u015b\u015f\58\35\2\u015c\u015f"+
		"\5:\36\2\u015d\u015f\5<\37\2\u015e\u0159\3\2\2\2\u015e\u015a\3\2\2\2\u015e"+
		"\u015b\3\2\2\2\u015e\u015c\3\2\2\2\u015e\u015d\3\2\2\2\u015f/\3\2\2\2"+
		"\u0160\u0162\7\33\2\2\u0161\u0163\5\62\32\2\u0162\u0161\3\2\2\2\u0162"+
		"\u0163\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0165\7\34\2\2\u0165\61\3\2\2"+
		"\2\u0166\u0167\b\32\1\2\u0167\u0168\5\64\33\2\u0168\u016d\3\2\2\2\u0169"+
		"\u016a\f\3\2\2\u016a\u016c\5\64\33\2\u016b\u0169\3\2\2\2\u016c\u016f\3"+
		"\2\2\2\u016d\u016b\3\2\2\2\u016d\u016e\3\2\2\2\u016e\63\3\2\2\2\u016f"+
		"\u016d\3\2\2\2\u0170\u0173\5B\"\2\u0171\u0173\5.\30\2\u0172\u0170\3\2"+
		"\2\2\u0172\u0171\3\2\2\2\u0173\65\3\2\2\2\u0174\u0176\5*\26\2\u0175\u0174"+
		"\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u0178\7\63\2\2"+
		"\u0178\67\3\2\2\2\u0179\u017a\7\f\2\2\u017a\u017b\7\27\2\2\u017b\u017c"+
		"\5*\26\2\u017c\u017d\7\30\2\2\u017d\u0180\5\64\33\2\u017e\u017f\7\n\2"+
		"\2\u017f\u0181\5\64\33\2\u0180\u017e\3\2\2\2\u0180\u0181\3\2\2\2\u0181"+
		"9\3\2\2\2\u0182\u0183\7\24\2\2\u0183\u0184\7\27\2\2\u0184\u0185\5(\25"+
		"\2\u0185\u0186\7\30\2\2\u0186\u0187\5\64\33\2\u0187\u0198\3\2\2\2\u0188"+
		"\u0189\7\13\2\2\u0189\u018b\7\27\2\2\u018a\u018c\5(\25\2\u018b\u018a\3"+
		"\2\2\2\u018b\u018c\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018f\7\63\2\2\u018e"+
		"\u0190\5(\25\2\u018f\u018e\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u0191\3\2"+
		"\2\2\u0191\u0193\7\63\2\2\u0192\u0194\5(\25\2\u0193\u0192\3\2\2\2\u0193"+
		"\u0194\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u0196\7\30\2\2\u0196\u0198\5"+
		"\64\33\2\u0197\u0182\3\2\2\2\u0197\u0188\3\2\2\2\u0198;\3\2\2\2\u0199"+
		"\u019a\7\7\2\2\u019a\u01a3\7\63\2\2\u019b\u019c\7\4\2\2\u019c\u01a3\7"+
		"\63\2\2\u019d\u019f\7\17\2\2\u019e\u01a0\5(\25\2\u019f\u019e\3\2\2\2\u019f"+
		"\u01a0\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a3\7\63\2\2\u01a2\u0199\3"+
		"\2\2\2\u01a2\u019b\3\2\2\2\u01a2\u019d\3\2\2\2\u01a3=\3\2\2\2\u01a4\u01a5"+
		"\b \1\2\u01a5\u01a6\5@!\2\u01a6\u01ab\3\2\2\2\u01a7\u01a8\f\3\2\2\u01a8"+
		"\u01aa\5@!\2\u01a9\u01a7\3\2\2\2\u01aa\u01ad\3\2\2\2\u01ab\u01a9\3\2\2"+
		"\2\u01ab\u01ac\3\2\2\2\u01ac?\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ae\u01b2"+
		"\5F$\2\u01af\u01b2\5L\'\2\u01b0\u01b2\5D#\2\u01b1\u01ae\3\2\2\2\u01b1"+
		"\u01af\3\2\2\2\u01b1\u01b0\3\2\2\2\u01b2A\3\2\2\2\u01b3\u01b4\5,\27\2"+
		"\u01b4\u01b7\5R*\2\u01b5\u01b6\7\65\2\2\u01b6\u01b8\5(\25\2\u01b7\u01b5"+
		"\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01ba\7\63\2\2"+
		"\u01baC\3\2\2\2\u01bb\u01bc\5,\27\2\u01bc\u01bf\5R*\2\u01bd\u01be\7\65"+
		"\2\2\u01be\u01c0\5(\25\2\u01bf\u01bd\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0"+
		"\u01c1\3\2\2\2\u01c1\u01c2\7\63\2\2\u01c2E\3\2\2\2\u01c3\u01c4\5,\27\2"+
		"\u01c4\u01c5\5R*\2\u01c5\u01c7\7\27\2\2\u01c6\u01c8\5H%\2\u01c7\u01c6"+
		"\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9\u01ca\7\30\2\2"+
		"\u01ca\u01cb\7\33\2\2\u01cb\u01cc\5\62\32\2\u01cc\u01cd\7\34\2\2\u01cd"+
		"G\3\2\2\2\u01ce\u01d4\5J&\2\u01cf\u01d0\5J&\2\u01d0\u01d1\7\64\2\2\u01d1"+
		"\u01d2\5H%\2\u01d2\u01d4\3\2\2\2\u01d3\u01ce\3\2\2\2\u01d3\u01cf\3\2\2"+
		"\2\u01d4I\3\2\2\2\u01d5\u01d6\5,\27\2\u01d6\u01d7\5R*\2\u01d7K\3\2\2\2"+
		"\u01d8\u01d9\7\b\2\2\u01d9\u01da\5R*\2\u01da\u01db\7\33\2\2\u01db\u01dc"+
		"\5N(\2\u01dc\u01dd\7\34\2\2\u01ddM\3\2\2\2\u01de\u01e3\5P)\2\u01df\u01e0"+
		"\5P)\2\u01e0\u01e1\5N(\2\u01e1\u01e3\3\2\2\2\u01e2\u01de\3\2\2\2\u01e2"+
		"\u01df\3\2\2\2\u01e3O\3\2\2\2\u01e4\u01e5\5,\27\2\u01e5\u01e6\5R*\2\u01e6"+
		"\u01e7\7\63\2\2\u01e7Q\3\2\2\2\u01e8\u01e9\7:\2\2\u01e9S\3\2\2\28U^do"+
		"{~\u0083\u008a\u008c\u0092\u009c\u00a7\u00b7\u00b9\u00c5\u00c7\u00d3\u00d5"+
		"\u00e7\u00e9\u00f5\u00f7\u0102\u010d\u0118\u0123\u012e\u0136\u0140\u0145"+
		"\u0149\u014d\u0151\u0155\u0157\u015e\u0162\u016d\u0172\u0175\u0180\u018b"+
		"\u018f\u0193\u0197\u019f\u01a2\u01ab\u01b1\u01b7\u01bf\u01c7\u01d3\u01e2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}