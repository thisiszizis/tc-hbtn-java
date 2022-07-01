import java.util.List;

public class ManipularArrayNumeros {

    public static int buscarPosicaoNumero(List<Integer> lista, int numero){
      return  lista.indexOf(numero);
    }

    public static void adicionarNumero(List<Integer> lista, int numero) throws IllegalArgumentException{
        int aux = buscarPosicaoNumero(lista, numero);
            if(aux < 0){
                lista.add(numero);
            }else
                throw new IllegalArgumentException("Numero jah contido na lista");
        }

    public static void removerNumero(List<Integer> lista, int numero) throws IllegalArgumentException {
        int aux = buscarPosicaoNumero(lista, numero);
            if(aux != -1){
                lista.remove(Integer.valueOf(numero));
            }else
                throw new IllegalArgumentException("Numero nao encontrado na lista");
        }

    public static void substituirNumero(List<Integer> lista, int numeroSubstituir, int numeroSubstituto){
        int aux = buscarPosicaoNumero(lista, numeroSubstituir);
            if(aux < 0){
                lista.add(numeroSubstituto);
            }else{
                lista.set(aux, numeroSubstituto);
            }
    }

}