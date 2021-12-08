public class MiniProjet {

  //Type to model a trap
  static class Trap{
      int position;//Position betwen 0 and the number of cells
      char symbol;//Here o or ~
  }

  //Type to model a rider
  static class Rider{
      String name;//Here red or blue
      int position;//Position betwen 0 and the number of cells
      char symbol;//Here R or B
  }

  //Type to model a board
  static class Board{
      int size;//Size of the board
      Trap hole1;
      Trap hole2;
      Trap river;
      Rider red = new Rider();
  }


  /*Create trap and set a trap
        char _symbol to set the symbol of the trap
        int _position to set the position of the trap
  */
  public static Trap create_trap(char _symbol, int _position){
      Trap trap = new Trap();
      trap.symbol = _symbol;
      trap.position = _position;
      return trap;
  }

  /*Create and set the game board
        int _board_size to set the size of the board
        int _nb_players to set the number of players
  */
  public static Board init_game(int _board_size, int _nb_players){
      //Create board
      Board board = new Board();
      board.size = _board_size;

      //Set traps
      //Position start at 2 because we can't have trap on the start cell
      board.hole1 = create_trap('o', (int)(Math.random()*board.size+2));
      board.hole2 = create_trap('o', (int)(Math.random()*board.size+2));
      //Check hole1 and hole2 are on same position
      while(board.hole1.position == board.hole2.position){
          board.hole2.position = (int)(Math.random()*board.size+2);
      }
      board.river = create_trap('~', (int)(Math.random()*board.size+2));
      //check if river and hole are on same position
      while(board.river.position == board.hole1.position || board.river.position == board.hole2.position){
          board.river.position = (int)(Math.random()*board.size+2);
      }

      //Set players
      board.red.position = 1;//Position of start cell
      board.red.symbol = 'R';


      return board;
  }

  public static void main(String[] args){
      Board board = init_game(40,1);
      print(board);
  }


  /*Print the board
        Board board to set in String
  */
  public static void print(Board board) {
      System.out.print(" ");
      for (int i = 1; i < board.size/4; i++) {
          System.out.print("_____");
      }
      System.out.println("___");
      for(int i = 1 ; i <= board.size/4; i++){
          if(i == board.red.position){
              System.out.print("|_R_|");
          }
          else if(i == board.hole1.position || board.hole2.position == i){
              System.out.print("|_o_|");
          }
          else if(i == board.river.position){
              System.out.print("|_~_|");
          }
          else{
              System.out.print("|___|");
          }

      }

      System.out.println("");

      for (int i = board.size/4+1; i <=board.size/2 ; i++) {
          if((board.size-(i - (board.size/4+1))) == board.red.position){
              System.out.print("|_R_|");
          }
          else if((board.size-(i - (board.size/4+1))) == board.hole1.position || board.hole2.position == (board.size-(i - (board.size/4+1)))){
              System.out.print("|_o_|");
          }
          else if((board.size-(i - (board.size/4+1))) == board.river.position){
              System.out.print("|_~_|");
          }
          else{
              System.out.print("|___|");
          }

          for(int j = 0; j <board.size/4-2; j++) {
              if(i == board.size/2){
                  System.out.print("_____");
              }
              else{
                  System.out.print("     ");
              }

          }
          if(i == board.red.position){
              System.out.println("|_R_|");
          }
          else if(i == board.hole1.position || board.hole2.position == i){
              System.out.println("|_o_|");
          }
          else if(i == board.river.position){
              System.out.println("|_~_|");
          }
          else{
              System.out.println("|___|");
          }
      }

      for(int i = (board.size/4)*3 ; i > (board.size/2) ; i--){
          if(i == board.red.position){
              System.out.print("|_R_|");
          }
          else if(i == board.hole1.position || board.hole2.position == i){
              System.out.print("|_o_|");
          }
          else if(i == board.river.position){
              System.out.print("|_~_|");
          }
          else{
              System.out.print("|___|");
          }
      }
      System.out.println("\n");



  }

}
