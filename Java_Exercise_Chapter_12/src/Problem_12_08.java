import java.util.Scanner;

public class Problem_12_08 {

    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a hex number: ");
        String hex = input.nextLine();

        try {
            System.out.println("The decimal value for hex number "
                    + hex + " is " + hexToDecimal(hex.toUpperCase()));
        }
        catch (HexFormatException ex) {
            System.out.println(ex.getMessage());
        }
    }

    /** Converts a hex string into a decimal number and throws a
     * HexFormatException if the string is not a hex string */
    public static int hexToDecimal(String hex) throws HexFormatException {
        int decimalValue = 0;
        for (int i = 0; i < hex.length(); i++) {
            if (!((hex.charAt(i) >= '0' && hex.charAt(i) <= '9') ||
                    (hex.charAt(i) >= 'A' && hex.charAt(i) <= 'F')))
                throw new HexFormatException(hex);
            char hexChar = hex.charAt(i);
            decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
        }

        return decimalValue;
    }

    public static int hexCharToDecimal(char ch) {
        if (ch >= 'A' && ch <= 'F')
            return 10 + ch - 'A';
        else // ch is '0', '1', ..., or '9'
            return ch - '0';
    }

    public static class HexFormatException extends NumberFormatException {
        private String hex; // Hex exception value

        /** Construct a HexFormatException object */
        public HexFormatException(String hex) {
            super(hex + " is not a hex string");
            this.hex = hex;
        }

        /** Return hex exception value */
        public String getHex() {
            return hex;
        }
    }


}
