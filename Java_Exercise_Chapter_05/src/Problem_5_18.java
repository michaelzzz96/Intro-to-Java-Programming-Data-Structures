public class Problem_5_18 {

    public static void main(String[] args) {

        System.out.println("");

        System.out.print("Pattern A");
        System.out.println("");

        for(int i = 1; i <= 6; i++){

            for(int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println(" ");
        }

        System.out.println(" ");

        System.out.print("Pattern B\n");
        System.out.println(" ");

        for(int i = 6; i >= 1; i--){

            for(int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println(" ");
        }

        System.out.println(" ");

        System.out.print("Pattern C");
        System.out.println("\n");

        for(int i = 1; i <= 6; i++){

            for (int j = 1; j <= (6 - i); j++) {
                System.out.print("  ");
            }

            for(int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println(" ");
        }

        System.out.println(" ");

        System.out.print("Pattern D\n");

        for(int i = 6; i >= 1; i--){

            for (int j = 1; j <= (6 - i); j++) {
                System.out.print("  ");
            }

            for(int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println(" ");
        }

    }


}
