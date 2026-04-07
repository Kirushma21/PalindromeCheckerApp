import java.util.Scanner;
import java.util.Stack;
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

        // Stack logic (UC5)
        Stack<Character> stack = new Stack<>();

        // Push all characters into stack
        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }

        // Pop and build reversed string
        String reversed = "";
        while (!stack.isEmpty()) {
            reversed += stack.pop();
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