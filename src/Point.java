import java.util.LinkedList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: clautour
 * Date: 24/03/13
 * Time: 8:17 PM
 * To change this template use File | Settings | File Templates.
 */
public class Point implements IExprResult {

    Double[] components;

    public Point(List<Double> dimensions){

        this.components = dimensions.toArray(new Double[]{});
    }

    public IExprResult sub(IExprResult other){
        return sub((Point)other);
    }

    public Vector sub(Point other){

        List<Double> comp = new LinkedList<Double>();

        for(int i = 0; i < components.length; i++){
            comp.add(components[i] - other.components[i]);
        }

        Vector result = new Vector(comp);

        return result;
    }

    @Override
    public String toString(){

        String result = "";

        for (Double val : components){
            if (result.length() > 0)
                result += ", ";

            result += "" + val.toString();
        }
        return "Point: (" + result + ")";
    }
}
