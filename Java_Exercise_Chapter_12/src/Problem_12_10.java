public class Problem_12_10 {

    public static void main(String[] args) {
        int length = 1200000000;
        try {
            byte[] array = new byte[length];
        }
        catch (OutOfMemoryError ex) { // Handle OutOfMemoryError
            System.out.println(ex.getMessage());
        }
        // Continue program
        System.out.println("Error handled program continues... ");
    }


}
