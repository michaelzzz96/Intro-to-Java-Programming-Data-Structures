import java.util.Scanner;

public class Problem_4_24 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first city: ");
        String city_one = input.nextLine();

        System.out.print("Enter the second city: ");
        String city_two = input.nextLine();

        System.out.print("Enter the first city: ");
        String city_three = input.nextLine();

        String temp = "";


        if (city_one.compareTo(city_two) > 0) {
            temp = city_two;
            city_two = city_one;
            city_one = temp;

        }
        if (city_two.compareTo(city_three) > 0) {
            temp = city_three;
            city_three = city_two;
            city_two = temp;

        }
        if (city_one.compareTo(city_two) > 0) {
            temp = city_two;
            city_two = city_one;
            city_one = temp;

        }

        System.out.print("The order is: " + city_one + " " + city_two  + " " + city_three);


    }

}
