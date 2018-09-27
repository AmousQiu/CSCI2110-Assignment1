public class FastFlexible extends FastPiece {
    FastFlexible(String name, String colour, int row, int col) {
        super(name, colour, row, col);
        situation="FF";
    }


    @Override
    public String toString() {
        return getName()+getColour()+situation;
    }
}
