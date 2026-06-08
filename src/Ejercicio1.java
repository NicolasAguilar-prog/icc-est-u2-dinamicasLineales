import java.util.Stack;

public class Ejercicio1 {
    //METODO QUE DEVUELVE UNA CADENA DE 
    //TEXTO INVERTIDA
    //TEXTO -> COMPUTACION
    //RETURN ->NOICATUPMOC
    //USANDO SOLO PILAS
    public String invertString(String texto) {

        Stack<Character> pila = new Stack<>();
        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);
            pila.push(letra);
        }
        /*
        SEGUNDA FORMA DE RECORRER LA CADENA
        for(char letra : texto.toCharArray()){
            pila.push(letra);
        }
        */
        String invertido = "";
       while(!pila.isEmpty()){
        invertido += pila.pop();
       } 
       return invertido;
    }
}
