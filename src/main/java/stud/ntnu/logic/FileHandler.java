package stud.ntnu.logic;

import java.io.InputStream;
import java.util.Scanner;

/**
 * Handles reading of Sudoku files.
 */
public class FileHandler {

  /**
   * Constructor for the SudokuFileHandler class.
   */
  private FileHandler() {
    // Constructor
  }

  /**
   * Reads a Sudoku file and returns the content as a 2D array.
   *
   * @param path the name of the file to read.
   * @return the content of the file as a 2D array.
   */
  public static int[][] readSudokuFile(String path, int grid) {
    int[][] board = new int[9][9];
    InputStream inputStream = FileHandler.class.getClassLoader().getResourceAsStream(path);
    if (inputStream == null) {
      throw new IllegalArgumentException("File not found: " + path);
    }
    Scanner scanner = new Scanner(inputStream);
    boolean gridFound = false;
    while (scanner.hasNextLine() && !gridFound) {
      String line = scanner.nextLine();
      if (line.equals("Grid " + grid)) {
        gridFound = true;
      }
    }
    if (!gridFound) {
      throw new IllegalArgumentException("Grid not found: " + grid);
    }

    for (int i = 0; i < 9; i++) {
      String line = scanner.nextLine();
      for (int j = 0; j < 9; j++) {
        board[i][j] = Character.getNumericValue(line.charAt(j));
      }
    }
    return board;
  }
}
