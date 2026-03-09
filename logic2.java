//^ logic 2 : using + and - operations


package SwappingNumbers;

import java.util.Scanner;

public class logic2 {
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

        a = a + b; //  a=10, b=20   10+20=30... so a=30
        b = a - b; //  30-20=10 ...so b=10
        a = a - b; //  30-10 ...so a=20
       

        System.out.println("After Swapping:");
        System.out.println("1st num: "+a);
        System.out.println("2nd num: "+b);
        

    }
}

