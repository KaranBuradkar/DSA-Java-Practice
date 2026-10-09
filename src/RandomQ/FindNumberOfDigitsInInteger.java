package RandomQ;

public class FindNumberOfDigitsInInteger {
    public static void main(String[] args) {
        Integer input = 757649;

        int digits = findNumberOfDigitInInteger(input);
        System.out.println("Digits of "+input+" is "+digits);
    }

    private static int findNumberOfDigitInInteger(Integer input) {
        return input.toString().length();
    }
}
