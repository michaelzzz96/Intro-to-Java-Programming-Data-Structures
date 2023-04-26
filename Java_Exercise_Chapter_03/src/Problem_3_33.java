import java.util.Scanner;

public class Problem_3_33 {

    public static void main(String[] args) {

        // Call the Scanner class
        Scanner input = new Scanner(System.in);

        // Prompt the user
        System.out.print("Enter weight and price for package 1: ");
        double package1_weight = input.nextDouble();
        double package1_price = input.nextDouble();
        System.out.print("Enter weight and price for package 2: ");
        double package2_weight = input.nextDouble();
        double package2_price = input.nextDouble();

        // Get price between both packages
        double price1 = package1_price / package1_weight;
        double price2 = package2_price / package2_weight;

        // Compare the cost
        if (price1 < price2){
            System.out.print("Package 1 has a better price");
        }
        else if (price1 == price2){
            System.out.print("The packages have the same price.");
        }
        else{
            System.out.print("Package 2 has a better price");
        }


    }

}
