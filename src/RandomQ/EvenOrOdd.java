package RandomQ;

public class EvenOrOdd {
    public static void main(String[] args) {
        int number = 1;
        boolean isEven = isEven(number);
        if (isEven) System.out.println(number+": Number is Even");
        else System.out.println(number+": Number is Odd");
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
