import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Problem_12_16 {

    public static void main(String[] args) throws Exception {
        // Check command line parameter usage
        if (args.length != 3) {
            System.out.println(
                    "Usage: Java Exercise_12_16 file oldString newString");
            System.exit(1);
        }

        // Check if file exists
        File file = new File(args[0]);
        if (!file.exists()) {
            System.out.println("File " + args[0] + " does not exist");
            System.exit(2);
        }

        // Create Arraylist
        ArrayList<String> list = new ArrayList<>();

        // Read text from file and change oldString to newString
        try (
                // Create input file
                Scanner input = new Scanner(file);
        ) {
            while (input.hasNext()) {
                String s1 = input.nextLine();
                list.add(s1.replaceAll(args[1], args[2]));
            }
        }

        // Save the change into the original file
        try (
                // Create output file
                PrintWriter output = new PrintWriter(file);
        ) {
            for (int i = 0; i < list.size(); i++) {
                output.println(list.get(i));
            }
        }
    }



}
