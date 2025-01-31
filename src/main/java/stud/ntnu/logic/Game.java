package stud.ntnu.logic;

import stud.ntnu.entity.Board;
import java.util.Random;

public class Game {
  Board board;
  Random random;

  public Game() {
    this.random = new Random();
    this.board = new Board(FileHandler.readSudokuFile("games/sudoku.txt", this.random.nextInt(0, 50)));
    this.board.printBoard();
  }
}
