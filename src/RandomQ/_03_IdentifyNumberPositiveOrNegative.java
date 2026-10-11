package RandomQ;

/**
 * WAP TO IDENTIFY GIVEN NUMBER IS POSITIVE OR NEGATIVE
 * ( 6, 9, 46 ) -> POSITIVE AND
 * ( -4, -8, -197 ) -> NEGATIVE
 */
public class _03_IdentifyNumberPositiveOrNegative {
    public static void main(String[] args) {
        int number = -8;
        boolean isPositive = isPositive(number);

        if (isPositive) System.out.println("Number is positive");
        else System.out.println("Number is negative");
    }

    private static boolean isPositive(int number) {
        return number >= 0;
    }
}
