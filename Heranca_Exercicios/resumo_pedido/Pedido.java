import produtos.Produto;
public class Pedido {

    private double percentualDesconto;
    private ItemPedido[] itens;

    public Pedido(double percentualDesconto, ItemPedido[] itens) {
        this.percentualDesconto = percentualDesconto;
        this.itens = itens;
    }

    public double getPercentualDesconto() {
        return percentualDesconto;
    }

    public ItemPedido[] getItens() {
        return itens;
    }

    public double calcularTotal(){
        double valor = 0;
        double total;
        for(int i = 0; i < itens.length; i++){
            valor = valor + itens[i].getProduto().obterPrecoLiquido() * itens[i].getQuantidade();
        }
        return total = valor - (valor * percentualDesconto/100);
    }

public double discount(){
        double val = 0;
        for(int i=0; i <itens.length; i++){
            val = val + itens[i].getQuantidade() * itens[i].getProduto().obterPrecoLiquido();
        }
        return (val * percentualDesconto/100 );
}

public double produtoTotal(){
        double somar = 0;
        for(int i = 0; i < itens.length; i ++){
            somar = somar + itens[i].getProduto().obterPrecoLiquido() * itens[i].getQuantidade();
        }
        return somar;
    }

    public void apresentarResumoPedido() {
        System.out.println("------- RESUMO PEDIDO -------");
        for (int i = 0; i < itens.length; i++) {
            System.out.printf("Tipo: %s  Titulo: %s  Preco: %.2f  Quant: %d  Total: %.2f\n",
                    itens[i].getProduto().getClass().getSimpleName(), itens[i].getProduto().getTitulo(), itens[i].getProduto().obterPrecoLiquido(), itens[i].getQuantidade(),
                    (itens[i].getProduto().obterPrecoLiquido() * itens[i].getQuantidade()));
        }
        System.out.println("----------------------------");
        System.out.printf("DESCONTO: %.2f\n", discount());
        System.out.printf("TOTAL PRODUTOS: %.2f\n", produtoTotal());
        System.out.println("----------------------------");
        System.out.printf("TOTAL PEDIDO: %.2f\n", calcularTotal());
        System.out.println("----------------------------");
    }
}