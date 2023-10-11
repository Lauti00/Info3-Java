package Utils;

public class Stack <AnyType> {
private int size;
private AnyType array[];
private int index; //Ultimo elemento


//Constructor 
public Stack(Integer size) {
    this.size = size;
    this.index = 0;
    this.array = (AnyType[]) new Object[size];
  }

//Insercion
public void push(AnyType item){    
 
    if(isFull()){
      throw new IllegalArgumentException("Pila completa");
  }
    this.array[this.index]=item;  //asigno el item a la nueva posicion
    this.index++;
}


public AnyType pop(){
    if(isEmpty()){
        throw new IllegalArgumentException("Pila vacia");
    }
    
    AnyType value =this.array[index - 1]; //Asigno a value el valor del penultimo elemento
    this.index--; //Decremento la pila
    return value;
}

public AnyType top(){
    return this.array[this.size -1]; //accedo al ultimo elemento de la pila
}

public boolean isEmpty(){
    return this.index==0;
}
public  boolean makeEmpty(){
    
    return this.index==0;
}
public boolean isFull(){
    return this.index==this.size;
    
}

    
}
