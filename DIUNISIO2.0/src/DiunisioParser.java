// Generated from C:/Users/Zylfrox/IdeaProjects/DIUNISIO2.0/src\Diunisio.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DiunisioParser extends Parser {
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
	public static final int
		RULE_algoritmo = 0, RULE_diunisio20 = 1, RULE_declaracionClase = 2, RULE_bloque_clase = 3, 
		RULE_clase_body = 4, RULE_def_clase = 5, RULE_llamada_metodo = 6, RULE_constructor = 7, 
		RULE_bloque_constructor = 8, RULE_superclase = 9, RULE_asignacion_esto = 10, 
		RULE_asignacion_obj = 11, RULE_objeto = 12, RULE_metodo = 13, RULE_modificador = 14, 
		RULE_acceso = 15, RULE_diunisio10 = 16, RULE_lista_ids = 17, RULE_exp_simple = 18, 
		RULE_expresion = 19, RULE_variable = 20, RULE_termino = 21, RULE_factor = 22, 
		RULE_lista_parsv = 23, RULE_conjunto = 24, RULE_tipo = 25, RULE_bloque = 26, 
		RULE_bloque_metodo = 27, RULE_sec_pobjeto = 28, RULE_proposicion_obj = 29, 
		RULE_sec_proposiciones = 30, RULE_proposicion = 31, RULE_asignacion = 32, 
		RULE_si_senten = 33, RULE_bloque_condicional = 34, RULE_mientras_senten = 35, 
		RULE_hacer_mientras_senten = 36, RULE_seleccionar_senten = 37, RULE_casos = 38, 
		RULE_para_senten = 39, RULE_fun_senten = 40, RULE_proc_senten = 41, RULE_funcion = 42;
	private static String[] makeRuleNames() {
		return new String[] {
			"algoritmo", "diunisio20", "declaracionClase", "bloque_clase", "clase_body", 
			"def_clase", "llamada_metodo", "constructor", "bloque_constructor", "superclase", 
			"asignacion_esto", "asignacion_obj", "objeto", "metodo", "modificador", 
			"acceso", "diunisio10", "lista_ids", "exp_simple", "expresion", "variable", 
			"termino", "factor", "lista_parsv", "conjunto", "tipo", "bloque", "bloque_metodo", 
			"sec_pobjeto", "proposicion_obj", "sec_proposiciones", "proposicion", 
			"asignacion", "si_senten", "bloque_condicional", "mientras_senten", "hacer_mientras_senten", 
			"seleccionar_senten", "casos", "para_senten", "fun_senten", "proc_senten", 
			"funcion"
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

	@Override
	public String getGrammarFileName() { return "Diunisio.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DiunisioParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class AlgoritmoContext extends ParserRuleContext {
		public Diunisio10Context diunisio10() {
			return getRuleContext(Diunisio10Context.class,0);
		}
		public Diunisio20Context diunisio20() {
			return getRuleContext(Diunisio20Context.class,0);
		}
		public AlgoritmoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_algoritmo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).enterAlgoritmo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).exitAlgoritmo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiunisioVisitor ) return ((DiunisioVisitor<? extends T>)visitor).visitAlgoritmo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlgoritmoContext algoritmo() throws RecognitionException {
		AlgoritmoContext _localctx = new AlgoritmoContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_algoritmo);
		try {
			setState(88);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALGORITMO:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				diunisio10();
				}
				break;
			case PUBLICO:
			case PRIVADO:
			case PROTEGIDO:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				diunisio20();
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

	public static class Diunisio20Context extends ParserRuleContext {
		public DeclaracionClaseContext declaracionClase() {
			return getRuleContext(DeclaracionClaseContext.class,0);
		}
		public Diunisio20Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diunisio20; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).enterDiunisio20(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).exitDiunisio20(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiunisioVisitor ) return ((DiunisioVisitor<? extends T>)visitor).visitDiunisio20(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Diunisio20Context diunisio20() throws RecognitionException {
		Diunisio20Context _localctx = new Diunisio20Context(_ctx, getState());
		enterRule(_localctx, 2, RULE_diunisio20);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			declaracionClase();
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

	public static class DeclaracionClaseContext extends ParserRuleContext {
		public AccesoContext acceso() {
			return getRuleContext(AccesoContext.class,0);
		}
		public TerminalNode CLASE() { return getToken(DiunisioParser.CLASE, 0); }
		public List<TerminalNode> CLASEID() { return getTokens(DiunisioParser.CLASEID); }
		public TerminalNode CLASEID(int i) {
			return getToken(DiunisioParser.CLASEID, i);
		}
		public Bloque_claseContext bloque_clase() {
			return getRuleContext(Bloque_claseContext.class,0);
		}
		public TerminalNode EXTIENDE() { return getToken(DiunisioParser.EXTIENDE, 0); }
		public TerminalNode IMPLEMENTA() { return getToken(DiunisioParser.IMPLEMENTA, 0); }
		public TerminalNode FINAL() { return getToken(DiunisioParser.FINAL, 0); }
		public TerminalNode ESTATICO() { return getToken(DiunisioParser.ESTATICO, 0); }
		public DeclaracionClaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracionClase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).enterDeclaracionClase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).exitDeclaracionClase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiunisioVisitor ) return ((DiunisioVisitor<? extends T>)visitor).visitDeclaracionClase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionClaseContext declaracionClase() throws RecognitionException {
		DeclaracionClaseContext _localctx = new DeclaracionClaseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaracionClase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			acceso();
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ESTATICO || _la==FINAL) {
				{
				setState(93);
				_la = _input.LA(1);
				if ( !(_la==ESTATICO || _la==FINAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(96);
			match(CLASE);
			setState(97);
			match(CLASEID);
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTIENDE) {
				{
				setState(98);
				match(EXTIENDE);
				setState(99);
				match(CLASEID);
				}
			}

			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTA) {
				{
				setState(102);
				match(IMPLEMENTA);
				setState(103);
				match(CLASEID);
				}
			}

			setState(106);
			bloque_clase();
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

	public static class Bloque_claseContext extends ParserRuleContext {
		public TerminalNode LLAVEIZ() { return getToken(DiunisioParser.LLAVEIZ, 0); }
		public TerminalNode LLAVEDE() { return getToken(DiunisioParser.LLAVEDE, 0); }
		public List<Clase_bodyContext> clase_body() {
			return getRuleContexts(Clase_bodyContext.class);
		}
		public Clase_bodyContext clase_body(int i) {
			return getRuleContext(Clase_bodyContext.class,i);
		}
		public Bloque_claseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque_clase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).enterBloque_clase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).exitBloque_clase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiunisioVisitor ) return ((DiunisioVisitor<? extends T>)visitor).visitBloque_clase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bloque_claseContext bloque_clase() throws RecognitionException {
		Bloque_claseContext _localctx = new Bloque_claseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_bloque_clase);
		int _la;
		try {
			setState(118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				match(LLAVEIZ);
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLICO) | (1L << PRIVADO) | (1L << PROTEGIDO) | (1L << ESTATICO) | (1L << FINAL) | (1L << ABSTRACTO) | (1L << SUPERCLASE) | (1L << VOID) | (1L << DEF) | (1L << RETORNAR) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << BOOL) | (1L << MATRIZ) | (1L << VECTOR) | (1L << LLAVEIZ) | (1L << SI) | (1L << MIENTRAS) | (1L << SELECCIONAR) | (1L << HACER) | (1L << PARA))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (CLASEID - 65)) | (1L << (IDENTIFICADOR - 65)) | (1L << (OTRO - 65)))) != 0)) {
					{
					{
					setState(109);
					clase_body();
					}
					}
					setState(114);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(115);
				match(LLAVEDE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				match(LLAVEIZ);
				setState(117);
				match(LLAVEDE);
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

	public static class Clase_bodyContext extends ParserRuleContext {
		public ProposicionContext proposicion() {
			return getRuleContext(ProposicionContext.class,0);
		}
		public Def_claseContext def_clase() {
			return getRuleContext(Def_claseContext.class,0);
		}
		public ObjetoContext objeto() {
			return getRuleContext(ObjetoContext.class,0);
		}
		public MetodoContext metodo() {
			return getRuleContext(MetodoContext.class,0);
		}
		public Asignacion_objContext asignacion_obj() {
			return getRuleContext(Asignacion_objContext.class,0);
		}
		public ConstructorContext constructor() {
			return getRuleContext(ConstructorContext.class,0);
		}
		public Llamada_metodoContext llamada_metodo() {
			return getRuleContext(Llamada_metodoContext.class,0);
		}
		public Clase_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clase_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).enterClase_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).exitClase_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiunisioVisitor ) return ((DiunisioVisitor<? extends T>)visitor).visitClase_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Clase_bodyContext clase_body() throws RecognitionException {
		Clase_bodyContext _localctx = new Clase_bodyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_clase_body);
		try {
			setState(127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				proposicion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				def_clase();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(122);
				objeto();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(123);
				metodo();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(124);
				asignacion_obj();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(125);
				constructor();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(126);
				llamada_metodo();
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

	public static class Def_claseContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode PCOMA() { return getToken(DiunisioParser.PCOMA, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(DiunisioParser.IDENTIFICADOR, 0); }
		public Def_claseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def_clase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).enterDef_clase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).exitDef_clase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiunisioVisitor ) return ((DiunisioVisitor<? extends T>)visitor).visitDef_clase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Def_claseContext def_clase() throws RecognitionException {
		Def_claseContext _localctx = new Def_claseContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_def_clase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			tipo();
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFICADOR) {
				{
				setState(130);
				match(IDENTIFICADOR);
				}
			}

			setState(133);
			match(PCOMA);
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

	public static class Llamada_metodoContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFICADOR() { return getTokens(DiunisioParser.IDENTIFICADOR); }
		public TerminalNode IDENTIFICADOR(int i) {
			return getToken(DiunisioParser.IDENTIFICADOR, i);
		}
		public TerminalNode PUNTO() { return getToken(DiunisioParser.PUNTO, 0); }
		public Lista_parsvContext lista_parsv() {
			return getRuleContext(Lista_parsvContext.class,0);
		}
		public TerminalNode PCOMA() { return getToken(DiunisioParser.PCOMA, 0); }
		public TerminalNode SUPERCLASE() { return getToken(DiunisioParser.SUPERCLASE, 0); }
		public Llamada_metodoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llamada_metodo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).enterLlamada_metodo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).exitLlamada_metodo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiunisioVisitor ) return ((DiunisioVisitor<? extends T>)visitor).visitLlamada_metodo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Llamada_metodoContext llamada_metodo() throws RecognitionException {
		Llamada_metodoContext _localctx = new Llamada_metodoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_llamada_metodo);
		try {
			setState(147);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				match(IDENTIFICADOR);
				setState(136);
				match(PUNTO);
				setState(137);
				match(IDENTIFICADOR);
				setState(138);
				lista_parsv();
				setState(139);
				match(PCOMA);
				}
				break;
			case SUPERCLASE:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				match(SUPERCLASE);
				setState(142);
				match(PUNTO);
				setState(143);
				match(IDENTIFICADOR);
				setState(144);
				lista_parsv();
				setState(145);
				match(PCOMA);
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

	public static class ConstructorContext extends ParserRuleContext {
		public AccesoContext acceso() {
			return getRuleContext(AccesoContext.class,0);
		}
		public TerminalNode CLASEID() { return getToken(DiunisioParser.CLASEID, 0); }
		public Lista_parsvContext lista_parsv() {
			return getRuleContext(Lista_parsvContext.class,0);
		}
		public TerminalNode LLAVEIZ() { return getToken(DiunisioParser.LLAVEIZ, 0); }
		public TerminalNode LLAVEDE() { return getToken(DiunisioParser.LLAVEDE, 0); }
		public List<Bloque_constructorContext> bloque_constructor() {
			return getRuleContexts(Bloque_constructorContext.class);
		}
		public Bloque_constructorContext bloque_constructor(int i) {
			return getRuleContext(Bloque_constructorContext.class,i);
		}
		public ConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).enterConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).exitConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiunisioVisitor ) return ((DiunisioVisitor<? extends T>)visitor).visitConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorContext constructor() throws RecognitionException {
		ConstructorContext _localctx = new ConstructorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_constructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			acceso();
			setState(150);
			match(CLASEID);
			setState(151);
			lista_parsv();
			setState(152);
			match(LLAVEIZ);
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ESTO || _la==SUPERCLASE) {
				{
				{
				setState(153);
				bloque_constructor();
				}
				}
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(159);
			match(LLAVEDE);
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

	public static class Bloque_constructorContext extends ParserRuleContext {
		public Asignacion_estoContext asignacion_esto() {
			return getRuleContext(Asignacion_estoContext.class,0);
		}
		public SuperclaseContext superclase() {
			return getRuleContext(SuperclaseContext.class,0);
		}
		public Bloque_constructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque_constructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).enterBloque_constructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).exitBloque_constructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiunisioVisitor ) return ((DiunisioVisitor<? extends T>)visitor).visitBloque_constructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bloque_constructorContext bloque_constructor() throws RecognitionException {
		Bloque_constructorContext _localctx = new Bloque_constructorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_bloque_constructor);
		try {
			setState(163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ESTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				asignacion_esto();
				}
				break;
			case SUPERCLASE:
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
				superclase();
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

	public static class SuperclaseContext extends ParserRuleContext {
		public TerminalNode SUPERCLASE() { return getToken(DiunisioParser.SUPERCLASE, 0); }
		public Lista_parsvContext lista_parsv() {
			return getRuleContext(Lista_parsvContext.class,0);
		}
		public TerminalNode PCOMA() { return getToken(DiunisioParser.PCOMA, 0); }
		public SuperclaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superclase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).enterSuperclase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).exitSuperclase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiunisioVisitor ) return ((DiunisioVisitor<? extends T>)visitor).visitSuperclase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuperclaseContext superclase() throws RecognitionException {
		SuperclaseContext _localctx = new SuperclaseContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_superclase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(SUPERCLASE);
			setState(166);
			lista_parsv();
			setState(167);
			match(PCOMA);
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

	public static class Asignacion_estoContext extends ParserRuleContext {
		public TerminalNode ESTO() { return getToken(DiunisioParser.ESTO, 0); }
		public TerminalNode PUNTO() { return getToken(DiunisioParser.PUNTO, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(DiunisioParser.IDENTIFICADOR, 0); }
		public TerminalNode ASIGNAR() { return getToken(DiunisioParser.ASIGNAR, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PCOMA() { return getToken(DiunisioParser.PCOMA, 0); }
		public Asignacion_estoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion_esto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).enterAsignacion_esto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).exitAsignacion_esto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiunisioVisitor ) return ((DiunisioVisitor<? extends T>)visitor).visitAsignacion_esto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Asignacion_estoContext asignacion_esto() throws RecognitionException {
		Asignacion_estoContext _localctx = new Asignacion_estoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_asignacion_esto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(169);
			match(ESTO);
			setState(170);
			match(PUNTO);
			setState(171);
			match(IDENTIFICADOR);
			setState(172);
			match(ASIGNAR);
			setState(173);
			expresion();
			setState(174);
			match(PCOMA);
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

	public static class Asignacion_objContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(DiunisioParser.IDENTIFICADOR, 0); }
		public TerminalNode PUNTO() { return getToken(DiunisioParser.PUNTO, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode ASIGNAR() { return getToken(DiunisioParser.ASIGNAR, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PCOMA() { return getToken(DiunisioParser.PCOMA, 0); }
		public Asignacion_objContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion_obj; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).enterAsignacion_obj(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).exitAsignacion_obj(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiunisioVisitor ) return ((DiunisioVisitor<? extends T>)visitor).visitAsignacion_obj(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Asignacion_objContext asignacion_obj() throws RecognitionException {
		Asignacion_objContext _localctx = new Asignacion_objContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_asignacion_obj);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(IDENTIFICADOR);
			setState(177);
			match(PUNTO);
			setState(178);
			variable();
			setState(179);
			match(ASIGNAR);
			setState(180);
			expresion();
			setState(181);
			match(PCOMA);
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

	public static class ObjetoContext extends ParserRuleContext {
		public List<TerminalNode> CLASEID() { return getTokens(DiunisioParser.CLASEID); }
		public TerminalNode CLASEID(int i) {
			return getToken(DiunisioParser.CLASEID, i);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(DiunisioParser.IDENTIFICADOR, 0); }
		public TerminalNode ASIGNAR() { return getToken(DiunisioParser.ASIGNAR, 0); }
		public TerminalNode NUEVO() { return getToken(DiunisioParser.NUEVO, 0); }
		public Lista_parsvContext lista_parsv() {
			return getRuleContext(Lista_parsvContext.class,0);
		}
		public TerminalNode PCOMA() { return getToken(DiunisioParser.PCOMA, 0); }
		public ObjetoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objeto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).enterObjeto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).exitObjeto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiunisioVisitor ) return ((DiunisioVisitor<? extends T>)visitor).visitObjeto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjetoContext objeto() throws RecognitionException {
		ObjetoContext _localctx = new ObjetoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_objeto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(CLASEID);
			setState(184);
			match(IDENTIFICADOR);
			setState(185);
			match(ASIGNAR);
			setState(186);
			match(NUEVO);
			setState(187);
			match(CLASEID);
			setState(188);
			lista_parsv();
			setState(189);
			match(PCOMA);
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

	public static class MetodoContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(DiunisioParser.IDENTIFICADOR, 0); }
		public Lista_parsvContext lista_parsv() {
			return getRuleContext(Lista_parsvContext.class,0);
		}
		public Bloque_metodoContext bloque_metodo() {
			return getRuleContext(Bloque_metodoContext.class,0);
		}
		public AccesoContext acceso() {
			return getRuleContext(AccesoContext.class,0);
		}
		public ModificadorContext modificador() {
			return getRuleContext(ModificadorContext.class,0);
		}
		public MetodoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metodo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).enterMetodo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).exitMetodo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiunisioVisitor ) return ((DiunisioVisitor<? extends T>)visitor).visitMetodo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MetodoContext metodo() throws RecognitionException {
		MetodoContext _localctx = new MetodoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_metodo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLICO) | (1L << PRIVADO) | (1L << PROTEGIDO))) != 0)) {
				{
				setState(191);
				acceso();
				}
			}

			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ESTATICO) | (1L << FINAL) | (1L << ABSTRACTO))) != 0)) {
				{
				setState(194);
				modificador();
				}
			}

			setState(197);
			tipo();
			setState(198);
			match(IDENTIFICADOR);
			setState(199);
			lista_parsv();
			setState(200);
			bloque_metodo();
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

	public static class ModificadorContext extends ParserRuleContext {
		public TerminalNode ESTATICO() { return getToken(DiunisioParser.ESTATICO, 0); }
		public TerminalNode FINAL() { return getToken(DiunisioParser.FINAL, 0); }
		public TerminalNode ABSTRACTO() { return getToken(DiunisioParser.ABSTRACTO, 0); }
		public ModificadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modificador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).enterModificador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).exitModificador(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiunisioVisitor ) return ((DiunisioVisitor<? extends T>)visitor).visitModificador(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModificadorContext modificador() throws RecognitionException {
		ModificadorContext _localctx = new ModificadorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_modificador);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ESTATICO) | (1L << FINAL) | (1L << ABSTRACTO))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class AccesoContext extends ParserRuleContext {
		public TerminalNode PUBLICO() { return getToken(DiunisioParser.PUBLICO, 0); }
		public TerminalNode PRIVADO() { return getToken(DiunisioParser.PRIVADO, 0); }
		public TerminalNode PROTEGIDO() { return getToken(DiunisioParser.PROTEGIDO, 0); }
		public AccesoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_acceso; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).enterAcceso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).exitAcceso(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiunisioVisitor ) return ((DiunisioVisitor<? extends T>)visitor).visitAcceso(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccesoContext acceso() throws RecognitionException {
		AccesoContext _localctx = new AccesoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_acceso);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLICO) | (1L << PRIVADO) | (1L << PROTEGIDO))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Diunisio10Context extends ParserRuleContext {
		public TerminalNode ALGORITMO() { return getToken(DiunisioParser.ALGORITMO, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(DiunisioParser.IDENTIFICADOR, 0); }
		public TerminalNode DOSPUNTOS() { return getToken(DiunisioParser.DOSPUNTOS, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public TerminalNode TERMINA() { return getToken(DiunisioParser.TERMINA, 0); }
		public TerminalNode PAREN_AP() { return getToken(DiunisioParser.PAREN_AP, 0); }
		public Lista_idsContext lista_ids() {
			return getRuleContext(Lista_idsContext.class,0);
		}
		public TerminalNode PAREN_CI() { return getToken(DiunisioParser.PAREN_CI, 0); }
		public Diunisio10Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diunisio10; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).enterDiunisio10(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).exitDiunisio10(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiunisioVisitor ) return ((DiunisioVisitor<? extends T>)visitor).visitDiunisio10(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Diunisio10Context diunisio10() throws RecognitionException {
		Diunisio10Context _localctx = new Diunisio10Context(_ctx, getState());
		enterRule(_localctx, 32, RULE_diunisio10);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(ALGORITMO);
			setState(207);
			match(IDENTIFICADOR);
			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PAREN_AP) {
				{
				setState(208);
				match(PAREN_AP);
				setState(209);
				lista_ids();
				setState(210);
				match(PAREN_CI);
				}
			}

			setState(214);
			match(DOSPUNTOS);
			setState(215);
			bloque();
			setState(216);
			match(TERMINA);
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

	public static class Lista_idsContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFICADOR() { return getTokens(DiunisioParser.IDENTIFICADOR); }
		public TerminalNode IDENTIFICADOR(int i) {
			return getToken(DiunisioParser.IDENTIFICADOR, i);
		}
		public List<TerminalNode> COMA() { return getTokens(DiunisioParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(DiunisioParser.COMA, i);
		}
		public Lista_idsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_ids; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).enterLista_ids(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).exitLista_ids(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiunisioVisitor ) return ((DiunisioVisitor<? extends T>)visitor).visitLista_ids(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lista_idsContext lista_ids() throws RecognitionException {
		Lista_idsContext _localctx = new Lista_idsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_lista_ids);
		int _la;
		try {
			setState(227);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
				match(IDENTIFICADOR);
				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(219);
					match(COMA);
					setState(220);
					match(IDENTIFICADOR);
					}
					}
					setState(225);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case PAREN_CI:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Exp_simpleContext extends ParserRuleContext {
		public Token op;
		public Token op2;
		public TerminalNode PAREN_AP() { return getToken(DiunisioParser.PAREN_AP, 0); }
		public Exp_simpleContext exp_simple() {
			return getRuleContext(Exp_simpleContext.class,0);
		}
		public TerminalNode PAREN_CI() { return getToken(DiunisioParser.PAREN_CI, 0); }
		public List<TerminoContext> termino() {
			return getRuleContexts(TerminoContext.class);
		}
		public TerminoContext termino(int i) {
			return getRuleContext(TerminoContext.class,i);
		}
		public List<TerminalNode> SUMA() { return getTokens(DiunisioParser.SUMA); }
		public TerminalNode SUMA(int i) {
			return getToken(DiunisioParser.SUMA, i);
		}
		public List<TerminalNode> MENOS() { return getTokens(DiunisioParser.MENOS); }
		public TerminalNode MENOS(int i) {
			return getToken(DiunisioParser.MENOS, i);
		}
		public List<TerminalNode> O() { return getTokens(DiunisioParser.O); }
		public TerminalNode O(int i) {
			return getToken(DiunisioParser.O, i);
		}
		public Exp_simpleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_simple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).enterExp_simple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).exitExp_simple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiunisioVisitor ) return ((DiunisioVisitor<? extends T>)visitor).visitExp_simple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp_simpleContext exp_simple() throws RecognitionException {
		Exp_simpleContext _localctx = new Exp_simpleContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_exp_simple);
		int _la;
		try {
			setState(245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(229);
				match(PAREN_AP);
				setState(230);
				exp_simple();
				setState(231);
				match(PAREN_CI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUMA || _la==MENOS) {
					{
					setState(233);
					((Exp_simpleContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==SUMA || _la==MENOS) ) {
						((Exp_simpleContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(236);
				termino();
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << O) | (1L << SUMA) | (1L << MENOS))) != 0)) {
					{
					{
					setState(237);
					((Exp_simpleContext)_localctx).op2 = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << O) | (1L << SUMA) | (1L << MENOS))) != 0)) ) {
						((Exp_simpleContext)_localctx).op2 = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(238);
					termino();
					}
					}
					setState(243);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(244);
				termino();
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

	public static class ExpresionContext extends ParserRuleContext {
		public Token op;
		public TerminalNode PAREN_AP() { return getToken(DiunisioParser.PAREN_AP, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PAREN_CI() { return getToken(DiunisioParser.PAREN_CI, 0); }
		public List<Exp_simpleContext> exp_simple() {
			return getRuleContexts(Exp_simpleContext.class);
		}
		public Exp_simpleContext exp_simple(int i) {
			return getRuleContext(Exp_simpleContext.class,i);
		}
		public TerminalNode IGUAL() { return getToken(DiunisioParser.IGUAL, 0); }
		public TerminalNode DIFERENTE() { return getToken(DiunisioParser.DIFERENTE, 0); }
		public TerminalNode MEN_IGUAL() { return getToken(DiunisioParser.MEN_IGUAL, 0); }
		public TerminalNode MAY_IGUAL() { return getToken(DiunisioParser.MAY_IGUAL, 0); }
		public TerminalNode MENOR() { return getToken(DiunisioParser.MENOR, 0); }
		public TerminalNode MAYOR() { return getToken(DiunisioParser.MAYOR, 0); }
		public TerminalNode NO() { return getToken(DiunisioParser.NO, 0); }
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).enterExpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).exitExpresion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiunisioVisitor ) return ((DiunisioVisitor<? extends T>)visitor).visitExpresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_expresion);
		int _la;
		try {
			setState(262);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				match(PAREN_AP);
				setState(248);
				expresion();
				setState(249);
				match(PAREN_CI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(251);
				exp_simple();
				setState(252);
				((ExpresionContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IGUAL) | (1L << DIFERENTE) | (1L << MAYOR) | (1L << MENOR) | (1L << MAY_IGUAL) | (1L << MEN_IGUAL))) != 0)) ) {
					((ExpresionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(253);
				exp_simple();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(255);
				match(PAREN_AP);
				setState(256);
				exp_simple();
				setState(257);
				match(PAREN_CI);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(259);
				exp_simple();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(260);
				match(NO);
				setState(261);
				expresion();
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(DiunisioParser.IDENTIFICADOR, 0); }
		public ConjuntoContext conjunto() {
			return getRuleContext(ConjuntoContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiunisioVisitor ) return ((DiunisioVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_variable);
		try {
			setState(267);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(264);
				match(IDENTIFICADOR);
				setState(265);
				conjunto();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(266);
				match(IDENTIFICADOR);
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

	public static class TerminoContext extends ParserRuleContext {
		public Token op;
		public TerminalNode PAREN_AP() { return getToken(DiunisioParser.PAREN_AP, 0); }
		public TerminoContext termino() {
			return getRuleContext(TerminoContext.class,0);
		}
		public TerminalNode PAREN_CI() { return getToken(DiunisioParser.PAREN_CI, 0); }
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> MULT() { return getTokens(DiunisioParser.MULT); }
		public TerminalNode MULT(int i) {
			return getToken(DiunisioParser.MULT, i);
		}
		public List<TerminalNode> DIV() { return getTokens(DiunisioParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(DiunisioParser.DIV, i);
		}
		public List<TerminalNode> MOD() { return getTokens(DiunisioParser.MOD); }
		public TerminalNode MOD(int i) {
			return getToken(DiunisioParser.MOD, i);
		}
		public List<TerminalNode> Y() { return getTokens(DiunisioParser.Y); }
		public TerminalNode Y(int i) {
			return getToken(DiunisioParser.Y, i);
		}
		public List<TerminalNode> O() { return getTokens(DiunisioParser.O); }
		public TerminalNode O(int i) {
			return getToken(DiunisioParser.O, i);
		}
		public List<TerminalNode> POTENCIA() { return getTokens(DiunisioParser.POTENCIA); }
		public TerminalNode POTENCIA(int i) {
			return getToken(DiunisioParser.POTENCIA, i);
		}
		public TerminalNode NO() { return getToken(DiunisioParser.NO, 0); }
		public TerminoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termino; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).enterTermino(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).exitTermino(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiunisioVisitor ) return ((DiunisioVisitor<? extends T>)visitor).visitTermino(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TerminoContext termino() throws RecognitionException {
		TerminoContext _localctx = new TerminoContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_termino);
		int _la;
		try {
			int _alt;
			setState(284);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(269);
				match(PAREN_AP);
				setState(270);
				termino();
				setState(271);
				match(PAREN_CI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(273);
				factor();
				setState(278);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(274);
						((TerminoContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << O) | (1L << Y) | (1L << MULT) | (1L << DIV) | (1L << MOD) | (1L << POTENCIA))) != 0)) ) {
							((TerminoContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(275);
						factor();
						}
						} 
					}
					setState(280);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(281);
				match(NO);
				setState(282);
				termino();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(283);
				factor();
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

	public static class FactorContext extends ParserRuleContext {
		public TerminalNode ENTERO() { return getToken(DiunisioParser.ENTERO, 0); }
		public TerminalNode REAL() { return getToken(DiunisioParser.REAL, 0); }
		public TerminalNode CADENA() { return getToken(DiunisioParser.CADENA, 0); }
		public TerminalNode COMPLEJO() { return getToken(DiunisioParser.COMPLEJO, 0); }
		public TerminalNode NULO() { return getToken(DiunisioParser.NULO, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(DiunisioParser.IDENTIFICADOR, 0); }
		public Lista_parsvContext lista_parsv() {
			return getRuleContext(Lista_parsvContext.class,0);
		}
		public List<TerminalNode> ANGIZ() { return getTokens(DiunisioParser.ANGIZ); }
		public TerminalNode ANGIZ(int i) {
			return getToken(DiunisioParser.ANGIZ, i);
		}
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> ANGDE() { return getTokens(DiunisioParser.ANGDE); }
		public TerminalNode ANGDE(int i) {
			return getToken(DiunisioParser.ANGDE, i);
		}
		public TerminalNode NO() { return getToken(DiunisioParser.NO, 0); }
		public TerminalNode VERDADERO() { return getToken(DiunisioParser.VERDADERO, 0); }
		public TerminalNode FALSO() { return getToken(DiunisioParser.FALSO, 0); }
		public ConjuntoContext conjunto() {
			return getRuleContext(ConjuntoContext.class,0);
		}
		public TerminalNode PAREN_AP() { return getToken(DiunisioParser.PAREN_AP, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PAREN_CI() { return getToken(DiunisioParser.PAREN_CI, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiunisioVisitor ) return ((DiunisioVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_factor);
		int _la;
		try {
			setState(315);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(286);
				match(ENTERO);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(287);
				match(REAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(288);
				match(CADENA);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(289);
				match(COMPLEJO);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(290);
				match(NULO);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(291);
				variable();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(292);
				match(IDENTIFICADOR);
				setState(294);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PAREN_AP) {
					{
					setState(293);
					lista_parsv();
					}
				}

				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(296);
				match(IDENTIFICADOR);
				setState(301); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(297);
					match(ANGIZ);
					setState(298);
					factor();
					setState(299);
					match(ANGDE);
					}
					}
					setState(303); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ANGIZ );
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(305);
				match(IDENTIFICADOR);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(306);
				match(NO);
				setState(307);
				factor();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(308);
				match(VERDADERO);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(309);
				match(FALSO);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(310);
				conjunto();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(311);
				match(PAREN_AP);
				setState(312);
				expresion();
				setState(313);
				match(PAREN_CI);
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

	public static class Lista_parsvContext extends ParserRuleContext {
		public TerminalNode PAREN_AP() { return getToken(DiunisioParser.PAREN_AP, 0); }
		public TerminalNode PAREN_CI() { return getToken(DiunisioParser.PAREN_CI, 0); }
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<TerminalNode> IDENTIFICADOR() { return getTokens(DiunisioParser.IDENTIFICADOR); }
		public TerminalNode IDENTIFICADOR(int i) {
			return getToken(DiunisioParser.IDENTIFICADOR, i);
		}
		public List<TerminalNode> COMA() { return getTokens(DiunisioParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(DiunisioParser.COMA, i);
		}
		public Lista_parsvContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_parsv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).enterLista_parsv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).exitLista_parsv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiunisioVisitor ) return ((DiunisioVisitor<? extends T>)visitor).visitLista_parsv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lista_parsvContext lista_parsv() throws RecognitionException {
		Lista_parsvContext _localctx = new Lista_parsvContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_lista_parsv);
		int _la;
		try {
			setState(337);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(317);
				match(PAREN_AP);
				setState(321);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(318);
					expresion();
					}
					break;
				case 2:
					{
					setState(319);
					variable();
					}
					break;
				case 3:
					{
					setState(320);
					match(IDENTIFICADOR);
					}
					break;
				}
				setState(331);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(323);
					match(COMA);
					setState(327);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
					case 1:
						{
						setState(324);
						expresion();
						}
						break;
					case 2:
						{
						setState(325);
						variable();
						}
						break;
					case 3:
						{
						setState(326);
						match(IDENTIFICADOR);
						}
						break;
					}
					}
					}
					setState(333);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(334);
				match(PAREN_CI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(335);
				match(PAREN_AP);
				setState(336);
				match(PAREN_CI);
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

	public static class ConjuntoContext extends ParserRuleContext {
		public TerminalNode LLAVEIZ() { return getToken(DiunisioParser.LLAVEIZ, 0); }
		public TerminalNode LLAVEDE() { return getToken(DiunisioParser.LLAVEDE, 0); }
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(DiunisioParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(DiunisioParser.COMA, i);
		}
		public ConjuntoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conjunto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).enterConjunto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).exitConjunto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiunisioVisitor ) return ((DiunisioVisitor<? extends T>)visitor).visitConjunto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConjuntoContext conjunto() throws RecognitionException {
		ConjuntoContext _localctx = new ConjuntoContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_conjunto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			match(LLAVEIZ);
			setState(348);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 28)) & ~0x3f) == 0 && ((1L << (_la - 28)) & ((1L << (SUMA - 28)) | (1L << (MENOS - 28)) | (1L << (NO - 28)) | (1L << (PAREN_AP - 28)) | (1L << (LLAVEIZ - 28)) | (1L << (VERDADERO - 28)) | (1L << (FALSO - 28)) | (1L << (NULO - 28)) | (1L << (IDENTIFICADOR - 28)) | (1L << (ENTERO - 28)) | (1L << (REAL - 28)) | (1L << (COMPLEJO - 28)) | (1L << (CADENA - 28)))) != 0)) {
				{
				setState(340);
				expresion();
				setState(345);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(341);
					match(COMA);
					setState(342);
					expresion();
					}
					}
					setState(347);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(350);
			match(LLAVEDE);
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

	public static class TipoContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(DiunisioParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(DiunisioParser.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(DiunisioParser.STRING, 0); }
		public TerminalNode BOOL() { return getToken(DiunisioParser.BOOL, 0); }
		public TerminalNode MATRIZ() { return getToken(DiunisioParser.MATRIZ, 0); }
		public TerminalNode VECTOR() { return getToken(DiunisioParser.VECTOR, 0); }
		public TerminalNode VOID() { return getToken(DiunisioParser.VOID, 0); }
		public TerminalNode CLASEID() { return getToken(DiunisioParser.CLASEID, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).exitTipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiunisioVisitor ) return ((DiunisioVisitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			_la = _input.LA(1);
			if ( !(((((_la - 15)) & ~0x3f) == 0 && ((1L << (_la - 15)) & ((1L << (VOID - 15)) | (1L << (INT - 15)) | (1L << (FLOAT - 15)) | (1L << (STRING - 15)) | (1L << (BOOL - 15)) | (1L << (MATRIZ - 15)) | (1L << (VECTOR - 15)) | (1L << (CLASEID - 15)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class BloqueContext extends ParserRuleContext {
		public TerminalNode LLAVEIZ() { return getToken(DiunisioParser.LLAVEIZ, 0); }
		public TerminalNode LLAVEDE() { return getToken(DiunisioParser.LLAVEDE, 0); }
		public Sec_proposicionesContext sec_proposiciones() {
			return getRuleContext(Sec_proposicionesContext.class,0);
		}
		public BloqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).enterBloque(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).exitBloque(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiunisioVisitor ) return ((DiunisioVisitor<? extends T>)visitor).visitBloque(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BloqueContext bloque() throws RecognitionException {
		BloqueContext _localctx = new BloqueContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_bloque);
		try {
			setState(360);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(354);
				match(LLAVEIZ);
				setState(355);
				match(LLAVEDE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(356);
				match(LLAVEIZ);
				setState(357);
				sec_proposiciones();
				setState(358);
				match(LLAVEDE);
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

	public static class Bloque_metodoContext extends ParserRuleContext {
		public TerminalNode LLAVEIZ() { return getToken(DiunisioParser.LLAVEIZ, 0); }
		public TerminalNode LLAVEDE() { return getToken(DiunisioParser.LLAVEDE, 0); }
		public Sec_pobjetoContext sec_pobjeto() {
			return getRuleContext(Sec_pobjetoContext.class,0);
		}
		public Bloque_metodoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque_metodo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).enterBloque_metodo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).exitBloque_metodo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiunisioVisitor ) return ((DiunisioVisitor<? extends T>)visitor).visitBloque_metodo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bloque_metodoContext bloque_metodo() throws RecognitionException {
		Bloque_metodoContext _localctx = new Bloque_metodoContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_bloque_metodo);
		try {
			setState(368);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(362);
				match(LLAVEIZ);
				setState(363);
				match(LLAVEDE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(364);
				match(LLAVEIZ);
				setState(365);
				sec_pobjeto();
				setState(366);
				match(LLAVEDE);
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

	public static class Sec_pobjetoContext extends ParserRuleContext {
		public List<Proposicion_objContext> proposicion_obj() {
			return getRuleContexts(Proposicion_objContext.class);
		}
		public Proposicion_objContext proposicion_obj(int i) {
			return getRuleContext(Proposicion_objContext.class,i);
		}
		public Sec_pobjetoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sec_pobjeto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).enterSec_pobjeto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).exitSec_pobjeto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiunisioVisitor ) return ((DiunisioVisitor<? extends T>)visitor).visitSec_pobjeto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sec_pobjetoContext sec_pobjeto() throws RecognitionException {
		Sec_pobjetoContext _localctx = new Sec_pobjetoContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_sec_pobjeto);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(370);
					proposicion_obj();
					}
					} 
				}
				setState(375);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			}
			setState(376);
			proposicion_obj();
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

	public static class Proposicion_objContext extends ParserRuleContext {
		public Token OTRO;
		public TerminalNode RETORNAR() { return getToken(DiunisioParser.RETORNAR, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PCOMA() { return getToken(DiunisioParser.PCOMA, 0); }
		public ObjetoContext objeto() {
			return getRuleContext(ObjetoContext.class,0);
		}
		public Si_sentenContext si_senten() {
			return getRuleContext(Si_sentenContext.class,0);
		}
		public Asignacion_objContext asignacion_obj() {
			return getRuleContext(Asignacion_objContext.class,0);
		}
		public Llamada_metodoContext llamada_metodo() {
			return getRuleContext(Llamada_metodoContext.class,0);
		}
		public Mientras_sentenContext mientras_senten() {
			return getRuleContext(Mientras_sentenContext.class,0);
		}
		public Para_sentenContext para_senten() {
			return getRuleContext(Para_sentenContext.class,0);
		}
		public Hacer_mientras_sentenContext hacer_mientras_senten() {
			return getRuleContext(Hacer_mientras_sentenContext.class,0);
		}
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public TerminalNode LLAVEIZ() { return getToken(DiunisioParser.LLAVEIZ, 0); }
		public Proposicion_objContext proposicion_obj() {
			return getRuleContext(Proposicion_objContext.class,0);
		}
		public TerminalNode LLAVEDE() { return getToken(DiunisioParser.LLAVEDE, 0); }
		public TerminalNode OTRO() { return getToken(DiunisioParser.OTRO, 0); }
		public Proposicion_objContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proposicion_obj; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).enterProposicion_obj(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).exitProposicion_obj(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiunisioVisitor ) return ((DiunisioVisitor<? extends T>)visitor).visitProposicion_obj(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Proposicion_objContext proposicion_obj() throws RecognitionException {
		Proposicion_objContext _localctx = new Proposicion_objContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_proposicion_obj);
		try {
			setState(398);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(378);
				match(RETORNAR);
				setState(379);
				expresion();
				setState(380);
				match(PCOMA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(382);
				objeto();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(383);
				si_senten();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(384);
				asignacion_obj();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(385);
				llamada_metodo();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(386);
				mientras_senten();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(387);
				para_senten();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(388);
				hacer_mientras_senten();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(389);
				asignacion();
				setState(390);
				match(PCOMA);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(392);
				match(LLAVEIZ);
				setState(393);
				proposicion_obj();
				setState(394);
				match(LLAVEDE);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(396);
				((Proposicion_objContext)_localctx).OTRO = match(OTRO);
				System.err.println("Caracter desconocido: " + (((Proposicion_objContext)_localctx).OTRO!=null?((Proposicion_objContext)_localctx).OTRO.getText():null));
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

	public static class Sec_proposicionesContext extends ParserRuleContext {
		public List<ProposicionContext> proposicion() {
			return getRuleContexts(ProposicionContext.class);
		}
		public ProposicionContext proposicion(int i) {
			return getRuleContext(ProposicionContext.class,i);
		}
		public Sec_proposicionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sec_proposiciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).enterSec_proposiciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).exitSec_proposiciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiunisioVisitor ) return ((DiunisioVisitor<? extends T>)visitor).visitSec_proposiciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sec_proposicionesContext sec_proposiciones() throws RecognitionException {
		Sec_proposicionesContext _localctx = new Sec_proposicionesContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_sec_proposiciones);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(400);
					proposicion();
					}
					} 
				}
				setState(405);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			}
			setState(406);
			proposicion();
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

	public static class ProposicionContext extends ParserRuleContext {
		public Token OTRO;
		public TerminalNode RETORNAR() { return getToken(DiunisioParser.RETORNAR, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PCOMA() { return getToken(DiunisioParser.PCOMA, 0); }
		public Fun_sentenContext fun_senten() {
			return getRuleContext(Fun_sentenContext.class,0);
		}
		public Proc_sentenContext proc_senten() {
			return getRuleContext(Proc_sentenContext.class,0);
		}
		public Si_sentenContext si_senten() {
			return getRuleContext(Si_sentenContext.class,0);
		}
		public Seleccionar_sentenContext seleccionar_senten() {
			return getRuleContext(Seleccionar_sentenContext.class,0);
		}
		public Mientras_sentenContext mientras_senten() {
			return getRuleContext(Mientras_sentenContext.class,0);
		}
		public Para_sentenContext para_senten() {
			return getRuleContext(Para_sentenContext.class,0);
		}
		public Hacer_mientras_sentenContext hacer_mientras_senten() {
			return getRuleContext(Hacer_mientras_sentenContext.class,0);
		}
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(DiunisioParser.IDENTIFICADOR, 0); }
		public Lista_parsvContext lista_parsv() {
			return getRuleContext(Lista_parsvContext.class,0);
		}
		public TerminalNode LLAVEIZ() { return getToken(DiunisioParser.LLAVEIZ, 0); }
		public Sec_proposicionesContext sec_proposiciones() {
			return getRuleContext(Sec_proposicionesContext.class,0);
		}
		public TerminalNode LLAVEDE() { return getToken(DiunisioParser.LLAVEDE, 0); }
		public TerminalNode OTRO() { return getToken(DiunisioParser.OTRO, 0); }
		public ProposicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proposicion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).enterProposicion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).exitProposicion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiunisioVisitor ) return ((DiunisioVisitor<? extends T>)visitor).visitProposicion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProposicionContext proposicion() throws RecognitionException {
		ProposicionContext _localctx = new ProposicionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_proposicion);
		try {
			setState(432);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(408);
				match(RETORNAR);
				setState(409);
				expresion();
				setState(410);
				match(PCOMA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(412);
				fun_senten();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(413);
				proc_senten();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(414);
				si_senten();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(415);
				seleccionar_senten();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(416);
				mientras_senten();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(417);
				para_senten();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(418);
				hacer_mientras_senten();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(419);
				asignacion();
				setState(420);
				match(PCOMA);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(422);
				match(IDENTIFICADOR);
				setState(423);
				lista_parsv();
				setState(424);
				match(PCOMA);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(426);
				match(LLAVEIZ);
				setState(427);
				sec_proposiciones();
				setState(428);
				match(LLAVEDE);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(430);
				((ProposicionContext)_localctx).OTRO = match(OTRO);
				System.err.println("Caracter desconocido: " + (((ProposicionContext)_localctx).OTRO!=null?((ProposicionContext)_localctx).OTRO.getText():null));
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

	public static class AsignacionContext extends ParserRuleContext {
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
	 
		public AsignacionContext() { }
		public void copyFrom(AsignacionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AsigVecContext extends AsignacionContext {
		public TerminalNode IDENTIFICADOR() { return getToken(DiunisioParser.IDENTIFICADOR, 0); }
		public TerminalNode ASIGNAR() { return getToken(DiunisioParser.ASIGNAR, 0); }
		public ConjuntoContext conjunto() {
			return getRuleContext(ConjuntoContext.class,0);
		}
		public AsigVecContext(AsignacionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).enterAsigVec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).exitAsigVec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiunisioVisitor ) return ((DiunisioVisitor<? extends T>)visitor).visitAsigVec(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AsigNumContext extends AsignacionContext {
		public TerminalNode IDENTIFICADOR() { return getToken(DiunisioParser.IDENTIFICADOR, 0); }
		public TerminalNode ASIGNAR() { return getToken(DiunisioParser.ASIGNAR, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public AsigNumContext(AsignacionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).enterAsigNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).exitAsigNum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiunisioVisitor ) return ((DiunisioVisitor<? extends T>)visitor).visitAsigNum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_asignacion);
		try {
			setState(440);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				_localctx = new AsigNumContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(434);
				match(IDENTIFICADOR);
				setState(435);
				match(ASIGNAR);
				setState(436);
				expresion();
				}
				break;
			case 2:
				_localctx = new AsigVecContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(437);
				match(IDENTIFICADOR);
				setState(438);
				match(ASIGNAR);
				setState(439);
				conjunto();
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

	public static class Si_sentenContext extends ParserRuleContext {
		public List<TerminalNode> SI() { return getTokens(DiunisioParser.SI); }
		public TerminalNode SI(int i) {
			return getToken(DiunisioParser.SI, i);
		}
		public List<Bloque_condicionalContext> bloque_condicional() {
			return getRuleContexts(Bloque_condicionalContext.class);
		}
		public Bloque_condicionalContext bloque_condicional(int i) {
			return getRuleContext(Bloque_condicionalContext.class,i);
		}
		public List<TerminalNode> SI_NO() { return getTokens(DiunisioParser.SI_NO); }
		public TerminalNode SI_NO(int i) {
			return getToken(DiunisioParser.SI_NO, i);
		}
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public TerminalNode ENTONCES() { return getToken(DiunisioParser.ENTONCES, 0); }
		public Si_sentenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_si_senten; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).enterSi_senten(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).exitSi_senten(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiunisioVisitor ) return ((DiunisioVisitor<? extends T>)visitor).visitSi_senten(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Si_sentenContext si_senten() throws RecognitionException {
		Si_sentenContext _localctx = new Si_sentenContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_si_senten);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			match(SI);
			setState(443);
			bloque_condicional();
			setState(449);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(444);
					match(SI_NO);
					setState(445);
					match(SI);
					setState(446);
					bloque_condicional();
					}
					} 
				}
				setState(451);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			}
			setState(457);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SI_NO) {
				{
				setState(452);
				match(SI_NO);
				setState(454);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ENTONCES) {
					{
					setState(453);
					match(ENTONCES);
					}
				}

				setState(456);
				bloque();
				}
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

	public static class Bloque_condicionalContext extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public TerminalNode ENTONCES() { return getToken(DiunisioParser.ENTONCES, 0); }
		public Bloque_condicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque_condicional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).enterBloque_condicional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).exitBloque_condicional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiunisioVisitor ) return ((DiunisioVisitor<? extends T>)visitor).visitBloque_condicional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bloque_condicionalContext bloque_condicional() throws RecognitionException {
		Bloque_condicionalContext _localctx = new Bloque_condicionalContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_bloque_condicional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
			expresion();
			setState(461);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ENTONCES) {
				{
				setState(460);
				match(ENTONCES);
				}
			}

			setState(463);
			bloque();
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

	public static class Mientras_sentenContext extends ParserRuleContext {
		public TerminalNode MIENTRAS() { return getToken(DiunisioParser.MIENTRAS, 0); }
		public Bloque_condicionalContext bloque_condicional() {
			return getRuleContext(Bloque_condicionalContext.class,0);
		}
		public Mientras_sentenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mientras_senten; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).enterMientras_senten(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).exitMientras_senten(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiunisioVisitor ) return ((DiunisioVisitor<? extends T>)visitor).visitMientras_senten(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mientras_sentenContext mientras_senten() throws RecognitionException {
		Mientras_sentenContext _localctx = new Mientras_sentenContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_mientras_senten);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			match(MIENTRAS);
			setState(466);
			bloque_condicional();
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

	public static class Hacer_mientras_sentenContext extends ParserRuleContext {
		public TerminalNode HACER() { return getToken(DiunisioParser.HACER, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public TerminalNode MIENTRAS() { return getToken(DiunisioParser.MIENTRAS, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public Hacer_mientras_sentenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hacer_mientras_senten; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).enterHacer_mientras_senten(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).exitHacer_mientras_senten(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiunisioVisitor ) return ((DiunisioVisitor<? extends T>)visitor).visitHacer_mientras_senten(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Hacer_mientras_sentenContext hacer_mientras_senten() throws RecognitionException {
		Hacer_mientras_sentenContext _localctx = new Hacer_mientras_sentenContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_hacer_mientras_senten);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			match(HACER);
			setState(469);
			bloque();
			setState(470);
			match(MIENTRAS);
			setState(471);
			expresion();
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

	public static class Seleccionar_sentenContext extends ParserRuleContext {
		public TerminalNode SELECCIONAR() { return getToken(DiunisioParser.SELECCIONAR, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(DiunisioParser.IDENTIFICADOR, 0); }
		public TerminalNode LLAVEIZ() { return getToken(DiunisioParser.LLAVEIZ, 0); }
		public CasosContext casos() {
			return getRuleContext(CasosContext.class,0);
		}
		public TerminalNode LLAVEDE() { return getToken(DiunisioParser.LLAVEDE, 0); }
		public Seleccionar_sentenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seleccionar_senten; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).enterSeleccionar_senten(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).exitSeleccionar_senten(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiunisioVisitor ) return ((DiunisioVisitor<? extends T>)visitor).visitSeleccionar_senten(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Seleccionar_sentenContext seleccionar_senten() throws RecognitionException {
		Seleccionar_sentenContext _localctx = new Seleccionar_sentenContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_seleccionar_senten);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(473);
			match(SELECCIONAR);
			setState(474);
			match(IDENTIFICADOR);
			setState(475);
			match(LLAVEIZ);
			setState(476);
			casos();
			setState(477);
			match(LLAVEDE);
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

	public static class CasosContext extends ParserRuleContext {
		public CasosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_casos; }
	 
		public CasosContext() { }
		public void copyFrom(CasosContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CasosDefContext extends CasosContext {
		public TerminalNode DEFECTO() { return getToken(DiunisioParser.DEFECTO, 0); }
		public TerminalNode DOSPUNTOS() { return getToken(DiunisioParser.DOSPUNTOS, 0); }
		public Sec_proposicionesContext sec_proposiciones() {
			return getRuleContext(Sec_proposicionesContext.class,0);
		}
		public CasosDefContext(CasosContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).enterCasosDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).exitCasosDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiunisioVisitor ) return ((DiunisioVisitor<? extends T>)visitor).visitCasosDef(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CasosGenContext extends CasosContext {
		public TerminalNode CASO() { return getToken(DiunisioParser.CASO, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode DOSPUNTOS() { return getToken(DiunisioParser.DOSPUNTOS, 0); }
		public Sec_proposicionesContext sec_proposiciones() {
			return getRuleContext(Sec_proposicionesContext.class,0);
		}
		public CasosContext casos() {
			return getRuleContext(CasosContext.class,0);
		}
		public TerminalNode ROMPER() { return getToken(DiunisioParser.ROMPER, 0); }
		public TerminalNode PCOMA() { return getToken(DiunisioParser.PCOMA, 0); }
		public CasosGenContext(CasosContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).enterCasosGen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).exitCasosGen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiunisioVisitor ) return ((DiunisioVisitor<? extends T>)visitor).visitCasosGen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CasosContext casos() throws RecognitionException {
		CasosContext _localctx = new CasosContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_casos);
		int _la;
		try {
			setState(492);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASO:
				_localctx = new CasosGenContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(479);
				match(CASO);
				setState(480);
				expresion();
				setState(481);
				match(DOSPUNTOS);
				setState(482);
				sec_proposiciones();
				setState(485);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ROMPER) {
					{
					setState(483);
					match(ROMPER);
					setState(484);
					match(PCOMA);
					}
				}

				setState(487);
				casos();
				}
				break;
			case DEFECTO:
				_localctx = new CasosDefContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(489);
				match(DEFECTO);
				setState(490);
				match(DOSPUNTOS);
				setState(491);
				sec_proposiciones();
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

	public static class Para_sentenContext extends ParserRuleContext {
		public TerminalNode PARA() { return getToken(DiunisioParser.PARA, 0); }
		public List<AsignacionContext> asignacion() {
			return getRuleContexts(AsignacionContext.class);
		}
		public AsignacionContext asignacion(int i) {
			return getRuleContext(AsignacionContext.class,i);
		}
		public List<TerminalNode> PCOMA() { return getTokens(DiunisioParser.PCOMA); }
		public TerminalNode PCOMA(int i) {
			return getToken(DiunisioParser.PCOMA, i);
		}
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public List<TerminalNode> COMA() { return getTokens(DiunisioParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(DiunisioParser.COMA, i);
		}
		public TerminalNode PAREN_AP() { return getToken(DiunisioParser.PAREN_AP, 0); }
		public TerminalNode PAREN_CI() { return getToken(DiunisioParser.PAREN_CI, 0); }
		public Para_sentenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_para_senten; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).enterPara_senten(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).exitPara_senten(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiunisioVisitor ) return ((DiunisioVisitor<? extends T>)visitor).visitPara_senten(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Para_sentenContext para_senten() throws RecognitionException {
		Para_sentenContext _localctx = new Para_sentenContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_para_senten);
		int _la;
		try {
			setState(540);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(494);
				match(PARA);
				setState(495);
				asignacion();
				setState(500);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(496);
					match(COMA);
					setState(497);
					asignacion();
					}
					}
					setState(502);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(503);
				match(PCOMA);
				setState(504);
				expresion();
				setState(505);
				match(PCOMA);
				setState(506);
				asignacion();
				setState(511);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(507);
					match(COMA);
					setState(508);
					asignacion();
					}
					}
					setState(513);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(514);
				bloque();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(516);
				match(PARA);
				setState(517);
				match(PAREN_AP);
				setState(518);
				asignacion();
				setState(523);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(519);
					match(COMA);
					setState(520);
					asignacion();
					}
					}
					setState(525);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(526);
				match(PCOMA);
				setState(527);
				expresion();
				setState(528);
				match(PCOMA);
				setState(529);
				asignacion();
				setState(534);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(530);
					match(COMA);
					setState(531);
					asignacion();
					}
					}
					setState(536);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(537);
				match(PAREN_CI);
				setState(538);
				bloque();
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

	public static class Fun_sentenContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(DiunisioParser.DEF, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(DiunisioParser.IDENTIFICADOR, 0); }
		public TerminalNode PAREN_AP() { return getToken(DiunisioParser.PAREN_AP, 0); }
		public Lista_idsContext lista_ids() {
			return getRuleContext(Lista_idsContext.class,0);
		}
		public TerminalNode PAREN_CI() { return getToken(DiunisioParser.PAREN_CI, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public Fun_sentenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fun_senten; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).enterFun_senten(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).exitFun_senten(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiunisioVisitor ) return ((DiunisioVisitor<? extends T>)visitor).visitFun_senten(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fun_sentenContext fun_senten() throws RecognitionException {
		Fun_sentenContext _localctx = new Fun_sentenContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_fun_senten);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(542);
			match(DEF);
			setState(543);
			tipo();
			setState(544);
			match(IDENTIFICADOR);
			setState(545);
			match(PAREN_AP);
			setState(546);
			lista_ids();
			setState(547);
			match(PAREN_CI);
			setState(548);
			bloque();
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

	public static class Proc_sentenContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(DiunisioParser.DEF, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(DiunisioParser.IDENTIFICADOR, 0); }
		public TerminalNode PAREN_AP() { return getToken(DiunisioParser.PAREN_AP, 0); }
		public Lista_idsContext lista_ids() {
			return getRuleContext(Lista_idsContext.class,0);
		}
		public TerminalNode PAREN_CI() { return getToken(DiunisioParser.PAREN_CI, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public Proc_sentenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proc_senten; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).enterProc_senten(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).exitProc_senten(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiunisioVisitor ) return ((DiunisioVisitor<? extends T>)visitor).visitProc_senten(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Proc_sentenContext proc_senten() throws RecognitionException {
		Proc_sentenContext _localctx = new Proc_sentenContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_proc_senten);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(550);
			match(DEF);
			setState(551);
			match(IDENTIFICADOR);
			setState(552);
			match(PAREN_AP);
			setState(553);
			lista_ids();
			setState(554);
			match(PAREN_CI);
			setState(555);
			bloque();
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

	public static class FuncionContext extends ParserRuleContext {
		public TerminalNode LLAVEIZ() { return getToken(DiunisioParser.LLAVEIZ, 0); }
		public Sec_proposicionesContext sec_proposiciones() {
			return getRuleContext(Sec_proposicionesContext.class,0);
		}
		public TerminalNode PCOMA() { return getToken(DiunisioParser.PCOMA, 0); }
		public TerminalNode LLAVEDE() { return getToken(DiunisioParser.LLAVEDE, 0); }
		public FuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).enterFuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).exitFuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiunisioVisitor ) return ((DiunisioVisitor<? extends T>)visitor).visitFuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncionContext funcion() throws RecognitionException {
		FuncionContext _localctx = new FuncionContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_funcion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(557);
			match(LLAVEIZ);
			setState(558);
			sec_proposiciones();
			setState(559);
			match(PCOMA);
			setState(560);
			match(LLAVEDE);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3J\u0235\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\3\2\5\2[\n\2\3\3\3\3\3\4\3\4\5\4a\n\4\3\4\3\4\3\4\3\4\5\4g\n"+
		"\4\3\4\3\4\5\4k\n\4\3\4\3\4\3\5\3\5\7\5q\n\5\f\5\16\5t\13\5\3\5\3\5\3"+
		"\5\5\5y\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0082\n\6\3\7\3\7\5\7\u0086"+
		"\n\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0096"+
		"\n\b\3\t\3\t\3\t\3\t\3\t\7\t\u009d\n\t\f\t\16\t\u00a0\13\t\3\t\3\t\3\n"+
		"\3\n\5\n\u00a6\n\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17"+
		"\5\17\u00c3\n\17\3\17\5\17\u00c6\n\17\3\17\3\17\3\17\3\17\3\17\3\20\3"+
		"\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00d7\n\22\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\7\23\u00e0\n\23\f\23\16\23\u00e3\13\23\3\23"+
		"\5\23\u00e6\n\23\3\24\3\24\3\24\3\24\3\24\5\24\u00ed\n\24\3\24\3\24\3"+
		"\24\7\24\u00f2\n\24\f\24\16\24\u00f5\13\24\3\24\5\24\u00f8\n\24\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5"+
		"\25\u0109\n\25\3\26\3\26\3\26\5\26\u010e\n\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\7\27\u0117\n\27\f\27\16\27\u011a\13\27\3\27\3\27\3\27\5\27"+
		"\u011f\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0129\n\30\3"+
		"\30\3\30\3\30\3\30\3\30\6\30\u0130\n\30\r\30\16\30\u0131\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u013e\n\30\3\31\3\31\3\31\3\31"+
		"\5\31\u0144\n\31\3\31\3\31\3\31\3\31\5\31\u014a\n\31\7\31\u014c\n\31\f"+
		"\31\16\31\u014f\13\31\3\31\3\31\3\31\5\31\u0154\n\31\3\32\3\32\3\32\3"+
		"\32\7\32\u015a\n\32\f\32\16\32\u015d\13\32\5\32\u015f\n\32\3\32\3\32\3"+
		"\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u016b\n\34\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\5\35\u0173\n\35\3\36\7\36\u0176\n\36\f\36\16\36\u0179"+
		"\13\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u0191\n\37\3 \7 \u0194"+
		"\n \f \16 \u0197\13 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3"+
		"!\3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u01b3\n!\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u01bb"+
		"\n\"\3#\3#\3#\3#\3#\7#\u01c2\n#\f#\16#\u01c5\13#\3#\3#\5#\u01c9\n#\3#"+
		"\5#\u01cc\n#\3$\3$\5$\u01d0\n$\3$\3$\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\5(\u01e8\n(\3(\3(\3(\3(\3(\5(\u01ef\n"+
		"(\3)\3)\3)\3)\7)\u01f5\n)\f)\16)\u01f8\13)\3)\3)\3)\3)\3)\3)\7)\u0200"+
		"\n)\f)\16)\u0203\13)\3)\3)\3)\3)\3)\3)\3)\7)\u020c\n)\f)\16)\u020f\13"+
		")\3)\3)\3)\3)\3)\3)\7)\u0217\n)\f)\16)\u021a\13)\3)\3)\3)\5)\u021f\n)"+
		"\3*\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\2\2-\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJL"+
		"NPRTV\2\n\3\2\6\7\3\2\6\b\3\2\3\5\3\2\36\37\4\2\26\26\36\37\3\2\30\35"+
		"\4\2\26\27 #\5\2\21\21\',CC\2\u0267\2Z\3\2\2\2\4\\\3\2\2\2\6^\3\2\2\2"+
		"\bx\3\2\2\2\n\u0081\3\2\2\2\f\u0083\3\2\2\2\16\u0095\3\2\2\2\20\u0097"+
		"\3\2\2\2\22\u00a5\3\2\2\2\24\u00a7\3\2\2\2\26\u00ab\3\2\2\2\30\u00b2\3"+
		"\2\2\2\32\u00b9\3\2\2\2\34\u00c2\3\2\2\2\36\u00cc\3\2\2\2 \u00ce\3\2\2"+
		"\2\"\u00d0\3\2\2\2$\u00e5\3\2\2\2&\u00f7\3\2\2\2(\u0108\3\2\2\2*\u010d"+
		"\3\2\2\2,\u011e\3\2\2\2.\u013d\3\2\2\2\60\u0153\3\2\2\2\62\u0155\3\2\2"+
		"\2\64\u0162\3\2\2\2\66\u016a\3\2\2\28\u0172\3\2\2\2:\u0177\3\2\2\2<\u0190"+
		"\3\2\2\2>\u0195\3\2\2\2@\u01b2\3\2\2\2B\u01ba\3\2\2\2D\u01bc\3\2\2\2F"+
		"\u01cd\3\2\2\2H\u01d3\3\2\2\2J\u01d6\3\2\2\2L\u01db\3\2\2\2N\u01ee\3\2"+
		"\2\2P\u021e\3\2\2\2R\u0220\3\2\2\2T\u0228\3\2\2\2V\u022f\3\2\2\2X[\5\""+
		"\22\2Y[\5\4\3\2ZX\3\2\2\2ZY\3\2\2\2[\3\3\2\2\2\\]\5\6\4\2]\5\3\2\2\2^"+
		"`\5 \21\2_a\t\2\2\2`_\3\2\2\2`a\3\2\2\2ab\3\2\2\2bc\7\20\2\2cf\7C\2\2"+
		"de\7\r\2\2eg\7C\2\2fd\3\2\2\2fg\3\2\2\2gj\3\2\2\2hi\7\f\2\2ik\7C\2\2j"+
		"h\3\2\2\2jk\3\2\2\2kl\3\2\2\2lm\5\b\5\2m\7\3\2\2\2nr\7\61\2\2oq\5\n\6"+
		"\2po\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2su\3\2\2\2tr\3\2\2\2uy\7\62"+
		"\2\2vw\7\61\2\2wy\7\62\2\2xn\3\2\2\2xv\3\2\2\2y\t\3\2\2\2z\u0082\5@!\2"+
		"{\u0082\5\f\7\2|\u0082\5\32\16\2}\u0082\5\34\17\2~\u0082\5\30\r\2\177"+
		"\u0082\5\20\t\2\u0080\u0082\5\16\b\2\u0081z\3\2\2\2\u0081{\3\2\2\2\u0081"+
		"|\3\2\2\2\u0081}\3\2\2\2\u0081~\3\2\2\2\u0081\177\3\2\2\2\u0081\u0080"+
		"\3\2\2\2\u0082\13\3\2\2\2\u0083\u0085\5\64\33\2\u0084\u0086\7D\2\2\u0085"+
		"\u0084\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088\7-"+
		"\2\2\u0088\r\3\2\2\2\u0089\u008a\7D\2\2\u008a\u008b\7\n\2\2\u008b\u008c"+
		"\7D\2\2\u008c\u008d\5\60\31\2\u008d\u008e\7-\2\2\u008e\u0096\3\2\2\2\u008f"+
		"\u0090\7\16\2\2\u0090\u0091\7\n\2\2\u0091\u0092\7D\2\2\u0092\u0093\5\60"+
		"\31\2\u0093\u0094\7-\2\2\u0094\u0096\3\2\2\2\u0095\u0089\3\2\2\2\u0095"+
		"\u008f\3\2\2\2\u0096\17\3\2\2\2\u0097\u0098\5 \21\2\u0098\u0099\7C\2\2"+
		"\u0099\u009a\5\60\31\2\u009a\u009e\7\61\2\2\u009b\u009d\5\22\n\2\u009c"+
		"\u009b\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2"+
		"\2\2\u009f\u00a1\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a2\7\62\2\2\u00a2"+
		"\21\3\2\2\2\u00a3\u00a6\5\26\f\2\u00a4\u00a6\5\24\13\2\u00a5\u00a3\3\2"+
		"\2\2\u00a5\u00a4\3\2\2\2\u00a6\23\3\2\2\2\u00a7\u00a8\7\16\2\2\u00a8\u00a9"+
		"\5\60\31\2\u00a9\u00aa\7-\2\2\u00aa\25\3\2\2\2\u00ab\u00ac\7\13\2\2\u00ac"+
		"\u00ad\7\n\2\2\u00ad\u00ae\7D\2\2\u00ae\u00af\7.\2\2\u00af\u00b0\5(\25"+
		"\2\u00b0\u00b1\7-\2\2\u00b1\27\3\2\2\2\u00b2\u00b3\7D\2\2\u00b3\u00b4"+
		"\7\n\2\2\u00b4\u00b5\5*\26\2\u00b5\u00b6\7.\2\2\u00b6\u00b7\5(\25\2\u00b7"+
		"\u00b8\7-\2\2\u00b8\31\3\2\2\2\u00b9\u00ba\7C\2\2\u00ba\u00bb\7D\2\2\u00bb"+
		"\u00bc\7.\2\2\u00bc\u00bd\7\t\2\2\u00bd\u00be\7C\2\2\u00be\u00bf\5\60"+
		"\31\2\u00bf\u00c0\7-\2\2\u00c0\33\3\2\2\2\u00c1\u00c3\5 \21\2\u00c2\u00c1"+
		"\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c5\3\2\2\2\u00c4\u00c6\5\36\20\2"+
		"\u00c5\u00c4\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8"+
		"\5\64\33\2\u00c8\u00c9\7D\2\2\u00c9\u00ca\5\60\31\2\u00ca\u00cb\58\35"+
		"\2\u00cb\35\3\2\2\2\u00cc\u00cd\t\3\2\2\u00cd\37\3\2\2\2\u00ce\u00cf\t"+
		"\4\2\2\u00cf!\3\2\2\2\u00d0\u00d1\7\23\2\2\u00d1\u00d6\7D\2\2\u00d2\u00d3"+
		"\7/\2\2\u00d3\u00d4\5$\23\2\u00d4\u00d5\7\60\2\2\u00d5\u00d7\3\2\2\2\u00d6"+
		"\u00d2\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9\7\66"+
		"\2\2\u00d9\u00da\5\66\34\2\u00da\u00db\7\24\2\2\u00db#\3\2\2\2\u00dc\u00e1"+
		"\7D\2\2\u00dd\u00de\7\65\2\2\u00de\u00e0\7D\2\2\u00df\u00dd\3\2\2\2\u00e0"+
		"\u00e3\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e6\3\2"+
		"\2\2\u00e3\u00e1\3\2\2\2\u00e4\u00e6\3\2\2\2\u00e5\u00dc\3\2\2\2\u00e5"+
		"\u00e4\3\2\2\2\u00e6%\3\2\2\2\u00e7\u00e8\7/\2\2\u00e8\u00e9\5&\24\2\u00e9"+
		"\u00ea\7\60\2\2\u00ea\u00f8\3\2\2\2\u00eb\u00ed\t\5\2\2\u00ec\u00eb\3"+
		"\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00f3\5,\27\2\u00ef"+
		"\u00f0\t\6\2\2\u00f0\u00f2\5,\27\2\u00f1\u00ef\3\2\2\2\u00f2\u00f5\3\2"+
		"\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f8\3\2\2\2\u00f5"+
		"\u00f3\3\2\2\2\u00f6\u00f8\5,\27\2\u00f7\u00e7\3\2\2\2\u00f7\u00ec\3\2"+
		"\2\2\u00f7\u00f6\3\2\2\2\u00f8\'\3\2\2\2\u00f9\u00fa\7/\2\2\u00fa\u00fb"+
		"\5(\25\2\u00fb\u00fc\7\60\2\2\u00fc\u0109\3\2\2\2\u00fd\u00fe\5&\24\2"+
		"\u00fe\u00ff\t\7\2\2\u00ff\u0100\5&\24\2\u0100\u0109\3\2\2\2\u0101\u0102"+
		"\7/\2\2\u0102\u0103\5&\24\2\u0103\u0104\7\60\2\2\u0104\u0109\3\2\2\2\u0105"+
		"\u0109\5&\24\2\u0106\u0107\7$\2\2\u0107\u0109\5(\25\2\u0108\u00f9\3\2"+
		"\2\2\u0108\u00fd\3\2\2\2\u0108\u0101\3\2\2\2\u0108\u0105\3\2\2\2\u0108"+
		"\u0106\3\2\2\2\u0109)\3\2\2\2\u010a\u010b\7D\2\2\u010b\u010e\5\62\32\2"+
		"\u010c\u010e\7D\2\2\u010d\u010a\3\2\2\2\u010d\u010c\3\2\2\2\u010e+\3\2"+
		"\2\2\u010f\u0110\7/\2\2\u0110\u0111\5,\27\2\u0111\u0112\7\60\2\2\u0112"+
		"\u011f\3\2\2\2\u0113\u0118\5.\30\2\u0114\u0115\t\b\2\2\u0115\u0117\5."+
		"\30\2\u0116\u0114\3\2\2\2\u0117\u011a\3\2\2\2\u0118\u0116\3\2\2\2\u0118"+
		"\u0119\3\2\2\2\u0119\u011f\3\2\2\2\u011a\u0118\3\2\2\2\u011b\u011c\7$"+
		"\2\2\u011c\u011f\5,\27\2\u011d\u011f\5.\30\2\u011e\u010f\3\2\2\2\u011e"+
		"\u0113\3\2\2\2\u011e\u011b\3\2\2\2\u011e\u011d\3\2\2\2\u011f-\3\2\2\2"+
		"\u0120\u013e\7E\2\2\u0121\u013e\7F\2\2\u0122\u013e\7H\2\2\u0123\u013e"+
		"\7G\2\2\u0124\u013e\79\2\2\u0125\u013e\5*\26\2\u0126\u0128\7D\2\2\u0127"+
		"\u0129\5\60\31\2\u0128\u0127\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u013e\3"+
		"\2\2\2\u012a\u012f\7D\2\2\u012b\u012c\7\63\2\2\u012c\u012d\5.\30\2\u012d"+
		"\u012e\7\64\2\2\u012e\u0130\3\2\2\2\u012f\u012b\3\2\2\2\u0130\u0131\3"+
		"\2\2\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u013e\3\2\2\2\u0133"+
		"\u013e\7D\2\2\u0134\u0135\7$\2\2\u0135\u013e\5.\30\2\u0136\u013e\7\67"+
		"\2\2\u0137\u013e\78\2\2\u0138\u013e\5\62\32\2\u0139\u013a\7/\2\2\u013a"+
		"\u013b\5(\25\2\u013b\u013c\7\60\2\2\u013c\u013e\3\2\2\2\u013d\u0120\3"+
		"\2\2\2\u013d\u0121\3\2\2\2\u013d\u0122\3\2\2\2\u013d\u0123\3\2\2\2\u013d"+
		"\u0124\3\2\2\2\u013d\u0125\3\2\2\2\u013d\u0126\3\2\2\2\u013d\u012a\3\2"+
		"\2\2\u013d\u0133\3\2\2\2\u013d\u0134\3\2\2\2\u013d\u0136\3\2\2\2\u013d"+
		"\u0137\3\2\2\2\u013d\u0138\3\2\2\2\u013d\u0139\3\2\2\2\u013e/\3\2\2\2"+
		"\u013f\u0143\7/\2\2\u0140\u0144\5(\25\2\u0141\u0144\5*\26\2\u0142\u0144"+
		"\7D\2\2\u0143\u0140\3\2\2\2\u0143\u0141\3\2\2\2\u0143\u0142\3\2\2\2\u0144"+
		"\u014d\3\2\2\2\u0145\u0149\7\65\2\2\u0146\u014a\5(\25\2\u0147\u014a\5"+
		"*\26\2\u0148\u014a\7D\2\2\u0149\u0146\3\2\2\2\u0149\u0147\3\2\2\2\u0149"+
		"\u0148\3\2\2\2\u014a\u014c\3\2\2\2\u014b\u0145\3\2\2\2\u014c\u014f\3\2"+
		"\2\2\u014d\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u0150\3\2\2\2\u014f"+
		"\u014d\3\2\2\2\u0150\u0154\7\60\2\2\u0151\u0152\7/\2\2\u0152\u0154\7\60"+
		"\2\2\u0153\u013f\3\2\2\2\u0153\u0151\3\2\2\2\u0154\61\3\2\2\2\u0155\u015e"+
		"\7\61\2\2\u0156\u015b\5(\25\2\u0157\u0158\7\65\2\2\u0158\u015a\5(\25\2"+
		"\u0159\u0157\3\2\2\2\u015a\u015d\3\2\2\2\u015b\u0159\3\2\2\2\u015b\u015c"+
		"\3\2\2\2\u015c\u015f\3\2\2\2\u015d\u015b\3\2\2\2\u015e\u0156\3\2\2\2\u015e"+
		"\u015f\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u0161\7\62\2\2\u0161\63\3\2\2"+
		"\2\u0162\u0163\t\t\2\2\u0163\65\3\2\2\2\u0164\u0165\7\61\2\2\u0165\u016b"+
		"\7\62\2\2\u0166\u0167\7\61\2\2\u0167\u0168\5> \2\u0168\u0169\7\62\2\2"+
		"\u0169\u016b\3\2\2\2\u016a\u0164\3\2\2\2\u016a\u0166\3\2\2\2\u016b\67"+
		"\3\2\2\2\u016c\u016d\7\61\2\2\u016d\u0173\7\62\2\2\u016e\u016f\7\61\2"+
		"\2\u016f\u0170\5:\36\2\u0170\u0171\7\62\2\2\u0171\u0173\3\2\2\2\u0172"+
		"\u016c\3\2\2\2\u0172\u016e\3\2\2\2\u01739\3\2\2\2\u0174\u0176\5<\37\2"+
		"\u0175\u0174\3\2\2\2\u0176\u0179\3\2\2\2\u0177\u0175\3\2\2\2\u0177\u0178"+
		"\3\2\2\2\u0178\u017a\3\2\2\2\u0179\u0177\3\2\2\2\u017a\u017b\5<\37\2\u017b"+
		";\3\2\2\2\u017c\u017d\7&\2\2\u017d\u017e\5(\25\2\u017e\u017f\7-\2\2\u017f"+
		"\u0191\3\2\2\2\u0180\u0191\5\32\16\2\u0181\u0191\5D#\2\u0182\u0191\5\30"+
		"\r\2\u0183\u0191\5\16\b\2\u0184\u0191\5H%\2\u0185\u0191\5P)\2\u0186\u0191"+
		"\5J&\2\u0187\u0188\5B\"\2\u0188\u0189\7-\2\2\u0189\u0191\3\2\2\2\u018a"+
		"\u018b\7\61\2\2\u018b\u018c\5<\37\2\u018c\u018d\7\62\2\2\u018d\u0191\3"+
		"\2\2\2\u018e\u018f\7J\2\2\u018f\u0191\b\37\1\2\u0190\u017c\3\2\2\2\u0190"+
		"\u0180\3\2\2\2\u0190\u0181\3\2\2\2\u0190\u0182\3\2\2\2\u0190\u0183\3\2"+
		"\2\2\u0190\u0184\3\2\2\2\u0190\u0185\3\2\2\2\u0190\u0186\3\2\2\2\u0190"+
		"\u0187\3\2\2\2\u0190\u018a\3\2\2\2\u0190\u018e\3\2\2\2\u0191=\3\2\2\2"+
		"\u0192\u0194\5@!\2\u0193\u0192\3\2\2\2\u0194\u0197\3\2\2\2\u0195\u0193"+
		"\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u0198\3\2\2\2\u0197\u0195\3\2\2\2\u0198"+
		"\u0199\5@!\2\u0199?\3\2\2\2\u019a\u019b\7&\2\2\u019b\u019c\5(\25\2\u019c"+
		"\u019d\7-\2\2\u019d\u01b3\3\2\2\2\u019e\u01b3\5R*\2\u019f\u01b3\5T+\2"+
		"\u01a0\u01b3\5D#\2\u01a1\u01b3\5L\'\2\u01a2\u01b3\5H%\2\u01a3\u01b3\5"+
		"P)\2\u01a4\u01b3\5J&\2\u01a5\u01a6\5B\"\2\u01a6\u01a7\7-\2\2\u01a7\u01b3"+
		"\3\2\2\2\u01a8\u01a9\7D\2\2\u01a9\u01aa\5\60\31\2\u01aa\u01ab\7-\2\2\u01ab"+
		"\u01b3\3\2\2\2\u01ac\u01ad\7\61\2\2\u01ad\u01ae\5> \2\u01ae\u01af\7\62"+
		"\2\2\u01af\u01b3\3\2\2\2\u01b0\u01b1\7J\2\2\u01b1\u01b3\b!\1\2\u01b2\u019a"+
		"\3\2\2\2\u01b2\u019e\3\2\2\2\u01b2\u019f\3\2\2\2\u01b2\u01a0\3\2\2\2\u01b2"+
		"\u01a1\3\2\2\2\u01b2\u01a2\3\2\2\2\u01b2\u01a3\3\2\2\2\u01b2\u01a4\3\2"+
		"\2\2\u01b2\u01a5\3\2\2\2\u01b2\u01a8\3\2\2\2\u01b2\u01ac\3\2\2\2\u01b2"+
		"\u01b0\3\2\2\2\u01b3A\3\2\2\2\u01b4\u01b5\7D\2\2\u01b5\u01b6\7.\2\2\u01b6"+
		"\u01bb\5(\25\2\u01b7\u01b8\7D\2\2\u01b8\u01b9\7.\2\2\u01b9\u01bb\5\62"+
		"\32\2\u01ba\u01b4\3\2\2\2\u01ba\u01b7\3\2\2\2\u01bbC\3\2\2\2\u01bc\u01bd"+
		"\7:\2\2\u01bd\u01c3\5F$\2\u01be\u01bf\7;\2\2\u01bf\u01c0\7:\2\2\u01c0"+
		"\u01c2\5F$\2\u01c1\u01be\3\2\2\2\u01c2\u01c5\3\2\2\2\u01c3\u01c1\3\2\2"+
		"\2\u01c3\u01c4\3\2\2\2\u01c4\u01cb\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c6\u01c8"+
		"\7;\2\2\u01c7\u01c9\7\25\2\2\u01c8\u01c7\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9"+
		"\u01ca\3\2\2\2\u01ca\u01cc\5\66\34\2\u01cb\u01c6\3\2\2\2\u01cb\u01cc\3"+
		"\2\2\2\u01ccE\3\2\2\2\u01cd\u01cf\5(\25\2\u01ce\u01d0\7\25\2\2\u01cf\u01ce"+
		"\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1\u01d2\5\66\34\2"+
		"\u01d2G\3\2\2\2\u01d3\u01d4\7<\2\2\u01d4\u01d5\5F$\2\u01d5I\3\2\2\2\u01d6"+
		"\u01d7\7@\2\2\u01d7\u01d8\5\66\34\2\u01d8\u01d9\7<\2\2\u01d9\u01da\5("+
		"\25\2\u01daK\3\2\2\2\u01db\u01dc\7=\2\2\u01dc\u01dd\7D\2\2\u01dd\u01de"+
		"\7\61\2\2\u01de\u01df\5N(\2\u01df\u01e0\7\62\2\2\u01e0M\3\2\2\2\u01e1"+
		"\u01e2\7>\2\2\u01e2\u01e3\5(\25\2\u01e3\u01e4\7\66\2\2\u01e4\u01e7\5>"+
		" \2\u01e5\u01e6\7?\2\2\u01e6\u01e8\7-\2\2\u01e7\u01e5\3\2\2\2\u01e7\u01e8"+
		"\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01ea\5N(\2\u01ea\u01ef\3\2\2\2\u01eb"+
		"\u01ec\7B\2\2\u01ec\u01ed\7\66\2\2\u01ed\u01ef\5> \2\u01ee\u01e1\3\2\2"+
		"\2\u01ee\u01eb\3\2\2\2\u01efO\3\2\2\2\u01f0\u01f1\7A\2\2\u01f1\u01f6\5"+
		"B\"\2\u01f2\u01f3\7\65\2\2\u01f3\u01f5\5B\"\2\u01f4\u01f2\3\2\2\2\u01f5"+
		"\u01f8\3\2\2\2\u01f6\u01f4\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7\u01f9\3\2"+
		"\2\2\u01f8\u01f6\3\2\2\2\u01f9\u01fa\7-\2\2\u01fa\u01fb\5(\25\2\u01fb"+
		"\u01fc\7-\2\2\u01fc\u0201\5B\"\2\u01fd\u01fe\7\65\2\2\u01fe\u0200\5B\""+
		"\2\u01ff\u01fd\3\2\2\2\u0200\u0203\3\2\2\2\u0201\u01ff\3\2\2\2\u0201\u0202"+
		"\3\2\2\2\u0202\u0204\3\2\2\2\u0203\u0201\3\2\2\2\u0204\u0205\5\66\34\2"+
		"\u0205\u021f\3\2\2\2\u0206\u0207\7A\2\2\u0207\u0208\7/\2\2\u0208\u020d"+
		"\5B\"\2\u0209\u020a\7\65\2\2\u020a\u020c\5B\"\2\u020b\u0209\3\2\2\2\u020c"+
		"\u020f\3\2\2\2\u020d\u020b\3\2\2\2\u020d\u020e\3\2\2\2\u020e\u0210\3\2"+
		"\2\2\u020f\u020d\3\2\2\2\u0210\u0211\7-\2\2\u0211\u0212\5(\25\2\u0212"+
		"\u0213\7-\2\2\u0213\u0218\5B\"\2\u0214\u0215\7\65\2\2\u0215\u0217\5B\""+
		"\2\u0216\u0214\3\2\2\2\u0217\u021a\3\2\2\2\u0218\u0216\3\2\2\2\u0218\u0219"+
		"\3\2\2\2\u0219\u021b\3\2\2\2\u021a\u0218\3\2\2\2\u021b\u021c\7\60\2\2"+
		"\u021c\u021d\5\66\34\2\u021d\u021f\3\2\2\2\u021e\u01f0\3\2\2\2\u021e\u0206"+
		"\3\2\2\2\u021fQ\3\2\2\2\u0220\u0221\7%\2\2\u0221\u0222\5\64\33\2\u0222"+
		"\u0223\7D\2\2\u0223\u0224\7/\2\2\u0224\u0225\5$\23\2\u0225\u0226\7\60"+
		"\2\2\u0226\u0227\5\66\34\2\u0227S\3\2\2\2\u0228\u0229\7%\2\2\u0229\u022a"+
		"\7D\2\2\u022a\u022b\7/\2\2\u022b\u022c\5$\23\2\u022c\u022d\7\60\2\2\u022d"+
		"\u022e\5\66\34\2\u022eU\3\2\2\2\u022f\u0230\7\61\2\2\u0230\u0231\5> \2"+
		"\u0231\u0232\7-\2\2\u0232\u0233\7\62\2\2\u0233W\3\2\2\2\64Z`fjrx\u0081"+
		"\u0085\u0095\u009e\u00a5\u00c2\u00c5\u00d6\u00e1\u00e5\u00ec\u00f3\u00f7"+
		"\u0108\u010d\u0118\u011e\u0128\u0131\u013d\u0143\u0149\u014d\u0153\u015b"+
		"\u015e\u016a\u0172\u0177\u0190\u0195\u01b2\u01ba\u01c3\u01c8\u01cb\u01cf"+
		"\u01e7\u01ee\u01f6\u0201\u020d\u0218\u021e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}