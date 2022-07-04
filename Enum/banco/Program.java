import java.util.Locale;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));
        Banco banco = new Banco("Banco do Brasil");

        banco.adicionarAgencia("Alameda");

        banco.adicionarCliente("Alameda", "John Bannons", 50.05);
        banco.adicionarCliente("Alameda", "Jane Doe", 175.34);
        banco.adicionarCliente("Alameda", "Jackson Percy", 220.12);

        banco.adicionarTransacaoCliente("Alameda", "Jane Doe", 44.22);
        banco.adicionarTransacaoCliente("Alameda", "Jane Doe", 12.44);
        banco.adicionarTransacaoCliente("Alameda", "Jackson Percy", 1.65);

        banco.listarClientes("Alameda", true);
    }
}