// Generated from C:/Users/olman/IdeaProjects/Prueba\AlphaParser2.g4 by ANTLR 4.12.0
package generated;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AlphaParser2}.
 */
public interface AlphaParser2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AlphaParser2#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(AlphaParser2.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlphaParser2#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(AlphaParser2.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlphaParser2#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(AlphaParser2.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlphaParser2#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(AlphaParser2.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlphaParser2#singleCommand}.
	 * @param ctx the parse tree
	 */
	void enterSingleCommand(AlphaParser2.SingleCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlphaParser2#singleCommand}.
	 * @param ctx the parse tree
	 */
	void exitSingleCommand(AlphaParser2.SingleCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlphaParser2#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(AlphaParser2.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlphaParser2#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(AlphaParser2.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlphaParser2#singleDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSingleDeclaration(AlphaParser2.SingleDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlphaParser2#singleDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSingleDeclaration(AlphaParser2.SingleDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlphaParser2#typedenoter}.
	 * @param ctx the parse tree
	 */
	void enterTypedenoter(AlphaParser2.TypedenoterContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlphaParser2#typedenoter}.
	 * @param ctx the parse tree
	 */
	void exitTypedenoter(AlphaParser2.TypedenoterContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlphaParser2#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(AlphaParser2.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlphaParser2#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(AlphaParser2.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlphaParser2#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(AlphaParser2.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlphaParser2#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(AlphaParser2.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlphaParser2#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(AlphaParser2.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlphaParser2#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(AlphaParser2.OperatorContext ctx);
}