import java.util.Scanner;

public class Problem_5_9 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double max_score = 0;
        String max_name = "";

        double second_max_score = 0;
        String second_max_name = "";

        System.out.print("Enter the number of students: ");
        int number_students = input.nextInt();

        for (int i = 0; i < number_students; i++){
            System.out.print("Enter Student(s) " + (i + 1) +  " name and score: ");
            String name = input.next();
            double score = input.nextDouble();

            if (score > max_score){
                max_score = score;
                max_name = name;
            }
            else if (score > second_max_score){
                second_max_score = score;
                second_max_name = name;
            }
        }
        System.out.println("The student with the highest score is  " + max_name);
        System.out.println("The highest score is  " + max_score);
        System.out.println("The student with the second highest score is  " + second_max_name);
        System.out.println("The second highest score is  " + second_max_score);
    }
}
