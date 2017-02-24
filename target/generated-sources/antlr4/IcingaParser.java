// Generated from Icinga.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class IcingaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__7=1, T__6=2, T__5=3, T__4=4, T__3=5, T__2=6, T__1=7, T__0=8, VAR=9, 
		STRING=10, ICINGA_OBJ_TYPE=11, OBJECT=12, TEMPLATE=13, APPLY=14, TEXT=15, 
		EQUAL=16, WS=17, NUMBER=18;
	public static final String[] tokenNames = {
		"<INVALID>", "'null'", "'true'", "'['", "'{'", "','", "']'", "'}'", "'false'", 
		"VAR", "STRING", "ICINGA_OBJ_TYPE", "'object'", "'template'", "'apply'", 
		"TEXT", "'='", "WS", "NUMBER"
	};
	public static final int
		RULE_prog = 0, RULE_icinga_obj = 1, RULE_obj = 2, RULE_pair = 3, RULE_array = 4, 
		RULE_value = 5;
	public static final String[] ruleNames = {
		"prog", "icinga_obj", "obj", "pair", "array", "value"
	};

	@Override
	public String getGrammarFileName() { return "Icinga.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public IcingaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public List<Icinga_objContext> icinga_obj() {
			return getRuleContexts(Icinga_objContext.class);
		}
		public Icinga_objContext icinga_obj(int i) {
			return getRuleContext(Icinga_objContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IcingaListener ) ((IcingaListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IcingaListener ) ((IcingaListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(13); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(12); icinga_obj();
				}
				}
				setState(15); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==OBJECT || _la==TEMPLATE );
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

	public static class Icinga_objContext extends ParserRuleContext {
		public ObjContext obj() {
			return getRuleContext(ObjContext.class,0);
		}
		public TerminalNode OBJECT() { return getToken(IcingaParser.OBJECT, 0); }
		public TerminalNode TEMPLATE() { return getToken(IcingaParser.TEMPLATE, 0); }
		public TerminalNode STRING() { return getToken(IcingaParser.STRING, 0); }
		public TerminalNode ICINGA_OBJ_TYPE() { return getToken(IcingaParser.ICINGA_OBJ_TYPE, 0); }
		public Icinga_objContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_icinga_obj; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IcingaListener ) ((IcingaListener)listener).enterIcinga_obj(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IcingaListener ) ((IcingaListener)listener).exitIcinga_obj(this);
		}
	}

	public final Icinga_objContext icinga_obj() throws RecognitionException {
		Icinga_objContext _localctx = new Icinga_objContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_icinga_obj);
		try {
			setState(22);
			switch (_input.LA(1)) {
			case OBJECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(17); match(OBJECT);
				}
				break;
			case TEMPLATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(18); match(TEMPLATE);
				setState(19); match(ICINGA_OBJ_TYPE);
				setState(20); match(STRING);
				setState(21); obj();
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

	public static class ObjContext extends ParserRuleContext {
		public PairContext pair(int i) {
			return getRuleContext(PairContext.class,i);
		}
		public List<PairContext> pair() {
			return getRuleContexts(PairContext.class);
		}
		public ObjContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_obj; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IcingaListener ) ((IcingaListener)listener).enterObj(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IcingaListener ) ((IcingaListener)listener).exitObj(this);
		}
	}

	public final ObjContext obj() throws RecognitionException {
		ObjContext _localctx = new ObjContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_obj);
		int _la;
		try {
			setState(37);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(24); match(T__4);
				setState(25); pair();
				setState(30);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(26); match(T__3);
					setState(27); pair();
					}
					}
					setState(32);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(33); match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(35); match(T__4);
				setState(36); match(T__1);
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

	public static class PairContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(IcingaParser.EQUAL, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode VAR() { return getToken(IcingaParser.VAR, 0); }
		public PairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IcingaListener ) ((IcingaListener)listener).enterPair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IcingaListener ) ((IcingaListener)listener).exitPair(this);
		}
	}

	public final PairContext pair() throws RecognitionException {
		PairContext _localctx = new PairContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_pair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39); match(VAR);
			setState(40); match(EQUAL);
			setState(41); value();
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

	public static class ArrayContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IcingaListener ) ((IcingaListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IcingaListener ) ((IcingaListener)listener).exitArray(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_array);
		int _la;
		try {
			setState(56);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(43); match(T__5);
				setState(44); value();
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(45); match(T__3);
					setState(46); value();
					}
					}
					setState(51);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(52); match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(54); match(T__5);
				setState(55); match(T__2);
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

	public static class ValueContext extends ParserRuleContext {
		public ObjContext obj() {
			return getRuleContext(ObjContext.class,0);
		}
		public TerminalNode STRING() { return getToken(IcingaParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(IcingaParser.NUMBER, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IcingaListener ) ((IcingaListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IcingaListener ) ((IcingaListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_value);
		try {
			setState(65);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(58); match(STRING);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(59); match(NUMBER);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 3);
				{
				setState(60); obj();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 4);
				{
				setState(61); array();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 5);
				{
				setState(62); match(T__6);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 6);
				{
				setState(63); match(T__0);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 7);
				{
				setState(64); match(T__7);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\24F\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\6\2\20\n\2\r\2\16\2\21\3\3\3\3"+
		"\3\3\3\3\3\3\5\3\31\n\3\3\4\3\4\3\4\3\4\7\4\37\n\4\f\4\16\4\"\13\4\3\4"+
		"\3\4\3\4\3\4\5\4(\n\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\7\6\62\n\6\f\6\16"+
		"\6\65\13\6\3\6\3\6\3\6\3\6\5\6;\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7D\n"+
		"\7\3\7\2\2\b\2\4\6\b\n\f\2\2K\2\17\3\2\2\2\4\30\3\2\2\2\6\'\3\2\2\2\b"+
		")\3\2\2\2\n:\3\2\2\2\fC\3\2\2\2\16\20\5\4\3\2\17\16\3\2\2\2\20\21\3\2"+
		"\2\2\21\17\3\2\2\2\21\22\3\2\2\2\22\3\3\2\2\2\23\31\7\16\2\2\24\25\7\17"+
		"\2\2\25\26\7\r\2\2\26\27\7\f\2\2\27\31\5\6\4\2\30\23\3\2\2\2\30\24\3\2"+
		"\2\2\31\5\3\2\2\2\32\33\7\6\2\2\33 \5\b\5\2\34\35\7\7\2\2\35\37\5\b\5"+
		"\2\36\34\3\2\2\2\37\"\3\2\2\2 \36\3\2\2\2 !\3\2\2\2!#\3\2\2\2\" \3\2\2"+
		"\2#$\7\t\2\2$(\3\2\2\2%&\7\6\2\2&(\7\t\2\2\'\32\3\2\2\2\'%\3\2\2\2(\7"+
		"\3\2\2\2)*\7\13\2\2*+\7\22\2\2+,\5\f\7\2,\t\3\2\2\2-.\7\5\2\2.\63\5\f"+
		"\7\2/\60\7\7\2\2\60\62\5\f\7\2\61/\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2"+
		"\63\64\3\2\2\2\64\66\3\2\2\2\65\63\3\2\2\2\66\67\7\b\2\2\67;\3\2\2\28"+
		"9\7\5\2\29;\7\b\2\2:-\3\2\2\2:8\3\2\2\2;\13\3\2\2\2<D\7\f\2\2=D\7\24\2"+
		"\2>D\5\6\4\2?D\5\n\6\2@D\7\4\2\2AD\7\n\2\2BD\7\3\2\2C<\3\2\2\2C=\3\2\2"+
		"\2C>\3\2\2\2C?\3\2\2\2C@\3\2\2\2CA\3\2\2\2CB\3\2\2\2D\r\3\2\2\2\t\21\30"+
		" \'\63:C";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}