import java.util.Random;
import java.util.Scanner;


public class Problem_11_1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        // Prompt the user to enter three sides of the triangle
        System.out.print("Enter three side of the triangle: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        // Prompt the user to enter a color
        System.out.print("Enter a color: ");
        String color = input.next();

        // Prompt the user to enter whether the triangle is filled
        System.out.print("Is the triangle filled (true / false)? ");
        boolean filled = input.nextBoolean();

        // Create triangle object with user input
        Triangle triangle = new Triangle(side1, side2, side3);
        triangle.setColor(color);
        triangle.setFilled(filled);

        System.out.println(triangle.toString());
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());
        System.out.println("Color: " + triangle.getColor());
        System.out.println("Triangle is" + (triangle.isFilled() ? "" : " not ")
                + "filled");

    }

    private static class GeometricObject{
        private String color = "white";
        private boolean filled;
        private java.util.Date dateCreated;

        public GeometricObject(){
            dateCreated = new java.util.Date();
        }

        public GeometricObject(String color, boolean filled){
            dateCreated = new java.util.Date();
            this.color = color;
            this.filled = filled;
        }

        public String getColor(){
            return  color;
        }

        public void setColor(String color){
            this.color = color;
        }

        public boolean isFilled(){
            return  filled;
        }

        public void setFilled(boolean filled){
            this.filled = filled;
        }

        public java.util.Date getDateCreated(){
            return dateCreated;
        }

        public String toString(){
            return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
        }

    }

    private static class Triangle extends GeometricObject{
        private double side1 = 1.0;
        private double side2 = 1.0;
        private double side3 = 1.0;


        public Triangle(){
            side1 = side2 = side3 = 1.0;
        }

        public Triangle(double side1, double side2, double side3){
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }

        public double getSide1() {
            return side1;
        }

        public double getSide2() {
            return side2;
        }

        public double getSide3() {
            return side3;
        }

        public double getArea() {
            double s = (side1 + side2 + side3) / 2;
            return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        }

        public double getPerimeter() {
            return side1 + side2 + side3;
        }


        public String toString() {
            return "Triangle: side1 = " + side1 + " side2 = " + side2 +
                    " side3 = " + side3;
        }
    }

}
