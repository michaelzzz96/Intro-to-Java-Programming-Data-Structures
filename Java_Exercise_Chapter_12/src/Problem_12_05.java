import java.util.Scanner;


public class Problem_12_05 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a color
        System.out.print("Enter a color: ");
        String color = input.next();

        // Prompt the user to enter whether the triangle is filled
        System.out.print("Is the triangle filled (true / false)? ");
        boolean filled = input.nextBoolean();

        boolean repeatSidesInput = true;
        do {
            // Prompt the user to enter three sides of the triangle
            System.out.print("Enter three side of the triangle: ");
            double side1 = input.nextDouble();
            double side2 = input.nextDouble();
            double side3 = input.nextDouble();

            try {
                // Create triangle object with user input
                Triangle triangle = new Triangle(side1, side2, side3);
                repeatSidesInput = false;

                triangle.setColor(color);
                triangle.setFilled(filled);

                System.out.println(triangle.toString());
                System.out.println("Area: " + triangle.getArea());
                System.out.println("Perimeter: " + triangle.getPerimeter());
                System.out.println("Color: " + triangle.getColor());
                System.out.println("Triangle is" + (triangle.isFilled() ? "" : " not ")
                        + "filled");
            }
            catch (IllegalTriangleException ex) {
                System.out.println(ex.getMessage());
            }

        } while (repeatSidesInput);
    }




        private static class GeometricObject{
            private String color = "white";
            private boolean filled;
            private java.util.Date dateCreated;

            /** Construct a default geometric object */
            public GeometricObject() {
                dateCreated = new java.util.Date();
            }

            /** Construct a geometric object with the specified color
             * and filled value */
            public GeometricObject(String color, boolean filled) {
                dateCreated = new java.util.Date();
                this.color = color;
                this.filled = filled;
            }

            /** Return colot */
            public String getColor() {
                return color;
            }

            /** Set a new color */
            public void setColor(String color) {
                this.color = color;
            }

            /** Return filled. Since filled is boolean,
             its getter method is named isFilled */
            public boolean isFilled() {
                return filled;
            }

            /** Set a new filled */
            public void setFilled(boolean filled) {
                this.filled = filled;
            }

            /** Get dateCreated */
            public java.util.Date getDateCreated() {
                return dateCreated;
            }

            /** Return a string representation of this object */
            @Override
            public String toString() {
                return "created on " + dateCreated + "\ncolor: " + color +
                        " and filled: " + filled;
            }

        }


    private static class Triangle extends GeometricObject {

        private double side1;
        private double side2;
        private double side3;

        /** Construct default Triangle object */
        public Triangle() {
            side1 = side2 = side3 = 1.0;
        }

        /** Construct a triangle with specified side1, side2 and side3 */
        public Triangle(double side1, double side2, double side3)
                throws IllegalTriangleException {
            if (side1 + side2 <= side3 ||
                    side1 + side3 <= side2 ||
                    side2 + side3 <= side1)
                throw new IllegalTriangleException(side1, side2, side3);
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }

        /** Return side1 */
        public double getSide1() {
            return side1;
        }

        /** Return side2 */
        public double getSide2() {
            return side2;
        }

        /** Return side3 */
        public double getSide3() {
            return side3;
        }

        /** Return area of this triangle */
        public double getArea() {
            double s = (side1 + side2 + side3) / 2;
            return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        }

        /** Return perimeter of this triangle */
        public double getPerimeter() {
            return side1 + side2 + side3;
        }

        /** Return a string description for the triangle */
        @Override
        public String toString() {
            return "Triangle: side1 = " + side1 + " side2 = " + side2 +
                    " side3 = " + side3;
        }
    }


    private static class IllegalTriangleException extends Exception {
        private double side1;
        private double side2;
        private double side3;

        /**
         * Construct an IllegalTriangleException
         */
        public IllegalTriangleException(double side1, double side2, double side3) {
            super("Illegal sides " + side1 + " " + side2 + " " + side3);
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }

        /**
         * Return side1
         */
        public double getSide1() {
            return side1;
        }

        /**
         * Return side2
         */
        public double getSide2() {
            return side2;
        }

        /**
         * Return side3
         */
        public double getSide3() {
            return side3;
        }
    }
    }
