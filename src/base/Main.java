package base;

public class Main {
    public static void main(String[] args) {
        Board board = new Board();
        Player player = new Player();
        UserInput userInput = new UserInput(player);
        Display display = new Display();
        try {
            while (true) {
                Board.field[player.currentPosition[0]][player.currentPosition[1]] = player.figure;
                display.show();
                Thread.sleep(100);
                Console.clear();
                Board.reset();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
