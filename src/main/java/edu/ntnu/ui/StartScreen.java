package edu.ntnu.ui;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

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
  public void run() {
    Button playButton = new Button("Play");
    Button quitButton = new Button("Quit");
    VBox buttonBox = new VBox(10); // VBox with spacing of 10
    buttonBox.getChildren().addAll(playButton, quitButton);
    this.root.setCenter(buttonBox); // Add VBox to the center of BorderPane
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
