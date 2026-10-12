package RandomQ;

/**
 * WAP TO FIND POWER OF THE NUMBER
 * EX: a ^ b, 5 ^ 2 = 5 * 5
 */
public class _15_PowerOfNumber {
    public static void main(String[] args) {
        int base = 5;
        int pow = 4;
        int expected = 625;

        int result = power(base, pow);
        if (result == expected) System.out.println("PASSED: "+result);
        else System.out.println("FAILED: "+result+", EXPECTED: "+expected);
    }

    private static int power(int base, int pow) {
        if (base == 0) return 0;
        if (pow == 0) return 1;
        return base * power(base, pow - 1);
    }
}
