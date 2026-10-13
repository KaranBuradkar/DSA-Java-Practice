package RandomQ;

/**
 * WAP TO CHECK A NUMBER IS PALINDROME OR NOT
 * EX: 121 -> Palindrome
 * 123 -> Not Palindrome
 */
public class _19_PalindromeOrNot {

    public static void main(String[] args) {
        int number = 1758875721;
        boolean expected = false;

        boolean status = isPalindrome(number);

        if (expected == status) {
            System.out.print("PASSED: ");
        }
        else System.out.print("FAILED: ");

        if (status) System.out.println(number+" is a Palindrome");
        else System.out.println(number+" is not a Palindrome");
    }

    private static boolean isPalindrome(int originalNumber) {
        int number = originalNumber;
        int reverse = 0;
        while (number != 0) {
            int rem = number % 10;
            reverse = reverse * 10 + rem;
            number = number / 10;
        }
        return reverse == originalNumber;
    }
}
