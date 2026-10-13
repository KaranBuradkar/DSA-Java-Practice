package RandomQ;

/**
 * WAP TO CHECK NUMBER IS PRIME OR NOT
 * Ex: 2, 3, 5, 7 -> Prime,
 * 4, 8, 28, 55 -> Not Prime
 */
public class _18_PrimeOrNot {

    public static void main(String[] args) {
        int number = 31;
        boolean expected = true;

        boolean status = isPrime(number);

        if (expected == status) System.out.print("PASSED: ");
        else  System.out.print("FAILED: ");
        if (status) System.out.println(number+" is a Prime");
        else System.out.println(number+" is not a Prime");
    }

    private static boolean isPrime(int number) {
        if (number == 2) return true;

        double sqrt = Math.sqrt(number);
        for (int i = 2; i < sqrt / 2; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}
