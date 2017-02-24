// Generated from Icinga.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link IcingaParser}.
 */
public interface IcingaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link IcingaParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(@NotNull IcingaParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link IcingaParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(@NotNull IcingaParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link IcingaParser#obj}.
	 * @param ctx the parse tree
	 */
	void enterObj(@NotNull IcingaParser.ObjContext ctx);
	/**
	 * Exit a parse tree produced by {@link IcingaParser#obj}.
	 * @param ctx the parse tree
	 */
	void exitObj(@NotNull IcingaParser.ObjContext ctx);
	/**
	 * Enter a parse tree produced by {@link IcingaParser#icinga_obj}.
	 * @param ctx the parse tree
	 */
	void enterIcinga_obj(@NotNull IcingaParser.Icinga_objContext ctx);
	/**
	 * Exit a parse tree produced by {@link IcingaParser#icinga_obj}.
	 * @param ctx the parse tree
	 */
	void exitIcinga_obj(@NotNull IcingaParser.Icinga_objContext ctx);
	/**
	 * Enter a parse tree produced by {@link IcingaParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(@NotNull IcingaParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link IcingaParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(@NotNull IcingaParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link IcingaParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(@NotNull IcingaParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link IcingaParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(@NotNull IcingaParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link IcingaParser#pair}.
	 * @param ctx the parse tree
	 */
	void enterPair(@NotNull IcingaParser.PairContext ctx);
	/**
	 * Exit a parse tree produced by {@link IcingaParser#pair}.
	 * @param ctx the parse tree
	 */
	void exitPair(@NotNull IcingaParser.PairContext ctx);
}