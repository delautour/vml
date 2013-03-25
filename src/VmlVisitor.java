// Generated from Vml.g4 by ANTLR 4.0
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface VmlVisitor<T> extends ParseTreeVisitor<T> {
	T visitFetch(VmlParser.FetchContext ctx);

	T visitSub(VmlParser.SubContext ctx);

	T visitAssignment(VmlParser.AssignmentContext ctx);

	T visitNumberList(VmlParser.NumberListContext ctx);

	T visitMagnitude(VmlParser.MagnitudeContext ctx);

	T visitVectorLiteral(VmlParser.VectorLiteralContext ctx);

	T visitParens(VmlParser.ParensContext ctx);

	T visitAdd(VmlParser.AddContext ctx);

	T visitDot(VmlParser.DotContext ctx);

	T visitNormalize(VmlParser.NormalizeContext ctx);

	T visitPoint(VmlParser.PointContext ctx);

	T visitRank(VmlParser.RankContext ctx);

	T visitComponent(VmlParser.ComponentContext ctx);

	T visitFile(VmlParser.FileContext ctx);

	T visitVector(VmlParser.VectorContext ctx);

	T visitInspect(VmlParser.InspectContext ctx);

	T visitPointLiteral(VmlParser.PointLiteralContext ctx);

	T visitCross(VmlParser.CrossContext ctx);
}