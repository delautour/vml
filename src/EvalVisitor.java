import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

public class EvalVisitor extends VmlBaseVisitor<IExprResult>
{

	@Override
	public IExprResult visitAssignment(VmlParser.AssignmentContext ctx){
		TerminalNode id = ctx.ID();
		VmlParser.ComponentContext comp = ctx.component();
		VmlParser.RankContext rank = ctx.rank();

        VmlParser.ExprContext expr = ctx.expr();

        IExprResult obj = visit(expr);
        Memory.set(id.getText(), obj);

        return obj;
 	}

    @Override
    public IExprResult visitInspect(VmlParser.InspectContext ctx){
        System.out.println ( visit(ctx.expr()) );
        return null;
    }

    @Override
    public IExprResult visitSub(VmlParser.SubContext ctx)
    {
        return visit(ctx.expr(0)).sub(visit(ctx.expr(1)));
    }

    @Override
    public IExprResult visitParens(VmlParser.ParensContext ctx){
        return visit(ctx.expr());
    }

    @Override
    public IExprResult visitNormalize(VmlParser.NormalizeContext ctx)
    {
        Vector v =  (Vector)(visit(ctx.expr()));
        return v.nomalize();
    }

    @Override
    public IExprResult visitMagnitude(VmlParser.MagnitudeContext ctx)
    {
        Vector v =  (Vector)(visit(ctx.expr()));
        return v.magnitude();
    }


    @Override
    public IExprResult visitDot(VmlParser.DotContext ctx)
    {
        Vector v1 =  (Vector)(visit(ctx.expr(0)));
        Vector v2 =  (Vector)(visit(ctx.expr(1)));
        return v1.dot(v2);
    }

    @Override
    public IExprResult visitFetch(VmlParser.FetchContext ctx)
    {
        return Memory.get(ctx.ID().getText());
    }


    @Override
    public IExprResult visitPoint(VmlParser.PointContext ctx){
        NumberListVisitor visitor = new NumberListVisitor();
        List<Double> list = visitor.visit(ctx.pointLiteral().numberList());

        return new Point(list);
    }


    @Override
    public IExprResult visitVector(VmlParser.VectorContext ctx){
        NumberListVisitor visitor = new NumberListVisitor();
        List<Double> list = visitor.visit(ctx.vectorLiteral().numberList());

        return new Vector(list);
    }

}
