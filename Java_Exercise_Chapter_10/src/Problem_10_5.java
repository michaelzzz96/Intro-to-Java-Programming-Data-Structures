import java.util.Scanner;

public class Problem_10_5 {

    public static void main(String[] args) {
        System.out.print("Enter a positive integer: ");
        int num = new Scanner(System.in).nextInt();

        StackOfIntegers stack = new StackOfIntegers(20);

        int factor = 2;
        while (factor <= num) {
            if (num % factor == 0) {
                stack.push(factor);
                num /= factor;
            } else {
                factor++;
            }
        }
        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
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
