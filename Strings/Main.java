import java.util.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        // ─────────────────────────────────────────────────────────────────────
        // 🧠 Question 1: Find the First Non-Repeating Character
        // Write a Java program to find the first non-repeating character in a string.
        // Example: aabbcdde → ans = c
        // ─────────────────────────────────────────────────────────────────────

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter string: ");
        // String str = sc.nextLine();
        // boolean found = false;
        // for (int i = 0; i < str.length(); i++) {
        //     int count = 0;
        //     for (int j = 0; j < str.length(); j++) {
        //         if (str.charAt(i) == str.charAt(j)) {
        //             count++;
        //         }
        //     }
        //     if (count == 1) {
        //         System.out.println("First non-repeating character: " + str.charAt(i));
        //         found = true;
        //         break;
        //     }
        // }
        // if (!found) {
        //     System.out.println("No non-repeating character found.");
        // }


        // ─────────────────────────────────────────────────────────────────────
        // 🧠 Question 2: Check Whether Two Strings are Anagrams
        // Anagrams means both strings contain same characters with same frequency.
        // Example: listen and silent → Anagram
        // ─────────────────────────────────────────────────────────────────────

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter first string: ");
        // String str1 = sc.nextLine();
        // System.out.print("Enter second string: ");
        // String str2 = sc.nextLine();
        // str1 = str1.toLowerCase();
        // str2 = str2.toLowerCase();
        // char arr1[] = str1.toCharArray();
        // char arr2[] = str2.toCharArray();
        // Arrays.sort(arr1);
        // Arrays.sort(arr2);
        // if (Arrays.equals(arr1, arr2)) {
        //     System.out.println("Anagram");
        // } else {
        //     System.out.println("Not Anagram");
        // }


        // ─────────────────────────────────────────────────────────────────────
        // 🧠 Question 3: Reverse Each Word of a String
        // Write a Java program to reverse each word of a sentence individually.
        // Example: Java is awesome → avaJ si emosewa
        // ─────────────────────────────────────────────────────────────────────

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter sentence: ");
        // String str = sc.nextLine();
        // String words[] = str.split(" ");
        // for (String word : words) {
        //     for (int i = word.length() - 1; i >= 0; i--) {
        //         System.out.print(word.charAt(i));
        //     }
        //     System.out.print(" ");
        // }


        // ─────────────────────────────────────────────────────────────────────
        // 🧠 Question 4: Find the Longest Word in a Sentence
        // Write a Java program to find the longest word in a sentence.
        // Example: Java programming language → programming
        // ─────────────────────────────────────────────────────────────────────

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter sentence: ");
        // String str = sc.nextLine();
        // String words[] = str.split(" ");
        // String longest = "";
        // for (String word : words) {
        //     if (word.length() > longest.length()) {
        //         longest = word;
        //     }
        // }
        // System.out.println("Longest word: " + longest);


        // ─────────────────────────────────────────────────────────────────────
        // 🧠 Question 5: Remove Duplicate Characters from String
        // Write a Java program to remove duplicate characters from a string.
        // Example: programming → progamin
        // ─────────────────────────────────────────────────────────────────────

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter string: ");
        // String str = sc.nextLine();
        // String result = "";
        // for (int i = 0; i < str.length(); i++) {
        //     char ch = str.charAt(i);
        //     if (result.indexOf(ch) == -1) {
        //         result = result + ch;
        //     }
        // }
        // System.out.println("After removing duplicates: " + result);


        // ─────────────────────────────────────────────────────────────────────
        // 🧠 Question 6: Count Vowels, Consonants, Digits and Spaces
        // Write a Java program to count vowels, consonants, digits, and spaces in a string.
        // ─────────────────────────────────────────────────────────────────────

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter string: ");
        // String str = sc.nextLine().toLowerCase();
        // int vowels = 0;
        // int consonants = 0;
        // int digits = 0;
        // int spaces = 0;
        // for (int i = 0; i < str.length(); i++) {
        //     char ch = str.charAt(i);
        //     if (ch >= 'a' && ch <= 'z') {
        //         if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
        //             vowels++;
        //         } else {
        //             consonants++;
        //         }
        //     } else if (ch >= '0' && ch <= '9') {
        //         digits++;
        //     } else if (ch == ' ') {
        //         spaces++;
        //     }
        // }
        // System.out.println("Vowels = " + vowels);
        // System.out.println("Consonants = " + consonants);
        // System.out.println("Digits = " + digits);
        // System.out.println("Spaces = " + spaces);


        // ─────────────────────────────────────────────────────────────────────
        // 🧠 Question 7: Check if String is Palindrome
        // Write a Java program to check whether a string is palindrome or not.
        // ─────────────────────────────────────────────────────────────────────

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter string: ");
        // String str = sc.nextLine();
        // String rev = "";
        // for (int i = str.length() - 1; i >= 0; i--) {
        //     rev = rev + str.charAt(i);
        // }
        // if (str.equals(rev)) {
        //     System.out.println("Palindrome");
        // } else {
        //     System.out.println("Not Palindrome");
        // }


        // ─────────────────────────────────────────────────────────────────────
        // 🧠 Question 8: Find Highest Frequency Character
        // Write a Java program to find the character having the highest frequency in a string.
        // ─────────────────────────────────────────────────────────────────────

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter string: ");
        // String str = sc.nextLine();
        // int max = 0;
        // char maxChar = ' ';
        // for (int i = 0; i < str.length(); i++) {
        //     int count = 0;
        //     for (int j = 0; j < str.length(); j++) {
        //         if (str.charAt(i) == str.charAt(j)) {
        //             count++;
        //         }
        //     }
        //     if (count > max) {
        //         max = count;
        //         maxChar = str.charAt(i);
        //     }
        // }
        // System.out.println(maxChar + " -> " + max);


        // ─────────────────────────────────────────────────────────────────────
        // 🧠 Question 9: Toggle Case of Each Character
        // Write a Java program to convert uppercase letters to lowercase
        // and lowercase letters to uppercase.
        // ─────────────────────────────────────────────────────────────────────

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a sentence: ");
        // String str = sc.nextLine();
        // String result = "";  // start with empty string
        // for (int i = 0; i < str.length(); i++) {
        //     char ch = str.charAt(i);
        //     if (Character.isUpperCase(ch)) {
        //         result = result + Character.toLowerCase(ch);
        //     } else if (Character.isLowerCase(ch)) {
        //         result = result + Character.toUpperCase(ch);
        //     } else {
        //         result = result + ch; // keep spaces, digits, symbols unchanged
        //     }
        // }
        // System.out.println("Toggled case: " + result);


        // ─────────────────────────────────────────────────────────────────────
        // 🧠 Question 10: Replace Spaces with Special Character
        // Write a Java program to replace all spaces in a string with @.
        // Example: Java is powerful → Java@is@powerful
        // ─────────────────────────────────────────────────────────────────────

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter sentence: ");
        // String str = sc.nextLine();
        // String result = "";
        // for (int i = 0; i < str.length(); i++) {
        //     char ch = str.charAt(i);
        //     if (ch == ' ') {
        //         result = result + "@";
        //     } else {
        //         result = result + ch;
        //     }
        // }
        // System.out.println(result);


        // ─────────────────────────────────────────────────────────────────────
        // 🧠 Question 11: Check Whether One String is Rotation of Another
        // Write a Java program to check whether one string is rotation of another.
        // Example: ABCD and CDAB → Rotation
        // ─────────────────────────────────────────────────────────────────────

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter first string: ");
        // String str1 = sc.nextLine();
        // System.out.print("Enter second string: ");
        // String str2 = sc.nextLine();
        // String temp = str1 + str1;
        // if (temp.contains(str2)) {
        //     System.out.println("Rotation");
        // } else {
        //     System.out.println("Not Rotation");
        // }


        // ─────────────────────────────────────────────────────────────────────
        // 🧠 Question 12: Print Characters and Their ASCII Values
        // Write a Java program to print each character and its ASCII value.
        // ─────────────────────────────────────────────────────────────────────

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter string: ");
        // String str = sc.nextLine();
        // for (int i = 0; i < str.length(); i++) {
        //     char ch = str.charAt(i);
        //     System.out.println(ch + " -> " + (int) ch);
        // }


        // ─────────────────────────────────────────────────────────────────────
        // 🧠 Question 13: Find Common Characters Between Two Strings
        // Write a Java program to find common characters between two strings.
        // ─────────────────────────────────────────────────────────────────────

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter first string: ");
        // String str1 = sc.nextLine();
        // System.out.print("Enter second string: ");
        // String str2 = sc.nextLine();
        // String printed = "";
        // for (int i = 0; i < str1.length(); i++) {
        //     char ch = str1.charAt(i);
        //     if (str2.indexOf(ch) != -1 && printed.indexOf(ch) == -1) {
        //         System.out.println(ch);
        //         printed = printed + ch;
        //     }
        // }


        // ─────────────────────────────────────────────────────────────────────
        // 🧠 Question 14: String Compression
        // Write a Java program to compress a string by counting consecutive characters.
        // Example: aaabbc → a3b2c1
        // ─────────────────────────────────────────────────────────────────────

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter string: ");
        // String str = sc.nextLine();
        // String result = "";
        // int count = 1;
        // for (int i = 0; i < str.length() - 1; i++) {
        //     if (str.charAt(i) == str.charAt(i + 1)) {
        //         count++;
        //     } else {
        //         result = result + str.charAt(i) + count;
        //         count = 1;
        //     }
        // }
        // result = result + str.charAt(str.length() - 1) + count;
        // System.out.println("Compressed String: " + result);

    }
}
