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
		PUBLICO=1, PRIVADO=2, PROTEGIDO=3, ESTATICO=4, FINAL=5, ABSTRACTO=6, NUEVO=7, 
		PUNTO=8, ESTO=9, IMPLEMENTA=10, EXTIENDE=11, SUPERCLASE=12, INTERFAZ=13, 
		CLASE=14, VOID=15, COMENTARIO=16, ALGORITMO=17, TERMINA=18, ENTONCES=19, 
		O=20, Y=21, IGUAL=22, DIFERENTE=23, MAYOR=24, MENOR=25, MAY_IGUAL=26, 
		MEN_IGUAL=27, SUMA=28, MENOS=29, MULT=30, DIV=31, MOD=32, POTENCIA=33, 
		NO=34, DEF=35, RETORNAR=36, INT=37, FLOAT=38, STRING=39, BOOL=40, MATRIZ=41, 
		VECTOR=42, PCOMA=43, ASIGNAR=44, PAREN_AP=45, PAREN_CI=46, LLAVEIZ=47, 
		LLAVEDE=48, ANGIZ=49, ANGDE=50, COMA=51, DOSPUNTOS=52, VERDADERO=53, FALSO=54, 
		NULO=55, SI=56, SI_NO=57, MIENTRAS=58, SELECCIONAR=59, CASO=60, ROMPER=61, 
		HACER=62, PARA=63, DEFECTO=64, CLASEID=65, IDENTIFICADOR=66, ENTERO=67, 
		REAL=68, COMPLEJO=69, CADENA=70, ESPACIO=71, OTRO=72;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PUBLICO", "PRIVADO", "PROTEGIDO", "ESTATICO", "FINAL", "ABSTRACTO", 
			"NUEVO", "PUNTO", "ESTO", "IMPLEMENTA", "EXTIENDE", "SUPERCLASE", "INTERFAZ", 
			"CLASE", "VOID", "COMENTARIO", "ALGORITMO", "TERMINA", "ENTONCES", "O", 
			"Y", "IGUAL", "DIFERENTE", "MAYOR", "MENOR", "MAY_IGUAL", "MEN_IGUAL", 
			"SUMA", "MENOS", "MULT", "DIV", "MOD", "POTENCIA", "NO", "DEF", "RETORNAR", 
			"INT", "FLOAT", "STRING", "BOOL", "MATRIZ", "VECTOR", "PCOMA", "ASIGNAR", 
			"PAREN_AP", "PAREN_CI", "LLAVEIZ", "LLAVEDE", "ANGIZ", "ANGDE", "COMA", 
			"DOSPUNTOS", "VERDADERO", "FALSO", "NULO", "SI", "SI_NO", "MIENTRAS", 
			"SELECCIONAR", "CASO", "ROMPER", "HACER", "PARA", "DEFECTO", "CLASEID", 
			"IDENTIFICADOR", "ENTERO", "REAL", "COMPLEJO", "CADENA", "ESPACIO", "OTRO"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'publico'", "'privado'", "'protegido'", "'estatico'", "'final'", 
			"'abstracto'", "'nuevo'", "'.'", "'esto'", "'implementa'", "'extiende'", 
			"'super'", "'interfaz'", "'clase'", "'void'", null, "'ALGORITMO'", "'..'", 
			"'entonces'", "'||'", "'&&'", "'=='", "'!='", "'>'", "'<'", "'>='", "'<='", 
			"'+'", "'-'", "'*'", "'/'", "'%'", "'^'", "'!'", "'def'", "'retornar'", 
			"'entero'", "'decimal'", "'cadena'", "'booleano'", "'matriz'", "'vector'", 
			"';'", "'='", "'('", "')'", "'{'", "'}'", "'['", "']'", "','", "':'", 
			"'verdadero'", "'falso'", "'nulo'", "'si'", "'si_no'", "'mientras'", 
			"'seleccionar'", "'caso'", "'romper'", "'hacer'", "'para'", "'defecto'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PUBLICO", "PRIVADO", "PROTEGIDO", "ESTATICO", "FINAL", "ABSTRACTO", 
			"NUEVO", "PUNTO", "ESTO", "IMPLEMENTA", "EXTIENDE", "SUPERCLASE", "INTERFAZ", 
			"CLASE", "VOID", "COMENTARIO", "ALGORITMO", "TERMINA", "ENTONCES", "O", 
			"Y", "IGUAL", "DIFERENTE", "MAYOR", "MENOR", "MAY_IGUAL", "MEN_IGUAL", 
			"SUMA", "MENOS", "MULT", "DIV", "MOD", "POTENCIA", "NO", "DEF", "RETORNAR", 
			"INT", "FLOAT", "STRING", "BOOL", "MATRIZ", "VECTOR", "PCOMA", "ASIGNAR", 
			"PAREN_AP", "PAREN_CI", "LLAVEIZ", "LLAVEDE", "ANGIZ", "ANGDE", "COMA", 
			"DOSPUNTOS", "VERDADERO", "FALSO", "NULO", "SI", "SI_NO", "MIENTRAS", 
			"SELECCIONAR", "CASO", "ROMPER", "HACER", "PARA", "DEFECTO", "CLASEID", 
			"IDENTIFICADOR", "ENTERO", "REAL", "COMPLEJO", "CADENA", "ESPACIO", "OTRO"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2J\u0238\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\7\21"+
		"\u0104\n\21\f\21\16\21\u0107\13\21\3\21\3\21\3\21\3\21\7\21\u010d\n\21"+
		"\f\21\16\21\u0110\13\21\3\21\3\21\5\21\u0114\n\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34"+
		"\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3$\3$\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3"+
		"*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3"+
		"\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3"+
		"\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\38\38\38\38\38\3"+
		"9\39\39\3:\3:\3:\3:\3:\3:\3;\3;\3;\3;\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3"+
		"<\3<\3<\3<\3<\3<\3<\3=\3=\3=\3=\3=\3>\3>\3>\3>\3>\3>\3>\3?\3?\3?\3?\3"+
		"?\3?\3@\3@\3@\3@\3@\3A\3A\3A\3A\3A\3A\3A\3A\3B\3B\7B\u01f4\nB\fB\16B\u01f7"+
		"\13B\3C\3C\7C\u01fb\nC\fC\16C\u01fe\13C\3D\6D\u0201\nD\rD\16D\u0202\3"+
		"E\7E\u0206\nE\fE\16E\u0209\13E\3E\3E\7E\u020d\nE\fE\16E\u0210\13E\3E\3"+
		"E\5E\u0214\nE\3E\6E\u0217\nE\rE\16E\u0218\5E\u021b\nE\3F\3F\5F\u021f\n"+
		"F\3F\3F\3F\5F\u0224\nF\3F\3F\3G\3G\3G\3G\7G\u022c\nG\fG\16G\u022f\13G"+
		"\3G\3G\3H\3H\3H\3H\3I\3I\3\u010e\2J\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.["+
		"/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083"+
		"C\u0085D\u0087E\u0089F\u008bG\u008dH\u008fI\u0091J\3\2\f\4\2\f\f\17\17"+
		"\3\2C\\\6\2\62;C\\aac|\5\2C\\aac|\3\2\62;\4\2GGgg\4\2--//\5\2--//~~\5"+
		"\2\f\f\17\17$$\5\2\13\f\17\17\"\"\2\u0247\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2"+
		"\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2"+
		"\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M"+
		"\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2"+
		"\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2"+
		"\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s"+
		"\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177"+
		"\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2"+
		"\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091"+
		"\3\2\2\2\3\u0093\3\2\2\2\5\u009b\3\2\2\2\7\u00a3\3\2\2\2\t\u00ad\3\2\2"+
		"\2\13\u00b6\3\2\2\2\r\u00bc\3\2\2\2\17\u00c6\3\2\2\2\21\u00cc\3\2\2\2"+
		"\23\u00ce\3\2\2\2\25\u00d3\3\2\2\2\27\u00de\3\2\2\2\31\u00e7\3\2\2\2\33"+
		"\u00ed\3\2\2\2\35\u00f6\3\2\2\2\37\u00fc\3\2\2\2!\u0113\3\2\2\2#\u0117"+
		"\3\2\2\2%\u0121\3\2\2\2\'\u0124\3\2\2\2)\u012d\3\2\2\2+\u0130\3\2\2\2"+
		"-\u0133\3\2\2\2/\u0136\3\2\2\2\61\u0139\3\2\2\2\63\u013b\3\2\2\2\65\u013d"+
		"\3\2\2\2\67\u0140\3\2\2\29\u0143\3\2\2\2;\u0145\3\2\2\2=\u0147\3\2\2\2"+
		"?\u0149\3\2\2\2A\u014b\3\2\2\2C\u014d\3\2\2\2E\u014f\3\2\2\2G\u0151\3"+
		"\2\2\2I\u0155\3\2\2\2K\u015e\3\2\2\2M\u0165\3\2\2\2O\u016d\3\2\2\2Q\u0174"+
		"\3\2\2\2S\u017d\3\2\2\2U\u0184\3\2\2\2W\u018b\3\2\2\2Y\u018d\3\2\2\2["+
		"\u018f\3\2\2\2]\u0191\3\2\2\2_\u0193\3\2\2\2a\u0195\3\2\2\2c\u0197\3\2"+
		"\2\2e\u0199\3\2\2\2g\u019b\3\2\2\2i\u019d\3\2\2\2k\u019f\3\2\2\2m\u01a9"+
		"\3\2\2\2o\u01af\3\2\2\2q\u01b4\3\2\2\2s\u01b7\3\2\2\2u\u01bd\3\2\2\2w"+
		"\u01c6\3\2\2\2y\u01d2\3\2\2\2{\u01d7\3\2\2\2}\u01de\3\2\2\2\177\u01e4"+
		"\3\2\2\2\u0081\u01e9\3\2\2\2\u0083\u01f1\3\2\2\2\u0085\u01f8\3\2\2\2\u0087"+
		"\u0200\3\2\2\2\u0089\u0207\3\2\2\2\u008b\u021e\3\2\2\2\u008d\u0227\3\2"+
		"\2\2\u008f\u0232\3\2\2\2\u0091\u0236\3\2\2\2\u0093\u0094\7r\2\2\u0094"+
		"\u0095\7w\2\2\u0095\u0096\7d\2\2\u0096\u0097\7n\2\2\u0097\u0098\7k\2\2"+
		"\u0098\u0099\7e\2\2\u0099\u009a\7q\2\2\u009a\4\3\2\2\2\u009b\u009c\7r"+
		"\2\2\u009c\u009d\7t\2\2\u009d\u009e\7k\2\2\u009e\u009f\7x\2\2\u009f\u00a0"+
		"\7c\2\2\u00a0\u00a1\7f\2\2\u00a1\u00a2\7q\2\2\u00a2\6\3\2\2\2\u00a3\u00a4"+
		"\7r\2\2\u00a4\u00a5\7t\2\2\u00a5\u00a6\7q\2\2\u00a6\u00a7\7v\2\2\u00a7"+
		"\u00a8\7g\2\2\u00a8\u00a9\7i\2\2\u00a9\u00aa\7k\2\2\u00aa\u00ab\7f\2\2"+
		"\u00ab\u00ac\7q\2\2\u00ac\b\3\2\2\2\u00ad\u00ae\7g\2\2\u00ae\u00af\7u"+
		"\2\2\u00af\u00b0\7v\2\2\u00b0\u00b1\7c\2\2\u00b1\u00b2\7v\2\2\u00b2\u00b3"+
		"\7k\2\2\u00b3\u00b4\7e\2\2\u00b4\u00b5\7q\2\2\u00b5\n\3\2\2\2\u00b6\u00b7"+
		"\7h\2\2\u00b7\u00b8\7k\2\2\u00b8\u00b9\7p\2\2\u00b9\u00ba\7c\2\2\u00ba"+
		"\u00bb\7n\2\2\u00bb\f\3\2\2\2\u00bc\u00bd\7c\2\2\u00bd\u00be\7d\2\2\u00be"+
		"\u00bf\7u\2\2\u00bf\u00c0\7v\2\2\u00c0\u00c1\7t\2\2\u00c1\u00c2\7c\2\2"+
		"\u00c2\u00c3\7e\2\2\u00c3\u00c4\7v\2\2\u00c4\u00c5\7q\2\2\u00c5\16\3\2"+
		"\2\2\u00c6\u00c7\7p\2\2\u00c7\u00c8\7w\2\2\u00c8\u00c9\7g\2\2\u00c9\u00ca"+
		"\7x\2\2\u00ca\u00cb\7q\2\2\u00cb\20\3\2\2\2\u00cc\u00cd\7\60\2\2\u00cd"+
		"\22\3\2\2\2\u00ce\u00cf\7g\2\2\u00cf\u00d0\7u\2\2\u00d0\u00d1\7v\2\2\u00d1"+
		"\u00d2\7q\2\2\u00d2\24\3\2\2\2\u00d3\u00d4\7k\2\2\u00d4\u00d5\7o\2\2\u00d5"+
		"\u00d6\7r\2\2\u00d6\u00d7\7n\2\2\u00d7\u00d8\7g\2\2\u00d8\u00d9\7o\2\2"+
		"\u00d9\u00da\7g\2\2\u00da\u00db\7p\2\2\u00db\u00dc\7v\2\2\u00dc\u00dd"+
		"\7c\2\2\u00dd\26\3\2\2\2\u00de\u00df\7g\2\2\u00df\u00e0\7z\2\2\u00e0\u00e1"+
		"\7v\2\2\u00e1\u00e2\7k\2\2\u00e2\u00e3\7g\2\2\u00e3\u00e4\7p\2\2\u00e4"+
		"\u00e5\7f\2\2\u00e5\u00e6\7g\2\2\u00e6\30\3\2\2\2\u00e7\u00e8\7u\2\2\u00e8"+
		"\u00e9\7w\2\2\u00e9\u00ea\7r\2\2\u00ea\u00eb\7g\2\2\u00eb\u00ec\7t\2\2"+
		"\u00ec\32\3\2\2\2\u00ed\u00ee\7k\2\2\u00ee\u00ef\7p\2\2\u00ef\u00f0\7"+
		"v\2\2\u00f0\u00f1\7g\2\2\u00f1\u00f2\7t\2\2\u00f2\u00f3\7h\2\2\u00f3\u00f4"+
		"\7c\2\2\u00f4\u00f5\7|\2\2\u00f5\34\3\2\2\2\u00f6\u00f7\7e\2\2\u00f7\u00f8"+
		"\7n\2\2\u00f8\u00f9\7c\2\2\u00f9\u00fa\7u\2\2\u00fa\u00fb\7g\2\2\u00fb"+
		"\36\3\2\2\2\u00fc\u00fd\7x\2\2\u00fd\u00fe\7q\2\2\u00fe\u00ff\7k\2\2\u00ff"+
		"\u0100\7f\2\2\u0100 \3\2\2\2\u0101\u0105\7%\2\2\u0102\u0104\n\2\2\2\u0103"+
		"\u0102\3\2\2\2\u0104\u0107\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2"+
		"\2\2\u0106\u0114\3\2\2\2\u0107\u0105\3\2\2\2\u0108\u0109\7\61\2\2\u0109"+
		"\u010a\7,\2\2\u010a\u010e\3\2\2\2\u010b\u010d\13\2\2\2\u010c\u010b\3\2"+
		"\2\2\u010d\u0110\3\2\2\2\u010e\u010f\3\2\2\2\u010e\u010c\3\2\2\2\u010f"+
		"\u0111\3\2\2\2\u0110\u010e\3\2\2\2\u0111\u0112\7,\2\2\u0112\u0114\7\61"+
		"\2\2\u0113\u0101\3\2\2\2\u0113\u0108\3\2\2\2\u0114\u0115\3\2\2\2\u0115"+
		"\u0116\b\21\2\2\u0116\"\3\2\2\2\u0117\u0118\7C\2\2\u0118\u0119\7N\2\2"+
		"\u0119\u011a\7I\2\2\u011a\u011b\7Q\2\2\u011b\u011c\7T\2\2\u011c\u011d"+
		"\7K\2\2\u011d\u011e\7V\2\2\u011e\u011f\7O\2\2\u011f\u0120\7Q\2\2\u0120"+
		"$\3\2\2\2\u0121\u0122\7\60\2\2\u0122\u0123\7\60\2\2\u0123&\3\2\2\2\u0124"+
		"\u0125\7g\2\2\u0125\u0126\7p\2\2\u0126\u0127\7v\2\2\u0127\u0128\7q\2\2"+
		"\u0128\u0129\7p\2\2\u0129\u012a\7e\2\2\u012a\u012b\7g\2\2\u012b\u012c"+
		"\7u\2\2\u012c(\3\2\2\2\u012d\u012e\7~\2\2\u012e\u012f\7~\2\2\u012f*\3"+
		"\2\2\2\u0130\u0131\7(\2\2\u0131\u0132\7(\2\2\u0132,\3\2\2\2\u0133\u0134"+
		"\7?\2\2\u0134\u0135\7?\2\2\u0135.\3\2\2\2\u0136\u0137\7#\2\2\u0137\u0138"+
		"\7?\2\2\u0138\60\3\2\2\2\u0139\u013a\7@\2\2\u013a\62\3\2\2\2\u013b\u013c"+
		"\7>\2\2\u013c\64\3\2\2\2\u013d\u013e\7@\2\2\u013e\u013f\7?\2\2\u013f\66"+
		"\3\2\2\2\u0140\u0141\7>\2\2\u0141\u0142\7?\2\2\u01428\3\2\2\2\u0143\u0144"+
		"\7-\2\2\u0144:\3\2\2\2\u0145\u0146\7/\2\2\u0146<\3\2\2\2\u0147\u0148\7"+
		",\2\2\u0148>\3\2\2\2\u0149\u014a\7\61\2\2\u014a@\3\2\2\2\u014b\u014c\7"+
		"\'\2\2\u014cB\3\2\2\2\u014d\u014e\7`\2\2\u014eD\3\2\2\2\u014f\u0150\7"+
		"#\2\2\u0150F\3\2\2\2\u0151\u0152\7f\2\2\u0152\u0153\7g\2\2\u0153\u0154"+
		"\7h\2\2\u0154H\3\2\2\2\u0155\u0156\7t\2\2\u0156\u0157\7g\2\2\u0157\u0158"+
		"\7v\2\2\u0158\u0159\7q\2\2\u0159\u015a\7t\2\2\u015a\u015b\7p\2\2\u015b"+
		"\u015c\7c\2\2\u015c\u015d\7t\2\2\u015dJ\3\2\2\2\u015e\u015f\7g\2\2\u015f"+
		"\u0160\7p\2\2\u0160\u0161\7v\2\2\u0161\u0162\7g\2\2\u0162\u0163\7t\2\2"+
		"\u0163\u0164\7q\2\2\u0164L\3\2\2\2\u0165\u0166\7f\2\2\u0166\u0167\7g\2"+
		"\2\u0167\u0168\7e\2\2\u0168\u0169\7k\2\2\u0169\u016a\7o\2\2\u016a\u016b"+
		"\7c\2\2\u016b\u016c\7n\2\2\u016cN\3\2\2\2\u016d\u016e\7e\2\2\u016e\u016f"+
		"\7c\2\2\u016f\u0170\7f\2\2\u0170\u0171\7g\2\2\u0171\u0172\7p\2\2\u0172"+
		"\u0173\7c\2\2\u0173P\3\2\2\2\u0174\u0175\7d\2\2\u0175\u0176\7q\2\2\u0176"+
		"\u0177\7q\2\2\u0177\u0178\7n\2\2\u0178\u0179\7g\2\2\u0179\u017a\7c\2\2"+
		"\u017a\u017b\7p\2\2\u017b\u017c\7q\2\2\u017cR\3\2\2\2\u017d\u017e\7o\2"+
		"\2\u017e\u017f\7c\2\2\u017f\u0180\7v\2\2\u0180\u0181\7t\2\2\u0181\u0182"+
		"\7k\2\2\u0182\u0183\7|\2\2\u0183T\3\2\2\2\u0184\u0185\7x\2\2\u0185\u0186"+
		"\7g\2\2\u0186\u0187\7e\2\2\u0187\u0188\7v\2\2\u0188\u0189\7q\2\2\u0189"+
		"\u018a\7t\2\2\u018aV\3\2\2\2\u018b\u018c\7=\2\2\u018cX\3\2\2\2\u018d\u018e"+
		"\7?\2\2\u018eZ\3\2\2\2\u018f\u0190\7*\2\2\u0190\\\3\2\2\2\u0191\u0192"+
		"\7+\2\2\u0192^\3\2\2\2\u0193\u0194\7}\2\2\u0194`\3\2\2\2\u0195\u0196\7"+
		"\177\2\2\u0196b\3\2\2\2\u0197\u0198\7]\2\2\u0198d\3\2\2\2\u0199\u019a"+
		"\7_\2\2\u019af\3\2\2\2\u019b\u019c\7.\2\2\u019ch\3\2\2\2\u019d\u019e\7"+
		"<\2\2\u019ej\3\2\2\2\u019f\u01a0\7x\2\2\u01a0\u01a1\7g\2\2\u01a1\u01a2"+
		"\7t\2\2\u01a2\u01a3\7f\2\2\u01a3\u01a4\7c\2\2\u01a4\u01a5\7f\2\2\u01a5"+
		"\u01a6\7g\2\2\u01a6\u01a7\7t\2\2\u01a7\u01a8\7q\2\2\u01a8l\3\2\2\2\u01a9"+
		"\u01aa\7h\2\2\u01aa\u01ab\7c\2\2\u01ab\u01ac\7n\2\2\u01ac\u01ad\7u\2\2"+
		"\u01ad\u01ae\7q\2\2\u01aen\3\2\2\2\u01af\u01b0\7p\2\2\u01b0\u01b1\7w\2"+
		"\2\u01b1\u01b2\7n\2\2\u01b2\u01b3\7q\2\2\u01b3p\3\2\2\2\u01b4\u01b5\7"+
		"u\2\2\u01b5\u01b6\7k\2\2\u01b6r\3\2\2\2\u01b7\u01b8\7u\2\2\u01b8\u01b9"+
		"\7k\2\2\u01b9\u01ba\7a\2\2\u01ba\u01bb\7p\2\2\u01bb\u01bc\7q\2\2\u01bc"+
		"t\3\2\2\2\u01bd\u01be\7o\2\2\u01be\u01bf\7k\2\2\u01bf\u01c0\7g\2\2\u01c0"+
		"\u01c1\7p\2\2\u01c1\u01c2\7v\2\2\u01c2\u01c3\7t\2\2\u01c3\u01c4\7c\2\2"+
		"\u01c4\u01c5\7u\2\2\u01c5v\3\2\2\2\u01c6\u01c7\7u\2\2\u01c7\u01c8\7g\2"+
		"\2\u01c8\u01c9\7n\2\2\u01c9\u01ca\7g\2\2\u01ca\u01cb\7e\2\2\u01cb\u01cc"+
		"\7e\2\2\u01cc\u01cd\7k\2\2\u01cd\u01ce\7q\2\2\u01ce\u01cf\7p\2\2\u01cf"+
		"\u01d0\7c\2\2\u01d0\u01d1\7t\2\2\u01d1x\3\2\2\2\u01d2\u01d3\7e\2\2\u01d3"+
		"\u01d4\7c\2\2\u01d4\u01d5\7u\2\2\u01d5\u01d6\7q\2\2\u01d6z\3\2\2\2\u01d7"+
		"\u01d8\7t\2\2\u01d8\u01d9\7q\2\2\u01d9\u01da\7o\2\2\u01da\u01db\7r\2\2"+
		"\u01db\u01dc\7g\2\2\u01dc\u01dd\7t\2\2\u01dd|\3\2\2\2\u01de\u01df\7j\2"+
		"\2\u01df\u01e0\7c\2\2\u01e0\u01e1\7e\2\2\u01e1\u01e2\7g\2\2\u01e2\u01e3"+
		"\7t\2\2\u01e3~\3\2\2\2\u01e4\u01e5\7r\2\2\u01e5\u01e6\7c\2\2\u01e6\u01e7"+
		"\7t\2\2\u01e7\u01e8\7c\2\2\u01e8\u0080\3\2\2\2\u01e9\u01ea\7f\2\2\u01ea"+
		"\u01eb\7g\2\2\u01eb\u01ec\7h\2\2\u01ec\u01ed\7g\2\2\u01ed\u01ee\7e\2\2"+
		"\u01ee\u01ef\7v\2\2\u01ef\u01f0\7q\2\2\u01f0\u0082\3\2\2\2\u01f1\u01f5"+
		"\t\3\2\2\u01f2\u01f4\t\4\2\2\u01f3\u01f2\3\2\2\2\u01f4\u01f7\3\2\2\2\u01f5"+
		"\u01f3\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6\u0084\3\2\2\2\u01f7\u01f5\3\2"+
		"\2\2\u01f8\u01fc\t\5\2\2\u01f9\u01fb\t\4\2\2\u01fa\u01f9\3\2\2\2\u01fb"+
		"\u01fe\3\2\2\2\u01fc\u01fa\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u0086\3\2"+
		"\2\2\u01fe\u01fc\3\2\2\2\u01ff\u0201\t\6\2\2\u0200\u01ff\3\2\2\2\u0201"+
		"\u0202\3\2\2\2\u0202\u0200\3\2\2\2\u0202\u0203\3\2\2\2\u0203\u0088\3\2"+
		"\2\2\u0204\u0206\t\6\2\2\u0205\u0204\3\2\2\2\u0206\u0209\3\2\2\2\u0207"+
		"\u0205\3\2\2\2\u0207\u0208\3\2\2\2\u0208\u020a\3\2\2\2\u0209\u0207\3\2"+
		"\2\2\u020a\u020e\7\60\2\2\u020b\u020d\t\6\2\2\u020c\u020b\3\2\2\2\u020d"+
		"\u0210\3\2\2\2\u020e\u020c\3\2\2\2\u020e\u020f\3\2\2\2\u020f\u021a\3\2"+
		"\2\2\u0210\u020e\3\2\2\2\u0211\u0213\t\7\2\2\u0212\u0214\t\b\2\2\u0213"+
		"\u0212\3\2\2\2\u0213\u0214\3\2\2\2\u0214\u0216\3\2\2\2\u0215\u0217\t\6"+
		"\2\2\u0216\u0215\3\2\2\2\u0217\u0218\3\2\2\2\u0218\u0216\3\2\2\2\u0218"+
		"\u0219\3\2\2\2\u0219\u021b\3\2\2\2\u021a\u0211\3\2\2\2\u021a\u021b\3\2"+
		"\2\2\u021b\u008a\3\2\2\2\u021c\u021f\5\u0087D\2\u021d\u021f\5\u0089E\2"+
		"\u021e\u021c\3\2\2\2\u021e\u021d\3\2\2\2\u021f\u0220\3\2\2\2\u0220\u0223"+
		"\t\t\2\2\u0221\u0224\5\u0087D\2\u0222\u0224\5\u0089E\2\u0223\u0221\3\2"+
		"\2\2\u0223\u0222\3\2\2\2\u0223\u0224\3\2\2\2\u0224\u0225\3\2\2\2\u0225"+
		"\u0226\7k\2\2\u0226\u008c\3\2\2\2\u0227\u022d\7$\2\2\u0228\u022c\n\n\2"+
		"\2\u0229\u022a\7$\2\2\u022a\u022c\7$\2\2\u022b\u0228\3\2\2\2\u022b\u0229"+
		"\3\2\2\2\u022c\u022f\3\2\2\2\u022d\u022b\3\2\2\2\u022d\u022e\3\2\2\2\u022e"+
		"\u0230\3\2\2\2\u022f\u022d\3\2\2\2\u0230\u0231\7$\2\2\u0231\u008e\3\2"+
		"\2\2\u0232\u0233\t\13\2\2\u0233\u0234\3\2\2\2\u0234\u0235\bH\2\2\u0235"+
		"\u0090\3\2\2\2\u0236\u0237\13\2\2\2\u0237\u0092\3\2\2\2\22\2\u0105\u010e"+
		"\u0113\u01f5\u01fc\u0202\u0207\u020e\u0213\u0218\u021a\u021e\u0223\u022b"+
		"\u022d\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}