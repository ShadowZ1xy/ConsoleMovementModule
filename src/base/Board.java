package base;

import java.util.Arrays;

public class Board {
    static char[][] field = new char[20][20];

    public Board() {
        reset();
    }

    static void reset() {
        for (char[] token : field) {
            Arrays.fill(token, ' ');
        }
    }
}
