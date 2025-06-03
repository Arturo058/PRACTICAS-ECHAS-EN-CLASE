/*Cadena */
import java.util.LinkedList;

public class ListaEnlazada {
    public static void main(String[] args) {
        LinkedList<String> comida = new LinkedList<>();

        comida.add("Empanadas");
        comida.add("Tostadas");
        comida.add("Tacos");
        comida.add("Tortas");

        // Mostrar los elementos de la lista
        for (String platillo : comida) {
            System.out.println("Platillo: " + platillo);
        }
    }
}
