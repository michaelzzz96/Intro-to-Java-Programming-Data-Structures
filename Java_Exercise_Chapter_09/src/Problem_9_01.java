public class Problem_9_01 {

    public static void main(String[] args) {
        Rectangle obj1 = new Rectangle(4, 40);
        Rectangle obj2 = new Rectangle(3.5, 35.9);

        System.out.println("The height, width, area and perimeter of rectangle one is ");
        System.out.println(obj1.height);
        System.out.println(obj1.width);
        System.out.println(obj1.getArea());
        System.out.println(obj1.getPerimeter());

        System.out.println("");
        System.out.println("The height, width, area and perimeter of rectangle one is ");
        System.out.println(obj2.height);
        System.out.println(obj2.width);
        System.out.println(obj2.getArea());
        System.out.println(obj2.getPerimeter());

    }

    private static class Rectangle{
        double width = 1;
        double height = 1;

        Rectangle(){

        }

        Rectangle(double newWidth, double newHeight){
            width = newWidth;
            height = newHeight;
        }

        double getArea(){
            return width * height;
        }

        double getPerimeter(){
            return  2 * (width + height);
        }
    }

}
