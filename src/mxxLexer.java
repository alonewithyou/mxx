// Generated from mxx.g4 by ANTLR 4.5
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class mxxLexer extends Lexer {
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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "Break", "Char", "Const", "Continue", "Class", "Do", "Else", "For", 
		"If", "Int", "New", "Return", "Static", "String", "Struct", "Void", "While", 
		"Null", "True", "False", "Bool", "LeftParen", "RightParen", "LeftBracket", 
		"RightBracket", "LeftBrace", "RightBrace", "Less", "LessEqual", "Greater", 
		"GreaterEqual", "LeftShift", "RightShift", "Plus", "PlusPlus", "Minus", 
		"MinusMinus", "Star", "Div", "Mod", "And", "Or", "AndAnd", "OrOr", "Caret", 
		"Not", "Tilde", "Question", "Colon", "Semi", "Comma", "Assign", "Equal", 
		"NotEqual", "Dot", "BoolLiteral", "Identifier", "Nondigit", "Digit", "IntegerLiteral", 
		"NonzeroDigit", "Sign", "DigitSequence", "CharacterConstant", "CCharSequence", 
		"CChar", "EscapeSequence", "SimpleEscapeSequence", "StringLiteral", "SCharSequence", 
		"SChar", "Whitespace", "Newline", "BlockComment", "LineComment"
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


	public mxxLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "mxx.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2@\u01c7\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3"+
		"\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3"+
		"\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3"+
		"\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3"+
		"\36\3\37\3\37\3\37\3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3%\3%\3%"+
		"\3&\3&\3\'\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3-\3.\3.\3.\3/"+
		"\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3"+
		"\66\3\67\3\67\3\67\38\38\38\39\39\3:\3:\5:\u0162\n:\3;\3;\3;\7;\u0167"+
		"\n;\f;\16;\u016a\13;\3<\3<\3=\3=\3>\6>\u0171\n>\r>\16>\u0172\3?\3?\3@"+
		"\3@\3A\6A\u017a\nA\rA\16A\u017b\3B\3B\3B\3B\3C\6C\u0183\nC\rC\16C\u0184"+
		"\3D\3D\5D\u0189\nD\3E\3E\3F\3F\3F\3G\3G\5G\u0192\nG\3G\3G\3H\6H\u0197"+
		"\nH\rH\16H\u0198\3I\3I\5I\u019d\nI\3J\6J\u01a0\nJ\rJ\16J\u01a1\3J\3J\3"+
		"K\3K\5K\u01a8\nK\3K\5K\u01ab\nK\3K\3K\3L\3L\3L\3L\7L\u01b3\nL\fL\16L\u01b6"+
		"\13L\3L\3L\3L\3L\3L\3M\3M\3M\3M\7M\u01c1\nM\fM\16M\u01c4\13M\3M\3M\3\u01b4"+
		"\2N\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\2+\2-\26/\27\61\30\63\31\65\32\67\339\34;"+
		"\35=\36?\37A C!E\"G#I$K%M&O\'Q(S)U*W+Y,[-]._/a\60c\61e\62g\63i\64k\65"+
		"m\66o\67q8s9u:w\2y\2{;}\2\177\2\u0081\2\u0083\2\u0085\2\u0087\2\u0089"+
		"\2\u008b\2\u008d<\u008f\2\u0091\2\u0093=\u0095>\u0097?\u0099@\3\2\13\5"+
		"\2C\\aac|\3\2\62;\3\2\63;\4\2--//\6\2\f\f\17\17))^^\f\2$$))AA^^cdhhpp"+
		"ttvvxx\6\2\f\f\17\17$$^^\4\2\13\13\"\"\4\2\f\f\17\17\u01c7\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2"+
		"\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2"+
		"\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2["+
		"\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2"+
		"\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2"+
		"\2u\3\2\2\2\2{\3\2\2\2\2\u008d\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2"+
		"\2\u0097\3\2\2\2\2\u0099\3\2\2\2\3\u009b\3\2\2\2\5\u009e\3\2\2\2\7\u00a4"+
		"\3\2\2\2\t\u00a9\3\2\2\2\13\u00af\3\2\2\2\r\u00b8\3\2\2\2\17\u00be\3\2"+
		"\2\2\21\u00c1\3\2\2\2\23\u00c6\3\2\2\2\25\u00ca\3\2\2\2\27\u00cd\3\2\2"+
		"\2\31\u00d1\3\2\2\2\33\u00d5\3\2\2\2\35\u00dc\3\2\2\2\37\u00e3\3\2\2\2"+
		"!\u00ea\3\2\2\2#\u00f1\3\2\2\2%\u00f6\3\2\2\2\'\u00fc\3\2\2\2)\u0101\3"+
		"\2\2\2+\u0106\3\2\2\2-\u010c\3\2\2\2/\u0111\3\2\2\2\61\u0113\3\2\2\2\63"+
		"\u0115\3\2\2\2\65\u0117\3\2\2\2\67\u0119\3\2\2\29\u011b\3\2\2\2;\u011d"+
		"\3\2\2\2=\u011f\3\2\2\2?\u0122\3\2\2\2A\u0124\3\2\2\2C\u0127\3\2\2\2E"+
		"\u012a\3\2\2\2G\u012d\3\2\2\2I\u012f\3\2\2\2K\u0132\3\2\2\2M\u0134\3\2"+
		"\2\2O\u0137\3\2\2\2Q\u0139\3\2\2\2S\u013b\3\2\2\2U\u013d\3\2\2\2W\u013f"+
		"\3\2\2\2Y\u0141\3\2\2\2[\u0144\3\2\2\2]\u0147\3\2\2\2_\u0149\3\2\2\2a"+
		"\u014b\3\2\2\2c\u014d\3\2\2\2e\u014f\3\2\2\2g\u0151\3\2\2\2i\u0153\3\2"+
		"\2\2k\u0155\3\2\2\2m\u0157\3\2\2\2o\u015a\3\2\2\2q\u015d\3\2\2\2s\u0161"+
		"\3\2\2\2u\u0163\3\2\2\2w\u016b\3\2\2\2y\u016d\3\2\2\2{\u0170\3\2\2\2}"+
		"\u0174\3\2\2\2\177\u0176\3\2\2\2\u0081\u0179\3\2\2\2\u0083\u017d\3\2\2"+
		"\2\u0085\u0182\3\2\2\2\u0087\u0188\3\2\2\2\u0089\u018a\3\2\2\2\u008b\u018c"+
		"\3\2\2\2\u008d\u018f\3\2\2\2\u008f\u0196\3\2\2\2\u0091\u019c\3\2\2\2\u0093"+
		"\u019f\3\2\2\2\u0095\u01aa\3\2\2\2\u0097\u01ae\3\2\2\2\u0099\u01bc\3\2"+
		"\2\2\u009b\u009c\7]\2\2\u009c\u009d\7_\2\2\u009d\4\3\2\2\2\u009e\u009f"+
		"\7d\2\2\u009f\u00a0\7t\2\2\u00a0\u00a1\7g\2\2\u00a1\u00a2\7c\2\2\u00a2"+
		"\u00a3\7m\2\2\u00a3\6\3\2\2\2\u00a4\u00a5\7e\2\2\u00a5\u00a6\7j\2\2\u00a6"+
		"\u00a7\7c\2\2\u00a7\u00a8\7t\2\2\u00a8\b\3\2\2\2\u00a9\u00aa\7e\2\2\u00aa"+
		"\u00ab\7q\2\2\u00ab\u00ac\7p\2\2\u00ac\u00ad\7u\2\2\u00ad\u00ae\7v\2\2"+
		"\u00ae\n\3\2\2\2\u00af\u00b0\7e\2\2\u00b0\u00b1\7q\2\2\u00b1\u00b2\7p"+
		"\2\2\u00b2\u00b3\7v\2\2\u00b3\u00b4\7k\2\2\u00b4\u00b5\7p\2\2\u00b5\u00b6"+
		"\7w\2\2\u00b6\u00b7\7g\2\2\u00b7\f\3\2\2\2\u00b8\u00b9\7e\2\2\u00b9\u00ba"+
		"\7n\2\2\u00ba\u00bb\7c\2\2\u00bb\u00bc\7u\2\2\u00bc\u00bd\7u\2\2\u00bd"+
		"\16\3\2\2\2\u00be\u00bf\7f\2\2\u00bf\u00c0\7q\2\2\u00c0\20\3\2\2\2\u00c1"+
		"\u00c2\7g\2\2\u00c2\u00c3\7n\2\2\u00c3\u00c4\7u\2\2\u00c4\u00c5\7g\2\2"+
		"\u00c5\22\3\2\2\2\u00c6\u00c7\7h\2\2\u00c7\u00c8\7q\2\2\u00c8\u00c9\7"+
		"t\2\2\u00c9\24\3\2\2\2\u00ca\u00cb\7k\2\2\u00cb\u00cc\7h\2\2\u00cc\26"+
		"\3\2\2\2\u00cd\u00ce\7k\2\2\u00ce\u00cf\7p\2\2\u00cf\u00d0\7v\2\2\u00d0"+
		"\30\3\2\2\2\u00d1\u00d2\7p\2\2\u00d2\u00d3\7g\2\2\u00d3\u00d4\7y\2\2\u00d4"+
		"\32\3\2\2\2\u00d5\u00d6\7t\2\2\u00d6\u00d7\7g\2\2\u00d7\u00d8\7v\2\2\u00d8"+
		"\u00d9\7w\2\2\u00d9\u00da\7t\2\2\u00da\u00db\7p\2\2\u00db\34\3\2\2\2\u00dc"+
		"\u00dd\7u\2\2\u00dd\u00de\7v\2\2\u00de\u00df\7c\2\2\u00df\u00e0\7v\2\2"+
		"\u00e0\u00e1\7k\2\2\u00e1\u00e2\7e\2\2\u00e2\36\3\2\2\2\u00e3\u00e4\7"+
		"u\2\2\u00e4\u00e5\7v\2\2\u00e5\u00e6\7t\2\2\u00e6\u00e7\7k\2\2\u00e7\u00e8"+
		"\7p\2\2\u00e8\u00e9\7i\2\2\u00e9 \3\2\2\2\u00ea\u00eb\7u\2\2\u00eb\u00ec"+
		"\7v\2\2\u00ec\u00ed\7t\2\2\u00ed\u00ee\7w\2\2\u00ee\u00ef\7e\2\2\u00ef"+
		"\u00f0\7v\2\2\u00f0\"\3\2\2\2\u00f1\u00f2\7x\2\2\u00f2\u00f3\7q\2\2\u00f3"+
		"\u00f4\7k\2\2\u00f4\u00f5\7f\2\2\u00f5$\3\2\2\2\u00f6\u00f7\7y\2\2\u00f7"+
		"\u00f8\7j\2\2\u00f8\u00f9\7k\2\2\u00f9\u00fa\7n\2\2\u00fa\u00fb\7g\2\2"+
		"\u00fb&\3\2\2\2\u00fc\u00fd\7p\2\2\u00fd\u00fe\7w\2\2\u00fe\u00ff\7n\2"+
		"\2\u00ff\u0100\7n\2\2\u0100(\3\2\2\2\u0101\u0102\7v\2\2\u0102\u0103\7"+
		"t\2\2\u0103\u0104\7w\2\2\u0104\u0105\7g\2\2\u0105*\3\2\2\2\u0106\u0107"+
		"\7h\2\2\u0107\u0108\7c\2\2\u0108\u0109\7n\2\2\u0109\u010a\7u\2\2\u010a"+
		"\u010b\7g\2\2\u010b,\3\2\2\2\u010c\u010d\7d\2\2\u010d\u010e\7q\2\2\u010e"+
		"\u010f\7q\2\2\u010f\u0110\7n\2\2\u0110.\3\2\2\2\u0111\u0112\7*\2\2\u0112"+
		"\60\3\2\2\2\u0113\u0114\7+\2\2\u0114\62\3\2\2\2\u0115\u0116\7]\2\2\u0116"+
		"\64\3\2\2\2\u0117\u0118\7_\2\2\u0118\66\3\2\2\2\u0119\u011a\7}\2\2\u011a"+
		"8\3\2\2\2\u011b\u011c\7\177\2\2\u011c:\3\2\2\2\u011d\u011e\7>\2\2\u011e"+
		"<\3\2\2\2\u011f\u0120\7>\2\2\u0120\u0121\7?\2\2\u0121>\3\2\2\2\u0122\u0123"+
		"\7@\2\2\u0123@\3\2\2\2\u0124\u0125\7@\2\2\u0125\u0126\7?\2\2\u0126B\3"+
		"\2\2\2\u0127\u0128\7>\2\2\u0128\u0129\7>\2\2\u0129D\3\2\2\2\u012a\u012b"+
		"\7@\2\2\u012b\u012c\7@\2\2\u012cF\3\2\2\2\u012d\u012e\7-\2\2\u012eH\3"+
		"\2\2\2\u012f\u0130\7-\2\2\u0130\u0131\7-\2\2\u0131J\3\2\2\2\u0132\u0133"+
		"\7/\2\2\u0133L\3\2\2\2\u0134\u0135\7/\2\2\u0135\u0136\7/\2\2\u0136N\3"+
		"\2\2\2\u0137\u0138\7,\2\2\u0138P\3\2\2\2\u0139\u013a\7\61\2\2\u013aR\3"+
		"\2\2\2\u013b\u013c\7\'\2\2\u013cT\3\2\2\2\u013d\u013e\7(\2\2\u013eV\3"+
		"\2\2\2\u013f\u0140\7~\2\2\u0140X\3\2\2\2\u0141\u0142\7(\2\2\u0142\u0143"+
		"\7(\2\2\u0143Z\3\2\2\2\u0144\u0145\7~\2\2\u0145\u0146\7~\2\2\u0146\\\3"+
		"\2\2\2\u0147\u0148\7`\2\2\u0148^\3\2\2\2\u0149\u014a\7#\2\2\u014a`\3\2"+
		"\2\2\u014b\u014c\7\u0080\2\2\u014cb\3\2\2\2\u014d\u014e\7A\2\2\u014ed"+
		"\3\2\2\2\u014f\u0150\7<\2\2\u0150f\3\2\2\2\u0151\u0152\7=\2\2\u0152h\3"+
		"\2\2\2\u0153\u0154\7.\2\2\u0154j\3\2\2\2\u0155\u0156\7?\2\2\u0156l\3\2"+
		"\2\2\u0157\u0158\7?\2\2\u0158\u0159\7?\2\2\u0159n\3\2\2\2\u015a\u015b"+
		"\7#\2\2\u015b\u015c\7?\2\2\u015cp\3\2\2\2\u015d\u015e\7\60\2\2\u015er"+
		"\3\2\2\2\u015f\u0162\5)\25\2\u0160\u0162\5+\26\2\u0161\u015f\3\2\2\2\u0161"+
		"\u0160\3\2\2\2\u0162t\3\2\2\2\u0163\u0168\5w<\2\u0164\u0167\5w<\2\u0165"+
		"\u0167\5y=\2\u0166\u0164\3\2\2\2\u0166\u0165\3\2\2\2\u0167\u016a\3\2\2"+
		"\2\u0168\u0166\3\2\2\2\u0168\u0169\3\2\2\2\u0169v\3\2\2\2\u016a\u0168"+
		"\3\2\2\2\u016b\u016c\t\2\2\2\u016cx\3\2\2\2\u016d\u016e\t\3\2\2\u016e"+
		"z\3\2\2\2\u016f\u0171\5y=\2\u0170\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172"+
		"\u0170\3\2\2\2\u0172\u0173\3\2\2\2\u0173|\3\2\2\2\u0174\u0175\t\4\2\2"+
		"\u0175~\3\2\2\2\u0176\u0177\t\5\2\2\u0177\u0080\3\2\2\2\u0178\u017a\5"+
		"y=\2\u0179\u0178\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u0179\3\2\2\2\u017b"+
		"\u017c\3\2\2\2\u017c\u0082\3\2\2\2\u017d\u017e\7)\2\2\u017e\u017f\5\u0085"+
		"C\2\u017f\u0180\7)\2\2\u0180\u0084\3\2\2\2\u0181\u0183\5\u0087D\2\u0182"+
		"\u0181\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0182\3\2\2\2\u0184\u0185\3\2"+
		"\2\2\u0185\u0086\3\2\2\2\u0186\u0189\n\6\2\2\u0187\u0189\5\u0089E\2\u0188"+
		"\u0186\3\2\2\2\u0188\u0187\3\2\2\2\u0189\u0088\3\2\2\2\u018a\u018b\5\u008b"+
		"F\2\u018b\u008a\3\2\2\2\u018c\u018d\7^\2\2\u018d\u018e\t\7\2\2\u018e\u008c"+
		"\3\2\2\2\u018f\u0191\7$\2\2\u0190\u0192\5\u008fH\2\u0191\u0190\3\2\2\2"+
		"\u0191\u0192\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0194\7$\2\2\u0194\u008e"+
		"\3\2\2\2\u0195\u0197\5\u0091I\2\u0196\u0195\3\2\2\2\u0197\u0198\3\2\2"+
		"\2\u0198\u0196\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u0090\3\2\2\2\u019a\u019d"+
		"\n\b\2\2\u019b\u019d\5\u0089E\2\u019c\u019a\3\2\2\2\u019c\u019b\3\2\2"+
		"\2\u019d\u0092\3\2\2\2\u019e\u01a0\t\t\2\2\u019f\u019e\3\2\2\2\u01a0\u01a1"+
		"\3\2\2\2\u01a1\u019f\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3"+
		"\u01a4\bJ\2\2\u01a4\u0094\3\2\2\2\u01a5\u01a7\7\17\2\2\u01a6\u01a8\7\f"+
		"\2\2\u01a7\u01a6\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01ab\3\2\2\2\u01a9"+
		"\u01ab\7\f\2\2\u01aa\u01a5\3\2\2\2\u01aa\u01a9\3\2\2\2\u01ab\u01ac\3\2"+
		"\2\2\u01ac\u01ad\bK\2\2\u01ad\u0096\3\2\2\2\u01ae\u01af\7\61\2\2\u01af"+
		"\u01b0\7,\2\2\u01b0\u01b4\3\2\2\2\u01b1\u01b3\13\2\2\2\u01b2\u01b1\3\2"+
		"\2\2\u01b3\u01b6\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b5"+
		"\u01b7\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b7\u01b8\7,\2\2\u01b8\u01b9\7\61"+
		"\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01bb\bL\2\2\u01bb\u0098\3\2\2\2\u01bc"+
		"\u01bd\7\61\2\2\u01bd\u01be\7\61\2\2\u01be\u01c2\3\2\2\2\u01bf\u01c1\n"+
		"\n\2\2\u01c0\u01bf\3\2\2\2\u01c1\u01c4\3\2\2\2\u01c2\u01c0\3\2\2\2\u01c2"+
		"\u01c3\3\2\2\2\u01c3\u01c5\3\2\2\2\u01c4\u01c2\3\2\2\2\u01c5\u01c6\bM"+
		"\2\2\u01c6\u009a\3\2\2\2\22\2\u0161\u0166\u0168\u0172\u017b\u0184\u0188"+
		"\u0191\u0198\u019c\u01a1\u01a7\u01aa\u01b4\u01c2\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}