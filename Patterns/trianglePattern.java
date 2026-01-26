//Print :
//         *   for num=5   for triangle patterns just make the box, look at coordinates (do add, subs, compare) and find the pattern logic where and where not to print the staers
//       * * *
//     * * * * *
//   * * * * * * *
// * * * * * * * * *
// import java.util.Scanner;
// class trianglePattern {
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);
//         System.out.println("Enter a number : ");
//         int num = s.nextInt();
//         for(int  i = 1; i<=num; i++)
//             {
//             for(int j = 1; j <=num*2-1; j++)
//             {
//         if(i+j >= num+1 && j-i<=num-1)
//             System.out.print("* ");
//         else
//             System.out.print("  ");
//              } 
//             System.out.println();
//             }
//         }
// }


//Print :
// * * * * * * * * * * * for num=6
//   * * * * * * * * *
//     * * * * * * *
//       * * * * *
//         * * *
//           *
import java.util.Scanner;
class trianglePatternDown {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = s.nextInt();
        for(int  i = num; i>=1; i--)
            {
            for(int j = 1; j <=num*2-1; j++)
            {
        if(i+j >= num+1 && j-i<=num-1)
            System.out.print("* ");
        else
            System.out.print("  ");
             } 
            System.out.println();
            }
        }
}