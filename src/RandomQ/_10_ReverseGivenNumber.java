package RandomQ;

import java.util.Objects;

/**
 * WAP TO REVERSE A GIVEN NUMBER
 * ex: 284 -> 482
 */
public class _10_ReverseGivenNumber {
    public static void main(String[] args) {
        Integer number = 3739;
        Integer expected = 9373;
        Integer reverseNumber = reverseNumber(number);

        if (Objects.equals(reverseNumber, expected)) System.out.println("PASSED: "+number+" -> "+reverseNumber);
        else System.out.println("FAILED: "+reverseNumber+", EXPECTED: "+expected);
    }

    private static Integer reverseNumber(Integer number) {
        int reverse = 0;
        while (number > 0) {
            int rem = number % 10;
            reverse = reverse * 10 + rem;
            number = number / 10;
        }
        return reverse;
    }
}
