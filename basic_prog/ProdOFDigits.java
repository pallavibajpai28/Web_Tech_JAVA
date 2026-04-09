// WAJP to find out the product of all the digits in the given numbers 
public class ProdOFDigits {
    public static void main(String[] args) {
        int num = 1234;
        int product = 1; // Initialize product to 1
        while (num > 0) {
            int lastDigit = num % 10; // Get the last digit
            product *= lastDigit; // Multiply the last digit to the product
            num /= 10; // Remove the last digit
        }
        System.out.println("Product of digits: " + product);
    }
}
