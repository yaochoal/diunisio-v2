// Generated from C:/Users/Zylfrox/IdeaProjects/DIUNISIO2.0/src\Diunisio.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DiunisioLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMENTARIO=1, ENTONCES=2, O=3, Y=4, IGUAL=5, DIFERENTE=6, MAYOR=7, MENOR=8, 
		MAY_IGUAL=9, MEN_IGUAL=10, SUMA=11, MENOS=12, MULT=13, DIV=14, MOD=15, 
		POTENCIA=16, NO=17, DEF=18, RETORNAR=19, INT=20, FLOAT=21, STRING=22, 
		BOOL=23, MATRIZ=24, VECTOR=25, PUBLICO=26, PRIVADO=27, PROTEGIDO=28, ESTATICO=29, 
		FINAL=30, ABSTRACTO=31, NUEVO=32, PCOMA=33, ASIGNAR=34, PAREN_AP=35, PAREN_CI=36, 
		LLAVEIZ=37, LLAVEDE=38, ANGIZ=39, ANGDE=40, COMA=41, DOSPUNTOS=42, VERDADERO=43, 
		FALSO=44, NULO=45, SI=46, SI_NO=47, MIENTRAS=48, SELECCIONAR=49, CASO=50, 
		ROMPER=51, HACER=52, PARA=53, DEFECTO=54, PUNTO=55, ESTO=56, IMPLEMENTA=57, 
		EXTIENDE=58, SUPERCLASE=59, INTERFAZ=60, CLASE=61, CLASEID=62, IDENTIFICADOR=63, 
		ENTERO=64, REAL=65, COMPLEJO=66, CADENA=67, ESPACIO=68, OTRO=69;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"COMENTARIO", "ENTONCES", "O", "Y", "IGUAL", "DIFERENTE", "MAYOR", "MENOR", 
			"MAY_IGUAL", "MEN_IGUAL", "SUMA", "MENOS", "MULT", "DIV", "MOD", "POTENCIA", 
			"NO", "DEF", "RETORNAR", "INT", "FLOAT", "STRING", "BOOL", "MATRIZ", 
			"VECTOR", "PUBLICO", "PRIVADO", "PROTEGIDO", "ESTATICO", "FINAL", "ABSTRACTO", 
			"NUEVO", "PCOMA", "ASIGNAR", "PAREN_AP", "PAREN_CI", "LLAVEIZ", "LLAVEDE", 
			"ANGIZ", "ANGDE", "COMA", "DOSPUNTOS", "VERDADERO", "FALSO", "NULO", 
			"SI", "SI_NO", "MIENTRAS", "SELECCIONAR", "CASO", "ROMPER", "HACER", 
			"PARA", "DEFECTO", "PUNTO", "ESTO", "IMPLEMENTA", "EXTIENDE", "SUPERCLASE", 
			"INTERFAZ", "CLASE", "CLASEID", "IDENTIFICADOR", "ENTERO", "REAL", "COMPLEJO", 
			"CADENA", "ESPACIO", "OTRO"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'entonces'", "'||'", "'&&'", "'=='", "'!='", "'>'", "'<'", 
			"'>='", "'<='", "'+'", "'-'", "'*'", "'/'", "'%'", "'^'", "'!'", "'def'", 
			"'retornar'", "'entero'", "'decimal'", "'cadena'", "'booleano'", "'matriz'", 
			"'vector'", "'publico'", "'privado'", "'protegido'", "'estatico'", "'final'", 
			"'abstracto'", "'nuevo'", "';'", "'='", "'('", "')'", "'{'", "'}'", "'['", 
			"']'", "','", "':'", "'verdadero'", "'falso'", "'nulo'", "'si'", "'si_no'", 
			"'mientras'", "'seleccionar'", "'caso'", "'romper'", "'hacer'", "'para'", 
			"'defecto'", "'.'", "'esto'", "'implementa'", "'extiende'", "'superclase'", 
			"'interfaz'", "'clase'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COMENTARIO", "ENTONCES", "O", "Y", "IGUAL", "DIFERENTE", "MAYOR", 
			"MENOR", "MAY_IGUAL", "MEN_IGUAL", "SUMA", "MENOS", "MULT", "DIV", "MOD", 
			"POTENCIA", "NO", "DEF", "RETORNAR", "INT", "FLOAT", "STRING", "BOOL", 
			"MATRIZ", "VECTOR", "PUBLICO", "PRIVADO", "PROTEGIDO", "ESTATICO", "FINAL", 
			"ABSTRACTO", "NUEVO", "PCOMA", "ASIGNAR", "PAREN_AP", "PAREN_CI", "LLAVEIZ", 
			"LLAVEDE", "ANGIZ", "ANGDE", "COMA", "DOSPUNTOS", "VERDADERO", "FALSO", 
			"NULO", "SI", "SI_NO", "MIENTRAS", "SELECCIONAR", "CASO", "ROMPER", "HACER", 
			"PARA", "DEFECTO", "PUNTO", "ESTO", "IMPLEMENTA", "EXTIENDE", "SUPERCLASE", 
			"INTERFAZ", "CLASE", "CLASEID", "IDENTIFICADOR", "ENTERO", "REAL", "COMPLEJO", 
			"CADENA", "ESPACIO", "OTRO"
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


	public DiunisioLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Diunisio.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2G\u0225\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\3\2\3\2\7\2\u0090"+
		"\n\2\f\2\16\2\u0093\13\2\3\2\3\2\3\2\3\2\7\2\u0099\n\2\f\2\16\2\u009c"+
		"\13\2\3\2\3\2\5\2\u00a0\n\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20"+
		"\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3"+
		"!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3"+
		",\3,\3,\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3/\3/\3"+
		"/\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\63"+
		"\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\38\38\39\39\39\39\39\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3;\3"+
		";\3;\3;\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3=\3=\3=\3=\3"+
		"=\3=\3=\3=\3=\3>\3>\3>\3>\3>\3>\3?\3?\7?\u01e1\n?\f?\16?\u01e4\13?\3@"+
		"\3@\7@\u01e8\n@\f@\16@\u01eb\13@\3A\6A\u01ee\nA\rA\16A\u01ef\3B\7B\u01f3"+
		"\nB\fB\16B\u01f6\13B\3B\3B\7B\u01fa\nB\fB\16B\u01fd\13B\3B\3B\5B\u0201"+
		"\nB\3B\6B\u0204\nB\rB\16B\u0205\5B\u0208\nB\3C\3C\5C\u020c\nC\3C\3C\3"+
		"C\5C\u0211\nC\3C\3C\3D\3D\3D\3D\7D\u0219\nD\fD\16D\u021c\13D\3D\3D\3E"+
		"\3E\3E\3E\3F\3F\3\u009a\2G\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a"+
		"\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087"+
		"E\u0089F\u008bG\3\2\f\4\2\f\f\17\17\3\2C\\\6\2\62;C\\aac|\5\2C\\aac|\3"+
		"\2\62;\4\2GGgg\4\2--//\5\2--//~~\5\2\f\f\17\17$$\5\2\13\f\17\17\"\"\2"+
		"\u0234\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2"+
		"G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3"+
		"\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2"+
		"\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2"+
		"m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3"+
		"\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2"+
		"\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\3"+
		"\u009f\3\2\2\2\5\u00a3\3\2\2\2\7\u00ac\3\2\2\2\t\u00af\3\2\2\2\13\u00b2"+
		"\3\2\2\2\r\u00b5\3\2\2\2\17\u00b8\3\2\2\2\21\u00ba\3\2\2\2\23\u00bc\3"+
		"\2\2\2\25\u00bf\3\2\2\2\27\u00c2\3\2\2\2\31\u00c4\3\2\2\2\33\u00c6\3\2"+
		"\2\2\35\u00c8\3\2\2\2\37\u00ca\3\2\2\2!\u00cc\3\2\2\2#\u00ce\3\2\2\2%"+
		"\u00d0\3\2\2\2\'\u00d4\3\2\2\2)\u00dd\3\2\2\2+\u00e4\3\2\2\2-\u00ec\3"+
		"\2\2\2/\u00f3\3\2\2\2\61\u00fc\3\2\2\2\63\u0103\3\2\2\2\65\u010a\3\2\2"+
		"\2\67\u0112\3\2\2\29\u011a\3\2\2\2;\u0124\3\2\2\2=\u012d\3\2\2\2?\u0133"+
		"\3\2\2\2A\u013d\3\2\2\2C\u0143\3\2\2\2E\u0145\3\2\2\2G\u0147\3\2\2\2I"+
		"\u0149\3\2\2\2K\u014b\3\2\2\2M\u014d\3\2\2\2O\u014f\3\2\2\2Q\u0151\3\2"+
		"\2\2S\u0153\3\2\2\2U\u0155\3\2\2\2W\u0157\3\2\2\2Y\u0161\3\2\2\2[\u0167"+
		"\3\2\2\2]\u016c\3\2\2\2_\u016f\3\2\2\2a\u0175\3\2\2\2c\u017e\3\2\2\2e"+
		"\u018a\3\2\2\2g\u018f\3\2\2\2i\u0196\3\2\2\2k\u019c\3\2\2\2m\u01a1\3\2"+
		"\2\2o\u01a9\3\2\2\2q\u01ab\3\2\2\2s\u01b0\3\2\2\2u\u01bb\3\2\2\2w\u01c4"+
		"\3\2\2\2y\u01cf\3\2\2\2{\u01d8\3\2\2\2}\u01de\3\2\2\2\177\u01e5\3\2\2"+
		"\2\u0081\u01ed\3\2\2\2\u0083\u01f4\3\2\2\2\u0085\u020b\3\2\2\2\u0087\u0214"+
		"\3\2\2\2\u0089\u021f\3\2\2\2\u008b\u0223\3\2\2\2\u008d\u0091\7%\2\2\u008e"+
		"\u0090\n\2\2\2\u008f\u008e\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2"+
		"\2\2\u0091\u0092\3\2\2\2\u0092\u00a0\3\2\2\2\u0093\u0091\3\2\2\2\u0094"+
		"\u0095\7\61\2\2\u0095\u0096\7,\2\2\u0096\u009a\3\2\2\2\u0097\u0099\13"+
		"\2\2\2\u0098\u0097\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u009b\3\2\2\2\u009a"+
		"\u0098\3\2\2\2\u009b\u009d\3\2\2\2\u009c\u009a\3\2\2\2\u009d\u009e\7,"+
		"\2\2\u009e\u00a0\7\61\2\2\u009f\u008d\3\2\2\2\u009f\u0094\3\2\2\2\u00a0"+
		"\u00a1\3\2\2\2\u00a1\u00a2\b\2\2\2\u00a2\4\3\2\2\2\u00a3\u00a4\7g\2\2"+
		"\u00a4\u00a5\7p\2\2\u00a5\u00a6\7v\2\2\u00a6\u00a7\7q\2\2\u00a7\u00a8"+
		"\7p\2\2\u00a8\u00a9\7e\2\2\u00a9\u00aa\7g\2\2\u00aa\u00ab\7u\2\2\u00ab"+
		"\6\3\2\2\2\u00ac\u00ad\7~\2\2\u00ad\u00ae\7~\2\2\u00ae\b\3\2\2\2\u00af"+
		"\u00b0\7(\2\2\u00b0\u00b1\7(\2\2\u00b1\n\3\2\2\2\u00b2\u00b3\7?\2\2\u00b3"+
		"\u00b4\7?\2\2\u00b4\f\3\2\2\2\u00b5\u00b6\7#\2\2\u00b6\u00b7\7?\2\2\u00b7"+
		"\16\3\2\2\2\u00b8\u00b9\7@\2\2\u00b9\20\3\2\2\2\u00ba\u00bb\7>\2\2\u00bb"+
		"\22\3\2\2\2\u00bc\u00bd\7@\2\2\u00bd\u00be\7?\2\2\u00be\24\3\2\2\2\u00bf"+
		"\u00c0\7>\2\2\u00c0\u00c1\7?\2\2\u00c1\26\3\2\2\2\u00c2\u00c3\7-\2\2\u00c3"+
		"\30\3\2\2\2\u00c4\u00c5\7/\2\2\u00c5\32\3\2\2\2\u00c6\u00c7\7,\2\2\u00c7"+
		"\34\3\2\2\2\u00c8\u00c9\7\61\2\2\u00c9\36\3\2\2\2\u00ca\u00cb\7\'\2\2"+
		"\u00cb \3\2\2\2\u00cc\u00cd\7`\2\2\u00cd\"\3\2\2\2\u00ce\u00cf\7#\2\2"+
		"\u00cf$\3\2\2\2\u00d0\u00d1\7f\2\2\u00d1\u00d2\7g\2\2\u00d2\u00d3\7h\2"+
		"\2\u00d3&\3\2\2\2\u00d4\u00d5\7t\2\2\u00d5\u00d6\7g\2\2\u00d6\u00d7\7"+
		"v\2\2\u00d7\u00d8\7q\2\2\u00d8\u00d9\7t\2\2\u00d9\u00da\7p\2\2\u00da\u00db"+
		"\7c\2\2\u00db\u00dc\7t\2\2\u00dc(\3\2\2\2\u00dd\u00de\7g\2\2\u00de\u00df"+
		"\7p\2\2\u00df\u00e0\7v\2\2\u00e0\u00e1\7g\2\2\u00e1\u00e2\7t\2\2\u00e2"+
		"\u00e3\7q\2\2\u00e3*\3\2\2\2\u00e4\u00e5\7f\2\2\u00e5\u00e6\7g\2\2\u00e6"+
		"\u00e7\7e\2\2\u00e7\u00e8\7k\2\2\u00e8\u00e9\7o\2\2\u00e9\u00ea\7c\2\2"+
		"\u00ea\u00eb\7n\2\2\u00eb,\3\2\2\2\u00ec\u00ed\7e\2\2\u00ed\u00ee\7c\2"+
		"\2\u00ee\u00ef\7f\2\2\u00ef\u00f0\7g\2\2\u00f0\u00f1\7p\2\2\u00f1\u00f2"+
		"\7c\2\2\u00f2.\3\2\2\2\u00f3\u00f4\7d\2\2\u00f4\u00f5\7q\2\2\u00f5\u00f6"+
		"\7q\2\2\u00f6\u00f7\7n\2\2\u00f7\u00f8\7g\2\2\u00f8\u00f9\7c\2\2\u00f9"+
		"\u00fa\7p\2\2\u00fa\u00fb\7q\2\2\u00fb\60\3\2\2\2\u00fc\u00fd\7o\2\2\u00fd"+
		"\u00fe\7c\2\2\u00fe\u00ff\7v\2\2\u00ff\u0100\7t\2\2\u0100\u0101\7k\2\2"+
		"\u0101\u0102\7|\2\2\u0102\62\3\2\2\2\u0103\u0104\7x\2\2\u0104\u0105\7"+
		"g\2\2\u0105\u0106\7e\2\2\u0106\u0107\7v\2\2\u0107\u0108\7q\2\2\u0108\u0109"+
		"\7t\2\2\u0109\64\3\2\2\2\u010a\u010b\7r\2\2\u010b\u010c\7w\2\2\u010c\u010d"+
		"\7d\2\2\u010d\u010e\7n\2\2\u010e\u010f\7k\2\2\u010f\u0110\7e\2\2\u0110"+
		"\u0111\7q\2\2\u0111\66\3\2\2\2\u0112\u0113\7r\2\2\u0113\u0114\7t\2\2\u0114"+
		"\u0115\7k\2\2\u0115\u0116\7x\2\2\u0116\u0117\7c\2\2\u0117\u0118\7f\2\2"+
		"\u0118\u0119\7q\2\2\u01198\3\2\2\2\u011a\u011b\7r\2\2\u011b\u011c\7t\2"+
		"\2\u011c\u011d\7q\2\2\u011d\u011e\7v\2\2\u011e\u011f\7g\2\2\u011f\u0120"+
		"\7i\2\2\u0120\u0121\7k\2\2\u0121\u0122\7f\2\2\u0122\u0123\7q\2\2\u0123"+
		":\3\2\2\2\u0124\u0125\7g\2\2\u0125\u0126\7u\2\2\u0126\u0127\7v\2\2\u0127"+
		"\u0128\7c\2\2\u0128\u0129\7v\2\2\u0129\u012a\7k\2\2\u012a\u012b\7e\2\2"+
		"\u012b\u012c\7q\2\2\u012c<\3\2\2\2\u012d\u012e\7h\2\2\u012e\u012f\7k\2"+
		"\2\u012f\u0130\7p\2\2\u0130\u0131\7c\2\2\u0131\u0132\7n\2\2\u0132>\3\2"+
		"\2\2\u0133\u0134\7c\2\2\u0134\u0135\7d\2\2\u0135\u0136\7u\2\2\u0136\u0137"+
		"\7v\2\2\u0137\u0138\7t\2\2\u0138\u0139\7c\2\2\u0139\u013a\7e\2\2\u013a"+
		"\u013b\7v\2\2\u013b\u013c\7q\2\2\u013c@\3\2\2\2\u013d\u013e\7p\2\2\u013e"+
		"\u013f\7w\2\2\u013f\u0140\7g\2\2\u0140\u0141\7x\2\2\u0141\u0142\7q\2\2"+
		"\u0142B\3\2\2\2\u0143\u0144\7=\2\2\u0144D\3\2\2\2\u0145\u0146\7?\2\2\u0146"+
		"F\3\2\2\2\u0147\u0148\7*\2\2\u0148H\3\2\2\2\u0149\u014a\7+\2\2\u014aJ"+
		"\3\2\2\2\u014b\u014c\7}\2\2\u014cL\3\2\2\2\u014d\u014e\7\177\2\2\u014e"+
		"N\3\2\2\2\u014f\u0150\7]\2\2\u0150P\3\2\2\2\u0151\u0152\7_\2\2\u0152R"+
		"\3\2\2\2\u0153\u0154\7.\2\2\u0154T\3\2\2\2\u0155\u0156\7<\2\2\u0156V\3"+
		"\2\2\2\u0157\u0158\7x\2\2\u0158\u0159\7g\2\2\u0159\u015a\7t\2\2\u015a"+
		"\u015b\7f\2\2\u015b\u015c\7c\2\2\u015c\u015d\7f\2\2\u015d\u015e\7g\2\2"+
		"\u015e\u015f\7t\2\2\u015f\u0160\7q\2\2\u0160X\3\2\2\2\u0161\u0162\7h\2"+
		"\2\u0162\u0163\7c\2\2\u0163\u0164\7n\2\2\u0164\u0165\7u\2\2\u0165\u0166"+
		"\7q\2\2\u0166Z\3\2\2\2\u0167\u0168\7p\2\2\u0168\u0169\7w\2\2\u0169\u016a"+
		"\7n\2\2\u016a\u016b\7q\2\2\u016b\\\3\2\2\2\u016c\u016d\7u\2\2\u016d\u016e"+
		"\7k\2\2\u016e^\3\2\2\2\u016f\u0170\7u\2\2\u0170\u0171\7k\2\2\u0171\u0172"+
		"\7a\2\2\u0172\u0173\7p\2\2\u0173\u0174\7q\2\2\u0174`\3\2\2\2\u0175\u0176"+
		"\7o\2\2\u0176\u0177\7k\2\2\u0177\u0178\7g\2\2\u0178\u0179\7p\2\2\u0179"+
		"\u017a\7v\2\2\u017a\u017b\7t\2\2\u017b\u017c\7c\2\2\u017c\u017d\7u\2\2"+
		"\u017db\3\2\2\2\u017e\u017f\7u\2\2\u017f\u0180\7g\2\2\u0180\u0181\7n\2"+
		"\2\u0181\u0182\7g\2\2\u0182\u0183\7e\2\2\u0183\u0184\7e\2\2\u0184\u0185"+
		"\7k\2\2\u0185\u0186\7q\2\2\u0186\u0187\7p\2\2\u0187\u0188\7c\2\2\u0188"+
		"\u0189\7t\2\2\u0189d\3\2\2\2\u018a\u018b\7e\2\2\u018b\u018c\7c\2\2\u018c"+
		"\u018d\7u\2\2\u018d\u018e\7q\2\2\u018ef\3\2\2\2\u018f\u0190\7t\2\2\u0190"+
		"\u0191\7q\2\2\u0191\u0192\7o\2\2\u0192\u0193\7r\2\2\u0193\u0194\7g\2\2"+
		"\u0194\u0195\7t\2\2\u0195h\3\2\2\2\u0196\u0197\7j\2\2\u0197\u0198\7c\2"+
		"\2\u0198\u0199\7e\2\2\u0199\u019a\7g\2\2\u019a\u019b\7t\2\2\u019bj\3\2"+
		"\2\2\u019c\u019d\7r\2\2\u019d\u019e\7c\2\2\u019e\u019f\7t\2\2\u019f\u01a0"+
		"\7c\2\2\u01a0l\3\2\2\2\u01a1\u01a2\7f\2\2\u01a2\u01a3\7g\2\2\u01a3\u01a4"+
		"\7h\2\2\u01a4\u01a5\7g\2\2\u01a5\u01a6\7e\2\2\u01a6\u01a7\7v\2\2\u01a7"+
		"\u01a8\7q\2\2\u01a8n\3\2\2\2\u01a9\u01aa\7\60\2\2\u01aap\3\2\2\2\u01ab"+
		"\u01ac\7g\2\2\u01ac\u01ad\7u\2\2\u01ad\u01ae\7v\2\2\u01ae\u01af\7q\2\2"+
		"\u01afr\3\2\2\2\u01b0\u01b1\7k\2\2\u01b1\u01b2\7o\2\2\u01b2\u01b3\7r\2"+
		"\2\u01b3\u01b4\7n\2\2\u01b4\u01b5\7g\2\2\u01b5\u01b6\7o\2\2\u01b6\u01b7"+
		"\7g\2\2\u01b7\u01b8\7p\2\2\u01b8\u01b9\7v\2\2\u01b9\u01ba\7c\2\2\u01ba"+
		"t\3\2\2\2\u01bb\u01bc\7g\2\2\u01bc\u01bd\7z\2\2\u01bd\u01be\7v\2\2\u01be"+
		"\u01bf\7k\2\2\u01bf\u01c0\7g\2\2\u01c0\u01c1\7p\2\2\u01c1\u01c2\7f\2\2"+
		"\u01c2\u01c3\7g\2\2\u01c3v\3\2\2\2\u01c4\u01c5\7u\2\2\u01c5\u01c6\7w\2"+
		"\2\u01c6\u01c7\7r\2\2\u01c7\u01c8\7g\2\2\u01c8\u01c9\7t\2\2\u01c9\u01ca"+
		"\7e\2\2\u01ca\u01cb\7n\2\2\u01cb\u01cc\7c\2\2\u01cc\u01cd\7u\2\2\u01cd"+
		"\u01ce\7g\2\2\u01cex\3\2\2\2\u01cf\u01d0\7k\2\2\u01d0\u01d1\7p\2\2\u01d1"+
		"\u01d2\7v\2\2\u01d2\u01d3\7g\2\2\u01d3\u01d4\7t\2\2\u01d4\u01d5\7h\2\2"+
		"\u01d5\u01d6\7c\2\2\u01d6\u01d7\7|\2\2\u01d7z\3\2\2\2\u01d8\u01d9\7e\2"+
		"\2\u01d9\u01da\7n\2\2\u01da\u01db\7c\2\2\u01db\u01dc\7u\2\2\u01dc\u01dd"+
		"\7g\2\2\u01dd|\3\2\2\2\u01de\u01e2\t\3\2\2\u01df\u01e1\t\4\2\2\u01e0\u01df"+
		"\3\2\2\2\u01e1\u01e4\3\2\2\2\u01e2\u01e0\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3"+
		"~\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e5\u01e9\t\5\2\2\u01e6\u01e8\t\4\2\2"+
		"\u01e7\u01e6\3\2\2\2\u01e8\u01eb\3\2\2\2\u01e9\u01e7\3\2\2\2\u01e9\u01ea"+
		"\3\2\2\2\u01ea\u0080\3\2\2\2\u01eb\u01e9\3\2\2\2\u01ec\u01ee\t\6\2\2\u01ed"+
		"\u01ec\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef\u01ed\3\2\2\2\u01ef\u01f0\3\2"+
		"\2\2\u01f0\u0082\3\2\2\2\u01f1\u01f3\t\6\2\2\u01f2\u01f1\3\2\2\2\u01f3"+
		"\u01f6\3\2\2\2\u01f4\u01f2\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5\u01f7\3\2"+
		"\2\2\u01f6\u01f4\3\2\2\2\u01f7\u01fb\7\60\2\2\u01f8\u01fa\t\6\2\2\u01f9"+
		"\u01f8\3\2\2\2\u01fa\u01fd\3\2\2\2\u01fb\u01f9\3\2\2\2\u01fb\u01fc\3\2"+
		"\2\2\u01fc\u0207\3\2\2\2\u01fd\u01fb\3\2\2\2\u01fe\u0200\t\7\2\2\u01ff"+
		"\u0201\t\b\2\2\u0200\u01ff\3\2\2\2\u0200\u0201\3\2\2\2\u0201\u0203\3\2"+
		"\2\2\u0202\u0204\t\6\2\2\u0203\u0202\3\2\2\2\u0204\u0205\3\2\2\2\u0205"+
		"\u0203\3\2\2\2\u0205\u0206\3\2\2\2\u0206\u0208\3\2\2\2\u0207\u01fe\3\2"+
		"\2\2\u0207\u0208\3\2\2\2\u0208\u0084\3\2\2\2\u0209\u020c\5\u0081A\2\u020a"+
		"\u020c\5\u0083B\2\u020b\u0209\3\2\2\2\u020b\u020a\3\2\2\2\u020c\u020d"+
		"\3\2\2\2\u020d\u0210\t\t\2\2\u020e\u0211\5\u0081A\2\u020f\u0211\5\u0083"+
		"B\2\u0210\u020e\3\2\2\2\u0210\u020f\3\2\2\2\u0210\u0211\3\2\2\2\u0211"+
		"\u0212\3\2\2\2\u0212\u0213\7k\2\2\u0213\u0086\3\2\2\2\u0214\u021a\7$\2"+
		"\2\u0215\u0219\n\n\2\2\u0216\u0217\7$\2\2\u0217\u0219\7$\2\2\u0218\u0215"+
		"\3\2\2\2\u0218\u0216\3\2\2\2\u0219\u021c\3\2\2\2\u021a\u0218\3\2\2\2\u021a"+
		"\u021b\3\2\2\2\u021b\u021d\3\2\2\2\u021c\u021a\3\2\2\2\u021d\u021e\7$"+
		"\2\2\u021e\u0088\3\2\2\2\u021f\u0220\t\13\2\2\u0220\u0221\3\2\2\2\u0221"+
		"\u0222\bE\2\2\u0222\u008a\3\2\2\2\u0223\u0224\13\2\2\2\u0224\u008c\3\2"+
		"\2\2\22\2\u0091\u009a\u009f\u01e2\u01e9\u01ef\u01f4\u01fb\u0200\u0205"+
		"\u0207\u020b\u0210\u0218\u021a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}