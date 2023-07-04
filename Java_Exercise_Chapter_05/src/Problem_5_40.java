public class Problem_5_40 {

    public static void main(String[] args) {

        int heads_count = 0;
        int tails_count = 0;
        int Choice = 0;

        for(int i = 0; i < 1000000; i++){
            Choice = (int) (Math.random() * 2);

            if (Choice == 0){
                heads_count++;
            }
            else{
                tails_count++;
            }
        }

        // Display results
        System.out.println("The number of heads is " + heads_count);
        System.out.println("The number of tails is " + tails_count);

    }

}
