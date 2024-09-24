package edu.ntnu;

import edu.ntnu.ui.StartScreen;
import javafx.application.Application;
import javafx.stage.Stage;

/**
 * Represents the main class.
 */
public class Main extends Application {
  public static void main(String[] args) {
    launch(args);
  }

  /**
   * Starts the start-screen.
   *
   * @param stage the stage from application.
   * @throws Exception if an exception occurs.
   */
  @Override
  public void start(Stage stage) throws Exception {
    Sudoku sudoku = new Sudoku();
    int[][] board = sudoku.run();
    StartScreen startScreen = new StartScreen();
    startScreen.run(stage, board);
    stage.setScene(startScreen.getScene());
    stage.show();
  }
}