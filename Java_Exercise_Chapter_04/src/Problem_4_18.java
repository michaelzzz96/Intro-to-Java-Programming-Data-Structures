import  java.util.Scanner;

public class Problem_4_18 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter two characters: ");
        String characters = input.nextLine();

        // Find the characters
        char character_1 = characters.charAt(0);
        char character_2 = characters.charAt(1);

        if (character_1 == Character.toUpperCase(character_1) && (Character.isDigit(character_2))) {

            // Math students
            if (character_1 == 'M') {
                if (Character.isDigit(character_2)) {
                    if (character_2 == '1') {
                        System.out.print("Math Freshman");
                    }
                    else if (character_2 == '2') {
                        System.out.print("Math Sophomore");
                    }
                    else if (character_2 == '3') {
                        System.out.print("Math Junior");
                    }
                    else if (character_2 == '4') {
                        System.out.print("Math Senior");
                    }
                    else{
                        System.out.print("Invalid Input");
                    }
                }
            }

            // Computer Science
            else if (character_1 == 'C') {
                if (Character.isDigit(character_2)) {
                    if (character_2 == '1') {
                        System.out.print("Computer Science Freshman");
                    }
                    else if (character_2 == '2') {
                        System.out.print("Computer Science Sophomore");
                    }
                    else if (character_2 == '3') {
                        System.out.print("Computer Science Junior");
                    }
                    else if (character_2 == '4') {
                        System.out.print("Computer Science Senior");
                    }
                    else{
                        System.out.print("Invalid Input");
                    }
                }
            }

            // Information Technology
            else if (character_1 == 'I') {
                if (Character.isDigit(character_2)) {
                    if (character_2 == '1') {
                        System.out.print("Information Technology Freshman");
                    }
                    else if (character_2 == '2') {
                        System.out.print("Information Technology Sophomore");
                    }
                    else if (character_2 == '3') {
                        System.out.print("Information Technology Junior");
                    }
                    else if (character_2 == '4') {
                        System.out.print("Information Technology Senior");
                    }
                    else{
                        System.out.print("Invalid Input");
                    }
                }
            } else {
                System.out.print("Invalid input");
            }

        }
        else{
            System.out.print("Invalid Input");
        }
    }
}


