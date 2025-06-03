import java.util.HashMap;

public class Hashmap {
    public static void main(String[]args){
        HashMap<String,String> diccionario = new HashMap<>();
        diccionario.put("perro", "dog");
        diccionario.put("gato", "cat");
        diccionario.put("casa", "house");

        System.out.println("traduccion de 'gato':" + diccionario.get("gato"));
    
    }
}
