package RandomQ;

public class IdentifyNumberPositiveOrNegative {
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
