import java.util.Scanner;
public class PalindromeCheckerApp {
    public static void main() {

        // Welcome Message
        System.out.println("=======================================");
        System.out.println("     Palindrome Checker Application    ");
        System.out.println("=======================================");

        // User input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = sc.nextLine();

        // Convert to char array (UC4)
        char[] arr = word.toCharArray();

        int start = 0;
        int end = arr.length - 1;
        boolean isPalindrome = true;

        // Two-pointer check
        while (start < end) {
            if (arr[start] != arr[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Output result
        if (isPalindrome) {
            System.out.println("The word \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("The word \"" + word + "\" is NOT a Palindrome.");
        }

        sc.close();
    }
}