public class Problem_7_1 {

    public static void main(String[] args) {


        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = input.nextInt();

        double[] score = new double[n];
        double best_score = 0;

        System.out.print("Enter " + n + " scores:");

        for (int i = 0; i < n; i++){
            score[i] = input.nextDouble();
            if(score[i] > best_score) best_score = score[i];

        }


        char grade;
        for (int i = 0; i < score.length; i++) {
            if (score[i] >= best_score - 10)
                grade = 'A';
            else if (score[i] >= best_score - 20)
                grade = 'B';
            else if (score[i] >= best_score - 30)
                grade = 'C';
            else if (score[i] >= best_score - 40)
                grade = 'D';
            else
                grade = 'F';

            System.out.println("Student " + i +" score is " + score[i] +" and grade is " + grade);
        }


    }


}
