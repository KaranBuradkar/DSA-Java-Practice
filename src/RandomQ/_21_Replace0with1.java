package RandomQ;

/**
 * WAP TO REPLACE 0's FROM INTEGER WITH 1's
 * EX: 10240120 -> 11231121
 */
public class _21_Replace0with1 {

    public static void main(String[] args) {
        Integer number = 2050340;
        Integer expected = 2151341;

        Integer result = replace0to1(number);

        if (expected.equals(result)) {
            System.out.println("PASSED: "+result);
        } else {
            System.out.println("FAILED: "+result+", EXPECTED: "+expected);
        }
    }

    private static Integer replace0to1(Integer number) {
        return Integer.parseInt(number.toString().replace('0', '1'));
    }
}
