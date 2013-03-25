// Generated from Vml.g4 by ANTLR 4.0
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class VmlLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__13=1, T__12=2, T__11=3, T__10=4, T__9=5, T__8=6, T__7=7, T__6=8, T__5=9, 
		T__4=10, T__3=11, T__2=12, T__1=13, T__0=14, ID=15, NUMBER=16, INT=17, 
		WS=18;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"']'", "'||'", "'^'", "')'", "'.'", "','", "'+'", "'*'", "'-'", "'['", 
		"'('", "':'", "'='", "';'", "ID", "NUMBER", "INT", "WS"
	};
	public static final String[] ruleNames = {
		"T__13", "T__12", "T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", 
		"T__4", "T__3", "T__2", "T__1", "T__0", "DIGIT", "FRACTION", "LETTER", 
		"ID", "NUMBER", "INT", "WS"
	};


	public VmlLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Vml.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 20: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\2\4\24l\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20"+
		"\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3"+
		"\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\6\21O\n"+
		"\21\r\21\16\21P\3\22\3\22\3\23\3\23\3\23\7\23X\n\23\f\23\16\23[\13\23"+
		"\3\24\3\24\5\24_\n\24\3\25\5\25b\n\25\3\25\6\25e\n\25\r\25\16\25f\3\26"+
		"\3\26\3\26\3\26\2\27\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n"+
		"\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\2\1!\2\1#\2\1%\21"+
		"\1\'\22\1)\23\1+\24\2\3\2\5\3\62;\4C\\c|\5\13\f\17\17\"\"n\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\3-\3\2\2\2\5/\3\2\2\2\7\62\3\2\2\2\t\64\3\2\2\2\13\66\3\2\2\2\r8\3"+
		"\2\2\2\17:\3\2\2\2\21<\3\2\2\2\23>\3\2\2\2\25@\3\2\2\2\27B\3\2\2\2\31"+
		"D\3\2\2\2\33F\3\2\2\2\35H\3\2\2\2\37J\3\2\2\2!L\3\2\2\2#R\3\2\2\2%T\3"+
		"\2\2\2\'\\\3\2\2\2)a\3\2\2\2+h\3\2\2\2-.\7_\2\2.\4\3\2\2\2/\60\7~\2\2"+
		"\60\61\7~\2\2\61\6\3\2\2\2\62\63\7`\2\2\63\b\3\2\2\2\64\65\7+\2\2\65\n"+
		"\3\2\2\2\66\67\7\60\2\2\67\f\3\2\2\289\7.\2\29\16\3\2\2\2:;\7-\2\2;\20"+
		"\3\2\2\2<=\7,\2\2=\22\3\2\2\2>?\7/\2\2?\24\3\2\2\2@A\7]\2\2A\26\3\2\2"+
		"\2BC\7*\2\2C\30\3\2\2\2DE\7<\2\2E\32\3\2\2\2FG\7?\2\2G\34\3\2\2\2HI\7"+
		"=\2\2I\36\3\2\2\2JK\t\2\2\2K \3\2\2\2LN\7\60\2\2MO\5\37\20\2NM\3\2\2\2"+
		"OP\3\2\2\2PN\3\2\2\2PQ\3\2\2\2Q\"\3\2\2\2RS\t\3\2\2S$\3\2\2\2TY\5#\22"+
		"\2UX\5#\22\2VX\5\37\20\2WU\3\2\2\2WV\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2"+
		"\2\2Z&\3\2\2\2[Y\3\2\2\2\\^\5)\25\2]_\5!\21\2^]\3\2\2\2^_\3\2\2\2_(\3"+
		"\2\2\2`b\7/\2\2a`\3\2\2\2ab\3\2\2\2bd\3\2\2\2ce\5\37\20\2dc\3\2\2\2ef"+
		"\3\2\2\2fd\3\2\2\2fg\3\2\2\2g*\3\2\2\2hi\t\4\2\2ij\3\2\2\2jk\b\26\2\2"+
		"k,\3\2\2\2\t\2PWY^af";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}