// Generated from C:/Users/Zylfrox/IdeaProjects/DIUNISIO2.0/src\Diunisio.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DiunisioParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DiunisioVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#algoritmo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlgoritmo(DiunisioParser.AlgoritmoContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#diunisio20}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiunisio20(DiunisioParser.Diunisio20Context ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#declaracionClase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracionClase(DiunisioParser.DeclaracionClaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#bloque_clase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque_clase(DiunisioParser.Bloque_claseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#clase_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClase_body(DiunisioParser.Clase_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#def_clase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef_clase(DiunisioParser.Def_claseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#llamada_metodo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamada_metodo(DiunisioParser.Llamada_metodoContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#constructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructor(DiunisioParser.ConstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#bloque_constructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque_constructor(DiunisioParser.Bloque_constructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#superclase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperclase(DiunisioParser.SuperclaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#asignacion_esto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion_esto(DiunisioParser.Asignacion_estoContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#asignacion_obj}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion_obj(DiunisioParser.Asignacion_objContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#objeto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjeto(DiunisioParser.ObjetoContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#metodo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetodo(DiunisioParser.MetodoContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#modificador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModificador(DiunisioParser.ModificadorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#acceso}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAcceso(DiunisioParser.AccesoContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#diunisio10}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiunisio10(DiunisioParser.Diunisio10Context ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#lista_ids}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista_ids(DiunisioParser.Lista_idsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#exp_simple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_simple(DiunisioParser.Exp_simpleContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion(DiunisioParser.ExpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(DiunisioParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#termino}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermino(DiunisioParser.TerminoContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(DiunisioParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#lista_parsv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista_parsv(DiunisioParser.Lista_parsvContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#conjunto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConjunto(DiunisioParser.ConjuntoContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(DiunisioParser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#bloque}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque(DiunisioParser.BloqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#bloque_metodo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque_metodo(DiunisioParser.Bloque_metodoContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#sec_pobjeto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSec_pobjeto(DiunisioParser.Sec_pobjetoContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#proposicion_obj}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProposicion_obj(DiunisioParser.Proposicion_objContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#sec_proposiciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSec_proposiciones(DiunisioParser.Sec_proposicionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#proposicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProposicion(DiunisioParser.ProposicionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code asigNum}
	 * labeled alternative in {@link DiunisioParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsigNum(DiunisioParser.AsigNumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code asigVec}
	 * labeled alternative in {@link DiunisioParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsigVec(DiunisioParser.AsigVecContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#si_senten}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSi_senten(DiunisioParser.Si_sentenContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#bloque_condicional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque_condicional(DiunisioParser.Bloque_condicionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#mientras_senten}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMientras_senten(DiunisioParser.Mientras_sentenContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#hacer_mientras_senten}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHacer_mientras_senten(DiunisioParser.Hacer_mientras_sentenContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#seleccionar_senten}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeleccionar_senten(DiunisioParser.Seleccionar_sentenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code casosGen}
	 * labeled alternative in {@link DiunisioParser#casos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCasosGen(DiunisioParser.CasosGenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code casosDef}
	 * labeled alternative in {@link DiunisioParser#casos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCasosDef(DiunisioParser.CasosDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#para_senten}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPara_senten(DiunisioParser.Para_sentenContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#fun_senten}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFun_senten(DiunisioParser.Fun_sentenContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#proc_senten}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProc_senten(DiunisioParser.Proc_sentenContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncion(DiunisioParser.FuncionContext ctx);
}