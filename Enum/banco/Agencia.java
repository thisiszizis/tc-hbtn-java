import java.util.ArrayList;

public class Agencia {
    private String nome;
    private ArrayList<Cliente> clientes;

    public Agencia(String nome) {
        clientes = new ArrayList<Cliente>();
        this.nome = nome;
    }
    public Cliente buscarCliente(String nomeDoCliente){
        for (Cliente cliente : clientes) {
            if (cliente.getNome().equals(nomeDoCliente)){
                return cliente;
            }
        }return null;
    }
    public boolean novoCliente(String nomeDoCliente, double valorTransacaoInicial){
        Cliente cliente = buscarCliente(nomeDoCliente);
        if (cliente == null){
            cliente = new Cliente(nomeDoCliente, valorTransacaoInicial);
            clientes.add(cliente);
            return true;
        } return false;
    }
    public boolean adicionarTransacaoCliente(String nomeDoCliente,double valorDaTransacao){
        Cliente cliente = buscarCliente(nomeDoCliente);
        if (cliente == null){
            return false;
        }else {
            cliente.adicionarTransacao(valorDaTransacao);
            return true;
        }

    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }
}
