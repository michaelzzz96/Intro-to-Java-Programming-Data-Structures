import java.util.Scanner;

public class Problem_4_17 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = input.nextInt();
        // Got info from to help with string and int variable from https://stackoverflow.com/questions/19485407/user-input-string-and-integers-in-java
        input.nextLine();


        System.out.print("Enter a month: ");
        String s = input.nextLine();
        char c = s.charAt(0);

        if(c != Character.toUpperCase(c)){
            System.out.print(s + " is not a correct month name");
        }

        switch (s){
            case "Jan":
                System.out.print(s + " " + year + " has 31 days");
                break;
            case "Feb":
                if (year % 4 ==0 && year % 100 != 0 || (year % 400 == 0)){
                    System.out.print(s + " " + year + " has 29 days");
                }
                else{
                    System.out.print(s + " " + year + " has 28 days");
                }
                break;
            case "Mar":
                System.out.print(s + " " + year + " has 31 days");
                break;
            case "Apr":
                System.out.print(s + " " + year + " has 30 days");
                break;
            case "May":
                System.out.print(s + " " + year + " has 31 days");
                break;
            case "Jun":
                System.out.print(s + " " + year + " has 30 days");
                break;
            case "Jul":
                System.out.print(s + " " + year +  " has 31 days");
                break;
            case "Aug":
                System.out.print(s + " " + year + " has 31 days");
                break;
            case "Sep":
                System.out.print(s + " " + year +  " has 30 days");
                break;
            case "Oct":
                System.out.print(s + " " + year +  " has 31 days");
                break;
            case "Nov":
                System.out.print(s + " " + year +  " has 30 days");
                break;
            case "Dec":
                System.out.print(s + " " + year +  " has 31 days");
                break;
        }


    }

}
