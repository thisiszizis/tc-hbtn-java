import java.util.ArrayList;

public class ListaTodo {

    ArrayList<Tarefa> tarefas;

    public ListaTodo() {
        this.tarefas = new ArrayList<Tarefa>();
    }

    public void adicionarTarefa(Tarefa novaTarefa) throws IllegalArgumentException {
        if (tarefas.isEmpty()) {
            tarefas.add(novaTarefa);
        } else {
            for (int i = 0; i < tarefas.size(); i++) {
                Tarefa t = tarefas.get(i);
                if (t.getIdentificador() == novaTarefa.getIdentificador()) {
                    throw new IllegalArgumentException("Tarefa com identificador " + novaTarefa.getIdentificador() + " ja existente na lista");
                }
            }
            tarefas.add(novaTarefa);
        }
    }

    public boolean marcarTarefaFeita(int identificador) {
        for (int i = 0; i < tarefas.size(); i++) {
            Tarefa t = tarefas.get(i);
            if (identificador == t.getIdentificador()) {
                t.setEstahFeita(true);
                return true;
            }
        }
        return false;
    }

    public boolean desfazerTarefa(int identificador) {
        for (int i = 0; i < tarefas.size(); i++) {
            Tarefa t = tarefas.get(i);
            if (identificador == t.getIdentificador()) {
                t.setEstahFeita(false);
                return true;
            }
        }
        return false;
    }

    public void desfazerTodas() {
        for (Tarefa t : tarefas) {
            t.setEstahFeita(false);
        }
    }

    public void fazerTodas() {
        for (Tarefa t : tarefas) {
            t.setEstahFeita(true);
        }
    }

    public void listarTarefas() {
        for (Tarefa t : tarefas) {
            if(t.isEstahFeita()){
                System.out.println("[X]  Id: " + t.getIdentificador() + " - Descricao: " + t.getDescricao());
            }else{
                System.out.println("[ ]  Id: " + t.getIdentificador() + " - Descricao: " + t.getDescricao());
            }
        }

    }

}