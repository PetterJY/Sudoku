package edu.ntnu;

import edu.ntnu.entity.Board;
import edu.ntnu.logic.SudokuFileHandler;
import java.io.IOException;

/**
 * Represents the Sudoku class.
 */
public class Sudoku {
  public static void main(String[] args) {
    Sudoku sudoku = new Sudoku();
    sudoku.run();
  }

  /**
   * Constructor for the Sudoku class.
   */
  public Sudoku() {
    // Constructor
  }

  /**
   * Runs the Sudoku game.
   */
  public void run() {
    try {
      Board board = new Board(SudokuFileHandler.readSudokuFile("src/main/resources/sudoku.txt", 1));
      play(board);
    } catch (IOException e) {
      System.out.println("Could not read file.");
    }
  }

  /**
   * Initiates the Sudoku game.
   *
   * @param board the Sudoku board.
   */
  public void play(Board board) {
    board.printBoard();
  }
}
