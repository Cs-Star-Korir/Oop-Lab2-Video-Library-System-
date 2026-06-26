import javafx.application.Application;
import javafx.stage.Stage;

/**
 * Main entry point for the Video Library System JavaFX application.
 * Launches the Genres screen first.
 */
public class Main extends Application {

    /**
     * JavaFX start method — opens the Genres screen.
     * @param primaryStage the primary stage
     */
    @Override
    public void start(Stage primaryStage) {
        new Genres().start(primaryStage);
    }

    /**
     * Main method — launches the JavaFX application.
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}