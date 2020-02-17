package base;

public class Display {
    void show() {
        for (int i = 0; i < 42; i++) {
            System.out.print("-");
        }
        System.out.println();
        for (int i = 0; i < Board.field.length; i++) {
            System.out.print("|");
            for (int j = 0; j < Board.field[0].length; j++) {
                System.out.print(Board.field[i][j]+" ");
            }
            System.out.print("|");
            System.out.println();
        }
        for (int i = 0; i < 42; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
}
