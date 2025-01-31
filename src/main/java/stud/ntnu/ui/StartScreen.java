package stud.ntnu.ui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Represents the StartScreen class.
 */
public class StartScreen extends Application {
  private Scene scene;
  private BorderPane root;

  /**
   * Constructor for the StartScreen class.
   */
  public StartScreen() {
    this.root = new BorderPane();
    this.scene = new Scene(this.root, 900, 700);
    this.scene.getStylesheets().add("/css/StartScreen.css");
  }

  @Override
  public void start(Stage stage) {
    StartScreen startScreen = new StartScreen();
    startScreen.run(stage);
  }

  /**
   * Runs the StartScreen.
   */
  public void run(Stage stage) {
    Label title = new Label("Sudoku");
    Button playButton = new Button("Play");
    Button quitButton = new Button("Quit");

    playButton.setOnAction(e -> {

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
