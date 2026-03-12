//^ logic 4 : using Bitwise XOR Operator
package SwappingNumbers;

public class logic4 {
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

        a = a ^ b; // a now holds the XOR result of original a and b
        b = a ^ b; // b now holds the original value of a
        a = a ^ b; // a now holds the original value of b
       

        System.out.println("After Swapping:");
        System.out.println("1st num: "+a);
        System.out.println("2nd num: "+b);
        

    }
    
}

