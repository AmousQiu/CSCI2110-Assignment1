public class Board {
  private int rows;
  private int columns;
  private Piece [][]board;
  public Board(int rows,int colums){
    
  }
  public void add(Piece p,int x,int y){
    if(board[x][y]==null){
      board[x][y]=p;
    }
   }

   public void move(int x,int y,String direction,int step){
    if(board[x][y]!=null){
      p=board[x][y];
     if(direction.equals("up")){
       if(board[x-step][y]==null){
         board[x][y]=null;
         board[x-step][y]=p;
       }
     }
     if(direction.equals("down")){
       if(board[x+step][y]==null){
         board[x][y]=null;
         board[x+step][y]=p;
       }
     }
     if(direction.equals("left")){
       if(board[x][y-step]==null){
         board[x][y]=null;
         board[x][y-step]=p;
       }
     }
     if(direction.equals("right")){
       if(board[x][y+step]==null){
         board[x][y]=null;
         board[x][y+step]=p;
       }
     }
   }
}
   public void display(){

   }
