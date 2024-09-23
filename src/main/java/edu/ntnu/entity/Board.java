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
   * Returns the board.
   *
   * @return the board.
   */
  public int[][] getBoard() {
    return board;
  }
}
