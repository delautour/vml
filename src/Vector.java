import java.util.LinkedList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: clautour
 * Date: 24/03/13
 * Time: 8:24 PM
 * To change this template use File | Settings | File Templates.
 */
public class Vector implements IExprResult {

    Double[] components;

    public Vector(List<Double> dimensions){
        this.components = dimensions.toArray(new Double[]{});
    }

    public IExprResult sub(IExprResult other){
        return null;
    }

    public Scalar dot(Vector other)
    {
        Double result = 0.0;

        for(int i = 0; i < components.length; i++){
            result += components[i] * other.components[i];
        }

        return new Scalar(result);
    }

    public Scalar magnitude(){
        Double total = 0.0;
        for(Double val : components){
            total += val*val;
        }

        return new Scalar(Math.sqrt(total));
    }

    public Vector nomalize(){

        List<Double> comp = new LinkedList<Double>();
        Double factor = 1 / magnitude().getValue();

        for(Double val : components){
            comp.add( val * factor );
        }

        return new Vector(comp);
    }

    @Override
    public String toString(){

        String result = "";

        for (Double val : components){
            if (result.length() > 0)
                result += ", ";

            result += "" + val.toString();
        }
        return "Vector: (" + result + ")";
    }
}
