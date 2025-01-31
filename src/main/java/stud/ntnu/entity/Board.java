package stud.ntnu.entity;

/**
 * Represents a sudoku-board.
 */
public class Board {
  Square[][] board;

  /**
   * Constructor for the Board class.
   */
  public Board() {
    this.board = new Square[9][9];
  }

  /**
   * Constructor for the Board class.
   *
   * @param board consisting of the values to fill in.
   */
  public Board(int[][] board) {
    this.board = new Square[9][9];
    assemble(board);
  }

  /**
   * Takes the values given, and fills them in the board.
   *
   * @param board the values to fill in.
   */
  public void assemble(int[][] board) {
    for (int i = 0; i < 9; i++) {
      for (int j = 0; j < 9; j++) {
        this.board[i][j] = new Square(board[i][j]);
      }
    }
  }

  /**
   * Prints the board.
   */
  public void printBoard() {
    for (int i = 0; i < 9; i++) {
      for (int j = 0; j < 9; j++) {
        System.out.print(this.board[i][j].getCharacter());
      }
      System.out.println();
    }
  }

  /**
   * Returns the board.
   *
   * @return the board
   */
  public Square[][] getBoard() {
    return this.board;
  }
}