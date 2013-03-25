import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.LinkedList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: clautour
 * Date: 24/03/13
 * Time: 8:09 PM
 * To change this template use File | Settings | File Templates.
 */
public class NumberListVisitor extends VmlBaseVisitor<List<Double>> {

    @Override
    public List<Double> visitNumberList(VmlParser.NumberListContext ctx){

        List<Double> parts = new LinkedList<Double>();

        for (TerminalNode token : ctx.NUMBER()){
            parts.add( Double.parseDouble(token.getText()));
        }

        return parts;
    }
}
