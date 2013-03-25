// Generated from Vml.g4 by ANTLR 4.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class VmlParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__13=1, T__12=2, T__11=3, T__10=4, T__9=5, T__8=6, T__7=7, T__6=8, T__5=9, 
		T__4=10, T__3=11, T__2=12, T__1=13, T__0=14, ID=15, NUMBER=16, INT=17, 
		WS=18;
	public static final String[] tokenNames = {
		"<INVALID>", "']'", "'||'", "'^'", "')'", "'.'", "','", "'+'", "'*'", 
		"'-'", "'['", "'('", "':'", "'='", "';'", "ID", "NUMBER", "INT", "WS"
	};
	public static final int
		RULE_rank = 0, RULE_component = 1, RULE_numberList = 2, RULE_expr = 3, 
		RULE_vectorLiteral = 4, RULE_pointLiteral = 5, RULE_assignmentStmt = 6, 
		RULE_inspectStmt = 7, RULE_file = 8;
	public static final String[] ruleNames = {
		"rank", "component", "numberList", "expr", "vectorLiteral", "pointLiteral", 
		"assignmentStmt", "inspectStmt", "file"
	};

	@Override
	public String getGrammarFileName() { return "Vml.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public VmlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class RankContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(VmlParser.INT, 0); }
		public RankContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rank; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VmlListener ) ((VmlListener)listener).enterRank(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VmlListener ) ((VmlListener)listener).exitRank(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VmlVisitor ) return ((VmlVisitor<? extends T>)visitor).visitRank(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RankContext rank() throws RecognitionException {
		RankContext _localctx = new RankContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_rank);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18); match(11);
			setState(19); match(INT);
			setState(20); match(4);
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

	public static class ComponentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(VmlParser.ID, 0); }
		public ComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_component; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VmlListener ) ((VmlListener)listener).enterComponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VmlListener ) ((VmlListener)listener).exitComponent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VmlVisitor ) return ((VmlVisitor<? extends T>)visitor).visitComponent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentContext component() throws RecognitionException {
		ComponentContext _localctx = new ComponentContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_component);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(22); match(12);
			setState(23); match(ID);
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

	public static class NumberListContext extends ParserRuleContext {
		public TerminalNode NUMBER(int i) {
			return getToken(VmlParser.NUMBER, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(VmlParser.NUMBER); }
		public NumberListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VmlListener ) ((VmlListener)listener).enterNumberList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VmlListener ) ((VmlListener)listener).exitNumberList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VmlVisitor ) return ((VmlVisitor<? extends T>)visitor).visitNumberList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberListContext numberList() throws RecognitionException {
		NumberListContext _localctx = new NumberListContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_numberList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25); match(NUMBER);
			setState(30);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==6) {
				{
				{
				setState(26); match(6);
				setState(27); match(NUMBER);
				}
				}
				setState(32);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ExprContext extends ParserRuleContext {
		public int _p;
		public ExprContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExprContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
			this._p = ctx._p;
		}
	}
	public static class FetchContext extends ExprContext {
		public ComponentContext component() {
			return getRuleContext(ComponentContext.class,0);
		}
		public TerminalNode ID() { return getToken(VmlParser.ID, 0); }
		public FetchContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VmlListener ) ((VmlListener)listener).enterFetch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VmlListener ) ((VmlListener)listener).exitFetch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VmlVisitor ) return ((VmlVisitor<? extends T>)visitor).visitFetch(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PointContext extends ExprContext {
		public PointLiteralContext pointLiteral() {
			return getRuleContext(PointLiteralContext.class,0);
		}
		public PointContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VmlListener ) ((VmlListener)listener).enterPoint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VmlListener ) ((VmlListener)listener).exitPoint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VmlVisitor ) return ((VmlVisitor<? extends T>)visitor).visitPoint(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NormalizeContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NormalizeContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VmlListener ) ((VmlListener)listener).enterNormalize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VmlListener ) ((VmlListener)listener).exitNormalize(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VmlVisitor ) return ((VmlVisitor<? extends T>)visitor).visitNormalize(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubContext extends ExprContext {
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public SubContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VmlListener ) ((VmlListener)listener).enterSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VmlListener ) ((VmlListener)listener).exitSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VmlVisitor ) return ((VmlVisitor<? extends T>)visitor).visitSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VectorContext extends ExprContext {
		public VectorLiteralContext vectorLiteral() {
			return getRuleContext(VectorLiteralContext.class,0);
		}
		public VectorContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VmlListener ) ((VmlListener)listener).enterVector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VmlListener ) ((VmlListener)listener).exitVector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VmlVisitor ) return ((VmlVisitor<? extends T>)visitor).visitVector(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MagnitudeContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public MagnitudeContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VmlListener ) ((VmlListener)listener).enterMagnitude(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VmlListener ) ((VmlListener)listener).exitMagnitude(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VmlVisitor ) return ((VmlVisitor<? extends T>)visitor).visitMagnitude(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParensContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParensContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VmlListener ) ((VmlListener)listener).enterParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VmlListener ) ((VmlListener)listener).exitParens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VmlVisitor ) return ((VmlVisitor<? extends T>)visitor).visitParens(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddContext extends ExprContext {
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public AddContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VmlListener ) ((VmlListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VmlListener ) ((VmlListener)listener).exitAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VmlVisitor ) return ((VmlVisitor<? extends T>)visitor).visitAdd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DotContext extends ExprContext {
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public DotContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VmlListener ) ((VmlListener)listener).enterDot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VmlListener ) ((VmlListener)listener).exitDot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VmlVisitor ) return ((VmlVisitor<? extends T>)visitor).visitDot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CrossContext extends ExprContext {
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public CrossContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VmlListener ) ((VmlListener)listener).enterCross(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VmlListener ) ((VmlListener)listener).exitCross(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VmlVisitor ) return ((VmlVisitor<? extends T>)visitor).visitCross(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState, _p);
		ExprContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, RULE_expr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				_localctx = new MagnitudeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(34); match(2);
				setState(35); expr(0);
				setState(36); match(2);
				}
				break;

			case 2:
				{
				_localctx = new FetchContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(38); match(ID);
				setState(40);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(39); component();
					}
					break;
				}
				}
				break;

			case 3:
				{
				_localctx = new PointContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(42); pointLiteral();
				}
				break;

			case 4:
				{
				_localctx = new VectorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(43); vectorLiteral();
				}
				break;

			case 5:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(44); match(11);
				setState(45); expr(0);
				setState(46); match(4);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(66);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(64);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new CrossContext(new ExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(50);
						if (!(8 >= _localctx._p)) throw new FailedPredicateException(this, "8 >= $_p");
						setState(51); match(8);
						setState(52); expr(9);
						}
						break;

					case 2:
						{
						_localctx = new DotContext(new ExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(53);
						if (!(7 >= _localctx._p)) throw new FailedPredicateException(this, "7 >= $_p");
						setState(54); match(5);
						setState(55); expr(8);
						}
						break;

					case 3:
						{
						_localctx = new AddContext(new ExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(56);
						if (!(6 >= _localctx._p)) throw new FailedPredicateException(this, "6 >= $_p");
						setState(57); match(7);
						setState(58); expr(7);
						}
						break;

					case 4:
						{
						_localctx = new SubContext(new ExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(59);
						if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
						setState(60); match(9);
						setState(61); expr(6);
						}
						break;

					case 5:
						{
						_localctx = new NormalizeContext(new ExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(62);
						if (!(9 >= _localctx._p)) throw new FailedPredicateException(this, "9 >= $_p");
						setState(63); match(3);
						}
						break;
					}
					} 
				}
				setState(68);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class VectorLiteralContext extends ParserRuleContext {
		public NumberListContext numberList() {
			return getRuleContext(NumberListContext.class,0);
		}
		public VectorLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vectorLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VmlListener ) ((VmlListener)listener).enterVectorLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VmlListener ) ((VmlListener)listener).exitVectorLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VmlVisitor ) return ((VmlVisitor<? extends T>)visitor).visitVectorLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VectorLiteralContext vectorLiteral() throws RecognitionException {
		VectorLiteralContext _localctx = new VectorLiteralContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_vectorLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69); match(10);
			setState(70); numberList();
			setState(71); match(1);
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

	public static class PointLiteralContext extends ParserRuleContext {
		public NumberListContext numberList() {
			return getRuleContext(NumberListContext.class,0);
		}
		public PointLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VmlListener ) ((VmlListener)listener).enterPointLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VmlListener ) ((VmlListener)listener).exitPointLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VmlVisitor ) return ((VmlVisitor<? extends T>)visitor).visitPointLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PointLiteralContext pointLiteral() throws RecognitionException {
		PointLiteralContext _localctx = new PointLiteralContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_pointLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73); match(11);
			setState(74); numberList();
			setState(75); match(4);
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

	public static class AssignmentStmtContext extends ParserRuleContext {
		public AssignmentStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStmt; }
	 
		public AssignmentStmtContext() { }
		public void copyFrom(AssignmentStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssignmentContext extends AssignmentStmtContext {
		public RankContext rank() {
			return getRuleContext(RankContext.class,0);
		}
		public ComponentContext component() {
			return getRuleContext(ComponentContext.class,0);
		}
		public TerminalNode ID() { return getToken(VmlParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignmentContext(AssignmentStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VmlListener ) ((VmlListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VmlListener ) ((VmlListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VmlVisitor ) return ((VmlVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentStmtContext assignmentStmt() throws RecognitionException {
		AssignmentStmtContext _localctx = new AssignmentStmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assignmentStmt);
		try {
			_localctx = new AssignmentContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(77); match(ID);
			setState(80);
			switch (_input.LA(1)) {
			case 11:
				{
				setState(78); rank();
				}
				break;
			case 12:
				{
				setState(79); component();
				}
				break;
			case 13:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(82); match(13);
			setState(83); expr(0);
			setState(84); match(14);
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

	public static class InspectStmtContext extends ParserRuleContext {
		public InspectStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inspectStmt; }
	 
		public InspectStmtContext() { }
		public void copyFrom(InspectStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InspectContext extends InspectStmtContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public InspectContext(InspectStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VmlListener ) ((VmlListener)listener).enterInspect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VmlListener ) ((VmlListener)listener).exitInspect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VmlVisitor ) return ((VmlVisitor<? extends T>)visitor).visitInspect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InspectStmtContext inspectStmt() throws RecognitionException {
		InspectStmtContext _localctx = new InspectStmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_inspectStmt);
		try {
			_localctx = new InspectContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(86); expr(0);
			setState(87); match(14);
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

	public static class FileContext extends ParserRuleContext {
		public List<InspectStmtContext> inspectStmt() {
			return getRuleContexts(InspectStmtContext.class);
		}
		public AssignmentStmtContext assignmentStmt(int i) {
			return getRuleContext(AssignmentStmtContext.class,i);
		}
		public List<AssignmentStmtContext> assignmentStmt() {
			return getRuleContexts(AssignmentStmtContext.class);
		}
		public InspectStmtContext inspectStmt(int i) {
			return getRuleContext(InspectStmtContext.class,i);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VmlListener ) ((VmlListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VmlListener ) ((VmlListener)listener).exitFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VmlVisitor ) return ((VmlVisitor<? extends T>)visitor).visitFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 10) | (1L << 11) | (1L << ID))) != 0)) {
				{
				setState(91);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(89); assignmentStmt();
					}
					break;

				case 2:
					{
					setState(90); inspectStmt();
					}
					break;
				}
				}
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3: return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return 8 >= _localctx._p;

		case 1: return 7 >= _localctx._p;

		case 2: return 6 >= _localctx._p;

		case 3: return 5 >= _localctx._p;

		case 4: return 9 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\2\3\24c\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t"+
		"\t\4\n\t\n\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\7\4\37\n\4\f\4\16\4"+
		"\"\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5+\n\5\3\5\3\5\3\5\3\5\3\5\3\5\5"+
		"\5\63\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5"+
		"C\n\5\f\5\16\5F\13\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\5\bS"+
		"\n\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\7\n^\n\n\f\n\16\na\13\n\3\n\2"+
		"\13\2\4\6\b\n\f\16\20\22\2\2h\2\24\3\2\2\2\4\30\3\2\2\2\6\33\3\2\2\2\b"+
		"\62\3\2\2\2\nG\3\2\2\2\fK\3\2\2\2\16O\3\2\2\2\20X\3\2\2\2\22_\3\2\2\2"+
		"\24\25\7\r\2\2\25\26\7\23\2\2\26\27\7\6\2\2\27\3\3\2\2\2\30\31\7\16\2"+
		"\2\31\32\7\21\2\2\32\5\3\2\2\2\33 \7\22\2\2\34\35\7\b\2\2\35\37\7\22\2"+
		"\2\36\34\3\2\2\2\37\"\3\2\2\2 \36\3\2\2\2 !\3\2\2\2!\7\3\2\2\2\" \3\2"+
		"\2\2#$\b\5\1\2$%\7\4\2\2%&\5\b\5\2&\'\7\4\2\2\'\63\3\2\2\2(*\7\21\2\2"+
		")+\5\4\3\2*)\3\2\2\2*+\3\2\2\2+\63\3\2\2\2,\63\5\f\7\2-\63\5\n\6\2./\7"+
		"\r\2\2/\60\5\b\5\2\60\61\7\6\2\2\61\63\3\2\2\2\62#\3\2\2\2\62(\3\2\2\2"+
		"\62,\3\2\2\2\62-\3\2\2\2\62.\3\2\2\2\63D\3\2\2\2\64\65\6\5\2\3\65\66\7"+
		"\n\2\2\66C\5\b\5\2\678\6\5\3\389\7\7\2\29C\5\b\5\2:;\6\5\4\3;<\7\t\2\2"+
		"<C\5\b\5\2=>\6\5\5\3>?\7\13\2\2?C\5\b\5\2@A\6\5\6\3AC\7\5\2\2B\64\3\2"+
		"\2\2B\67\3\2\2\2B:\3\2\2\2B=\3\2\2\2B@\3\2\2\2CF\3\2\2\2DB\3\2\2\2DE\3"+
		"\2\2\2E\t\3\2\2\2FD\3\2\2\2GH\7\f\2\2HI\5\6\4\2IJ\7\3\2\2J\13\3\2\2\2"+
		"KL\7\r\2\2LM\5\6\4\2MN\7\6\2\2N\r\3\2\2\2OR\7\21\2\2PS\5\2\2\2QS\5\4\3"+
		"\2RP\3\2\2\2RQ\3\2\2\2RS\3\2\2\2ST\3\2\2\2TU\7\17\2\2UV\5\b\5\2VW\7\20"+
		"\2\2W\17\3\2\2\2XY\5\b\5\2YZ\7\20\2\2Z\21\3\2\2\2[^\5\16\b\2\\^\5\20\t"+
		"\2][\3\2\2\2]\\\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`\23\3\2\2\2a_\3"+
		"\2\2\2\n *\62BDR]_";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}