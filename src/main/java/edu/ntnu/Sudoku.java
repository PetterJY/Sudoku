package edu.ntnu;

import edu.ntnu.entity.Board;
import edu.ntnu.logic.SudokuFileHandler;
import java.io.IOException;
import java.util.Random;

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
  public int[][] run() {
    int[][] board = new int[9][9];
    try {
      Random random = new Random();
      board = new Board(SudokuFileHandler
              .readSudokuFile("src/main/resources/sudoku.txt", random.nextInt(1, 50))).getBoard();
    } catch (IOException e) {
      System.out.println("Could not read file.");
    }
    return board;
  }
}
