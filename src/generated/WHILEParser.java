// Generated from WHILE.g4 by ANTLR 4.4
 
package generated;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Map;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.HashMap;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class WHILEParser extends Parser {
	static Map<String, Integer> state = new HashMap<>();
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__2=1, T__1=2, T__0=3, N=4, IDENT=5, WS=6;
	public static final String[] tokenNames = {
		"<INVALID>", "'*'", "'+'", "'-'", "N", "IDENT", "WS"
	};
	public static final int
		RULE_aexpr = 0;
	public static final String[] ruleNames = {
		"aexpr"
	};

	@Override
	public String getGrammarFileName() { return "WHILE.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public WHILEParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class AexprContext extends ParserRuleContext {
		public int sv;
		public AexprContext a1;
		public Token N;
		public Token IDENT;
		public AexprContext a2;
		public List<AexprContext> aexpr() {
			return getRuleContexts(AexprContext.class);
		}
		public TerminalNode N() { return getToken(WHILEParser.N, 0); }
		public AexprContext aexpr(int i) {
			return getRuleContext(AexprContext.class,i);
		}
		public TerminalNode IDENT() { return getToken(WHILEParser.IDENT, 0); }
		public AexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WHILEListener ) ((WHILEListener)listener).enterAexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WHILEListener ) ((WHILEListener)listener).exitAexpr(this);
		}
	}

	public final AexprContext aexpr() throws RecognitionException {
		return aexpr(0);
	}

	private AexprContext aexpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AexprContext _localctx = new AexprContext(_ctx, _parentState);
		AexprContext _prevctx = _localctx;
		int _startState = 0;
		enterRecursionRule(_localctx, 0, RULE_aexpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(7);
			switch (_input.LA(1)) {
			case N:
				{
				setState(3); ((AexprContext)_localctx).N = match(N);
				String n = ((AexprContext)_localctx).N.getText(); ((AexprContext)_localctx).sv =  Integer.parseInt(n);
				}
				break;
			case IDENT:
				{
				setState(5); ((AexprContext)_localctx).IDENT = match(IDENT);
				String id =((AexprContext)_localctx).IDENT.getText(); ((AexprContext)_localctx).sv =  state.get(id);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(26);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(24);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new AexprContext(_parentctx, _parentState);
						_localctx.a1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_aexpr);
						setState(9);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(10); match(T__1);
						setState(11); ((AexprContext)_localctx).a2 = aexpr(4);

						          		int i1 = ((AexprContext)_localctx).a1.sv;
						          		int i2 = ((AexprContext)_localctx).a2.sv;
						          		((AexprContext)_localctx).sv =  i1 + i2;
						          	
						}
						break;
					case 2:
						{
						_localctx = new AexprContext(_parentctx, _parentState);
						_localctx.a1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_aexpr);
						setState(14);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(15); match(T__2);
						setState(16); ((AexprContext)_localctx).a2 = aexpr(3);

						          		((AexprContext)_localctx).sv =  ((AexprContext)_localctx).a1.sv * ((AexprContext)_localctx).a2.sv;
						          	
						}
						break;
					case 3:
						{
						_localctx = new AexprContext(_parentctx, _parentState);
						_localctx.a1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_aexpr);
						setState(19);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(20); match(T__0);
						setState(21); ((AexprContext)_localctx).a2 = aexpr(2);

						          		((AexprContext)_localctx).sv =  ((AexprContext)_localctx).a1.sv - ((AexprContext)_localctx).a2.sv;
						          	
						}
						break;
					}
					} 
				}
				setState(28);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 0: return aexpr_sempred((AexprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean aexpr_sempred(AexprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 3);
		case 1: return precpred(_ctx, 2);
		case 2: return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\b \4\2\t\2\3\2\3"+
		"\2\3\2\3\2\3\2\5\2\n\n\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\7\2\33\n\2\f\2\16\2\36\13\2\3\2\2\3\2\3\2\2\2\"\2\t\3\2"+
		"\2\2\4\5\b\2\1\2\5\6\7\6\2\2\6\n\b\2\1\2\7\b\7\7\2\2\b\n\b\2\1\2\t\4\3"+
		"\2\2\2\t\7\3\2\2\2\n\34\3\2\2\2\13\f\f\5\2\2\f\r\7\4\2\2\r\16\5\2\2\6"+
		"\16\17\b\2\1\2\17\33\3\2\2\2\20\21\f\4\2\2\21\22\7\3\2\2\22\23\5\2\2\5"+
		"\23\24\b\2\1\2\24\33\3\2\2\2\25\26\f\3\2\2\26\27\7\5\2\2\27\30\5\2\2\4"+
		"\30\31\b\2\1\2\31\33\3\2\2\2\32\13\3\2\2\2\32\20\3\2\2\2\32\25\3\2\2\2"+
		"\33\36\3\2\2\2\34\32\3\2\2\2\34\35\3\2\2\2\35\3\3\2\2\2\36\34\3\2\2\2"+
		"\5\t\32\34";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}