

public class Problem_4_3 {

    public static void main(String[] args) {

        // Declare constants
        final double CHARLOTTE_LATITUDE = 35.2270896;
        final double CHARLOTTE_LONGITUDE = -80.843127;

        final double SAVANNAH_LATITUDE = 32.0835407;
        final double SAVANNAH_LONGITUDE = -81.0998342;

        final double ORLANDO_LATITUDE = 28.5383355;
        final double ORLANDO_LONGITUDE = -81.3792365;

        final double ATLANTA_LATITUDE = 33.7489954;
        final double ATLANTA_LONGITUDE = -84.3879824;

        final double RADIUS = 6371.01;


        // Global variables
        double CHARLOTTE_Radian_Latitude = Math.toRadians(CHARLOTTE_LATITUDE);
        double CHARLOTTE_Radian_Longitude = Math.toRadians(CHARLOTTE_LONGITUDE);
        double SAVANNAH_Radian_Latitude = Math.toRadians(SAVANNAH_LATITUDE);
        double SAVANNAH_Radian_Longitude = Math.toRadians(SAVANNAH_LONGITUDE);
        double ORLANDO_Radian_Latitude = Math.toRadians(ORLANDO_LATITUDE);
        double ORLANDO_Radian_Longitude = Math.toRadians(ORLANDO_LONGITUDE);
        double ATLANTA_Radian_Latitude = Math.toRadians(ATLANTA_LATITUDE);
        double ATLANTA_Radian_Longitude = Math.toRadians(ATLANTA_LONGITUDE);

        /*
            Compute sides

            (side one) Charlotte --> Savannah

            Convert degree to radians

         */

        // x1
         CHARLOTTE_Radian_Latitude = Math.toRadians(CHARLOTTE_LATITUDE);
        // y1
         CHARLOTTE_Radian_Longitude = Math.toRadians(CHARLOTTE_LONGITUDE);

        // x2
         SAVANNAH_Radian_Latitude = Math.toRadians(SAVANNAH_LATITUDE);
        // y2
         SAVANNAH_Radian_Longitude = Math.toRadians(SAVANNAH_LONGITUDE);

        double distance_Savannah_to_Charlotte = RADIUS * Math.acos(Math.sin(CHARLOTTE_Radian_Latitude) * Math.sin(SAVANNAH_Radian_Latitude)
                + Math.cos(CHARLOTTE_Radian_Latitude) * Math.cos(SAVANNAH_Radian_Latitude)
                * Math.cos(CHARLOTTE_Radian_Longitude - SAVANNAH_Radian_Longitude));

        System.out.println("Charlotte to Savannah is " + distance_Savannah_to_Charlotte + " km");

        /*
            Compute sides

            (side two) Savannah --> Orlando

            Convert degree to radians

         */

        // x1
        SAVANNAH_Radian_Latitude = Math.toRadians(SAVANNAH_LATITUDE);
        // y1
        SAVANNAH_Radian_Longitude = Math.toRadians(SAVANNAH_LONGITUDE);

        // x2
        ORLANDO_Radian_Latitude = Math.toRadians(ORLANDO_LATITUDE);
        // y2
        ORLANDO_Radian_Longitude = Math.toRadians(ORLANDO_LONGITUDE);

        double distance_Savannah_to_Orlando = RADIUS
                * Math.acos(Math.sin(SAVANNAH_Radian_Latitude) * Math.sin(ORLANDO_Radian_Latitude)
                + Math.cos(SAVANNAH_Radian_Latitude)
                * Math.cos(ORLANDO_Radian_Latitude) * Math.cos(SAVANNAH_Radian_Longitude - ORLANDO_Radian_Longitude));



        System.out.println("Savannah to Orlando is " + distance_Savannah_to_Orlando + " km");

         /*
            Compute sides

            (side three) Orlando --> Atlanta

            Convert degree to radians

         */

        // x1
        ORLANDO_Radian_Latitude = Math.toRadians(ORLANDO_LATITUDE);
        // y1
        ORLANDO_Radian_Longitude = Math.toRadians(ORLANDO_LONGITUDE);

        //x2
        ATLANTA_Radian_Latitude = Math.toRadians(ATLANTA_LATITUDE);
        //y2
        ATLANTA_Radian_Longitude = Math.toRadians(ATLANTA_LONGITUDE);

        double distance_Orlando_to_Atlanta = RADIUS *
                Math.acos(Math.sin(ORLANDO_Radian_Latitude) * Math.sin(ATLANTA_Radian_Latitude)
                        + Math.cos(ORLANDO_Radian_Latitude) * Math.cos(ATLANTA_Radian_Latitude)
                * Math.cos(ORLANDO_Radian_Longitude - ATLANTA_Radian_Longitude));

        System.out.println("Orlando to Atlanta is " + distance_Orlando_to_Atlanta + " km");

         /*
            Compute sides

            (side four) Atlanta --> Charlotte

            Convert degree to radians

         */

        //x1
        ATLANTA_Radian_Latitude = Math.toRadians(ATLANTA_LATITUDE);

        //y1
        ATLANTA_Radian_Longitude = Math.toRadians(ATLANTA_LONGITUDE);

        // x2
        CHARLOTTE_Radian_Latitude = Math.toRadians(CHARLOTTE_LATITUDE);
        // y2
        CHARLOTTE_Radian_Longitude = Math.toRadians(CHARLOTTE_LONGITUDE);

        double distance_Atlanta_to_Charlotte = RADIUS
                * Math.acos(Math.sin(ATLANTA_Radian_Latitude) * Math.sin(CHARLOTTE_Radian_Latitude) +
                Math.cos(ATLANTA_Radian_Latitude) * Math.cos(CHARLOTTE_Radian_Latitude)
                * Math.cos(ATLANTA_Radian_Longitude - CHARLOTTE_Radian_Longitude));


        System.out.println("Atlanta to Charlotte is " + distance_Atlanta_to_Charlotte + " km" );

          /*
            Compute sides

            (side five) Charlotte --> Orlando

            Convert degree to radians

         */

        // x1
        CHARLOTTE_Radian_Latitude = Math.toRadians(CHARLOTTE_LATITUDE);
        // y1
        CHARLOTTE_Radian_Longitude = Math.toRadians(CHARLOTTE_LONGITUDE);


        // x2
        ORLANDO_Radian_Latitude = Math.toRadians(ORLANDO_LATITUDE);
        // y2
        ORLANDO_Radian_Longitude = Math.toRadians(ORLANDO_LONGITUDE);

        double distance_Charlotte_to_Orlando = RADIUS
                * Math.acos(Math.sin(CHARLOTTE_Radian_Latitude)
                * Math.sin(ORLANDO_Radian_Latitude) + Math.cos(CHARLOTTE_Radian_Latitude) * Math.cos(ORLANDO_Radian_Latitude)
                * Math.cos(CHARLOTTE_Radian_Longitude - ORLANDO_Radian_Longitude));

        System.out.println("Charlotte to Orlando is " + distance_Charlotte_to_Orlando);


        // Calculate right side
        double right_side = (distance_Savannah_to_Charlotte + distance_Savannah_to_Orlando + distance_Charlotte_to_Orlando) / 2;

        // Calculate area
        double right_area = Math.pow(right_side*(right_side - distance_Savannah_to_Charlotte) * (right_side - distance_Savannah_to_Orlando)
                * (right_side - distance_Charlotte_to_Orlando) ,0.5);

        System.out.println("Area of the right side is " + right_area);


        // Calculate left side
        double left_side = (distance_Atlanta_to_Charlotte + distance_Orlando_to_Atlanta + distance_Charlotte_to_Orlando) / 2;

        // Calculate area
        double left_area = Math.pow(left_side*(left_side - distance_Atlanta_to_Charlotte) * (left_side - distance_Orlando_to_Atlanta)
                * (left_side - distance_Charlotte_to_Orlando) ,0.5);

        System.out.printf("Area of the left side is %10.2f km" , left_area);

        // Get the total area

        double total_area = left_area + right_area;
        System.out.println();
        System.out.printf("The total area of these four cities is %10.2f km" , total_area);

    }
}
