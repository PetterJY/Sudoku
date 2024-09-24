package edu.ntnu.ui;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * Represents the GameUi class.
 * Displays the Sudoku game.
 */
public class GameUi {
  Scene scene;
  GridPane root;

  /**
   * Constructor for the GameUi class.
   */
  public GameUi() {
    this.root = new GridPane();
    this.scene = new Scene(this.root, 900, 700);
    this.scene.getStylesheets().add("/css/GameScreen.css");
  }

  /**
   * Runs the GameUi.
   *
   * @param stage the stage.
   */
  public void run(Stage stage, int[][] board) {
    Label[][] numbers = new Label[9][9];
    for (int i = 0; i < 9; i++) {
      for (int j = 0; j < 9; j++) {
        numbers[i][j] = new Label();
        styleLabel(numbers, i, j);
        if (board[i][j] != 0) {
          numbers[i][j].setText(String.valueOf(board[i][j]));
        }
        this.root.add(numbers[i][j], i, j);
      }
    }

    stage.setScene(this.scene);
    stage.show();
  }

  /**
   * Styles the label.
   *
   * @param numbers the numbers.
   * @param i the x coordinate in the grid.
   * @param j the y coordinate in the grid.
   */
  private void styleLabel(Label[][] numbers, int i, int j) {
    numbers[i][j].setAlignment(Pos.CENTER);
    numbers[i][j].setPrefSize(100, 100);
    numbers[i][j].getStyleClass().add("numbers");
    if ((i == 2 || i == 5) && (j == 2 || j == 5)) {
      numbers[i][j].getStyleClass().add("numbers-bottom-right");
    } else if (i == 2 || i == 5) {
      numbers[i][j].getStyleClass().add("numbers-right");
    } else if (j == 2 || j == 5) {
      numbers[i][j].getStyleClass().add("numbers-bottom");
    } else {
      numbers[i][j].getStyleClass().add("numbers-plain");
    }
  }
}
