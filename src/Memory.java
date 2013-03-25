import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * User: clautour
 * Date: 24/03/13
 * Time: 8:29 PM
 * To change this template use File | Settings | File Templates.
 */
public class Memory {

   static HashMap<String, IExprResult> map = new HashMap<String, IExprResult>();

    public static void set(String name, IExprResult value){
       map.put(name, value);
    }

    public static IExprResult get(String name){
        return map.get(name);
    }

}
