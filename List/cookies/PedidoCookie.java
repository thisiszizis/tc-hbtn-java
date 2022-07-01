public class PedidoCookie {

    private String sabor;
    private int quantidadeCaixas;

    public PedidoCookie(String sabor, int quantidade) {
        this.sabor = sabor;
        this.quantidadeCaixas = quantidade;
    }

    public String getSabor() {
        return sabor;
    }


    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public int getQuantidade() {
        return quantidadeCaixas;
    }

    public void setQuantidade(int quantidade) {
        this.quantidadeCaixas = quantidade;
    }
}