package thedailybyte;

/**
 * This question is asked by Facebook. Given a string, return whether or not it forms a palindrome ignoring case and non-alphabetical characters.
 * Note: a palindrome is a sequence of characters that reads the same forwards and backwards.
 *
 * Ex: Given the following strings...
 *
 * "level", return true
 * "algorithm", return false
 * "A man, a plan, a canal: Panama.", return true
 *
 * **/
public class Palindrome {
    public static void main(String[] args) {
        String str = "a man a plan a canal panama";
        System.out.println(isPalindrome(str));

    }

    public static boolean isPalindrome(String str) {
        str = str.replace(" ", "");
        boolean result = true;
        System.out.println(str);
        for (int i =0; i< str.length()/2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                result = false;
                break;
            }
        }
        return result;

    }
}
