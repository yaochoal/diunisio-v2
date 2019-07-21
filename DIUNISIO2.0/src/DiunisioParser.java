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
	public static final int
		RULE_clase_sentencia = 0, RULE_acceso = 1, RULE_bloque_clase = 2, RULE_clase_body = 3, 
		RULE_metodo = 4, RULE_lista_ids = 5, RULE_exp_simple = 6, RULE_expresion = 7, 
		RULE_variable = 8, RULE_termino = 9, RULE_factor = 10, RULE_lista_parsv = 11, 
		RULE_conjunto = 12, RULE_tipo = 13, RULE_bloque = 14, RULE_sec_proposiciones = 15, 
		RULE_proposicion = 16, RULE_asignacion = 17, RULE_si_senten = 18, RULE_bloque_condicional = 19, 
		RULE_mientras_senten = 20, RULE_hacer_mientras_senten = 21, RULE_seleccionar_senten = 22, 
		RULE_casos = 23, RULE_para_senten = 24, RULE_fun_senten = 25, RULE_proc_senten = 26, 
		RULE_funcion = 27;
	private static String[] makeRuleNames() {
		return new String[] {
			"clase_sentencia", "acceso", "bloque_clase", "clase_body", "metodo", 
			"lista_ids", "exp_simple", "expresion", "variable", "termino", "factor", 
			"lista_parsv", "conjunto", "tipo", "bloque", "sec_proposiciones", "proposicion", 
			"asignacion", "si_senten", "bloque_condicional", "mientras_senten", "hacer_mientras_senten", 
			"seleccionar_senten", "casos", "para_senten", "fun_senten", "proc_senten", 
			"funcion"
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

	public static class Clase_sentenciaContext extends ParserRuleContext {
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
		public Clase_sentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clase_sentencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).enterClase_sentencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).exitClase_sentencia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiunisioVisitor ) return ((DiunisioVisitor<? extends T>)visitor).visitClase_sentencia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Clase_sentenciaContext clase_sentencia() throws RecognitionException {
		Clase_sentenciaContext _localctx = new Clase_sentenciaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_clase_sentencia);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			acceso();
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ESTATICO || _la==FINAL) {
				{
				setState(57);
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

			setState(60);
			match(CLASE);
			setState(61);
			match(CLASEID);
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTIENDE) {
				{
				setState(62);
				match(EXTIENDE);
				setState(63);
				match(CLASEID);
				}
			}

			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTA) {
				{
				setState(66);
				match(IMPLEMENTA);
				setState(67);
				match(CLASEID);
				}
			}

			setState(70);
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
		enterRule(_localctx, 2, RULE_acceso);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
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

	public static class Bloque_claseContext extends ParserRuleContext {
		public TerminalNode LLAVEIZ() { return getToken(DiunisioParser.LLAVEIZ, 0); }
		public Clase_bodyContext clase_body() {
			return getRuleContext(Clase_bodyContext.class,0);
		}
		public TerminalNode LLAVEDE() { return getToken(DiunisioParser.LLAVEDE, 0); }
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
		enterRule(_localctx, 4, RULE_bloque_clase);
		try {
			setState(80);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				match(LLAVEIZ);
				setState(75);
				clase_body();
				setState(76);
				match(LLAVEDE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				match(LLAVEIZ);
				setState(79);
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
		public MetodoContext metodo() {
			return getRuleContext(MetodoContext.class,0);
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
		enterRule(_localctx, 6, RULE_clase_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			metodo();
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
		public TerminalNode IDENTIFICADOR() { return getToken(DiunisioParser.IDENTIFICADOR, 0); }
		public TerminalNode DOSPUNTOS() { return getToken(DiunisioParser.DOSPUNTOS, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public TerminalNode PAREN_AP() { return getToken(DiunisioParser.PAREN_AP, 0); }
		public Lista_idsContext lista_ids() {
			return getRuleContext(Lista_idsContext.class,0);
		}
		public TerminalNode PAREN_CI() { return getToken(DiunisioParser.PAREN_CI, 0); }
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
		enterRule(_localctx, 8, RULE_metodo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(IDENTIFICADOR);
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PAREN_AP) {
				{
				setState(85);
				match(PAREN_AP);
				setState(86);
				lista_ids();
				setState(87);
				match(PAREN_CI);
				}
			}

			setState(91);
			match(DOSPUNTOS);
			setState(92);
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
		enterRule(_localctx, 10, RULE_lista_ids);
		int _la;
		try {
			setState(103);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				match(IDENTIFICADOR);
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(95);
					match(COMA);
					setState(96);
					match(IDENTIFICADOR);
					}
					}
					setState(101);
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
		enterRule(_localctx, 12, RULE_exp_simple);
		int _la;
		try {
			setState(121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				match(PAREN_AP);
				setState(106);
				exp_simple();
				setState(107);
				match(PAREN_CI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUMA || _la==MENOS) {
					{
					setState(109);
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

				setState(112);
				termino();
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << O) | (1L << SUMA) | (1L << MENOS))) != 0)) {
					{
					{
					setState(113);
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
					setState(114);
					termino();
					}
					}
					setState(119);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(120);
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
		enterRule(_localctx, 14, RULE_expresion);
		int _la;
		try {
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				match(PAREN_AP);
				setState(124);
				expresion();
				setState(125);
				match(PAREN_CI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
				exp_simple();
				setState(128);
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
				setState(129);
				exp_simple();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(131);
				match(PAREN_AP);
				setState(132);
				exp_simple();
				setState(133);
				match(PAREN_CI);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(135);
				exp_simple();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(136);
				match(NO);
				setState(137);
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
		enterRule(_localctx, 16, RULE_variable);
		try {
			setState(143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				match(IDENTIFICADOR);
				setState(141);
				conjunto();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
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
		enterRule(_localctx, 18, RULE_termino);
		int _la;
		try {
			int _alt;
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				match(PAREN_AP);
				setState(146);
				termino();
				setState(147);
				match(PAREN_CI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				factor();
				setState(154);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(150);
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
						setState(151);
						factor();
						}
						} 
					}
					setState(156);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(157);
				match(NO);
				setState(158);
				termino();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(159);
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
		enterRule(_localctx, 20, RULE_factor);
		int _la;
		try {
			setState(191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				match(ENTERO);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				match(REAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(164);
				match(CADENA);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(165);
				match(COMPLEJO);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(166);
				match(NULO);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(167);
				variable();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(168);
				match(IDENTIFICADOR);
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PAREN_AP) {
					{
					setState(169);
					lista_parsv();
					}
				}

				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(172);
				match(IDENTIFICADOR);
				setState(177); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(173);
					match(ANGIZ);
					setState(174);
					factor();
					setState(175);
					match(ANGDE);
					}
					}
					setState(179); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ANGIZ );
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(181);
				match(IDENTIFICADOR);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(182);
				match(NO);
				setState(183);
				factor();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(184);
				match(VERDADERO);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(185);
				match(FALSO);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(186);
				conjunto();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(187);
				match(PAREN_AP);
				setState(188);
				expresion();
				setState(189);
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
		enterRule(_localctx, 22, RULE_lista_parsv);
		int _la;
		try {
			setState(213);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(193);
				match(PAREN_AP);
				setState(197);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(194);
					expresion();
					}
					break;
				case 2:
					{
					setState(195);
					variable();
					}
					break;
				case 3:
					{
					setState(196);
					match(IDENTIFICADOR);
					}
					break;
				}
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(199);
					match(COMA);
					setState(203);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						setState(200);
						expresion();
						}
						break;
					case 2:
						{
						setState(201);
						variable();
						}
						break;
					case 3:
						{
						setState(202);
						match(IDENTIFICADOR);
						}
						break;
					}
					}
					}
					setState(209);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(210);
				match(PAREN_CI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				match(PAREN_AP);
				setState(212);
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
		enterRule(_localctx, 24, RULE_conjunto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(LLAVEIZ);
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 11)) & ~0x3f) == 0 && ((1L << (_la - 11)) & ((1L << (SUMA - 11)) | (1L << (MENOS - 11)) | (1L << (NO - 11)) | (1L << (PAREN_AP - 11)) | (1L << (LLAVEIZ - 11)) | (1L << (VERDADERO - 11)) | (1L << (FALSO - 11)) | (1L << (NULO - 11)) | (1L << (IDENTIFICADOR - 11)) | (1L << (ENTERO - 11)) | (1L << (REAL - 11)) | (1L << (COMPLEJO - 11)) | (1L << (CADENA - 11)))) != 0)) {
				{
				setState(216);
				expresion();
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(217);
					match(COMA);
					setState(218);
					expresion();
					}
					}
					setState(223);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(226);
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
		enterRule(_localctx, 26, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << BOOL) | (1L << MATRIZ) | (1L << VECTOR))) != 0)) ) {
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
		enterRule(_localctx, 28, RULE_bloque);
		try {
			setState(236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(230);
				match(LLAVEIZ);
				setState(231);
				match(LLAVEDE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(232);
				match(LLAVEIZ);
				setState(233);
				sec_proposiciones();
				setState(234);
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
		enterRule(_localctx, 30, RULE_sec_proposiciones);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(238);
					proposicion();
					}
					} 
				}
				setState(243);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			setState(244);
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
		enterRule(_localctx, 32, RULE_proposicion);
		try {
			setState(270);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				match(RETORNAR);
				setState(247);
				expresion();
				setState(248);
				match(PCOMA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(250);
				fun_senten();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(251);
				proc_senten();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(252);
				si_senten();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(253);
				seleccionar_senten();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(254);
				mientras_senten();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(255);
				para_senten();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(256);
				hacer_mientras_senten();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(257);
				asignacion();
				setState(258);
				match(PCOMA);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(260);
				match(IDENTIFICADOR);
				setState(261);
				lista_parsv();
				setState(262);
				match(PCOMA);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(264);
				match(LLAVEIZ);
				setState(265);
				sec_proposiciones();
				setState(266);
				match(LLAVEDE);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(268);
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
		enterRule(_localctx, 34, RULE_asignacion);
		try {
			setState(278);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				_localctx = new AsigNumContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(272);
				match(IDENTIFICADOR);
				setState(273);
				match(ASIGNAR);
				setState(274);
				expresion();
				}
				break;
			case 2:
				_localctx = new AsigVecContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(275);
				match(IDENTIFICADOR);
				setState(276);
				match(ASIGNAR);
				setState(277);
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
		enterRule(_localctx, 36, RULE_si_senten);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			match(SI);
			setState(281);
			bloque_condicional();
			setState(287);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(282);
					match(SI_NO);
					setState(283);
					match(SI);
					setState(284);
					bloque_condicional();
					}
					} 
				}
				setState(289);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SI_NO) {
				{
				setState(290);
				match(SI_NO);
				setState(292);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ENTONCES) {
					{
					setState(291);
					match(ENTONCES);
					}
				}

				setState(294);
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
		enterRule(_localctx, 38, RULE_bloque_condicional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			expresion();
			setState(299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ENTONCES) {
				{
				setState(298);
				match(ENTONCES);
				}
			}

			setState(301);
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
		enterRule(_localctx, 40, RULE_mientras_senten);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(MIENTRAS);
			setState(304);
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
		enterRule(_localctx, 42, RULE_hacer_mientras_senten);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			match(HACER);
			setState(307);
			bloque();
			setState(308);
			match(MIENTRAS);
			setState(309);
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
		enterRule(_localctx, 44, RULE_seleccionar_senten);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			match(SELECCIONAR);
			setState(312);
			match(IDENTIFICADOR);
			setState(313);
			match(LLAVEIZ);
			setState(314);
			casos();
			setState(315);
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
		enterRule(_localctx, 46, RULE_casos);
		int _la;
		try {
			setState(330);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASO:
				_localctx = new CasosGenContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(317);
				match(CASO);
				setState(318);
				expresion();
				setState(319);
				match(DOSPUNTOS);
				setState(320);
				sec_proposiciones();
				setState(323);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ROMPER) {
					{
					setState(321);
					match(ROMPER);
					setState(322);
					match(PCOMA);
					}
				}

				setState(325);
				casos();
				}
				break;
			case DEFECTO:
				_localctx = new CasosDefContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(327);
				match(DEFECTO);
				setState(328);
				match(DOSPUNTOS);
				setState(329);
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
		enterRule(_localctx, 48, RULE_para_senten);
		int _la;
		try {
			setState(378);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(332);
				match(PARA);
				setState(333);
				asignacion();
				setState(338);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(334);
					match(COMA);
					setState(335);
					asignacion();
					}
					}
					setState(340);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(341);
				match(PCOMA);
				setState(342);
				expresion();
				setState(343);
				match(PCOMA);
				setState(344);
				asignacion();
				setState(349);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(345);
					match(COMA);
					setState(346);
					asignacion();
					}
					}
					setState(351);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(352);
				bloque();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(354);
				match(PARA);
				setState(355);
				match(PAREN_AP);
				setState(356);
				asignacion();
				setState(361);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(357);
					match(COMA);
					setState(358);
					asignacion();
					}
					}
					setState(363);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(364);
				match(PCOMA);
				setState(365);
				expresion();
				setState(366);
				match(PCOMA);
				setState(367);
				asignacion();
				setState(372);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(368);
					match(COMA);
					setState(369);
					asignacion();
					}
					}
					setState(374);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(375);
				match(PAREN_CI);
				setState(376);
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
		enterRule(_localctx, 50, RULE_fun_senten);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			match(DEF);
			setState(381);
			tipo();
			setState(382);
			match(IDENTIFICADOR);
			setState(383);
			match(PAREN_AP);
			setState(384);
			lista_ids();
			setState(385);
			match(PAREN_CI);
			setState(386);
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
		enterRule(_localctx, 52, RULE_proc_senten);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			match(DEF);
			setState(389);
			match(IDENTIFICADOR);
			setState(390);
			match(PAREN_AP);
			setState(391);
			lista_ids();
			setState(392);
			match(PAREN_CI);
			setState(393);
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
		enterRule(_localctx, 54, RULE_funcion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			match(LLAVEIZ);
			setState(396);
			sec_proposiciones();
			setState(397);
			match(PCOMA);
			setState(398);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3G\u0193\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\5\2=\n\2\3\2\3\2\3\2"+
		"\3\2\5\2C\n\2\3\2\3\2\5\2G\n\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\5\4S\n\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\5\6\\\n\6\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\7\7d\n\7\f\7\16\7g\13\7\3\7\5\7j\n\7\3\b\3\b\3\b\3\b\3\b\5\bq\n\b\3"+
		"\b\3\b\3\b\7\bv\n\b\f\b\16\by\13\b\3\b\5\b|\n\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u008d\n\t\3\n\3\n\3\n\5\n\u0092"+
		"\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u009b\n\13\f\13\16\13\u009e"+
		"\13\13\3\13\3\13\3\13\5\13\u00a3\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\5\f\u00ad\n\f\3\f\3\f\3\f\3\f\3\f\6\f\u00b4\n\f\r\f\16\f\u00b5\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00c2\n\f\3\r\3\r\3\r\3\r\5\r\u00c8"+
		"\n\r\3\r\3\r\3\r\3\r\5\r\u00ce\n\r\7\r\u00d0\n\r\f\r\16\r\u00d3\13\r\3"+
		"\r\3\r\3\r\5\r\u00d8\n\r\3\16\3\16\3\16\3\16\7\16\u00de\n\16\f\16\16\16"+
		"\u00e1\13\16\5\16\u00e3\n\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\5\20\u00ef\n\20\3\21\7\21\u00f2\n\21\f\21\16\21\u00f5\13\21\3"+
		"\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0111"+
		"\n\22\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0119\n\23\3\24\3\24\3\24\3\24"+
		"\3\24\7\24\u0120\n\24\f\24\16\24\u0123\13\24\3\24\3\24\5\24\u0127\n\24"+
		"\3\24\5\24\u012a\n\24\3\25\3\25\5\25\u012e\n\25\3\25\3\25\3\26\3\26\3"+
		"\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\5\31\u0146\n\31\3\31\3\31\3\31\3\31\3\31\5\31\u014d"+
		"\n\31\3\32\3\32\3\32\3\32\7\32\u0153\n\32\f\32\16\32\u0156\13\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\7\32\u015e\n\32\f\32\16\32\u0161\13\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u016a\n\32\f\32\16\32\u016d\13\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u0175\n\32\f\32\16\32\u0178\13\32"+
		"\3\32\3\32\3\32\5\32\u017d\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\2\2"+
		"\36\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668\2\t\3"+
		"\2\37 \3\2\34\36\3\2\r\16\4\2\5\5\r\16\3\2\7\f\4\2\5\6\17\22\3\2\26\33"+
		"\2\u01ba\2:\3\2\2\2\4J\3\2\2\2\6R\3\2\2\2\bT\3\2\2\2\nV\3\2\2\2\fi\3\2"+
		"\2\2\16{\3\2\2\2\20\u008c\3\2\2\2\22\u0091\3\2\2\2\24\u00a2\3\2\2\2\26"+
		"\u00c1\3\2\2\2\30\u00d7\3\2\2\2\32\u00d9\3\2\2\2\34\u00e6\3\2\2\2\36\u00ee"+
		"\3\2\2\2 \u00f3\3\2\2\2\"\u0110\3\2\2\2$\u0118\3\2\2\2&\u011a\3\2\2\2"+
		"(\u012b\3\2\2\2*\u0131\3\2\2\2,\u0134\3\2\2\2.\u0139\3\2\2\2\60\u014c"+
		"\3\2\2\2\62\u017c\3\2\2\2\64\u017e\3\2\2\2\66\u0186\3\2\2\28\u018d\3\2"+
		"\2\2:<\5\4\3\2;=\t\2\2\2<;\3\2\2\2<=\3\2\2\2=>\3\2\2\2>?\7?\2\2?B\7@\2"+
		"\2@A\7<\2\2AC\7@\2\2B@\3\2\2\2BC\3\2\2\2CF\3\2\2\2DE\7;\2\2EG\7@\2\2F"+
		"D\3\2\2\2FG\3\2\2\2GH\3\2\2\2HI\5\6\4\2I\3\3\2\2\2JK\t\3\2\2K\5\3\2\2"+
		"\2LM\7\'\2\2MN\5\b\5\2NO\7(\2\2OS\3\2\2\2PQ\7\'\2\2QS\7(\2\2RL\3\2\2\2"+
		"RP\3\2\2\2S\7\3\2\2\2TU\5\n\6\2U\t\3\2\2\2V[\7A\2\2WX\7%\2\2XY\5\f\7\2"+
		"YZ\7&\2\2Z\\\3\2\2\2[W\3\2\2\2[\\\3\2\2\2\\]\3\2\2\2]^\7,\2\2^_\5\36\20"+
		"\2_\13\3\2\2\2`e\7A\2\2ab\7+\2\2bd\7A\2\2ca\3\2\2\2dg\3\2\2\2ec\3\2\2"+
		"\2ef\3\2\2\2fj\3\2\2\2ge\3\2\2\2hj\3\2\2\2i`\3\2\2\2ih\3\2\2\2j\r\3\2"+
		"\2\2kl\7%\2\2lm\5\16\b\2mn\7&\2\2n|\3\2\2\2oq\t\4\2\2po\3\2\2\2pq\3\2"+
		"\2\2qr\3\2\2\2rw\5\24\13\2st\t\5\2\2tv\5\24\13\2us\3\2\2\2vy\3\2\2\2w"+
		"u\3\2\2\2wx\3\2\2\2x|\3\2\2\2yw\3\2\2\2z|\5\24\13\2{k\3\2\2\2{p\3\2\2"+
		"\2{z\3\2\2\2|\17\3\2\2\2}~\7%\2\2~\177\5\20\t\2\177\u0080\7&\2\2\u0080"+
		"\u008d\3\2\2\2\u0081\u0082\5\16\b\2\u0082\u0083\t\6\2\2\u0083\u0084\5"+
		"\16\b\2\u0084\u008d\3\2\2\2\u0085\u0086\7%\2\2\u0086\u0087\5\16\b\2\u0087"+
		"\u0088\7&\2\2\u0088\u008d\3\2\2\2\u0089\u008d\5\16\b\2\u008a\u008b\7\23"+
		"\2\2\u008b\u008d\5\20\t\2\u008c}\3\2\2\2\u008c\u0081\3\2\2\2\u008c\u0085"+
		"\3\2\2\2\u008c\u0089\3\2\2\2\u008c\u008a\3\2\2\2\u008d\21\3\2\2\2\u008e"+
		"\u008f\7A\2\2\u008f\u0092\5\32\16\2\u0090\u0092\7A\2\2\u0091\u008e\3\2"+
		"\2\2\u0091\u0090\3\2\2\2\u0092\23\3\2\2\2\u0093\u0094\7%\2\2\u0094\u0095"+
		"\5\24\13\2\u0095\u0096\7&\2\2\u0096\u00a3\3\2\2\2\u0097\u009c\5\26\f\2"+
		"\u0098\u0099\t\7\2\2\u0099\u009b\5\26\f\2\u009a\u0098\3\2\2\2\u009b\u009e"+
		"\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u00a3\3\2\2\2\u009e"+
		"\u009c\3\2\2\2\u009f\u00a0\7\23\2\2\u00a0\u00a3\5\24\13\2\u00a1\u00a3"+
		"\5\26\f\2\u00a2\u0093\3\2\2\2\u00a2\u0097\3\2\2\2\u00a2\u009f\3\2\2\2"+
		"\u00a2\u00a1\3\2\2\2\u00a3\25\3\2\2\2\u00a4\u00c2\7B\2\2\u00a5\u00c2\7"+
		"C\2\2\u00a6\u00c2\7E\2\2\u00a7\u00c2\7D\2\2\u00a8\u00c2\7/\2\2\u00a9\u00c2"+
		"\5\22\n\2\u00aa\u00ac\7A\2\2\u00ab\u00ad\5\30\r\2\u00ac\u00ab\3\2\2\2"+
		"\u00ac\u00ad\3\2\2\2\u00ad\u00c2\3\2\2\2\u00ae\u00b3\7A\2\2\u00af\u00b0"+
		"\7)\2\2\u00b0\u00b1\5\26\f\2\u00b1\u00b2\7*\2\2\u00b2\u00b4\3\2\2\2\u00b3"+
		"\u00af\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2"+
		"\2\2\u00b6\u00c2\3\2\2\2\u00b7\u00c2\7A\2\2\u00b8\u00b9\7\23\2\2\u00b9"+
		"\u00c2\5\26\f\2\u00ba\u00c2\7-\2\2\u00bb\u00c2\7.\2\2\u00bc\u00c2\5\32"+
		"\16\2\u00bd\u00be\7%\2\2\u00be\u00bf\5\20\t\2\u00bf\u00c0\7&\2\2\u00c0"+
		"\u00c2\3\2\2\2\u00c1\u00a4\3\2\2\2\u00c1\u00a5\3\2\2\2\u00c1\u00a6\3\2"+
		"\2\2\u00c1\u00a7\3\2\2\2\u00c1\u00a8\3\2\2\2\u00c1\u00a9\3\2\2\2\u00c1"+
		"\u00aa\3\2\2\2\u00c1\u00ae\3\2\2\2\u00c1\u00b7\3\2\2\2\u00c1\u00b8\3\2"+
		"\2\2\u00c1\u00ba\3\2\2\2\u00c1\u00bb\3\2\2\2\u00c1\u00bc\3\2\2\2\u00c1"+
		"\u00bd\3\2\2\2\u00c2\27\3\2\2\2\u00c3\u00c7\7%\2\2\u00c4\u00c8\5\20\t"+
		"\2\u00c5\u00c8\5\22\n\2\u00c6\u00c8\7A\2\2\u00c7\u00c4\3\2\2\2\u00c7\u00c5"+
		"\3\2\2\2\u00c7\u00c6\3\2\2\2\u00c8\u00d1\3\2\2\2\u00c9\u00cd\7+\2\2\u00ca"+
		"\u00ce\5\20\t\2\u00cb\u00ce\5\22\n\2\u00cc\u00ce\7A\2\2\u00cd\u00ca\3"+
		"\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00cc\3\2\2\2\u00ce\u00d0\3\2\2\2\u00cf"+
		"\u00c9\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2"+
		"\2\2\u00d2\u00d4\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4\u00d8\7&\2\2\u00d5"+
		"\u00d6\7%\2\2\u00d6\u00d8\7&\2\2\u00d7\u00c3\3\2\2\2\u00d7\u00d5\3\2\2"+
		"\2\u00d8\31\3\2\2\2\u00d9\u00e2\7\'\2\2\u00da\u00df\5\20\t\2\u00db\u00dc"+
		"\7+\2\2\u00dc\u00de\5\20\t\2\u00dd\u00db\3\2\2\2\u00de\u00e1\3\2\2\2\u00df"+
		"\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df\3\2"+
		"\2\2\u00e2\u00da\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4"+
		"\u00e5\7(\2\2\u00e5\33\3\2\2\2\u00e6\u00e7\t\b\2\2\u00e7\35\3\2\2\2\u00e8"+
		"\u00e9\7\'\2\2\u00e9\u00ef\7(\2\2\u00ea\u00eb\7\'\2\2\u00eb\u00ec\5 \21"+
		"\2\u00ec\u00ed\7(\2\2\u00ed\u00ef\3\2\2\2\u00ee\u00e8\3\2\2\2\u00ee\u00ea"+
		"\3\2\2\2\u00ef\37\3\2\2\2\u00f0\u00f2\5\"\22\2\u00f1\u00f0\3\2\2\2\u00f2"+
		"\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f6\3\2"+
		"\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00f7\5\"\22\2\u00f7!\3\2\2\2\u00f8\u00f9"+
		"\7\25\2\2\u00f9\u00fa\5\20\t\2\u00fa\u00fb\7#\2\2\u00fb\u0111\3\2\2\2"+
		"\u00fc\u0111\5\64\33\2\u00fd\u0111\5\66\34\2\u00fe\u0111\5&\24\2\u00ff"+
		"\u0111\5.\30\2\u0100\u0111\5*\26\2\u0101\u0111\5\62\32\2\u0102\u0111\5"+
		",\27\2\u0103\u0104\5$\23\2\u0104\u0105\7#\2\2\u0105\u0111\3\2\2\2\u0106"+
		"\u0107\7A\2\2\u0107\u0108\5\30\r\2\u0108\u0109\7#\2\2\u0109\u0111\3\2"+
		"\2\2\u010a\u010b\7\'\2\2\u010b\u010c\5 \21\2\u010c\u010d\7(\2\2\u010d"+
		"\u0111\3\2\2\2\u010e\u010f\7G\2\2\u010f\u0111\b\22\1\2\u0110\u00f8\3\2"+
		"\2\2\u0110\u00fc\3\2\2\2\u0110\u00fd\3\2\2\2\u0110\u00fe\3\2\2\2\u0110"+
		"\u00ff\3\2\2\2\u0110\u0100\3\2\2\2\u0110\u0101\3\2\2\2\u0110\u0102\3\2"+
		"\2\2\u0110\u0103\3\2\2\2\u0110\u0106\3\2\2\2\u0110\u010a\3\2\2\2\u0110"+
		"\u010e\3\2\2\2\u0111#\3\2\2\2\u0112\u0113\7A\2\2\u0113\u0114\7$\2\2\u0114"+
		"\u0119\5\20\t\2\u0115\u0116\7A\2\2\u0116\u0117\7$\2\2\u0117\u0119\5\32"+
		"\16\2\u0118\u0112\3\2\2\2\u0118\u0115\3\2\2\2\u0119%\3\2\2\2\u011a\u011b"+
		"\7\60\2\2\u011b\u0121\5(\25\2\u011c\u011d\7\61\2\2\u011d\u011e\7\60\2"+
		"\2\u011e\u0120\5(\25\2\u011f\u011c\3\2\2\2\u0120\u0123\3\2\2\2\u0121\u011f"+
		"\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0129\3\2\2\2\u0123\u0121\3\2\2\2\u0124"+
		"\u0126\7\61\2\2\u0125\u0127\7\4\2\2\u0126\u0125\3\2\2\2\u0126\u0127\3"+
		"\2\2\2\u0127\u0128\3\2\2\2\u0128\u012a\5\36\20\2\u0129\u0124\3\2\2\2\u0129"+
		"\u012a\3\2\2\2\u012a\'\3\2\2\2\u012b\u012d\5\20\t\2\u012c\u012e\7\4\2"+
		"\2\u012d\u012c\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0130"+
		"\5\36\20\2\u0130)\3\2\2\2\u0131\u0132\7\62\2\2\u0132\u0133\5(\25\2\u0133"+
		"+\3\2\2\2\u0134\u0135\7\66\2\2\u0135\u0136\5\36\20\2\u0136\u0137\7\62"+
		"\2\2\u0137\u0138\5\20\t\2\u0138-\3\2\2\2\u0139\u013a\7\63\2\2\u013a\u013b"+
		"\7A\2\2\u013b\u013c\7\'\2\2\u013c\u013d\5\60\31\2\u013d\u013e\7(\2\2\u013e"+
		"/\3\2\2\2\u013f\u0140\7\64\2\2\u0140\u0141\5\20\t\2\u0141\u0142\7,\2\2"+
		"\u0142\u0145\5 \21\2\u0143\u0144\7\65\2\2\u0144\u0146\7#\2\2\u0145\u0143"+
		"\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0148\5\60\31\2"+
		"\u0148\u014d\3\2\2\2\u0149\u014a\78\2\2\u014a\u014b\7,\2\2\u014b\u014d"+
		"\5 \21\2\u014c\u013f\3\2\2\2\u014c\u0149\3\2\2\2\u014d\61\3\2\2\2\u014e"+
		"\u014f\7\67\2\2\u014f\u0154\5$\23\2\u0150\u0151\7+\2\2\u0151\u0153\5$"+
		"\23\2\u0152\u0150\3\2\2\2\u0153\u0156\3\2\2\2\u0154\u0152\3\2\2\2\u0154"+
		"\u0155\3\2\2\2\u0155\u0157\3\2\2\2\u0156\u0154\3\2\2\2\u0157\u0158\7#"+
		"\2\2\u0158\u0159\5\20\t\2\u0159\u015a\7#\2\2\u015a\u015f\5$\23\2\u015b"+
		"\u015c\7+\2\2\u015c\u015e\5$\23\2\u015d\u015b\3\2\2\2\u015e\u0161\3\2"+
		"\2\2\u015f\u015d\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u0162\3\2\2\2\u0161"+
		"\u015f\3\2\2\2\u0162\u0163\5\36\20\2\u0163\u017d\3\2\2\2\u0164\u0165\7"+
		"\67\2\2\u0165\u0166\7%\2\2\u0166\u016b\5$\23\2\u0167\u0168\7+\2\2\u0168"+
		"\u016a\5$\23\2\u0169\u0167\3\2\2\2\u016a\u016d\3\2\2\2\u016b\u0169\3\2"+
		"\2\2\u016b\u016c\3\2\2\2\u016c\u016e\3\2\2\2\u016d\u016b\3\2\2\2\u016e"+
		"\u016f\7#\2\2\u016f\u0170\5\20\t\2\u0170\u0171\7#\2\2\u0171\u0176\5$\23"+
		"\2\u0172\u0173\7+\2\2\u0173\u0175\5$\23\2\u0174\u0172\3\2\2\2\u0175\u0178"+
		"\3\2\2\2\u0176\u0174\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u0179\3\2\2\2\u0178"+
		"\u0176\3\2\2\2\u0179\u017a\7&\2\2\u017a\u017b\5\36\20\2\u017b\u017d\3"+
		"\2\2\2\u017c\u014e\3\2\2\2\u017c\u0164\3\2\2\2\u017d\63\3\2\2\2\u017e"+
		"\u017f\7\24\2\2\u017f\u0180\5\34\17\2\u0180\u0181\7A\2\2\u0181\u0182\7"+
		"%\2\2\u0182\u0183\5\f\7\2\u0183\u0184\7&\2\2\u0184\u0185\5\36\20\2\u0185"+
		"\65\3\2\2\2\u0186\u0187\7\24\2\2\u0187\u0188\7A\2\2\u0188\u0189\7%\2\2"+
		"\u0189\u018a\5\f\7\2\u018a\u018b\7&\2\2\u018b\u018c\5\36\20\2\u018c\67"+
		"\3\2\2\2\u018d\u018e\7\'\2\2\u018e\u018f\5 \21\2\u018f\u0190\7#\2\2\u0190"+
		"\u0191\7(\2\2\u01919\3\2\2\2(<BFR[eipw{\u008c\u0091\u009c\u00a2\u00ac"+
		"\u00b5\u00c1\u00c7\u00cd\u00d1\u00d7\u00df\u00e2\u00ee\u00f3\u0110\u0118"+
		"\u0121\u0126\u0129\u012d\u0145\u014c\u0154\u015f\u016b\u0176\u017c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}