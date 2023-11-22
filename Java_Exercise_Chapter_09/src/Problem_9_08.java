public class Problem_9_8 {

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();

        fan1.setSpeed(Fan.FAST);
        fan1.setRadius(10);
        fan1.setColor("Yellow");
        fan1.turnOff();

        fan2.setSpeed(Fan.MEDIUM);

        System.out.println("Fan1\n" + fan1.toString());
        System.out.println("Fan2\n" + fan2.toString());
    }

    private static class Fan{
        static  final int SLOW = 1;
        static  final int MEDIUM = 2;
        static final int FAST = 3;
        private int speed = 1;
        private boolean on = false;
        private double radius = 5.0;
        String color = "blue";

        Fan(){

        }

        public void setSpeed(int newSpeed) {
            speed = newSpeed;
        }

        /** Sets fan on */
        public void turnOn() {
            on = true;
        }

        /** Sets fan off */
        public void turnOff() {
            on = false;
        }

        /** Sets color */
        public void setColor(String newColor) {
            color = newColor;
        }

        /** Sets radius */
        public void setRadius(double newRadius) {
            radius = newRadius;
        }

        /** Accessor methods */
        /** Return speed */
        public String getSpeed() {
            String s = "";
            switch (speed) {
                case SLOW: s = "SLOW"; break;
                case MEDIUM: s = "MEDIUM"; break;
                case FAST: s = "FAST";
            }
            return s;
        }

        /** Return on */
        public boolean isOn() {
            return on;
        }

        /** Return radius */
        public double getRadius() {
            return radius;
        }

        /** Return color */
        public String getColor() {
            return color;
        }

        /** Returns a string description for the fan */
        public String toString() {
            if (on == true) {
                return "\nFan speed: " + getSpeed() + ", color: " + color +
                        ", radius: " + radius + "\n";
            }
            else{
                return "\nFan color: " + color + ", radius: " + radius +
                        "\nfan is off\n";
            }
        }


    }

}
