// Print window pattern
// * * * * *
// *   *   *
// * * * * *
// *   *   *
// * * * * *

public class window {
    public static void main(String[] args) {
        int num = 5; // num of the window pattern
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                if (i == 1 || i == num || j == 1 || j == num || i == num/2 + 1 || j == num/2 + 1) { // conditions to print *
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    
}
