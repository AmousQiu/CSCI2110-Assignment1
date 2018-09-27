public class FastPiece extends Piece {
    FastPiece(String name, String colour, int row, int col) {
        super(name, colour, row, col);
        situation = "FP";
    }

    public String toString() {
        return getName() + getColour() + situation;
    }
}
