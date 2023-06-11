

public class Problem_5_7 {

    // can use break or continue
    public static void main(String[] args) {

        double tuition = 10000;
        double tenth_year = 0;
        double total = 0;

        for(int i = 1; i <= 14; i++){

            tuition += tuition * 0.05;

            if (i == 10){
                tenth_year  += tuition;
            }

            if (i > 10){
                total += tuition;
            }

        }

        System.out.println("In ten year, the tuition will be $" + tenth_year);
        System.out.println("Total cost of four years' tuition after ten years is $" + total);

    }

}
