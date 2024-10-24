package stud.ntnu.entity;

import stud.ntnu.entity.Square;

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
    assemble(board);
  }

  /**
   * Takes the values given, and fills them in the board.
   *
   * @param board the values to fill in.
   */
  public void assemble(int[][] board) {
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        this.board[i][j].setCharacter((char) board[i][j]);
      }
    }
  }

  /**
   * Representes the board.
   *
   * @return the board
   */
  public Square[][] getBoard() {
    return this.board;
  }
}