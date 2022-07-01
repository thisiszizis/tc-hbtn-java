import java.util.ArrayList;
import java.util.HashMap;

public class ListaTelefonica {

    private HashMap<String, ArrayList<Telefone>> lista;

    public ListaTelefonica() {
        lista = new HashMap<>();
    }

    public void adicionarTelefone(String nome, Telefone newtelefone){
        ArrayList<Telefone> listaNova = lista.get(nome);

        if(listaNova == null){
            listaNova = new ArrayList<Telefone>();
        }

        listaNova.add(newtelefone);
        lista.put(nome, listaNova);
    }

    public ArrayList<Telefone> buscar(String nome){
        return lista.get(nome);
    }
}