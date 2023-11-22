import java.util.Random;

public class Problem_9_6 {

    public static void main(String[] args) {
        // Create a StopWatch object
        StopWatch stopWatch = new StopWatch();

        // create array of 100,000 random numbers
        int[] randomArray = getArray();

        // Invoke the start method in StopWatch class
        stopWatch.start();

        // Sort array
        selectionSort(randomArray);

        // Invoke the stop method in StopWatch class
        stopWatch.stop();

        // Display the execution time
        System.out.println("The execution time of sorting 100,000 " +
                "numbers using selection sort: " + stopWatch.getElapsedTime() +
                " milliseconds");
    }

    /**
     * getArray creates and returns an array of 100,000 random numbers
     */
    public static int[] getArray() {
        // Create an array of length 100,000
        int[] array = new int[100000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100000);
        }
        return array;
    }

    /**
     * selectionSort performs a selection sort on an array
     */
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = array[i];
            int minIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minIndex = j;
                }
            }

            if (i != minIndex) {
                array[minIndex] = array[i];
                array[i] = min;
            }
        }
    }



    private static class StopWatch {
        private long startTime;
        private long endTime;

        StopWatch() {
            startTime = System.currentTimeMillis();
        }

        public void start() {
            startTime = System.currentTimeMillis();
        }

        public void stop() {
            endTime = System.currentTimeMillis();
        }

        public long getStartTime() {
            return startTime;
        }

        // Return end time
        public long getEndTime() {
            return endTime;
        }

        public long getElapsedTime() {
            return getEndTime() - getStartTime();
        }

    }


}
