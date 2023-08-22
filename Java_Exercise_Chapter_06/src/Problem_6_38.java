public class Problem_6_38 {

    public static char getRandomCharacter(char ch1, char ch2){
        return (char)(ch1 + Math.random() * (ch2 -ch1 + 1));
    }

    public static char getRandomLowerCaseLetter(){
        return getRandomCharacter('a', 'z');
    }
    public static char getRandomUpperCaseLetter(){
        return getRandomCharacter('A', 'Z');
    }

    public static char getRandomDigitCharacter(){
        return getRandomCharacter('0', '9');
    }
    public static int getRandomInteger(){return ((int) (Math.random() * 9));}

    public static char getRandomCharacter(){return getRandomCharacter('\u0000', '\uFFFF');}

    public static void main(String[] args) {
        final int NUMBER_OF_CHARS = 100;
        final int CHARS_PER_LINE = 50;

        for (int i = 0; i < NUMBER_OF_CHARS; i++){
            char ch = Problem_6_38.getRandomUpperCaseLetter();

            if ((i + 1) % CHARS_PER_LINE == 0) {
                System.out.println(ch);
            }
            else
                System.out.print(ch);
        }

        for (int i = 0; i < NUMBER_OF_CHARS; i++){
            int random = Problem_6_38.getRandomInteger();

            if ((i + 1) % CHARS_PER_LINE == 0) {
                System.out.println(random);
            }
            else
                System.out.print(random);

        }

    }

}
