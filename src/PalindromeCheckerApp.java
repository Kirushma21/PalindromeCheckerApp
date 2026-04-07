// src/PalindromeCheckerApp.java

import java.util.Scanner;

public class PalindromeCheckerApp {

    // Recursive method
    public static boolean isPalindrome(String str, int start, int end) {

        // Base condition
        if (start >= end) {
            return true;
        }

        // Check mismatch
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recursive call
        return isPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=======================================");
        System.out.println("     Palindrome Checker Application    ");
        System.out.println("=======================================");

        // User input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = sc.nextLine();

        // Call recursive function
        boolean result = isPalindrome(word, 0, word.length() - 1);

        // Output
        if (result) {
            System.out.println("The word \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("The word \"" + word + "\" is NOT a Palindrome.");
        }

        sc.close();
    }
}