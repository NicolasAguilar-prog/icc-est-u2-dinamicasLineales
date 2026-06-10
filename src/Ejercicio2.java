import java.util.Stack;

public class Ejercicio2 {

    public boolean esPalindromo(String texto) {

        Stack<Character> pila = new Stack<>();
      
        for (int i = 0; i < texto.length(); i++) {
            pila.push(texto.charAt(i));
        }     
        String invertido = "";
        while (!pila.isEmpty()) {
            invertido += pila.pop();
        }

        
        return texto.equals(invertido);
    }
}