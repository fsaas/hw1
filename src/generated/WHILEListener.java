// Generated from WHILE.g4 by ANTLR 4.4
 
package generated;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link WHILEParser}.
 */
public interface WHILEListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link WHILEParser#aexpr}.
	 * @param ctx the parse tree
	 */
	void enterAexpr(@NotNull WHILEParser.AexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link WHILEParser#aexpr}.
	 * @param ctx the parse tree
	 */
	void exitAexpr(@NotNull WHILEParser.AexprContext ctx);
}