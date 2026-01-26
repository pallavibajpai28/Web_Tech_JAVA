// Print cross pattern
// *       *
//   *   *
//     *
//   *   *
// *       *
class crossPattern {
    public static void main(String[] args) throws Exception {
        int num = 5; // num of the window pattern
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                if (i == j || i + j == num + 1) { // explaination : i=j is for left diagonal and i+j=num+1 is for right diagonal
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
                Thread.sleep(100); // Adding a small delay for better visualization
            }
            System.out.println();
        }
    }
    
}