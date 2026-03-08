//* Swapping two numbers using 5 logics

//^ logic 1 : using a third variable (temp).
package SwappingNumbers;

import java.util.*;
public class logic1
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st num: ");
        int a = sc.nextInt();
  
        System.out.println("Enter 2st num: ");
        int b = sc.nextInt();

        System.out.println("Before Swapping:");
        System.out.println("1st num: "+a);
        System.out.println("2nd num: "+b);

        int temp=a;
        a=b;
        b=temp;
       

        System.out.println("After Swapping:");
        System.out.println("1st num: "+a);
        System.out.println("2nd num: "+b);
        

    }
   
    
}



