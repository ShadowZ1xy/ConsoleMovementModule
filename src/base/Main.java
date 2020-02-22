package base;

public class Main {
    static int tempCounter_TEST = 0;

    public static void main(String[] args) {
        Board board = new Board(20, 20);
        int sleepTimer = 10;
        Console.clear();
        Player player = new Player();
        UserInput userInput = new UserInput(player);
        Display display = new Display();
        Console.clear();
        display.show(board);
        board.field[player.getCurrentPosition(Coordinates.Y)][player.getCurrentPosition(Coordinates.X)] = player.figure;
        try {
            while (true) {
                if (player.lastMove != Side.STAND) {
                    Console.clear();
                    board.reset();
                    if (player.moveTo(board, player.lastMove)) {
                        tempCounter_TEST++;
                    }
                    board.field[player.getCurrentPosition(Coordinates.Y)][player.getCurrentPosition(Coordinates.X)] = player.figure;
                    player.faceDirection = player.lastMove;
                    player.lastMove = Side.STAND;
                    display.show(board);
                    Thread.sleep(sleepTimer);
                } else {
                    Thread.sleep(sleepTimer);
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
