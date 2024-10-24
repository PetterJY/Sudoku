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
   * Representes the board.
   *
   * @return the board
   */
  public Square[][] getBoard() {
    return this.board;
  }
}