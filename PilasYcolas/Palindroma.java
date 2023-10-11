/*Comprobación de Palíndromos:
a. Crea un programa que verifique si una cadena es un palíndromo (se
lee igual de izquierda a derecha y de derecha a izquierda).

b. Primero elimina espacios en blanco y convierte la cadena a
minúsculas. Luego, llena una pila con la primera mitad de los
caracteres de la cadena y compara los caracteres de la segunda mitad
con los elementos desapilados de la pila para determinar si es un
palíndromo.*/
package PilasYcolas;
import Utils.Stack;
import java.util.Scanner;

public class Palindroma {

    public static void main(String[] args) {
        String a1;
        Scanner console = new Scanner(System.in);
        Stack<String> stringStack = new Stack<String>(2);
        System.out.println("Ingrese el elemento");

        a1 = console.nextLine();
        stringStack.push(a1);

        System.out.println("Ingrese el segundo elemento");

        String a2 = console.nextLine();
        stringStack.push(a2);

        boolean esPalindroma1 = isPalindroma(a1);
        boolean esPalindroma2 = isPalindroma(a2);

        if (!esPalindroma1 && !esPalindroma2) {
            System.out.println("Ambas cadenas son palindromas.");
        } else {
            System.out.println("No son  palindromas.");
        }
        System.out.println("IMPRIMIENDO STACK...");
        System.out.println(stringStack.pop());
        System.out.println(stringStack.pop());

    }

    public static boolean isPalindroma(String cadena) {
        // Elimina todos los caracteres no alfabéticos y convierte la cadena a minúsculas
        cadena = cadena.replaceAll(" +", "").toLowerCase();

        int size = cadena.length();
        for (int i = 0; i < size / 2; i++) {
            if (cadena.charAt(i) != cadena.charAt(size - 1 - i)) {
                return false;
            }
        }
        return true;
    }

}
