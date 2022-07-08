import java.util.HashMap;
import java.util.Map;
public abstract class Armazem <T> implements Armazenavel<T>{
    private Map<String,T> itens;

    public Armazem() {
        this.itens = new HashMap<String,T>();
    }

    public Map<String,T> getItens() {
         return itens;
    }

    public void setItens(Map<String,T> itens) {
        this.itens = itens;
    }

    @Override
    public void adicionarAoInventario(String nome,T valor) {
        itens.put(nome,valor);
    }

    @Override
    public T obterDoInventario(String nome) {
        T aux = null;
        if(itens.containsKey(nome)){
            aux = itens.get(nome);
        } return aux;
    }
}