# Practica: Dinamicas Lineales en Java

## Datos del Estudiante
- *Nombre:* Nicolás Aguilarrrrrr
- *Curso:* Grupo 1
- *Fecha:* 08/06/02026

---


*Fecha:* 08/06/2026

*Descripción:* 

Ejercicio1: Invertir un string utilizando una pila

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


Ejercicio2: Comprobar si una palabara es palíndroma:

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

