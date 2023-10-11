package Utils;

public class Queue <AnyType> {
    private int size;
    private AnyType array[];
    private int front; //primer elemento
    private int back;//ultimo elemento
    private int count;
    
    public Queue (int size){
        
        this.size =size;
        this.array = (AnyType[]) new Object[size];
        this.front=0;   
        this.back=0;
        this.count=0;
    }
    
    public void enqueue(AnyType item){
          if(isFull()){
            throw new IllegalArgumentException("Cola completa");
        } 
        this.array[this.back] = item; //inserto el elemento (A LO ULTIMO)
            this.back++; //muevo puntero al sig elemento
            this.count++;
       
    }
    public AnyType dequeue(){
        if(isEmpty()){
            throw new IllegalArgumentException("Cola vacia");
        }
        AnyType value = this.array[this.front];
        this.front++;
        this.count--;
        return value;
    }
    
    public boolean isFull(){
     return this.count==this.size;
}
    public boolean isEmpty(){
        return this.count == 0;
    }
    
     
      public void print() {
        if (isEmpty()) {
            System.out.println("La cola esta vacia.");
        } else {
            for (int i = 0; i < count; i++) {
                int index = (front + i) % size;
                System.out.print(array[index] + " ");
            }
            System.out.println();
        }
}
      
}
