package Methods;
import java.util.Scanner;
public class Arithmatic {
    public static void main(String[] args) 
{
  System.out.println("Main Started");

  add();
  sub();
  mul();
  div();

  System.out.println("Main Ended");
}

public static void add() 
{
    Scanner s = new Scanner(System.in);

    System.out.println("Addition Operation Starts");

    System.out.println("Enter first number : ");
    int a = s.nextInt();

    System.out.println("Enter second number : ");
    int b = s.nextInt();

    System.out.println("The addition result is : " +(a+b));
}


public static void sub() 
{
     Scanner s = new Scanner(System.in);

     System.out.println("Substraction Operation Starts");

    System.out.println("Enter first number : ");
    int a = s.nextInt();

    System.out.println("Enter second number : ");
    int b = s.nextInt();

    System.out.println("The substraction result is : " +(a-b));
}


public static void mul() 
{
     Scanner s = new Scanner(System.in);

     System.out.println("Multiplication Operation Starts");

    System.out.println("Enter first number : ");
    int a = s.nextInt();

    System.out.println("Enter second number : ");
    int b = s.nextInt();

    System.out.println("The multiplication result is : " +(a*b));
}


public static void div() 
{
     Scanner s = new Scanner(System.in);

     System.out.println("Division Operation Starts");

    System.out.println("Enter first number : ");
    int a = s.nextInt();

    System.out.println("Enter second number : ");
    int b = s.nextInt();

    System.out.println("The division result is : " +(a/b));
}
}


