import edu.ntnu.logic.SudokuFileHandler;

import org.junit.Test;
import java.io.IOException;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.fail;

/**
 * Test class for SudokuFileHandler.
 */
public class TestSudokuFileHandler {
  int[][] board;
  /**
   * Constructor for the TestSudokuFileHandler class.
   */
  public TestSudokuFileHandler() {
    this.board = new int[9][9];

    this.board[0][2] = 3;
    this.board[0][4] = 2;
    this.board[0][6] = 6;
    this.board[1][0] = 9;
    this.board[1][3] = 3;
    this.board[1][5] = 5;
    this.board[1][8] = 1;
    this.board[2][2] = 1;
    this.board[2][3] = 8;
    this.board[2][5] = 6;
    this.board[2][6] = 4;
    this.board[3][2] = 8;
    this.board[3][3] = 1;
    this.board[3][5] = 2;
    this.board[3][6] = 9;
    this.board[4][0] = 7;
    this.board[4][8] = 8;
    this.board[5][2] = 6;
    this.board[5][3] = 7;
    this.board[5][5] = 8;
    this.board[5][6] = 2;
    this.board[6][2] = 2;
    this.board[6][3] = 6;
    this.board[6][5] = 9;
    this.board[6][6] = 5;
    this.board[7][0] = 8;
    this.board[7][3] = 2;
    this.board[7][5] = 3;
    this.board[7][8] = 9;
    this.board[8][2] = 5;
    this.board[8][4] = 1;
    this.board[8][6] = 3;
  }

  /**
   * Tests the readSudokuFile method.
   */
  @Test
  public void testReadSudokuFile() {
    try {
      SudokuFileHandler sudokuFileHandler = new SudokuFileHandler();
      int[][] board = sudokuFileHandler.readSudokuFile("src/main/resources/sudoku.txt", 1);
      assertArrayEquals(this.board, board);
    } catch (IOException e) {
      fail();
    }
  }
}
