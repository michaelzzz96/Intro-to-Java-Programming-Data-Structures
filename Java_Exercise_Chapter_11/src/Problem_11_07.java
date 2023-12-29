import java.util.ArrayList;
import java.util.Collections;

public class Problem_11_7 {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }
        System.out.println(numbers);
        shuffle(numbers);
        System.out.println(numbers);

    }

    public static void shuffle(ArrayList<Integer> list) {
        Collections.shuffle(list);
    }

}
