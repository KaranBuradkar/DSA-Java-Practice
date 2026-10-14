package RandomQ;

/**
 * WAP TO FIND QUADRANTS IN WHICH COORDINATE LIE
 * EX: X(-2), Y(3) -> Quadrant II
 */
public class _22_FindQuadrants {

    public static void main(String[] args) {
        int x = 0;
        int y = -3;
        int expected = 6;

        int quadrant = getQuadrant(x, y);

        String qudrantString = switch (quadrant) {
            case 1 -> "QUADRANT I";
            case 2 -> "QUADRANT II";
            case 3 -> "QUADRANT III";
            case 4 -> "QUADRANT IV";
            case 5 -> "X - AXIS";
            case 6 -> "Y - AXIS";
            default -> throw new IllegalStateException("Unexpected value: " + quadrant);
        };

        if (expected == quadrant) {
            System.out.println("PASSED: Coordinate("+x+", "+y+") lies in "+qudrantString);
        } else {
            System.out.println("FAILED: "+quadrant+", EXPECTED: "+expected);
        }
    }

    private static int getQuadrant(int x, int y) {
        int quadrant = -1;
        if (y == 0 && x != 0) {
            quadrant = 5;
        } else if (x == 0 && y != 0) {
            quadrant = 6;
        } else if (x > 0 && y > 0) {
            quadrant = 1;
        } else if (x < 0 && y > 0) {
            quadrant = 2;
        } else if (x < 0 && y < 0) {
            quadrant = 3;
        } else if (x > 0 && y < 0) {
            quadrant = 4;
        }
        return quadrant;
    }
}
