public class SlowFlexible extends SlowPiece {
    SlowFlexible(String name, String colour, int row, int col) {
        super(name, colour, row, col);
        situation = "SF";
    }

    public String toString() {
        return getName() + getColour() + situation;
    }
}
