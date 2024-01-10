import java.util.ArrayList;
import java.util.Scanner;

public class Problem_11_10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Create a MyStack
        MyStack stack = new MyStack();

        // Prompt the user to enter five strings
        System.out.print("Enter five strings: ");
        for (int i = 0; i < 5; i++) {
            stack.push(input.next());
        }

        // Display in reverse order
        System.out.println("Stack: " + stack.toString());
    }

    private static class MyStack {
        // Data fields
        private java.util.ArrayList<Object> list;

        // Constructor

        /**
         * Construct a default MyStack object
         */
        public MyStack() {
            list = new java.util.ArrayList<Object>();
        }

        /**
         * Add a new element to
         * the top of this stack
         */
        public void push(Object o) {
            list.add(0, o);
        }

        /**
         * Return the top element in this
         * stack without removing it
         */
        public Object peek() {
            return list.get(0);
        }

        /**
         * Return an remove the
         * top element in this stack
         */
        public Object pop() {
            Object o = list.get(0);
            list.remove(0);
            return o;
        }

        /**
         * Return a string of all elements in MyStack
         */
        @Override
        public String toString() {
            return "stack: " + list.toString();
        }
    }
}
