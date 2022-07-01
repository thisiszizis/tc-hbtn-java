import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Pedido {
    public static ArrayList<PedidoCookie> cookies = new ArrayList<>();


    public Pedido(List<PedidoCookie> cookies) {
        this.cookies = (ArrayList<PedidoCookie>) cookies;
    }

    public Pedido() {}

    public static void adicionarPedidoCookie(PedidoCookie lista){
        cookies.add(lista);
    }

    public static Object obterTotalCaixas(){

        int total = 0;

        for (PedidoCookie lista: cookies){
            total += lista.getQuantidade();
        }

        return total ;

    }

    public static int removerSabor(String sabor){

        int total = 0 ;

        Iterator<PedidoCookie> iterator = cookies.iterator();
        while (iterator.hasNext()) {
            PedidoCookie pedidoCookie = iterator.next();

            if (pedidoCookie.getSabor().equalsIgnoreCase(sabor)){
                total += pedidoCookie.getQuantidade() ;
                iterator.remove();

            }

        }
        return total ;

    }
}