import java.util.Scanner;

public class Problem_4_25 {

    public static void main(String[] args) {

        double Random_UpperCase_1 = 'A' + Math.random() * ('Z' - 'A' + 1);
        double Random_UpperCase_2 = 'A' + Math.random() * ('Z' - 'A' + 1);
        double Random_UpperCase_3 = 'A' + Math.random() * ('Z' - 'A' + 1);


        int Random = (int) (Math.random() * 10000);

        System.out.print("The Random licence plate number is: ");
        System.out.print((char)Random_UpperCase_1);
        System.out.print((char)Random_UpperCase_2);
        System.out.print((char)Random_UpperCase_3);
        System.out.print(Random);


    }

}
