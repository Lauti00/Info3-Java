
import java.util.Scanner;
public class Ejercicio {
    public static void main(String[] args) {
        
   
    int numero, opcion,potencia=0;
    System.out.println("Ingrese un numero para realizar la operacion:");
    Scanner console = new Scanner(System.in);
    numero = console.nextInt();
        

        System.out.println("----Menu--"+"\n"+ "1.Calcular factorial \n" + "2.Calcular suma factorial \n" + "3.Recursividad Potencia \n"+"4.Conteo \n"+
                "5.Recusividad Producto \n"+ "6.Recursividad Arreglo \n"+"7.Recursividad Binaria");
        opcion= console.nextInt();
        switch(opcion){
            case 1:
                System.out.println("El resultado es: " + recursivo(numero));
                break;
            case 2:
                System.out.println("El resultado de la recursividad de la suma es:"+ recursividadSuma(numero));
                break;
            case 3:
                System.out.println("Ingrese el numero de la potencia");
                potencia = console.nextInt();
                System.out.println("El resultado de la recursividad de la potencia es:" + recursividadPotencia(numero,potencia));
                break;
            case 4:
                System.out.println(conteo(numero));
                break;
            case 5:
                int num2=0;
                System.out.println("Ingrese cuantas veces quiere sumar:");
                num2=console.nextInt();
                System.out.println(sumaSucesiva(numero,num2));
                break;
            
            case 6:
                
                int valor=0;
                int tamanio = 0;
                System.out.println("Ingrese el tamanio del arreglo");
                tamanio=console.nextInt();
                int []arreglo = new int[tamanio];
                for(int i=0 ; i<tamanio ; i++){
                  valor = console.nextInt();
                  arreglo[i]=valor;
                }
                
                arreglo(arreglo, tamanio);
                break;
                
            case 7:
                imprimirBinario( numero);
                break;
        }
    }

public static int recursivo (int numero){
    int resultado=0;
    if(numero == 0){
        return resultado=1;
    }
    if(numero < 0){
        throw new IllegalArgumentException("No es posible calcular el factorial");
    }
    else{
         resultado = numero*recursivo(numero-1);
    }
        return resultado;
}

public static int recursividadSuma(int numero){
    int resultado=0;
    if(numero==0){
        return resultado=0;
    }
    if(numero<0){
        throw new IllegalArgumentException("No se puede calcular");
    }
    else{
        resultado= numero + recursividadSuma(numero-1);
    }
    return resultado;
}
public static int recursividadPotencia(int numero, int potencia){
    int resultado=0;
    
    if(numero==0){
        throw new IllegalArgumentException("Ingrese un numero valido");
    }
    if(potencia==0){
        return resultado=1;
    }
    if(potencia <0){
        throw new IllegalArgumentException("No se puede calcular potencia negativa");
    }
    else{
        resultado = numero *recursividadPotencia(numero, potencia-1);
    }
            
    return resultado;
}
public static int conteo(int numero){
    int resultado=0;
    if(numero==1){
        return 1;
    } else{
        System.out.println("numero" + numero);
        resultado = conteo(numero-1);
    }
    return resultado;
}
public static int sumaSucesiva(int numero , int num2){
    int resultado=0;
    if(num2==0){
        return 0;
    }    
    else{
        resultado = numero + sumaSucesiva(numero,num2 -1);
    }
    return resultado;
}

public static int arreglo(int []arreglo , int tamanio){
    int resultado=0;
    if(tamanio<0){
        throw new IllegalArgumentException("El tamanio esta vacio");
    }
    else if(tamanio==0){
        return 0;
    }
    else{
       System.out.println(arreglo[tamanio-1]);
       resultado= arreglo(arreglo,tamanio-1);
    }
    return resultado;
}
public static int imprimirBinario(int numero){
    if(numero<2){
        System.out.print(numero);
    }
    else{
        imprimirBinario(numero/2);
        System.out.println(numero%2);
    }
    return 0;
}
}




