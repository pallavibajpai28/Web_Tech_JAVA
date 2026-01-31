//write a java prog to identify the avgerage of even elements present in an array
import java.util.Scanner;
public class ex6  {
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
        int count = 0;
        for(int i=0; i<arr.length; i++)
        {
            if(i%2==0){
            sum = sum + arr[i];
            count++;
        }
    }
    System.out.println("The Average of Even elements is : "+sum/count);
}}
        
    