public class Problem_9_9 {

    public static void main(String[] args) {
// Create three RegularPolygon objects
        RegularPolygon regularPolygon1 = new RegularPolygon();
        RegularPolygon regularPolygon2 = new RegularPolygon(6, 4);
        RegularPolygon regularPolygon3 = new RegularPolygon(10, 4, 5.6, 7.8);

        // Display perimeter and area of each object
        System.out.println("\n--------------------------------------------------");
        System.out.println("| Regular Polygon Objects |  Perimeter  |  Area  |");
        System.out.println("--------------------------------------------------");
        System.out.printf( "|       Object# 1         |%8.2f     |%6.2f  |\n",
                regularPolygon1.getPerimeter(), regularPolygon1.getArea());
        System.out.printf( "|       Object# 2         |%8.2f     |%6.2f  |\n",
                regularPolygon2.getPerimeter(), regularPolygon2.getArea());
        System.out.printf( "|       Object# 3         |%8.2f     |%6.2f  |\n",
                regularPolygon3.getPerimeter(), regularPolygon3.getArea());
        System.out.println("--------------------------------------------------");

    }

    private static  class RegularPolygon{
        private int mNumberOfSides;
        private double mSideLength;
        private double mCenterX;
        private double mCenterY;

        public RegularPolygon() {
            mNumberOfSides = 3;
            mSideLength = 1;
            mCenterX = 0;
            mCenterY = 0;

        }

        public RegularPolygon(int numberOfSides, double sideLength) {
            this();
            mSideLength = sideLength;
            mNumberOfSides = numberOfSides;

        }

        public RegularPolygon(int numberOfSides, double sideLength, double x, double y) {
            this(numberOfSides, sideLength);
            mCenterX = x;
            mCenterY = y;
        }

        public int getNumberOfSides() {
            return mNumberOfSides;
        }

        public void setNumberOfSides(int numberOfSides) {
            mNumberOfSides = numberOfSides;
        }

        public double getSideLength() {
            return mSideLength;
        }

        public void setSideLength(double sideLength) {
            mSideLength = sideLength;
        }

        public double getCenterY() {
            return mCenterY;
        }

        public void setCenterY(double centerY) {
            mCenterY = centerY;
        }

        public double getCenterX() {
            return mCenterX;
        }

        public void setCenterX(double centerX) {
            mCenterX = centerX;
        }

        public double getPerimeter(){

            return mNumberOfSides * mSideLength;
        }

        public double getArea() {

            return (mNumberOfSides * mSideLength * mSideLength) / (4.0 * Math.tan(Math.PI / mNumberOfSides));
        }



    }


}
