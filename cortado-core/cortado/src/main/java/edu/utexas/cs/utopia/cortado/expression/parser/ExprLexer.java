// Generated from edu/utexas/cs/utopia/cortado/expression/parser/Expr.g4 by ANTLR 4.9
package edu.utexas.cs.utopia.cortado.expression.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExprLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, UNARY_OP=2, BINARY_OP=3, NARY_OP=4, QUANT_KIND=5, INTEGER_CONST=6, 
		BOOL_CONST=7, CROSS_PROD=8, COLON=9, L_BRACKET=10, R_BRACKET=11, ARROW=12, 
		INT_TY=13, BOOL_TY=14, STRING_TY=15, IDENTIFIER=16, LPAR=17, RPAR=18, 
		DECL=19, WS=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "UNARY_OP", "BINARY_OP", "NARY_OP", "QUANT_KIND", "INTEGER_CONST", 
			"BOOL_CONST", "CROSS_PROD", "COLON", "L_BRACKET", "R_BRACKET", "ARROW", 
			"INT_TY", "BOOL_TY", "STRING_TY", "IDENTIFIER", "LPAR", "RPAR", "DECL", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'neg'", null, null, null, null, null, "'x'", "':'", "'['", 
			"']'", "'->'", "'Int'", "'Bool'", "'String'", null, "'('", "')'", "'decl'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "UNARY_OP", "BINARY_OP", "NARY_OP", "QUANT_KIND", "INTEGER_CONST", 
			"BOOL_CONST", "CROSS_PROD", "COLON", "L_BRACKET", "R_BRACKET", "ARROW", 
			"INT_TY", "BOOL_TY", "STRING_TY", "IDENTIFIER", "LPAR", "RPAR", "DECL", 
			"WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public ExprLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Expr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\26\u00ac\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\5\4I\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5"+
		"V\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6c\n\6\3\7\3\7\3\7"+
		"\7\7h\n\7\f\7\16\7k\13\7\5\7m\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\5\bx\n\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\6\21\u0097\n\21\r\21\16\21\u0098\3\21\3\21\3\22\3\22\3\23\3\23\3"+
		"\24\3\24\3\24\3\24\3\24\3\25\6\25\u00a7\n\25\r\25\16\25\u00a8\3\25\3\25"+
		"\3\u0098\2\26\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25)\26\3\2\4\4\2,-//\5\2\13\f\17\17\""+
		"\"\2\u00bd\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\3+\3\2\2\2\5-\3\2\2\2"+
		"\7H\3\2\2\2\tU\3\2\2\2\13b\3\2\2\2\rl\3\2\2\2\17w\3\2\2\2\21y\3\2\2\2"+
		"\23{\3\2\2\2\25}\3\2\2\2\27\177\3\2\2\2\31\u0081\3\2\2\2\33\u0084\3\2"+
		"\2\2\35\u0088\3\2\2\2\37\u008d\3\2\2\2!\u0094\3\2\2\2#\u009c\3\2\2\2%"+
		"\u009e\3\2\2\2\'\u00a0\3\2\2\2)\u00a6\3\2\2\2+,\7.\2\2,\4\3\2\2\2-.\7"+
		"p\2\2./\7g\2\2/\60\7i\2\2\60\6\3\2\2\2\61I\7\61\2\2\62\63\7t\2\2\63\64"+
		"\7g\2\2\64I\7o\2\2\65\66\7o\2\2\66\67\7q\2\2\67I\7f\2\28I\7?\2\29:\7@"+
		"\2\2:I\7?\2\2;I\7@\2\2<=\7/\2\2=>\7/\2\2>I\7@\2\2?@\7>\2\2@I\7?\2\2AI"+
		"\7>\2\2BC\7u\2\2CD\7g\2\2DE\7n\2\2EF\7g\2\2FG\7e\2\2GI\7v\2\2H\61\3\2"+
		"\2\2H\62\3\2\2\2H\65\3\2\2\2H8\3\2\2\2H9\3\2\2\2H;\3\2\2\2H<\3\2\2\2H"+
		"?\3\2\2\2HA\3\2\2\2HB\3\2\2\2I\b\3\2\2\2JK\7c\2\2KL\7p\2\2LV\7f\2\2MN"+
		"\7q\2\2NV\7t\2\2OV\t\2\2\2PQ\7u\2\2QR\7v\2\2RS\7q\2\2ST\7t\2\2TV\7g\2"+
		"\2UJ\3\2\2\2UM\3\2\2\2UO\3\2\2\2UP\3\2\2\2V\n\3\2\2\2WX\7g\2\2XY\7z\2"+
		"\2YZ\7k\2\2Z[\7u\2\2[c\7v\2\2\\]\7h\2\2]^\7q\2\2^_\7t\2\2_`\7c\2\2`a\7"+
		"n\2\2ac\7n\2\2bW\3\2\2\2b\\\3\2\2\2c\f\3\2\2\2dm\7\62\2\2ei\4\63;\2fh"+
		"\4\62;\2gf\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2jm\3\2\2\2ki\3\2\2\2l"+
		"d\3\2\2\2le\3\2\2\2m\16\3\2\2\2no\7V\2\2op\7T\2\2pq\7W\2\2qx\7G\2\2rs"+
		"\7H\2\2st\7C\2\2tu\7N\2\2uv\7U\2\2vx\7G\2\2wn\3\2\2\2wr\3\2\2\2x\20\3"+
		"\2\2\2yz\7z\2\2z\22\3\2\2\2{|\7<\2\2|\24\3\2\2\2}~\7]\2\2~\26\3\2\2\2"+
		"\177\u0080\7_\2\2\u0080\30\3\2\2\2\u0081\u0082\7/\2\2\u0082\u0083\7@\2"+
		"\2\u0083\32\3\2\2\2\u0084\u0085\7K\2\2\u0085\u0086\7p\2\2\u0086\u0087"+
		"\7v\2\2\u0087\34\3\2\2\2\u0088\u0089\7D\2\2\u0089\u008a\7q\2\2\u008a\u008b"+
		"\7q\2\2\u008b\u008c\7n\2\2\u008c\36\3\2\2\2\u008d\u008e\7U\2\2\u008e\u008f"+
		"\7v\2\2\u008f\u0090\7t\2\2\u0090\u0091\7k\2\2\u0091\u0092\7p\2\2\u0092"+
		"\u0093\7i\2\2\u0093 \3\2\2\2\u0094\u0096\7~\2\2\u0095\u0097\13\2\2\2\u0096"+
		"\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099\3\2\2\2\u0098\u0096\3\2"+
		"\2\2\u0099\u009a\3\2\2\2\u009a\u009b\7~\2\2\u009b\"\3\2\2\2\u009c\u009d"+
		"\7*\2\2\u009d$\3\2\2\2\u009e\u009f\7+\2\2\u009f&\3\2\2\2\u00a0\u00a1\7"+
		"f\2\2\u00a1\u00a2\7g\2\2\u00a2\u00a3\7e\2\2\u00a3\u00a4\7n\2\2\u00a4("+
		"\3\2\2\2\u00a5\u00a7\t\3\2\2\u00a6\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8"+
		"\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\b\25"+
		"\2\2\u00ab*\3\2\2\2\13\2HUbilw\u0098\u00a8\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}