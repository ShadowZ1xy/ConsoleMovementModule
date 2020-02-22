package base;

import java.util.Arrays;

public class Board {
    char[][] field;
    int boardHeight;
    int boardWidth;

    public Board(int boardWidth, int boardHeight) {
        this.boardWidth = boardWidth;
        this.boardHeight = boardHeight;
        this.field = new char[boardHeight][boardWidth];
        reset();
    }

    void reset() {
        for (char[] token : field) {
            Arrays.fill(token, ' ');
        }
    }

    public boolean isLegitMove(int x, int y) {
        return (x >= 0 && y >= 0 && x < boardWidth && y < boardHeight);
    }

    public boolean isFreeSpot(int x, int y) {
        return field[y][x] == ' ';
    }
}
