import java.util.Scanner;

public class Problem_10_15 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Create 5 x 2 matrix
        double[][] points = new double[5][2];

        // Prompt the user to enter five points
        System.out.print("\nEnter five points: ");
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[i].length; j++) {
                points[i][j] = input.nextDouble();
            }
        }

        MyRectangle2D r1 = MyRectangle2D.getRectangle(points);

        System.out.println("The bounding rectangle's center (" + r1.getX() + ", " +
                r1.getY() + "), width " + r1.getWidth() + ", height " + r1.getHeight());
    }

    // Implement MyRectangle2D class
    private static class MyRectangle2D {
        // Data fields
        private double x;
        private double y;
        private double width;
        private double height;

        // Constructors

        /**
         * Creates a default rectangle with (0, 0)
         * for (x, y) and 1 for both width and height
         */
        MyRectangle2D() {
            this(0, 0, 1, 1);
        }

        /**
         * Creates a rectangle with the specified x, y, width, and height
         */
        MyRectangle2D(double x, double y, double width, double height) {
            this.x = x;
            this.y = y;
            this.width = width;
            this.height = height;
        }

        // Methods

        /**
         * Returns a bounding rectangle for a set
         * of points in a two-dimensional plane
         */
        public static MyRectangle2D getRectangle(double[][] points) {
            final int COLUMN_X = 0;
            final int COLUMN_Y = 1;
            double[] minMaxX = minMax(points, COLUMN_X);
            double[] minMaxY = minMax(points, COLUMN_Y);
            double x = (minMaxX[1] + minMaxX[0]) / 2;
            double y = (minMaxY[1] + minMaxY[0]) / 2;
            double height = Math.sqrt(Math.pow(minMaxY[1] - minMaxY[0], 2));
            ;
            double width = Math.sqrt(Math.pow(minMaxX[1] - minMaxX[0], 2));
            return new MyRectangle2D(x, y, width, height);
        }

        private static double[] minMax(double[][] points, int col) {
            double[] minMax = new double[2];
            minMax[0] = minMax[1] = points[0][col];
            for (int i = 0; i < points.length; i++) {
                if (points[i][col] < minMax[0])
                    minMax[0] = points[i][col];
                if (points[i][col] > minMax[1])
                    minMax[0] = points[i][col];
            }
            return minMax;
        }

        /**
         * Set x to specified point
         */
        public void setX(double x) {
            this.x = x;
        }

        /**
         * Set y to specified point
         */
        public void setY(double y) {
            this.x = y;
        }

        /**
         * Return x
         */
        public double getX() {
            return x;
        }

        /**
         * Return y
         */
        public double getY() {
            return y;
        }

        /**
         * Set width to specified length
         */
        public void setWidth(double width) {
            this.width = width;
        }

        /**
         * Set heigth to specified length
         */
        public void setHeight(double height) {
            this.height = height;
        }

        /**
         * Return height
         */
        public double getHeight() {
            return height;
        }

        /**
         * Return width
         */
        public double getWidth() {
            return width;
        }

        /**
         * Returns the area of the rectangle
         */
        public double getArea() {
            return width * height;
        }

        /**
         * Returns the perimeter of the rectangle
         */
        public double getPerimeter() {
            return 2 * (width + height);
        }

        /**
         * Returns true if the specified point(x, y)
         * is inside the rectangle
         */
        public boolean contains(double x, double y) {
            return getDistance(this.y, y) <= height / 2 &&
                    getDistance(this.x, x) <= width / 2;
        }

        /**
         * Returns true if the specified
         * rectangle is inside this rectangle
         */
        public boolean contains(MyRectangle2D r) {
            return
                    getDistance(y, r.getY()) + r.getHeight() / 2 <= height / 2 &&
                            getDistance(x, r.getX()) + r.getWidth() / 2 <= width / 2 &&
                            height / 2 + r.getHeight() / 2 <= height &&
                            width / 2 + r.getWidth() / 2 <= width;
        }

        /**
         * Returns true if the specified rectangle
         * overlaps with this rectangle
         */
        public boolean overlaps(MyRectangle2D r) {
            return !contains(r) &&
                    ((x + width / 2 > r.getX() - r.getWidth()) ||
                            (y + height / 2 > r.getY() - r.getHeight())) &&
                    (getDistance(y, r.getY()) < height / 2 + r.getHeight() / 2) &&
                    (getDistance(x, r.getX()) < width / 2 + r.getWidth() / 2);
        }

        /**
         * Return distance
         */
        private double getDistance(double p1, double p2) {
            return Math.sqrt(Math.pow(p2 - p1, 2));
        }
    }
}
