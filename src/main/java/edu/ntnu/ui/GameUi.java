package edu.ntnu.ui;

import javafx.scene.Scene;
import javafx.scene.control.TextField;
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

    TextField[][] textFields = new TextField[9][9];
    for (int i = 0; i < 9; i++) {
      for (int j = 0; j < 9; j++) {
        //Adding lines

        textFields[i][j] = new TextField();
        textFields[i][j].setPrefWidth(50);
        textFields[i][j].setPrefHeight(50);
        if ((i == 2 || i == 5) && (j == 2 || j == 5)) {
          textFields[i][j].setStyle("-fx-border-color: white black black white;");
        } else if (i == 2 || i == 5) {
          textFields[i][j].setStyle("-fx-border-color: white black white white;");
        } else if (j == 2 || j == 5) {
          textFields[i][j].setStyle("-fx-border-color: white white black white;");
        } else {
          textFields[i][j].setStyle("-fx-border-color: white white white white;");
        }
        if (board[i][j] != 0) {
          textFields[i][j].setText(String.valueOf(board[i][j]));
        }
        this.root.add(textFields[i][j], i, j);
      }
    }

    stage.setScene(this.scene);
    stage.show();
  }
}
