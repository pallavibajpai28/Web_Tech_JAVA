//Create a method which returns the area of circle and accepts the radius as actual argument.
import java.util.*;
public class AreaOfCircle2 {
    public static double circleArea(double radius) //creating a method so that we can just call it to calculate area everytime
    {
        return 3.14*radius*radius;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius:");
        double a=sc.nextDouble();
        double result = circleArea(a);
        System.out.println("Area of circle is: " + result);
    }
}
