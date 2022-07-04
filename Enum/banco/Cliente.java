import java.util.ArrayList;

public class Cliente {
    private String nome;
    private ArrayList<Double> transacoes;

    public Cliente(String nome, double valorInicial) {
        this.nome = nome;
        transacoes = new ArrayList<Double>();
        transacoes.add(valorInicial);
    }

    public void adicionarTransacao(double valorDaTransacao){
        transacoes.add(valorDaTransacao);
    }
    public String getNome() {
        return nome;
    }

    public ArrayList<Double> getTransacoes() {
        return transacoes;
    }
}