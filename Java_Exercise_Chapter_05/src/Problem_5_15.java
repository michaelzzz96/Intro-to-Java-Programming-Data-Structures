import java.util.Scanner;

public class Problem_5_15 {

    public static void main(String[] args) {

        int counter = 0;
        final int NUMBER_PER_LINE = 10;

       for(int i = 33; i <= 126; i++){
           System.out.print((char)i +  " ");
           counter++;

           if(counter % NUMBER_PER_LINE == 0){
               System.out.println(" ");
           }
       }
    }
}
