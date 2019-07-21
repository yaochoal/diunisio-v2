import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.*;

public class Main {
    public static String[] parametros;
    public static String algoritmo;

    public static void main(String[] args) throws Exception {
        DiunisioLexer lexer;
        lexer = new DiunisioLexer(new ANTLRFileStream("src/Ejemplo1.txt"));
        //Realiza el parseo del código
        DiunisioParser parser = new DiunisioParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.clase_sentencia();
        EvalVisitor visitor = new EvalVisitor();
        visitor.visit(tree);
    }
}