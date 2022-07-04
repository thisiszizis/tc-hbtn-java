import java.util.*;

public class Blog {
    private List<Post> postagens;

    public Blog() {
        postagens = new ArrayList<Post>();
    }

    public void adicionarPostagem(Post postagem){
        postagens.add(postagem);
    }
    public Set<String> obterTodosAutores(){
        Set<String> listaDeAutores = new TreeSet<>();
        for (int i = 0; i < postagens.size(); i++) {
            listaDeAutores.add(postagens.get(i).getAutor());
        }return listaDeAutores;
    }
    public Map<String, Integer> obterContagemPorCategoria(){
        Map<String, Integer> listaDeCategoria = new TreeMap<>();
        for (int i = 0; i < postagens.size(); i++){
            if (listaDeCategoria.isEmpty()){
                listaDeCategoria.put(postagens.get(i).getCategoria(),1);
                continue;
            }else{
                for (int j = 0; j < listaDeCategoria.size(); j++) {
                    if (listaDeCategoria.containsKey(postagens.get(i).getCategoria())){
                        Integer valor = listaDeCategoria.get(postagens.get(i).getCategoria());
                        listaDeCategoria.replace(postagens.get(i).getCategoria(), valor+1);
                        break;
                    }else {
                        listaDeCategoria.put(postagens.get(i).getCategoria(),1);
                        break;
                    }
                }
            }

        }return listaDeCategoria;
    }

}