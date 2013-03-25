/**
 * Created with IntelliJ IDEA.
 * User: clautour
 * Date: 25/03/13
 * Time: 10:41 AM
 * To change this template use File | Settings | File Templates.
 */
public class Scalar implements IExprResult {
    Double value;

    public Double getValue()
    {
        return value;
    }

    public Scalar(Double value){
        this.value = value;
    }

    @Override
    public IExprResult sub(IExprResult other) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public  String toString()
    {
        return value.toString();
    }

}
