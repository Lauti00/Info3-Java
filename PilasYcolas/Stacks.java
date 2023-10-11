package PilasYcolas;
import Utils.Stack;

public class Stacks {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<Integer>(3);
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Imprimiendo Stack..");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        stack.makeEmpty();
        System.out.println("Pila vacia");
        System.out.println(stack.makeEmpty());
    }

}
