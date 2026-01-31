//Accessing the elements using for loop

public class ex1 {
    public static void main(String[] args) {
        
        int[] arr = new int[7];

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 25;
        arr[3] = 33;
        arr[4] = 50;
        arr[5] = 64;
        arr[6] = 79;

        System.out.println(arr);
        System.out.println("Jenght of array is :" +arr.length);

        //Accessing the elements using for loop

        for(int i=0; i<arr.length; i++)
        {
            System.out.println(arr[i]);
        }

    }
}
