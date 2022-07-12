import java.util.ArrayList;
import java.util.List;

public class ConsultaProdutos {
    public static List<Produto> filtrar(List<Produto> list, CriterioFiltro criterioFiltro){
        List<Produto> novaLista = new ArrayList<>();
        for(Produto produto : list){
            if(criterioFiltro.testar(produto) == true){
                novaLista.add(produto);
            }
        }
        return novaLista;
    }
}