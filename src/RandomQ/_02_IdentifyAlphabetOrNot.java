package RandomQ;

/**
 * WAP TO IDENTIFY GIVEN CHARACTER IS ALPHABET OR NOT
 * ( a, y, p, b ) -> ALPHABET AND
 * ( ^ & % # $ ) -> NOT ALPHABET
 */
public class _02_IdentifyAlphabetOrNot {
    public static void main(String[] args) {
        char input = '^';

        boolean alphabet = isAlphabet(input);
        if (alphabet) System.out.println(input + " is a alphabet");
        else System.out.println(input + " is not a alphabet");
    }

    private static boolean isAlphabet(char input) {
        return 'a' < input && input < 'z' || 'A' < input && input < 'Z';
    }
}
