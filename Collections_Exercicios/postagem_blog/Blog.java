import com.sun.source.tree.Tree;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.*;

public class Blog {
    private List<Post> postagens;

    public Blog() {
        postagens = new ArrayList<>();
    }

    public void adicionarPostagem(Post postagem){
        for (int i = 0; i < postagens.size(); i++) {
            if (postagens.get(i).getAutor().getNome().equals(postagem.getAutor().getNome()) &&
                    postagens.get(i).getTitulo().equals(postagem.getTitulo())){
                throw new IllegalArgumentException("Postagem jah existente");
            }
        }
        postagens.add(postagem);
    }
    public Set<Post> obterPostsPorAutor(Autor autor){
        Set<Post> titulosDoAutor = new TreeSet<>();
        for (int i = 0; i < postagens.size(); i++) {
            if (postagens.get(i).getAutor().equals(autor))
                titulosDoAutor.add(postagens.get(i));
        }
        return titulosDoAutor;
    }
    public Set<Autor> obterTodosAutores(){
        Set<Autor> listaDeAutores = new TreeSet<>();
        for (int i = 0; i < postagens.size(); i++) {
            listaDeAutores.add(postagens.get(i).getAutor());
        }
        return listaDeAutores;
    }

    public Set<Post> obterPostsPorCategoria(Categorias categoria){
        Set<Post> listaDeCategorias = new TreeSet<>();
        for (int i = 0; i < postagens.size(); i++) {
            if (categoria.equals(postagens.get(i).getCategoria())){
                listaDeCategorias.add(postagens.get(i));
            }
        }return listaDeCategorias;
    }

    public Map<Categorias, Set<Post>> obterTodosPostsPorCategorias(){
        Map<Categorias, Set<Post>> listaDeCategoria = new TreeMap<>();
        Set<Post> postPorCategoria;
        for (int i = 0; i < postagens.size(); i++) {
            postPorCategoria = new TreeSet<>();
            for (Post post: postagens) {
                if (postagens.get(i).getCategoria().equals(post.getCategoria())){
                    postPorCategoria.add(post);
                }
            }
            listaDeCategoria.put((Categorias) postagens.get(i).getCategoria(),postPorCategoria);

        }return listaDeCategoria;
    }

    public Map<Autor, Set<Post>> obterTodosPostsPorAutor() {
        Map<Autor, Set<Post>> listaDeAutor = new TreeMap<>();
        Set<Post> postPorCategoria;
        for (int i = 0; i < postagens.size(); i++) {
            postPorCategoria = new TreeSet<>();
            for (Post post: postagens) {
                if (postagens.get(i).getAutor().equals(post.getAutor())){
                    postPorCategoria.add(post);
                }
            }
            listaDeAutor.put(postagens.get(i).getAutor(),postPorCategoria);

        }return listaDeAutor;
    }
    public Map<Categorias, Integer> obterContagemPorCategoria(){
        Map<Categorias, Integer> listaDeCategoria = new HashMap<>();
        for (int i = 0; i < postagens.size(); i++){
            if (listaDeCategoria.isEmpty()){
                listaDeCategoria.put((Categorias) postagens.get(i).getCategoria(),1);
                continue;
            }else{
                for (int j = 0; j < listaDeCategoria.size(); j++) {
                    if (listaDeCategoria.containsKey(postagens.get(i).getCategoria())){
                        Integer valor = listaDeCategoria.get(postagens.get(i).getCategoria());
                        listaDeCategoria.replace((Categorias) postagens.get(i).getCategoria(), valor+1);
                        break;
                    }else {
                        listaDeCategoria.put((Categorias) postagens.get(i).getCategoria(),1);
                        break;
                    }
                }
            }

        }return listaDeCategoria;
    }


}