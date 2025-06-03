import java.util.Stack;

public class pila {
    public static void main(String[] args) {
        Stack<String> rangos = new Stack<>();

        rangos.push("Coronel");
        rangos.push("Sargento");
        rangos.push("Soldado");

        while (!rangos.isEmpty()) {
            System.out.println("Tu ramgo es: " + rangos.pop());
        }
    }
}
