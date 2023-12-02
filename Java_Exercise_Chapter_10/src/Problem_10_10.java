public class Problem_10_10 {

    public static void main(String[] args) {
//Implement the class with the initial array size set to 8.
        Queue queue = new Queue();

        //adds 20 numbers from 1 to 20 into the queue
        for (int i = 1; i <= 20; i++) {
            queue.enqueue(i);
        }

        //removes these numbers and displays them.
        while (queue.getSize() > 0) {
            System.out.println(queue.dequeue());
        }
    }

    private static class Queue{
        private int[] elements;
        private int size;
        private int capacity;

        public Queue(int capacity) {
            this.capacity = capacity;
            elements = new int[capacity];
        }

        public Queue() {
            this(8);
        }

        public void enqueue(int v) {
            if (size >= elements.length) {
                int[] temp = new int[size * 2];
                System.arraycopy(elements, 0, temp, 0, size);
                elements = temp;
            }
            elements[size++] = v;

        }

        public int dequeue() {
            int v = elements[0];
            size--;
            for (int i = 0; i < size; i++) {
                elements[i] = elements[i + 1];
            }
            return v;
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public int getSize() {
            return size;
        }

        public int getCapacity() {
            return capacity;
        }
    }

}
