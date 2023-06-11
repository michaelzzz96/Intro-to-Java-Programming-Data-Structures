import java.util.Scanner;


public class Problem_2_18 {

    public static void main(String[] args) {

        float a = 1;
        float b = 2;

        System.out.println("a     b   pow(a,b) ");
        // First row
        System.out.println((int)a + "     " + (int)b + "  " + " " + (int)Math.pow(a, b));
        a++; b++;
        // Second row
        System.out.println((int)a + "     " + (int)b + "  " + " " + (int)Math.pow(a, b));
        a++; b++;
        // Third row
        System.out.println((int)a + "     " + (int)b + "  " + " " + (int)Math.pow(a, b));
        a++; b++;
        // Fourth row
        System.out.println((int)a + "     " + (int)b + "  " + " " + (int)Math.pow(a, b));
        a++; b++;
        // Fifth row
        System.out.println((int)a + "     " + (int)b + "  " + " " + (int)Math.pow(a, b));
        a++; b++;
    }
}
