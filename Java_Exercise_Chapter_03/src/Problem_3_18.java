import java.util.Scanner;

public class Problem_3_18 {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Prompt the user
        System.out.print("Enter the weight of the package: ");
        double weight = input.nextDouble();

        if (weight < 0){
            System.out.print("Invalid input");
        }
        else if (weight <= 1){
            weight = weight * 3.5;
            System.out.print("The shipping cost is $ " + weight);
        }
        else if (weight <= 3){
            weight = weight * 5.5;
            System.out.print("The shipping cost is $ " + weight);
        }
        else if (weight <= 10){
            weight = weight * 8.5;
            System.out.print("The shipping cost is $ " + weight);
        }
        else if (weight <= 20){
            weight = weight * 10.5;
            System.out.print("The shipping cost is $ " +weight);
        }
        else{
            System.out.print("The package cannot be shipped.");
        }
    }


}
