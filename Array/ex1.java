//Code for accessing the elements using for loop

public class ex1 {
    public static void main(String[] args) {
        
        int[] arr = new int[7];

        arr[0] = 10;
        arr[1] = 24;
        arr[2] = 29;
        arr[3] = 37;
        arr[4] = 50;
        arr[5] = 69;
        arr[6] = 74;

        System.out.println(arr);
        System.out.println("Lenght of array is :" +arr.length);

        //Accessing the elements using for loop

        for(int i=0; i<arr.length; i++)
        {
            System.out.println(arr[i]);
        }

    }
}

