import java.util.Scanner;
public class PalindromeCheckerApp {
    public static void main() {

        // Welcome Message
        System.out.println("=======================================");
        System.out.println("     Palindrome Checker Application    ");
        System.out.println("=======================================");

        // Take user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = sc.nextLine();

        // Reverse string
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }

        // Check palindrome
        if (word.equals(reversed)) {
            System.out.println("The word \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("The word \"" + word + "\" is NOT a Palindrome.");
        }

        sc.close();
    }
}