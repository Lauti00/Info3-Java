//Implementación de una Pila con lista:
package PilasYcolas;

/*Implementa una pila que almacene palabras. Crea un programa que
solicite al usuario ingresar palabras y las apile. Luego, desapílalas e
imprímelas en orden inverso.*/
import Utils.StackList;
import java.util.Scanner;

public class Pila {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        StackList<String> stack = new StackList<>();
        int size = 0;
        System.out.println("Ingrese la cantidad de elementos que desea agregar:");
        size = console.nextInt();
        console.nextLine();// Sin esto el for me toma un valor menos del que agrego.

        System.out.println("Ingresendo datos.. ");
        for (int i = 0; i < size; i++) {
            String palabras = console.nextLine();
            stack.push(palabras);
        }
        System.out.println("Imprimiendo los valores originales...");
        stack.print();

        pilaInvertida(stack);
        ingresarInverso(stack, ""); //le pongo "" sino me agrega un elemento"
        System.out.println("Valores de la pila nuevos...");
        stack.print();

    }

    public static void pilaInvertida(StackList<String> stack) {
        if (!stack.isEmpty()) { //Si la pila no esta vacia no tengo que invertir nada
            String elemento = stack.pop(); // Elimina el elemento
            pilaInvertida(stack);
            ingresarInverso(stack, elemento); //ingreso el elemento invertido
        }

    }

    public static void ingresarInverso(StackList<String> stack, String elemento) {
        StackList<String> stackTemporal = new StackList<>();

        // Desapila elementos de la pila original y lo apilo en la pila temporal
        while (!stack.isEmpty()) {
            stackTemporal.push(stack.pop());
        }
        // Apila el nuevo elemento en la pila original
        stack.push(elemento);

        // Desapila los elementos de la pila temporal y apilo  en la pila original
        while (!stackTemporal.isEmpty()) {
            stack.push(stackTemporal.pop());
        }
    }

}

        
        

    
    
    
    



    
    
        
    
    
    
    


    
    

