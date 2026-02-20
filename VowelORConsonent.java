import java.util.Scanner;
class VowelORConsonent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a single alphabet character: ");
        char ch = sc.next().charAt(0);

        switch (ch) {
            case 'a', 'e', 'i', 'o', 'u',
                 'A', 'E', 'I', 'O', 'U':    
                 {
                    System.out.println(ch + " is a Vowel.");
                    break;
                 }
            default :
            {
                 System.out.println(ch + " is a Consonant.");
            }
        }

        
    }
}
