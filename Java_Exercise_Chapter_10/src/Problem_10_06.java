import java.util.Scanner;

public class Problem_10_6 {

    public static void main(String[] args) {
        StackOfIntegers stack = new StackOfIntegers();

        // Find and push all prime numbers less than 120 to stack
        for (int i = 2; i < 120; i++) {
            if (isPrime(i))
                stack.push(i);
        }

        // Displays all the prime numbers less than 120 in decreasing order
        System.out.println(
                "\nAll the prime numbers less than 120 in decreasing order:");
        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();
    }

    /** Return true if n is a prime number */
    public static boolean isPrime(int n) {
        for (int d = 2; d <= n / 2; d++) {
            if (n % d == 0)
                return false;
        }
        return true;

    }

    private static class StackOfIntegers {
        private int[] elements;
        private int size;

        /** Construct a stack with the default capacity 16 */
        public StackOfIntegers() {
            this(16);
        }

        /** Construct a stack with the specified maximum capacity */
        public StackOfIntegers(int capacity) {
            elements = new int[capacity];
        }

        /** Push a new integer into the top of the stack */
        public int push(int value) {
            if (size >= elements.length) {
                int[] temp = new int[elements.length * 2];
                System.arraycopy(elements, 0, temp, 0, elements.length);
                elements = temp;
            }

            return elements[size++] = value;
        }

        /** Return and remove the top element from the stack */
        public int pop() {
            return elements[--size];
        }

        /** Return the top element from the stack */
        public int peek() {
            return elements[size - 1];
        }

        /** Exercise03_21 whether the stack is empty */
        public boolean empty() {
            return size == 0;
        }

        /** Return the number of elements in the stack */
        public int getSize() {
            return size;
        }
    }

}
