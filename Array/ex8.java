//write a java prog to identify the number of positive elements and number of negative elements
import java.util.Scanner;
public class ex8  {
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
        int positivecount = 0;
        int negativecount = 0;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]>=0)
            {
            positivecount++;
            }

            else
            {
            negativecount++;
            }
    }
System.out.println("the number of positive elements : "+positivecount);
System.out.println("the number of negative elements : "+negativecount);
}}