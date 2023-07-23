public class Problem_6_8 {

    public static void main(String[] args) {

        System.out.println("Celsius         Fahrenheit            |      Fahrenheit     Celsius");
        System.out.println("-----------------------------------------------------------------");

        for (double i = 40 , j = 120; i >= 31 && j >= 30 ; i -= 1, j -= 10) {

            double Fahrenheit = 0;
            double Celsius = 0;

             Fahrenheit += celsiusToFahrenheit(i);
             Celsius += fahrenheitToCelsius(j);
             System.out.printf("%-7f %11.1f %17s %15f %10.2f\n", i, Fahrenheit, '|',j, Celsius);
        }

    }

    public static double celsiusToFahrenheit (double celsius){

        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;

    }

    public static double fahrenheitToCelsius(double fahrenheit){

        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return  celsius;

    }

}
