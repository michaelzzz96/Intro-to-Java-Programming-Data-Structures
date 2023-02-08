public class Problem_1_11 {

    public static void main(String[] args) {
        System.out.println("Population projection");
        System.out.println("Current population: 312032486");
        System.out.println("One birth every 7 seconds.");
        System.out.println("One death every 13 seconds.");
        System.out.println("One new immigrant every 45 seconds.");
        System.out.println("Yearly Population projection formula: ");
        System.out.println("Current population + ((births per year)");
        System.out.println("                   - (deaths per year)");
        System.out.println("                   + (new immigrants per year))");
        System.out.println("                   * year.");


        System.out.println("Year 5 projection: ");
        System.out.println(312032486 + (((31536000 / 7)
                - (31536000 / 13)
                + (31536000 / 45)) * 5));

    }

}
