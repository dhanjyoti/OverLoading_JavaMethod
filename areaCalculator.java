import java.util.*;

public class AreaCalculator{
    public static double area(double radius){
        double area = radius * radius * Math.PI;
        if(radius < 0){
            return -1.0;
        }
        return area;
    }

    public static double area(double x, double y){
        double area = x * y;
        if(x<0 || y<0){
            return -1.0;
        }
        return area;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        double circleArea = area(radius);

        if(circleArea == -1.0){
            System.out.println("Invalid radius");
        } else {
            System.out.println("Circle area: " + circleArea);
        }
        // System.out.println(circleArea);

        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double rectangleArea = area(x, y);


        if(rectangleArea == -1.0){
            System.out.println("Invalid radius");
        } else {
            System.out.println("Rectangle area: " + rectangleArea);
        }
        // System.out.println(rectangleArea);
    }
}