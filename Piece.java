public class Piece {
    private String name;
    private String colour;
    public int[][] position;

    Piece(String name, String colour, int[][] position) {
        this.name = name;
        this.colour = colour;
        this.position = position;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setPosition(int[][] position) {
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public String getColour() {
        return colour;
    }

    public int[][] getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "name: "+this.getName()+" colour: "+this.getColour()+" position: "+this.getPosition();
    }
}
