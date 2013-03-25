// Generated from Vml.g4 by ANTLR 4.0
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface VmlListener extends ParseTreeListener {
	void enterFetch(VmlParser.FetchContext ctx);
	void exitFetch(VmlParser.FetchContext ctx);

	void enterSub(VmlParser.SubContext ctx);
	void exitSub(VmlParser.SubContext ctx);

	void enterAssignment(VmlParser.AssignmentContext ctx);
	void exitAssignment(VmlParser.AssignmentContext ctx);

	void enterNumberList(VmlParser.NumberListContext ctx);
	void exitNumberList(VmlParser.NumberListContext ctx);

	void enterMagnitude(VmlParser.MagnitudeContext ctx);
	void exitMagnitude(VmlParser.MagnitudeContext ctx);

	void enterVectorLiteral(VmlParser.VectorLiteralContext ctx);
	void exitVectorLiteral(VmlParser.VectorLiteralContext ctx);

	void enterParens(VmlParser.ParensContext ctx);
	void exitParens(VmlParser.ParensContext ctx);

	void enterAdd(VmlParser.AddContext ctx);
	void exitAdd(VmlParser.AddContext ctx);

	void enterDot(VmlParser.DotContext ctx);
	void exitDot(VmlParser.DotContext ctx);

	void enterNormalize(VmlParser.NormalizeContext ctx);
	void exitNormalize(VmlParser.NormalizeContext ctx);

	void enterPoint(VmlParser.PointContext ctx);
	void exitPoint(VmlParser.PointContext ctx);

	void enterRank(VmlParser.RankContext ctx);
	void exitRank(VmlParser.RankContext ctx);

	void enterComponent(VmlParser.ComponentContext ctx);
	void exitComponent(VmlParser.ComponentContext ctx);

	void enterFile(VmlParser.FileContext ctx);
	void exitFile(VmlParser.FileContext ctx);

	void enterVector(VmlParser.VectorContext ctx);
	void exitVector(VmlParser.VectorContext ctx);

	void enterInspect(VmlParser.InspectContext ctx);
	void exitInspect(VmlParser.InspectContext ctx);

	void enterPointLiteral(VmlParser.PointLiteralContext ctx);
	void exitPointLiteral(VmlParser.PointLiteralContext ctx);

	void enterCross(VmlParser.CrossContext ctx);
	void exitCross(VmlParser.CrossContext ctx);
}