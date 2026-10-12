package RandomQ;

/**
 * WAP TO IDENTIFY A GIVEN NUMBER IS A STRONG NUMBER OR NOT
 * EX: 145 => 1! + 4! + 5!
 */
public class _13_IdentifyStrongNumber {

    public static void main(String[] args) {

        // STRONG NUMBER OR NOT
        int number = 125;
        boolean isStrong = isStrongNumber(number);

        if(isStrong) System.out.println("PASSED: "+number +" is a STRONG NUMBER");
        else System.out.println("FAILED: "+number +" is not a STRONG NUMBER");
    }

    private static boolean isStrongNumber(int originalNumber) {
        int number = originalNumber;
        int total = 0;

        while (number != 0) {
            int rem = number % 10;
            total += factorial(rem);
            number = number / 10;
        }

        return originalNumber == total;
    }

    private static int factorial(int digit) {
        if (digit == 1 || digit == 0) return 1;
        return digit * factorial(digit - 1);
    }
}