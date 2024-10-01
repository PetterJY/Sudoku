package edu.ntnu.ui;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.input.MouseEvent;
import javafx.util.Pair;

/**
 * Represents the GameUi class.
 * Displays the Sudoku game.
 */
public class GameUi {
  Scene scene;
  GridPane root;
  Pair<Integer, Integer> selectedNumber;

  /**
   * Constructor for the GameUi class.
   */
  public GameUi() {
    this.root = new GridPane();
    this.scene = new Scene(this.root, 900, 700);
    this.scene.getStylesheets().add("/css/GameScreen.css");
    this.selectedNumber = new Pair<>(-1, -1); // No number selected
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

    this.root.addEventFilter(MouseEvent.MOUSE_CLICKED, e -> {
      if (e.getTarget() instanceof Label source) {
        // If: There is already a selected square
        // Then: De-select the square
        if (this.selectedNumber.getKey() != -1 && this.selectedNumber.getValue() != -1) {
          Label previouslySelected = numbers[this.selectedNumber.getKey()][this.selectedNumber.getValue()];
          System.out.println("Before removal: " + previouslySelected.getStyleClass());
          previouslySelected.getStyleClass().remove("numbers-selected");
          System.out.println("After removal: " + previouslySelected.getStyleClass());
        }

        // Select the new label if it is not already selected
        boolean isSelected = source.getStyleClass().contains("numbers-selected");
        if (!isSelected && source.getStyleClass().contains("numbers")) {
          source.getStyleClass().add("numbers-selected");
          this.selectedNumber = new Pair<>(
                  GridPane.getRowIndex(source),
                  GridPane.getColumnIndex(source)
          );
        } else {
          this.selectedNumber = new Pair<>(-1, -1); //Set to default
        }
        System.out.println("New selected number: " + this.selectedNumber);
      }
    });

    stage.setScene(this.scene);
    stage.show();
  }

  /**
   * Styles the label.
   * Adds the correct grid style to the label.
   * Such that the grid looks like a Sudoku board.
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
    } else if (i == 3 || i == 6) {
      numbers[i][j].getStyleClass().add("numbers-left");
    } else if (j == 3 || j == 6) {
      numbers[i][j].getStyleClass().add("numbers-top");
    } else {
      numbers[i][j].getStyleClass().add("numbers-full-grey");
    }
  }
}
