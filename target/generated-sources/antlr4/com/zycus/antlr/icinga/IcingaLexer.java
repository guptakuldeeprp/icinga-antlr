// Generated from Icinga.g4 by ANTLR 4.4

    package com.zycus.antlr.icinga;

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
		T__15=1, T__14=2, T__13=3, T__12=4, T__11=5, T__10=6, T__9=7, T__8=8, 
		T__7=9, T__6=10, T__5=11, T__4=12, T__3=13, T__2=14, T__1=15, T__0=16, 
		ICINGA_OBJ_TYPE=17, OBJECT=18, TEMPLATE=19, APPLY=20, VAR=21, STRING=22, 
		TEXT=23, WS=24, NUMBER=25, COMMENT=26, BLOCKCOMMENT=27;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'"
	};
	public static final String[] ruleNames = {
		"T__15", "T__14", "T__13", "T__12", "T__11", "T__10", "T__9", "T__8", 
		"T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "ICINGA_OBJ_TYPE", 
		"OBJECT", "TEMPLATE", "APPLY", "VAR", "STRING", "TEXT", "WS", "NUMBER", 
		"INT", "COMMENT", "BLOCKCOMMENT"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\35\u0120\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3"+
		"\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00bb"+
		"\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\27\3\27\7\27"+
		"\u00d7\n\27\f\27\16\27\u00da\13\27\3\27\3\27\3\27\5\27\u00df\n\27\3\30"+
		"\6\30\u00e2\n\30\r\30\16\30\u00e3\3\30\5\30\u00e7\n\30\3\31\6\31\u00ea"+
		"\n\31\r\31\16\31\u00eb\3\31\3\31\3\32\5\32\u00f1\n\32\3\32\3\32\3\32\6"+
		"\32\u00f6\n\32\r\32\16\32\u00f7\3\32\5\32\u00fb\n\32\3\32\3\32\5\32\u00ff"+
		"\n\32\3\32\5\32\u0102\n\32\3\33\3\33\3\33\7\33\u0107\n\33\f\33\16\33\u010a"+
		"\13\33\5\33\u010c\n\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\7"+
		"\35\u0117\n\35\f\35\16\35\u011a\13\35\3\35\3\35\3\35\3\35\3\35\3\u0118"+
		"\2\36\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\2\67\349\35"+
		"\3\2\7\4\2$$^^\t\2$$/\60\62;C\\^^aac|\5\2\13\f\17\17\"\"\3\2\62;\3\2\63"+
		";\u0131\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\3;\3\2\2\2"+
		"\5@\3\2\2\2\7M\3\2\2\2\tO\3\2\2\2\13Q\3\2\2\2\rS\3\2\2\2\17U\3\2\2\2\21"+
		"W\3\2\2\2\23\\\3\2\2\2\25i\3\2\2\2\27n\3\2\2\2\31s\3\2\2\2\33{\3\2\2\2"+
		"\35}\3\2\2\2\37\u0084\3\2\2\2!\u0089\3\2\2\2#\u00ba\3\2\2\2%\u00bc\3\2"+
		"\2\2\'\u00c3\3\2\2\2)\u00cc\3\2\2\2+\u00d2\3\2\2\2-\u00de\3\2\2\2/\u00e6"+
		"\3\2\2\2\61\u00e9\3\2\2\2\63\u0101\3\2\2\2\65\u010b\3\2\2\2\67\u010d\3"+
		"\2\2\29\u0112\3\2\2\2;<\7v\2\2<=\7t\2\2=>\7w\2\2>?\7g\2\2?\4\3\2\2\2@"+
		"A\7E\2\2AB\7j\2\2BC\7g\2\2CD\7e\2\2DE\7m\2\2EF\7E\2\2FG\7q\2\2GH\7o\2"+
		"\2HI\7o\2\2IJ\7c\2\2JK\7p\2\2KL\7f\2\2L\6\3\2\2\2MN\7]\2\2N\b\3\2\2\2"+
		"OP\7}\2\2P\n\3\2\2\2QR\7_\2\2R\f\3\2\2\2ST\7?\2\2T\16\3\2\2\2UV\7\177"+
		"\2\2V\20\3\2\2\2WX\7J\2\2XY\7q\2\2YZ\7u\2\2Z[\7v\2\2[\22\3\2\2\2\\]\7"+
		"P\2\2]^\7q\2\2^_\7v\2\2_`\7k\2\2`a\7h\2\2ab\7k\2\2bc\7e\2\2cd\7c\2\2d"+
		"e\7v\2\2ef\7k\2\2fg\7q\2\2gh\7p\2\2h\24\3\2\2\2ij\7p\2\2jk\7w\2\2kl\7"+
		"n\2\2lm\7n\2\2m\26\3\2\2\2no\7W\2\2op\7u\2\2pq\7g\2\2qr\7t\2\2r\30\3\2"+
		"\2\2st\7U\2\2tu\7g\2\2uv\7t\2\2vw\7x\2\2wx\7k\2\2xy\7e\2\2yz\7g\2\2z\32"+
		"\3\2\2\2{|\7.\2\2|\34\3\2\2\2}~\7k\2\2~\177\7o\2\2\177\u0080\7r\2\2\u0080"+
		"\u0081\7q\2\2\u0081\u0082\7t\2\2\u0082\u0083\7v\2\2\u0083\36\3\2\2\2\u0084"+
		"\u0085\7\\\2\2\u0085\u0086\7q\2\2\u0086\u0087\7p\2\2\u0087\u0088\7g\2"+
		"\2\u0088 \3\2\2\2\u0089\u008a\7h\2\2\u008a\u008b\7c\2\2\u008b\u008c\7"+
		"n\2\2\u008c\u008d\7u\2\2\u008d\u008e\7g\2\2\u008e\"\3\2\2\2\u008f\u0090"+
		"\7U\2\2\u0090\u0091\7g\2\2\u0091\u0092\7t\2\2\u0092\u0093\7x\2\2\u0093"+
		"\u0094\7k\2\2\u0094\u0095\7e\2\2\u0095\u00bb\7g\2\2\u0096\u0097\7J\2\2"+
		"\u0097\u0098\7q\2\2\u0098\u0099\7u\2\2\u0099\u00bb\7v\2\2\u009a\u009b"+
		"\7P\2\2\u009b\u009c\7q\2\2\u009c\u009d\7v\2\2\u009d\u009e\7k\2\2\u009e"+
		"\u009f\7h\2\2\u009f\u00a0\7k\2\2\u00a0\u00a1\7e\2\2\u00a1\u00a2\7c\2\2"+
		"\u00a2\u00a3\7v\2\2\u00a3\u00a4\7k\2\2\u00a4\u00a5\7q\2\2\u00a5\u00bb"+
		"\7p\2\2\u00a6\u00a7\7W\2\2\u00a7\u00a8\7u\2\2\u00a8\u00a9\7g\2\2\u00a9"+
		"\u00bb\7t\2\2\u00aa\u00ab\7E\2\2\u00ab\u00ac\7j\2\2\u00ac\u00ad\7g\2\2"+
		"\u00ad\u00ae\7e\2\2\u00ae\u00af\7m\2\2\u00af\u00b0\7E\2\2\u00b0\u00b1"+
		"\7q\2\2\u00b1\u00b2\7o\2\2\u00b2\u00b3\7o\2\2\u00b3\u00b4\7c\2\2\u00b4"+
		"\u00b5\7p\2\2\u00b5\u00bb\7f\2\2\u00b6\u00b7\7\\\2\2\u00b7\u00b8\7q\2"+
		"\2\u00b8\u00b9\7p\2\2\u00b9\u00bb\7g\2\2\u00ba\u008f\3\2\2\2\u00ba\u0096"+
		"\3\2\2\2\u00ba\u009a\3\2\2\2\u00ba\u00a6\3\2\2\2\u00ba\u00aa\3\2\2\2\u00ba"+
		"\u00b6\3\2\2\2\u00bb$\3\2\2\2\u00bc\u00bd\7q\2\2\u00bd\u00be\7d\2\2\u00be"+
		"\u00bf\7l\2\2\u00bf\u00c0\7g\2\2\u00c0\u00c1\7e\2\2\u00c1\u00c2\7v\2\2"+
		"\u00c2&\3\2\2\2\u00c3\u00c4\7v\2\2\u00c4\u00c5\7g\2\2\u00c5\u00c6\7o\2"+
		"\2\u00c6\u00c7\7r\2\2\u00c7\u00c8\7n\2\2\u00c8\u00c9\7c\2\2\u00c9\u00ca"+
		"\7v\2\2\u00ca\u00cb\7g\2\2\u00cb(\3\2\2\2\u00cc\u00cd\7c\2\2\u00cd\u00ce"+
		"\7r\2\2\u00ce\u00cf\7r\2\2\u00cf\u00d0\7n\2\2\u00d0\u00d1\7{\2\2\u00d1"+
		"*\3\2\2\2\u00d2\u00d3\5/\30\2\u00d3,\3\2\2\2\u00d4\u00d8\7$\2\2\u00d5"+
		"\u00d7\n\2\2\2\u00d6\u00d5\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d6\3\2"+
		"\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00db\3\2\2\2\u00da\u00d8\3\2\2\2\u00db"+
		"\u00df\7$\2\2\u00dc\u00dd\7$\2\2\u00dd\u00df\7$\2\2\u00de\u00d4\3\2\2"+
		"\2\u00de\u00dc\3\2\2\2\u00df.\3\2\2\2\u00e0\u00e2\t\3\2\2\u00e1\u00e0"+
		"\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4"+
		"\u00e7\3\2\2\2\u00e5\u00e7\5\63\32\2\u00e6\u00e1\3\2\2\2\u00e6\u00e5\3"+
		"\2\2\2\u00e7\60\3\2\2\2\u00e8\u00ea\t\4\2\2\u00e9\u00e8\3\2\2\2\u00ea"+
		"\u00eb\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed\3\2"+
		"\2\2\u00ed\u00ee\b\31\2\2\u00ee\62\3\2\2\2\u00ef\u00f1\7/\2\2\u00f0\u00ef"+
		"\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3\5\65\33\2"+
		"\u00f3\u00f5\7\60\2\2\u00f4\u00f6\t\5\2\2\u00f5\u00f4\3\2\2\2\u00f6\u00f7"+
		"\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u0102\3\2\2\2\u00f9"+
		"\u00fb\7/\2\2\u00fa\u00f9\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\3\2"+
		"\2\2\u00fc\u0102\5\65\33\2\u00fd\u00ff\7/\2\2\u00fe\u00fd\3\2\2\2\u00fe"+
		"\u00ff\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0102\5\65\33\2\u0101\u00f0\3"+
		"\2\2\2\u0101\u00fa\3\2\2\2\u0101\u00fe\3\2\2\2\u0102\64\3\2\2\2\u0103"+
		"\u010c\7\62\2\2\u0104\u0108\t\6\2\2\u0105\u0107\t\5\2\2\u0106\u0105\3"+
		"\2\2\2\u0107\u010a\3\2\2\2\u0108\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109"+
		"\u010c\3\2\2\2\u010a\u0108\3\2\2\2\u010b\u0103\3\2\2\2\u010b\u0104\3\2"+
		"\2\2\u010c\66\3\2\2\2\u010d\u010e\7\61\2\2\u010e\u010f\7\61\2\2\u010f"+
		"\u0110\3\2\2\2\u0110\u0111\b\34\2\2\u01118\3\2\2\2\u0112\u0113\7\61\2"+
		"\2\u0113\u0114\7,\2\2\u0114\u0118\3\2\2\2\u0115\u0117\13\2\2\2\u0116\u0115"+
		"\3\2\2\2\u0117\u011a\3\2\2\2\u0118\u0119\3\2\2\2\u0118\u0116\3\2\2\2\u0119"+
		"\u011b\3\2\2\2\u011a\u0118\3\2\2\2\u011b\u011c\7,\2\2\u011c\u011d\7\61"+
		"\2\2\u011d\u011e\3\2\2\2\u011e\u011f\b\35\2\2\u011f:\3\2\2\2\21\2\u00ba"+
		"\u00d8\u00de\u00e3\u00e6\u00eb\u00f0\u00f7\u00fa\u00fe\u0101\u0108\u010b"+
		"\u0118\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}