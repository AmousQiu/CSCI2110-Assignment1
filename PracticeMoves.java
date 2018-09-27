import java.util.Scanner;

public class PracticeMoves {
    //main method
    public static void main(String args[]) {
        Board checkBoard = new Board(8, 8);

        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a command (type help for details): ");
            String operation = input.next();
            if (operation.equals("help")) {
                System.out.println("Possible commands are as follows:\n" +
                        "create location [fast][flexible]: Creates a new piece.\n" +
                        "move location direction [spaces]: Moves a piece.\n" +
                        "Print: Displays the board.\n" +
                        "Help: Displays help.\n" +
                        "Exit: Exits the program.");
            }
            if (operation.equals("exit")) {
                System.out.println("Done.");
                break;
            }
            if (operation.equals("create")) {
                int row = input.nextInt();
                int col = input.nextInt();
                String speed = input.next();
                String situation = input.next();
                System.out.println("Input a name for the new piece:");
                String name = input.next();
                System.out.println("Enter a colour for the new piece:");
                String colour = input.next();
                checkBoard.add(speed, situation, name, colour, row, col);
            }
            if (operation.equals("print")) {
                checkBoard.display();
            }
            if (operation.equals("move")) {
                int x = input.nextInt();
                int y = input.nextInt();
                String direction=input.next();
                int step=input.nextInt();
                checkBoard.move(x, y,direction,step);
            }
        }
    }
}
