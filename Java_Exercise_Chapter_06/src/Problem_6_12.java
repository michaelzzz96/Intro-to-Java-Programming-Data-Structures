public class Problem_6_12 {

    public static void main(String[] args) {

        final int NUMBER_OF_CHARS_PER_LINE = 10; // Number of characters per line
        char ch1 = '1';    // Start of range
        char ch2 = 'Z';    // End of range

        System.out.println("\nCharacters per 1 to Z");
        printChars(ch1, ch2, NUMBER_OF_CHARS_PER_LINE);
        System.out.println();
    }

    public static void printChars(char ch1, char ch2, int numberPerLine) {
        int numberOfPrinted = 0;

        while (ch1 <= ch2) {
            System.out.print(ch1 + " ");
            ch1++;
            numberOfPrinted++;
            if (numberOfPrinted % numberPerLine == 0) {
                System.out.println();
            }
        }
    }
}


