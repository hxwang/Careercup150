

/////////////////////////////////// My Design

public class Game{
  private Chessboard chessboard;
  private User u1;
  private User u2;
  
  public void makeMove(User u) {}

}

public enum Color{
  whilte, black
}

public class User{
  private Color color;
  
  public User(int color){
    this.color = color;
  }
  
}

public class Chessboard{
  private int[][] board;
  private Chessboard chessboard;
  
  public Chessboard getInstance(){
    if(chessboard==null) chessboard = new Chessboard();
    return chessboard;
  }
  public int getWhiteCount() {}
  public int getBlackCount() {}
  
  public boolean whoWin() {}
}


////////////////////////////////////// References

//Making game a singleton class, this will make it easy for anyone to call a method within Game, without having to pass around referencs to the Game object

public enum Direction{
  left, right, up, down
}

public enum Color{
  White, Black
}

public class Game{
  private Player[] players;
  private static Game instance;
  pricate Board board;
  private final int ROWS = 10;
  private final int COLUMNS = 10;
  
  private Game(){
    board = new Board(ROWS,COLUMNS);
    players = new Player[2];
    players[0] = new Player(Color.Black);
    players[1] = new Player(Color.White);
  }
  
  public static Game getInstance(){
    if(instance == null) instance = new Game();
    return instance;
  }
  
  public Board getBoard(){
    return board;
  }
}


////////////////////////////////////////////////////////////////////////
//Board: The board class manages the actual pieces themselves, it does not handle much of the game play, leaving that up to the Game class

public class Board{
  private int blackCount = 0;
  private int whiteCount = 0;
  private Piece[][] board;
  
  public Board(int rows, int columns){
    board = new Piece[rows][columns];
  }
  
  public void init(){
    //init center black and white pieces
    
  public boolean placeColor(int row, int column, Color color){
    //attempt to place a piece of color at (row, column)
  }
  
  private int flipSection(int row, int column, Color color, Direction d){
    //flips pieces starting at (row, column) and proceeding in direction d
  }
  
  public int getScoreForColor(Color c){
    if( c == Color.Black) return blackcount;
    else return whiteCount;
  }
  
  //update board with additional newPieces peices of color new Color. 
  //Decrease score of opposite color
  public void updateScore(Color newColor, int newPieces){}
  }
}


/////////////////////////////////////////////////////////
//We implement black and white peices with the Piece class, which has a simple Color variable representing whether it is black or white piece

public class Piece{
  private Color color;
  public Piece(Color c) {color = c; }


public void flip(){
  if(color = Color.Black) color = Color.White;
  else color = Color.Black;
}

public Color getColor() {return color; }
}

/////////////////////////////////////////////// Player

public class Player{
  private Color color;
  public Player(Color c) {color = c;}
  
  public int getScore() {}
  
  public boolean playPiece(int r, int c){
    return Game.getInstance.getBoard.placeColor(r, c, c.color);
  }
  
  public Color getColor() {return color;}
}

