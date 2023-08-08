public class Problem_6_24 {

    public static void main(String[] args) {
        // Obtain the total milliseconds since midnight, Jan 1, 1970
        long totalMilliseconds = System.currentTimeMillis();

        // Obtain the total seconds since midnight, Jan 1, 1970
        long totalSeconds = totalMilliseconds / 1000;

        // Compute the current second in the minute in the hour
        long currentSecond = totalSeconds % 60;
        // Obtain the total minutes
        long totalMinutes = totalSeconds / 60;

        // Compute the current minute in the hour
        long currentMinute = totalMinutes % 60;

        // Obtain the total hours
        long totalHours = totalMinutes / 60;

        // Compute the current hour
        long currentHour = totalHours % 24;

        // Obtain the total days
        long totalDays = totalHours / 24;


        // current year
        int currentYear = (int)(totalDays / 365) + 1970;


        long daysInCurrentYear = (totalDays - numberOfLeapYearsSince1970(currentYear)) % 365;
        if (currentHour > 0) daysInCurrentYear++; // add today

        // get current month number
        int currentMonthNum = getMonthFromDays(currentYear, (int) daysInCurrentYear);

        // getting current month name
        String month = getMonthName(currentMonthNum);

        // getting day of current month
        int daysTillCurrentMonth = getNumOfDaysToReachThatMonth(currentYear, currentMonthNum);

        int startDay = getStartDay(currentYear, currentMonthNum);
        int today = (int) daysInCurrentYear - daysTillCurrentMonth;
        String dayOfWeek = getDayName( ((startDay + today) % 7));

        // Display results
        System.out.println("Today is " + dayOfWeek + " " + month + " " + today +", " + currentYear);
        System.out.println("Current time is " + currentHour + ":"
                + currentMinute + ":" + currentSecond + " GMT");
    }

    public static int numberOfLeapYearsSince1970(long year) {

        int count = 0;
        for (int i = 1970; i <= year; i++) {
            if (isLeapYear(i))count++;
        }
        return count;
    }


    public static int getMonthFromDays(int year, int days) {
        int dayTracker = 0;
        for (int i = 1; i <= 12; i++) {

            dayTracker += getNumberOfDaysInMonth(year, i);

            if (dayTracker > days) return i;
        }
        return 12;
    }

    public static int getNumOfDaysToReachThatMonth(int year, int month) {
        int dayTracker = 0;
        for (int i = 1; i < month; i++) {

            dayTracker += getNumberOfDaysInMonth(year, i);


        }
        return dayTracker;
    }


    public static String getDayName(int day) {
        String dayName;
        switch (day){
            case 0:
                dayName = "Sunday";
                break;
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            default:
                dayName = "Unknown";
        }
        return dayName;
    }

    public static int getStartDay(int year, int month){
        final int START_DAY_FOR_JAN_1_1800 = 3;

        int totalNumberOfDays = getTotalNumberOfDays(year, month);

        return (totalNumberOfDays + START_DAY_FOR_JAN_1_1800) % 7;
    }

    public static int getTotalNumberOfDays(int year, int month){
        int total = 0;

        for (int i = 1800; i < year; i++)
            if (isLeapYear(i))
                total = total + 366;
            else
                total = total + 365;

        for (int i = 1; i < month; i++)
            total = total + getTotalNumberOfDays(year, i);

        return total;
    }

    public static int getNumberOfDaysInMonth(int year, int month){
        if (month == 1 || month == 3 || month == 5 || month == 7 ||
                month == 8 || month == 10 || month == 12)
            return 31;

        if (month == 4 || month == 6 || month == 9 || month == 11)
            return 30;

        if(month == 2 )
            return isLeapYear(year) ? 29 : 28;

        return 0;
    }

    public static boolean isLeapYear(int year){

        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }

    public static String getMonthName(int month) {
        String monthName = "";
        switch (month) {
            case 1: monthName = "January"; break;
            case 2: monthName = "February"; break;
            case 3: monthName = "March"; break;
            case 4: monthName = "April"; break;
            case 5: monthName = "May"; break;
            case 6: monthName = "June"; break;
            case 7: monthName = "July"; break;
            case 8: monthName = "August"; break;
            case 9: monthName = "September"; break;
            case 10: monthName = "October"; break;
            case 11: monthName = "November"; break;
            case 12: monthName = "December";
        }

        return monthName;
    }

}
