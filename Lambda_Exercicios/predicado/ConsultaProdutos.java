import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ConsultaProdutos {
    public static List<Produto> filtrar(List<Produto> list, Predicate<Produto> predicate){
        List<Produto> novaLista = new ArrayList<>();
        for(Produto produto : list){
            if(predicate.test(produto) == true) {
                novaLista.add(produto);
            }
        }
        return novaLista;
    }

}