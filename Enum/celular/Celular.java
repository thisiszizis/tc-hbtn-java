import java.util.ArrayList;

public class Celular {
    private ArrayList<Contato> contatos;

    public Celular() {
        this.contatos = new ArrayList<Contato>();
    }

    public int obterPosicaoContato(String nomeDoContato) {
        //i é a posição da lista
        //listaDeContatos.size é o tamanho da lista
        for (int i = 0; i < contatos.size(); i++) {
            if (contatos.get(i).getNome().equals(nomeDoContato)) {
                return i;
            }
        }
        return -1;
    }

    public void adicionarContato(Contato novoContato) {
        if (obterPosicaoContato(novoContato.getNome()) == -1) {
            contatos.add(novoContato);
        } else {
            throw new IllegalArgumentException("Nao foi possivel adicionar contato. Contato jah existente com esse nome");
        }
    }

    public void atualizarContato(Contato contatoAntigo, Contato novoContato) {
        if (obterPosicaoContato(contatoAntigo.getNome()) == -1) {
            //contato antigo NAO Existe
            throw new IllegalArgumentException("Nao foi possivel modificar contato. Contato nao existe");
        } else {
            //contato antigo existe
            if (obterPosicaoContato(novoContato.getNome()) != -1 && !novoContato.getNome().equals(contatoAntigo.getNome())) {
                //novo ja existe entao lancar erro
                throw new IllegalArgumentException("Nao foi possivel modificar contato. Contato jah existente com esse nome");
            }//novo contato nao existe atualizar o antigo
            int i = contatos.indexOf(contatoAntigo);
            contatos.set(i, novoContato);
        }
    }

    public void removerContato(Contato contato) {
        if (obterPosicaoContato(contato.getNome()) == -1) {
            throw new IllegalArgumentException("Nao foi possivel remover contato. Contato nao existe");
        }
        contatos.remove(contato);
    }

    public void listarContatos() {
        for (int i = 0; i < contatos.size(); i++) {
            String nomes = contatos.get(i).getNome();
            String numeroDeTelefone = contatos.get(i).getNumeroDeTelefone();
            TipoNumero tipo = contatos.get(i).getTipo();
            System.out.printf("%s -> %s (%s)\n", nomes, numeroDeTelefone, tipo);
        }
    }
}