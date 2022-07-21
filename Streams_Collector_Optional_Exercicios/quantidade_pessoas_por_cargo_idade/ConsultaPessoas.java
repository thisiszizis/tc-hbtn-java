import java.util.*;
import java.util.stream.Collectors;

public class ConsultaPessoas {

    public static TreeMap<String, TreeSet<Pessoa>> obterPessoasAgrupadasPorCargoEmOrdemReversa1(List<Pessoa> pessoas){
        TreeMap<String, TreeSet<Pessoa>> lista = pessoas.stream().collect(Collectors.groupingBy(
                Pessoa::getCargo, TreeMap::new, Collectors.toCollection(TreeSet::new)));
        return lista;
    }

    public static TreeMap<String, TreeSet<Pessoa>> obterPessoasAgrupadasPorCargoEmOrdemReversa(List<Pessoa> pessoas){
        TreeMap<String, TreeSet<Pessoa>> list = pessoas.stream().collect(Collectors.groupingBy(Pessoa::getCargo, ()
         -> new TreeMap<>(Comparator.reverseOrder()), Collectors.toCollection(TreeSet::new)));

        return list;
    }

    public static Map<String, Long> obterContagemPessoasPorCargo(List<Pessoa> pessoas){
        Map<String, Long> lista = pessoas.stream().collect(Collectors.groupingBy(Pessoa::getCargo, Collectors.counting()));
        return lista;
    }

    public static Map<String, Map<Integer, Long>> obterContagemPessoasPorCargoEIdade (List<Pessoa> pessoas){
        Map<String, Map<Integer, Long>> lista = pessoas.stream().collect(Collectors.groupingBy(Pessoa::getCargo, Collectors.groupingBy(
                Pessoa::getIdade, Collectors.counting()
        )));
        return lista;
    }
}