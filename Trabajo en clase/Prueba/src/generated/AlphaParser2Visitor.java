// Generated from C:/Users/olman/IdeaProjects/Prueba\AlphaParser2.g4 by ANTLR 4.12.0
package generated;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AlphaParser2}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AlphaParser2Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AlphaParser2#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(AlphaParser2.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlphaParser2#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand(AlphaParser2.CommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlphaParser2#singleCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleCommand(AlphaParser2.SingleCommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlphaParser2#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(AlphaParser2.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlphaParser2#singleDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleDeclaration(AlphaParser2.SingleDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlphaParser2#typedenoter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedenoter(AlphaParser2.TypedenoterContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlphaParser2#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(AlphaParser2.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlphaParser2#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpression(AlphaParser2.PrimaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlphaParser2#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(AlphaParser2.OperatorContext ctx);
}