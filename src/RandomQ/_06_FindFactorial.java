package RandomQ;

/**
 * WAP TO FIND FACTORIAL
 * ex: 5 -> 120
 */
public class _06_FindFactorial {
    public static void main(String[] args) {
        long input = 56;
        long factorial = calFactorial(input);
        System.out.println("Factorial of "+input+" is "+factorial);
    }

    // Brute Force
    private static long calFactorial(long input) {
        if (input == 1) return 1;
        if (input <= 0) return 0;
        return input * (calFactorial(input-1));
    }
}
