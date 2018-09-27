public class SlowPiece extends Piece {
    SlowPiece(String name, String colour, int row, int col) {
        super(name, colour, row, col);
        situation="SP";
    }
    @Override
    public String toString() {
        return getName()+getColour()+situation;
    }
}
