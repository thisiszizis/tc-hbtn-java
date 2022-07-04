import java.util.Objects;

public class Contato {
    private String nome;
    private String numeroDeTelefone;
    private TipoNumero tipo;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contato contato = (Contato) o;
        return nome.equals(contato.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }

    public Contato(String nome, String numeroDeTelefone, TipoNumero tipo) {
        this.nome = nome;
        this.numeroDeTelefone = numeroDeTelefone;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public String getNumeroDeTelefone() {
        return numeroDeTelefone;
    }

    public TipoNumero getTipo() {
        return tipo;
    }
}