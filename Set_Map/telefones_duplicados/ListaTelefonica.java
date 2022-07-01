import java.util.*;
public class ListaTelefonica {

    private HashMap<String, HashSet<Telefone>> listaTel;
    public ListaTelefonica() {
        this.listaTel = new HashMap<>();
    }
    public HashSet<Telefone>  buscar(String nome){

        for (String listaTel : this.listaTel.keySet() ) {
            if(listaTel.equals(nome)){
                return this.listaTel.get(listaTel);
            }
        }
        return null;
    }
    public HashSet<Telefone> adicionarTelefone(String nome, Telefone telefone){

        HashSet<Telefone> numero;
        numero = listaTel.get(nome);
        if(numero==null){
            numero = new HashSet<Telefone>();
        }
        if(numero.contains(telefone)){
            throw new IllegalArgumentException("Telefone jah existente para essa pessoa");
        }
        Iterator<HashSet<Telefone>> telefones = listaTel.values().iterator();
        while (telefones.hasNext()){
            for(Telefone tel : telefones.next()){
                if(tel.equals(telefone)){
                    throw new IllegalArgumentException("Telefone jah pertence a outra pessoa");
                }
            }
        }
        numero.add(telefone);
        this.listaTel.put(nome,numero);
        return numero;
    }

}