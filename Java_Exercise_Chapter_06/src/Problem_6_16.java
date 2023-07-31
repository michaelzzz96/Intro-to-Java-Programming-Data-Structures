public class Problem_6_16 {

// Re write to tally it up
    public static void main(String[] args) {

        System.out.printf("%-10s%-10s\n", "Year", "Number of Days");


        for (int i = 2000; i <= 2020; i++) {
            System.out.printf("%-10d%10d\n", i, numberOfDaysInAYear(i));
        }
    }

    public static int numberOfDaysInAYear(int year){

        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        if (isLeapYear == true){
            return 366;
        }
        else{
            return 365;
        }

    }


}
