package RandomQ;

/**
 * WAP TO IDENTIFY A GIVEN NUMBER IS A PERFECT NUMBER OR NOT
 * concept: sum of factors of 6 = 1 + 2 + 3 = 6
 */
public class _14_IdentifyPerfectNumber {
    public static void main(String[] args) {
        int number = 6;
        boolean isPerfect = isPerfectNumber(number);

        if(isPerfect) System.out.println("PASSED: "+number +" is a PERFECT NUMBER");
        else System.out.println("FAILED: "+number +" is not a PERFECT NUMBER");
    }

    private static boolean isPerfectNumber(int originalNumber) {
        int total = 0;
        for (int i = 1; i < originalNumber; i++) {
            if (originalNumber % i == 0) {
                total += i;
            }
        }
        return total == originalNumber;
    }
}
