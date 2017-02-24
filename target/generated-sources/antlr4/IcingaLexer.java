// Generated from Icinga.g4 by ANTLR 4.4
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class IcingaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__7=1, T__6=2, T__5=3, T__4=4, T__3=5, T__2=6, T__1=7, T__0=8, VAR=9, 
		STRING=10, ICINGA_OBJ_TYPE=11, OBJECT=12, TEMPLATE=13, APPLY=14, TEXT=15, 
		EQUAL=16, WS=17, NUMBER=18;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'"
	};
	public static final String[] ruleNames = {
		"T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "VAR", 
		"STRING", "ICINGA_OBJ_TYPE", "OBJECT", "TEMPLATE", "APPLY", "TEXT", "EQUAL", 
		"WS", "NUMBER", "INT"
	};


	public IcingaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Icinga.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\24\u00bf\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4"+
		"\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3"+
		"\13\3\13\7\13H\n\13\f\13\16\13K\13\13\3\13\3\13\3\13\5\13P\n\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\5\fy\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\6\20\u0092"+
		"\n\20\r\20\16\20\u0093\3\20\5\20\u0097\n\20\3\21\3\21\3\22\6\22\u009c"+
		"\n\22\r\22\16\22\u009d\3\22\3\22\3\23\5\23\u00a3\n\23\3\23\3\23\3\23\6"+
		"\23\u00a8\n\23\r\23\16\23\u00a9\3\23\5\23\u00ad\n\23\3\23\3\23\5\23\u00b1"+
		"\n\23\3\23\5\23\u00b4\n\23\3\24\3\24\3\24\7\24\u00b9\n\24\f\24\16\24\u00bc"+
		"\13\24\5\24\u00be\n\24\2\2\25\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\2\3\2\7\4\2$$^^\t\2$"+
		"$/\60\62;C\\^^aac|\5\2\13\f\17\17\"\"\3\2\62;\3\2\63;\u00ce\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\3)\3\2\2\2\5.\3\2\2\2\7\63\3\2\2\2\t\65\3\2\2\2\13\67\3\2\2\2\r9"+
		"\3\2\2\2\17;\3\2\2\2\21=\3\2\2\2\23C\3\2\2\2\25O\3\2\2\2\27x\3\2\2\2\31"+
		"z\3\2\2\2\33\u0081\3\2\2\2\35\u008a\3\2\2\2\37\u0096\3\2\2\2!\u0098\3"+
		"\2\2\2#\u009b\3\2\2\2%\u00b3\3\2\2\2\'\u00bd\3\2\2\2)*\7p\2\2*+\7w\2\2"+
		"+,\7n\2\2,-\7n\2\2-\4\3\2\2\2./\7v\2\2/\60\7t\2\2\60\61\7w\2\2\61\62\7"+
		"g\2\2\62\6\3\2\2\2\63\64\7]\2\2\64\b\3\2\2\2\65\66\7}\2\2\66\n\3\2\2\2"+
		"\678\7.\2\28\f\3\2\2\29:\7_\2\2:\16\3\2\2\2;<\7\177\2\2<\20\3\2\2\2=>"+
		"\7h\2\2>?\7c\2\2?@\7n\2\2@A\7u\2\2AB\7g\2\2B\22\3\2\2\2CD\5\37\20\2D\24"+
		"\3\2\2\2EI\7$\2\2FH\n\2\2\2GF\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JL"+
		"\3\2\2\2KI\3\2\2\2LP\7$\2\2MN\7$\2\2NP\7$\2\2OE\3\2\2\2OM\3\2\2\2P\26"+
		"\3\2\2\2QR\7U\2\2RS\7g\2\2ST\7t\2\2TU\7x\2\2UV\7k\2\2VW\7e\2\2Wy\7g\2"+
		"\2XY\7J\2\2YZ\7q\2\2Z[\7u\2\2[y\7v\2\2\\]\7P\2\2]^\7q\2\2^_\7v\2\2_`\7"+
		"k\2\2`a\7h\2\2ab\7k\2\2bc\7e\2\2cd\7c\2\2de\7v\2\2ef\7k\2\2fg\7q\2\2g"+
		"y\7p\2\2hi\7W\2\2ij\7u\2\2jk\7g\2\2ky\7t\2\2lm\7E\2\2mn\7j\2\2no\7g\2"+
		"\2op\7e\2\2pq\7m\2\2qr\7E\2\2rs\7q\2\2st\7o\2\2tu\7o\2\2uv\7c\2\2vw\7"+
		"p\2\2wy\7f\2\2xQ\3\2\2\2xX\3\2\2\2x\\\3\2\2\2xh\3\2\2\2xl\3\2\2\2y\30"+
		"\3\2\2\2z{\7q\2\2{|\7d\2\2|}\7l\2\2}~\7g\2\2~\177\7e\2\2\177\u0080\7v"+
		"\2\2\u0080\32\3\2\2\2\u0081\u0082\7v\2\2\u0082\u0083\7g\2\2\u0083\u0084"+
		"\7o\2\2\u0084\u0085\7r\2\2\u0085\u0086\7n\2\2\u0086\u0087\7c\2\2\u0087"+
		"\u0088\7v\2\2\u0088\u0089\7g\2\2\u0089\34\3\2\2\2\u008a\u008b\7c\2\2\u008b"+
		"\u008c\7r\2\2\u008c\u008d\7r\2\2\u008d\u008e\7n\2\2\u008e\u008f\7{\2\2"+
		"\u008f\36\3\2\2\2\u0090\u0092\t\3\2\2\u0091\u0090\3\2\2\2\u0092\u0093"+
		"\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0097\3\2\2\2\u0095"+
		"\u0097\5%\23\2\u0096\u0091\3\2\2\2\u0096\u0095\3\2\2\2\u0097 \3\2\2\2"+
		"\u0098\u0099\7?\2\2\u0099\"\3\2\2\2\u009a\u009c\t\4\2\2\u009b\u009a\3"+
		"\2\2\2\u009c\u009d\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e"+
		"\u009f\3\2\2\2\u009f\u00a0\b\22\2\2\u00a0$\3\2\2\2\u00a1\u00a3\7/\2\2"+
		"\u00a2\u00a1\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5"+
		"\5\'\24\2\u00a5\u00a7\7\60\2\2\u00a6\u00a8\t\5\2\2\u00a7\u00a6\3\2\2\2"+
		"\u00a8\u00a9\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00b4"+
		"\3\2\2\2\u00ab\u00ad\7/\2\2\u00ac\u00ab\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad"+
		"\u00ae\3\2\2\2\u00ae\u00b4\5\'\24\2\u00af\u00b1\7/\2\2\u00b0\u00af\3\2"+
		"\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b4\5\'\24\2\u00b3"+
		"\u00a2\3\2\2\2\u00b3\u00ac\3\2\2\2\u00b3\u00b0\3\2\2\2\u00b4&\3\2\2\2"+
		"\u00b5\u00be\7\62\2\2\u00b6\u00ba\t\6\2\2\u00b7\u00b9\t\5\2\2\u00b8\u00b7"+
		"\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb"+
		"\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00b5\3\2\2\2\u00bd\u00b6\3\2"+
		"\2\2\u00be(\3\2\2\2\20\2IOx\u0093\u0096\u009d\u00a2\u00a9\u00ac\u00b0"+
		"\u00b3\u00ba\u00bd\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}