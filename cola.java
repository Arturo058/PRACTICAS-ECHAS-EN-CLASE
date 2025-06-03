import java.util.LinkedList;
import java.util.Queue;
public class cola {
    public static void main(String[] args){
    Queue<String> fila = new LinkedList<>();
    fila.add("cliente 1");
    fila.add("cliente 2");
    fila.add("cliente 3");

    while (!fila.isEmpty()){
       // System.out.println("Atendiendo:" + fila.poll());
        System.out.println("Atendiendo:" + fila);
    }

    }
}
