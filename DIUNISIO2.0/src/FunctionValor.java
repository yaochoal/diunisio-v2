import java.util.ArrayList;

//Clase que almacenará funciones y procedimientos
public class FunctionValor extends Valor {
    public ArrayList<String> parametros = new ArrayList<>();
    public String tipo;
    public DiunisioParser.BloqueContext bloque;

    //Constructor
    public FunctionValor(Object value){
        super(value);
    }
}
