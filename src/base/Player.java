package base;

public class Player {
    char figure = 'O';
    private int[] currentPosition = new int[]{0, 0};
    private final static int[][] SIDE_COORDINATE_CHANGE = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    public Side faceDirection = Side.STAND;
    public Side lastMove = Side.STAND;

    public boolean moveTo(Board board, Side side) {
        int tempRowCoordinate = currentPosition[0] + SIDE_COORDINATE_CHANGE[side.ordinal()][0];
        int tempLineCoordinate = currentPosition[1] + SIDE_COORDINATE_CHANGE[side.ordinal()][1];
        if (board.isLegitMove(tempLineCoordinate, tempRowCoordinate) &&
                board.isFreeSpot(tempLineCoordinate, tempRowCoordinate)) {
            currentPosition[0] = tempRowCoordinate;
            currentPosition[1] = tempLineCoordinate;
            return true;
        }
        return false;
    }

    public int getCurrentPosition(Coordinates coordinates) {
        if (coordinates == Coordinates.X) {
            return currentPosition[1];
        } else {
            return currentPosition[0];
        }
    }
}

enum Side {
    TOP,
    BOTTOM,
    LEFT,
    RIGHT,
    STAND
}

enum Coordinates {
    X,
    Y
}
