import java.util.Scanner;

public class Board {
    private int rows;
    private int columns;
    private Piece[][] board;

    public Board(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        board = new Piece[rows][columns];
    }

    public void add(String speed, String situation, String name, String colour, int x, int y) {
        if (board[x][y] == null) {
            if (speed.equals("fast")) {
                if (situation.equals("flexible")) {
                    FastFlexible p = new FastFlexible(name, colour, x, y);//add a fast flexible to the board
                    board[x][y] = p;
                }
                if (situation.equals("piece")) {
                    FastPiece p = new FastPiece(name, colour, x, y);//add a fast piece to the board
                    board[x][y] = p;
                }
            }
            if (speed.equals("slow")) {
                if (situation.equals("flexible")) {
                    SlowFlexible p = new SlowFlexible(name, colour, x, y);//add a slow flexible to board
                    board[x][y] = p;
                }
                if (situation.equals("piece")) {
                    SlowPiece p = new SlowPiece(name, colour, x, y);//add a slow piece to board
                    board[x][y] = p;
                }
            }
        }
    }
//move the specific situation chess to somewhere
    public void move(int x, int y, String direction, int step) {

        if (board[x][y] != null) {//whether there is no chess on this block
            //slow piece situation
            if (board[x][y].situation.equals("SP")) {
                if (direction.equals("left")) {
                    if (y - 1 >= 0) {
                        board[x][y - 1] = board[x][y];
                        board[x][y] = null;
                    } else {
                        System.out.println("Sorry,you can't do this");
                    }
                }
                if (direction.equals("right")) {
                    if (y + 1 < 8) {
                        board[x][y + 1] = board[x][y];
                        board[x][y] = null;
                    } else {
                        System.out.println("Sorry,you can't do this");
                    }
                }
                //fast piece situation
            } else if (board[x][y].situation.equals("FP")) {
                if (direction.equals("left")) {
                    if (y - step >= 0) {
                        board[x][y - step] = board[x][y];
                        board[x][y] = null;
                    } else {
                        System.out.println("Sorry,you can't do this");
                    }
                }
                if (direction.equals("right")) {
                    if (y + step < 8) {
                        board[x][y + step] = board[x][y];
                        board[x][y] = null;
                    } else {
                        System.out.println("Sorry,you can't do this");
                    }
                }
                //slow flexible situation
            } else if (board[x][y].situation.equals("SF")) {
                if (direction.equals("left")) {
                    if (y - 1 >= 0) {
                        board[x][y - 1] = board[x][y];
                        board[x][y] = null;
                    } else {
                        System.out.println("Sorry,you can't do this");
                    }
                }
                if (direction.equals("right")) {
                    if (y + 1 < 8) {
                        board[x][y + 1] = board[x][y];
                        board[x][y] = null;
                    } else {
                        System.out.println("Sorry,you can't do this");
                    }
                }
                if (direction.equals("down")) {
                    if (x + 1 < 8) {
                        board[x + 1][y] = board[x][y];
                        board[x][y] = null;
                    } else {
                        System.out.println("Sorry,you can't do this");
                    }
                }
                if (direction.equals("up")) {
                    if (x - 1 >= 0) {
                        board[x - 1][y] = board[x][y];
                        board[x][y] = null;
                    } else {
                        System.out.println("Sorry,you can't do this");
                    }
                }
            // fast fleixble situation
            } else if (board[x][y].situation.equals("FF")) {
                if (direction.equals("left")) {
                    if (y - step >= 0) {
                        board[x][y - step] = board[x][y];
                        board[x][y] = null;
                    } else {
                        System.out.println("Sorry,you can't do this");
                    }
                }
                if (direction.equals("right")) {
                    if (y + step < 8) {
                        board[x][y + step] = board[x][y];
                        board[x][y] = null;
                    } else {
                        System.out.println("Sorry,you can't do this");
                    }
                }
                if (direction.equals("down")) {
                    if (x + step < 8) {
                        board[x + step][y] = board[x][y];
                        board[x][y] = null;
                    } else {
                        System.out.println("Sorry,you can't do this");
                    }
                }
                if (direction.equals("up")) {
                    if (x - step >= 0) {
                        board[x - step][y] = board[x][y];
                        board[x][y] = null;
                    } else {
                        System.out.println("Sorry,you can't do this");
                    }
                }
            }
        } else {
            System.out.println("No piece at (" + x + "," + y + ")");
        }
    }

    public void display() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[i][j] == null) {
                    System.out.print("-      ");
                } else {
                    System.out.print(board[i][j]);
                }
            }
            System.out.println();
        }
    }
}