//write a java prog to find sum of elements present in an array object
import java.util.Scanner;
public class ex3  {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the size of the Array : ");
        int size = s.nextInt();
        int[] arr = new int[size];

        //storing elements using for loop 
        System.out.println("Enter "+arr.length+ " Elements in an array");
        for(int i=0; i<arr.length; i++)
        {
         arr[i] = s.nextInt();
        }
        
       
        int sum = 0;
        for(int i=0; i<arr.length; i++)
        {
            sum = sum + arr[i];
        }

         System.out.println("The sum of elements is : "+sum);


    }
}