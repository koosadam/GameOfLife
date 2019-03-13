package gameoflife;

public class Board {

    private Cell[][] board;
    private int size;
    
    public Board() {
    }

    public Board(int size) {
        this.size = size;
        board = new Cell[size][size];
        for (int y = 0; y < size; y++) {
            for (int x = 0; x < size; x++) {
                board[y][x] = new Cell();
            }
        }
    }

    public void setCell(int y, int x, boolean state) {
        board[y][x].setCoordinateY(y);
        board[y][x].setCoordinateX(x);
        board[y][x].setState(state);
    }

    public Cell getCell(int y, int x) {
        return board[y][x];
    }

    public int getSize() {
        return size;
    }

    public Cell[][] getBoard() {
        return board;
    }

    public void setBoard(Cell[][] board) {
        this.board = board;
    }
}
