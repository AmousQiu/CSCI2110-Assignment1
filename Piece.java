public class Piece {
    private String name;
    private String colour;
    private int row;
    private int col;
    protected String situation;
//constructor
    Piece(String name, String colour, int row,int col) {
        this.name = name;
        this.colour = colour;
        this.row=row;
        this.col=col;
        situation="";
    }
//set the time
    public void setName(String name) {
        this.name = name;
    }
// set the colour
    public void setColour(String colour) {
        this.colour = colour;
    }
//set the position
    public void setPosition(int col,int row) {
        this.col=col;
        this.row=row;
    }
//get the name
    public String getName() {
        return name;
    }
//get the colour
    public String getColour() {
        return colour;
    }



    @Override
    public String toString() {
        return "name: "+this.getName()+" colour: "+this.getColour();
    }
}
