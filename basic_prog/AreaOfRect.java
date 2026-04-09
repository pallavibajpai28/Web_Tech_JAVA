//WAJP to create a method which returns area of a rectangle and accepts lenght and breadth of a rectangle as actual arguments
import java.util.Scanner;
public class AreaOfRect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of rectangle: ");
        double length = sc.nextDouble();
        System.out.print("Enter breadth of rectangle: ");
        double breadth = sc.nextDouble();
        double area = getArea(length, breadth);
        System.out.println("Area of rectangle is: " + area);  
    }
    public static double getArea(double length, double breadth) {
        return length * breadth;
    }
}
