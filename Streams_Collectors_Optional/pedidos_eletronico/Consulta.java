import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Consulta {

    public static List<Produto> obterLivrosDoPedido(Pedido pedido){
        List<Produto> listaLivros = pedido.getProdutos().stream().filter(x -> x.getCategoria().equals(CategoriaProduto.LIVRO))
                .collect(Collectors.toList());

        return listaLivros;
    }

    public static Produto obterProdutoMaiorPreco(List<Produto> lista){
        Optional<Produto> produto = lista.stream().min(Comparator.comparing(Produto::getPreco).reversed());
        Produto newProduct = produto.get();
        return newProduct;
    }

    public static List<Produto> obterProdutosPorPrecoMinimo(List<Produto> lista, double precoMin){
        List<Produto> listaPreco = lista.stream().filter(preco -> preco.getPreco() >= precoMin).collect(Collectors.toList());
        return listaPreco;
    }

    public static List<Pedido> obterPedidosComEletronicos(List<Pedido> pedidos){
        List<Pedido> listaPedido = new ArrayList<>();
       for(Pedido pedido: pedidos) {
           if (pedido.getProdutos().stream().anyMatch(x -> x.getCategoria().equals(CategoriaProduto.ELETRONICO)) == true) {
               listaPedido.add(pedido);
           }
           }
        return listaPedido;
    }
}