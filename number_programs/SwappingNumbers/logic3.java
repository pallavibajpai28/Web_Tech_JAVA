//^ logic 3 : using * and / operations 
package SwappingNumbers;

import java.util.Scanner;

public class logic3 {
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

        a = a * b; //  a=5, b=10   5*10... so a=50
        b = a / b; //  50/10=5 ...so b=5
        a = a / b; //  50/5 ...so a=10
       

        System.out.println("After Swapping:");
        System.out.println("1st num: "+a);
        System.out.println("2nd num: "+b);
        

    }
}
