import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.FileInputStream;
import java.io.InputStream;


public class Vml {
	public static void main(String[] args) throws Exception {
		String inputFile = null;
		
                if ( args.length > 0 ) inputFile = args[0];
 		InputStream inputStream = System.in;
    		
		if ( inputFile != null ) inputStream = new FileInputStream(inputFile); 	
		
		ANTLRInputStream input = new ANTLRInputStream(inputStream);

		VmlLexer lexer = new VmlLexer(input);

		CommonTokenStream tokens = new CommonTokenStream(lexer);

		VmlParser parser = new VmlParser(tokens);
		
		VmlVisitor visitor = new EvalVisitor();
 		ParseTree tree = parser.file();
		visitor.visit(tree);
	}

       
}


