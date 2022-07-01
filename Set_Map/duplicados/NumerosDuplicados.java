import java.util.HashSet;
import java.util.TreeSet;

public class NumerosDuplicados {

    public static TreeSet<Integer> buscar(int[] valoresInt){
        HashSet<Integer> numeros = new HashSet<>();
        HashSet<Integer> valorDuplicados = new HashSet<>();

     for(int i=0; i < valoresInt.length; i++){
         if(!numeros.contains(valoresInt[i])){
             numeros.add(valoresInt[i]);
         }else{
            valorDuplicados.add(valoresInt[i]);
         }
     }

     TreeSet<Integer> completo = new TreeSet<>();
     completo.addAll(valorDuplicados);

        return completo;
    }
}