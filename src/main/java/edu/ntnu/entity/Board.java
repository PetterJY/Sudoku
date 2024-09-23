package edu.ntnu.entity;

/**
 * Represents the Sudoku board.
 */
public class Board {
  int[][] board;

  /**
   * Constructor for the Board class.
   *
   * @param board holds the values of the Sudoku board.
   */
  public Board(int[][] board) {
    this.board = board;
  }

  /**
   * Prints the board.
   */
  public void printBoard() {
    System.out.println("---------------------");
    for (int i = 0; i < this.board.length; i++) {
      boolean hasPrinted = false;
      for (int j = 0; j < this.board[i].length; j++) {
        if (i % 3 == 0 && i != 0 && !hasPrinted) {
          System.out.println("------+-------+------");
          hasPrinted = true;
        }
        if (j % 3 == 0 && j != 0) {
          System.out.print("| ");
        }
        System.out.print(this.board[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println("---------------------");
  }

  /**
   * Returns the board.
   *
   * @return the board.
   */
  public int[][] getBoard() {
    return board;
  }
}
