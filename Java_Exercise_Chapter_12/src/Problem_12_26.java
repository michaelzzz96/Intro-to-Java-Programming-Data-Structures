import java.io.File;
import java.util.Scanner;

public class Problem_12_26 {


    public static void main(String[] args) {
        String directory = promptStringValue("Enter a directory name: ");
        createDirectory(directory);
    }

    private static void createDirectory(String directory) {
        File file = new File(directory);
        if (file.exists()) {
            System.out.println("Directory already exists");
        } else if (file.mkdir()) {
            System.out.println("Directory created successfully");
        } else {
            System.out.println("The program encountered a problem creating the directory.");
        }
    }

    private static String promptStringValue(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextLine();
    }
}
