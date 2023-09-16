public class Problem_7_24 {

    public static void main(String[] args) {
        boolean spadesPicked = false;
        boolean heartsPicked= false;
        boolean diamondsPicked= false;
        boolean clubsPicked= false;
        int count = 0;
        while (!(spadesPicked && heartsPicked && diamondsPicked && clubsPicked)) {
            int pickedCard = (int)(Math.random() * 52);
            String suit = getSuit(pickedCard);
            String value = getValue(pickedCard);
            if (suit.equals("Spades") && !spadesPicked) {
                spadesPicked = true;
                System.out.println(value + " of " + suit);
            }
            if (suit.equals("Hearts") && !heartsPicked) {
                heartsPicked = true;
                System.out.println(value + " of " + suit);
            }
            if (suit.equals("Diamonds") && !diamondsPicked) {
                diamondsPicked = true;
                System.out.println(value + " of " + suit);
            }
            if (suit.equals("Clubs") && !clubsPicked) {
                clubsPicked = true;
                System.out.println(value + " of " + suit);
            }
            count++;
        }
        System.out.println("Number of picks: " + count);
    }

    public static String getSuit(int card) {
        int s = card / 13;
        switch (s) {
            case 0:
                return "Spades";
            case 1:
                return "Hearts";
            case 2:
                return "Diamonds";
            case 3:
                return "Clubs";
            default:
                return "Unknown";
        }
    }

    public static String getValue(int card) {
        int v = card % 13;
        switch (v) {
            case 0:
                return "Ace";
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return (v + 1) + "";
            case 10:
                return "Jack";
            case 11:
                return "Queen";
            case 12:
                return "King";
            default:
                return "Unknown";
        }
    }


}
