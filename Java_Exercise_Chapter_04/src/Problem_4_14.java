import java.util.Scanner;

public class Problem_4_14 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a letter grade: ");

        String s = input.nextLine();

        char grade = s.charAt(0);
        grade = Character.toUpperCase(grade);

        switch (grade){
            case 'A':
                System.out.print("The numeric value for " + grade + " is 4");
                break;
            case 'B':
                System.out.print("The numeric value for " + grade + " is 3");
                break;
            case 'C':
                System.out.print("The numeric value for " + grade + " is 2");
                break;
            case 'D':
                System.out.print("The numeric value for " + grade + " is 1");
                break;
            case 'F':
                System.out.print("The numeric value for " + grade + " is 0");
                break;
            default:
                System.out.print(grade +" is an Invalid grade");
        }

    }

}
