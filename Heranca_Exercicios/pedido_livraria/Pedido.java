public class Pedido {

    private double percentualDesconto;
    private ItemPedido[] itens;

    public Pedido(double percentualDesconto, ItemPedido[] itens) {
        this.percentualDesconto = percentualDesconto;
        this.itens = itens;
    }

    public double calcularTotal(){
        double valor = 0;
        double total;
        for(int i = 0; i < itens.length; i++){
            valor = valor + itens[i].getProduto().obterPrecoLiquido() * itens[i].getQuantidade();
        }
        return total = valor - (valor * percentualDesconto/100);
    }

}