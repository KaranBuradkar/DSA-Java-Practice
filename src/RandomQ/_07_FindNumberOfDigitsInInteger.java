package RandomQ;

/**
 * WAP TO COUNT DIGIT IN NUMBER
 * ex: -5738 -> 4
 */
public class _07_FindNumberOfDigitsInInteger {
    public static void main(String[] args) {
        int input = -757649;
        int expected = 6;

        int digits = findNumberOfDigitInInteger(input);
        if (digits == expected) System.out.println("Digits of "+input+" is "+digits);
        else System.out.println("FAILED: "+digits+", EXPECTED: "+expected);
    }

    // JAVA SPECIFIC
    private static int findNumberOfDigitInInteger(Integer number) {
        number = Math.abs(number);
        return number.toString().length();
    }

    // UNIVERSAL
    private static int findNumberOfDigitInInteger(int number) {
        number = Math.abs(number);
        int count = 0;

        while (number > 0) {
            number = number / 10;
            count++;
        }
        return count;
    }
}
