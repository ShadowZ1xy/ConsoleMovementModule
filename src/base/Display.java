package base;

public class Display {
    void show(Board board) {
        for (int i = 0; i < board.boardWidth * 2 + 2; i++) {
            System.out.print("-");
        }
        System.out.println();
        for (int i = 0; i < board.field.length; i++) {
            System.out.print("|");
            for (int j = 0; j < board.field[0].length; j++) {
                System.out.print(board.field[i][j] + " ");
            }
            System.out.print("|");
            if (i == 0) {
                System.out.print(" SOME_PLAYER_INFORMATION_TEST");
            } else if (i == 1) {
                System.out.print(" SOME_ENEMY_INFORMATION_TEST");
            } else if (i == 2) {
                System.out.print(" STEP_COUNTER = " + Main.tempCounter_TEST);
            }
            System.out.println();
        }
        for (int i = 0; i < board.boardWidth * 2 + 2; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
}
