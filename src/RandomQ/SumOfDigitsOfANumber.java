package RandomQ;

import java.util.Objects;

public class SumOfDigitsOfANumber {
    public static void main(String[] args) {
        Integer number = 8164795;
        Integer expect = 40;
        Integer sum = sumOfDigits(number);

        if (Objects.equals(sum, expect)) System.out.println("PASSED: "+sum);
        else System.out.println("FAILED: "+sum + ", expect: "+expect);
    }

    private static Integer sumOfDigits(Integer number) {
        Integer sum = 0;
        while (number > 0) {
            Integer reminder = number % 10;
            sum = sum + reminder;
            number = number / 10;
        }
        return sum;
    }
}
