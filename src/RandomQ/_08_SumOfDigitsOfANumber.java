package RandomQ;

import java.util.Objects;

/**
 * WAP TO SUM OF DIGITS OF A NUMBER
 * ex: 8164795 -> 40
 */
public class _08_SumOfDigitsOfANumber {

    public static void main(String[] args) {
        Integer number = 8164795;
        Integer expect = 40;
        Integer sum = sumOfDigits(number);

        if (Objects.equals(sum, expect)) System.out.println("PASSED: "+sum);
        else System.out.println("FAILED: "+sum + ", expect: "+expect);
    }

    private static Integer sumOfDigits(Integer number) {
        number = Math.abs(number);
        Integer sum = 0;
        while (number > 0) {
            Integer reminder = number % 10;
            sum = sum + reminder;
            number = number / 10;
        }
        return sum;
    }
}
