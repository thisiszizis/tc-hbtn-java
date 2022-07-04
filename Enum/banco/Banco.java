import java.util.ArrayList;

public class Banco {
    private String nome;
    private ArrayList<Agencia> agencias;

    public Banco(String nome) {
        agencias = new ArrayList<Agencia>();
        this.nome = nome;
    }

    public Agencia buscarAgencia(String nomeDaAgencia) {
        for (Agencia agenciaAtual : agencias) {
            if (agenciaAtual.getNome().equals(nomeDaAgencia)) {
                return agenciaAtual;
            }
        }
        return null;
    }

    public boolean adicionarAgencia(String nomeDaAgencia) {
        Agencia agencia = buscarAgencia(nomeDaAgencia);
        if (agencia == null) {
            agencia = new Agencia(nomeDaAgencia);
            agencias.add(agencia);
            return true;
        }
        return false;

    }

    public boolean adicionarCliente(String nomeDaAgencia, String nomeDoCliente, double valorDaTransacaoInicial) {
        Agencia agencia = buscarAgencia(nomeDaAgencia);
        if (agencia != null) {
            Cliente cliente = agencia.buscarCliente(nomeDoCliente);
            if (cliente == null) {
                cliente = new Cliente(nomeDoCliente, valorDaTransacaoInicial);
                agencia.getClientes().add(cliente);
                return true;
            }
        }
        return false;
    }

    public boolean adicionarTransacaoCliente(String nomeDaAgencia, String nomeDoCliente, double valorDaTransacaoInicial) {
        Agencia agencia = buscarAgencia(nomeDaAgencia);
        if (agencia != null) {
            Cliente cliente = agencia.buscarCliente(nomeDoCliente);
            if (cliente != null) {
                cliente.adicionarTransacao(valorDaTransacaoInicial);
                return true;
            }
        }
        return false;
    }

    public boolean listarClientes(String nomeDaAgencia, boolean imprimeTransacoes) {
        Agencia agencia = buscarAgencia(nomeDaAgencia);
        if (agencia != null) {
            for (int i = 0; i < agencia.getClientes().size(); i++) {
                if (imprimeTransacoes == false){
                    System.out.printf("Cliente: %s [%d]\n", agencia.getClientes().get(i).getNome(),agencia.getClientes().indexOf(agencia.getClientes().get(i)) + 1);
                }else {
                    System.out.printf("Cliente: %s [%d]\n", agencia.getClientes().get(i).getNome(),agencia.getClientes().indexOf(agencia.getClientes().get(i)) + 1);
                    for (Double transacoes : agencia.getClientes().get(i).getTransacoes()) {
                        System.out.printf("  [%d] valor %.2f\n",agencia.getClientes().get(i).getTransacoes().indexOf(transacoes) + 1,transacoes);
                    }
                }
            }
        }
        return false;
    }
}