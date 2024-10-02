package edu.ntnu.ui;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Represents the StartScreen class.
 */
public class StartScreen {
  private Scene scene;
  private BorderPane root;

  /**
   * Constructor for the StartScreen class.
   */
  public StartScreen() {
    this.root = new BorderPane();
    this.scene = new Scene(this.root, 900, 700);
    this.scene.getStylesheets().add("/css/startScreen.css");
  }

  /**
   * Runs the StartScreen.
   */
  public void run(Stage stage, int[][] board) {
    Label title = new Label("Sudoku");
    Button playButton = new Button("Play");
    Button quitButton = new Button("Quit");

    playButton.setOnAction(e -> {
      GameUi gameUi = new GameUi();
      gameUi.start(stage, board);
    });

    quitButton.setOnAction(e -> {
      System.out.println("Quit button clicked");
      stage.close();
    });

    VBox centralBox = new VBox(50);
    centralBox.setAlignment(javafx.geometry.Pos.CENTER);
    centralBox.getChildren().addAll(title, playButton, quitButton);
    this.root.setCenter(centralBox); // Add VBox to the center of BorderPane
  }

  /**
   * Returns the scene.
   *
   * @return the scene.
   */
  public Scene getScene() {
    return this.scene;
  }
}
