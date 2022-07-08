import java.util.ArrayList;
import java.util.List;

public class Biblioteca<T> extends Midia{

    private List<T> lista = new ArrayList<T>();

    public void adicionarMidia(T tipo){
        lista.add(tipo);
    }

    public List<T> obterListaMidias(){
        return lista;
    }
}