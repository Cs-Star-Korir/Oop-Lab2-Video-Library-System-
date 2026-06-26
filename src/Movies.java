import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * Movies screen for the Video Library System.
 * Allows saving a movie linked to a genre, and removing registered movies.
 */
public class Movies {

    /**
     * Displays the Movies GUI on the given stage.
     * @param stage the JavaFX stage
     */
    public void start(Stage stage) {

        // Labels
        Text text1 = new Text("Genres:");
        Text text2 = new Text("Name:");
        Text text3 = new Text("Registered:");

        // Controls
        ComboBox<String> genreBox = new ComboBox<>();
        genreBox.setMaxWidth(Double.MAX_VALUE);

        TextField nameField = new TextField();

        ComboBox<String> registeredBox = new ComboBox<>();
        registeredBox.setMaxWidth(Double.MAX_VALUE);

        // Buttons
        Button saveBtn   = new Button("Save Movie");
        Button removeBtn = new Button("Remove Movie");
        Button backBtn   = new Button("Back");

        saveBtn.setMaxWidth(Double.MAX_VALUE);
        removeBtn.setMaxWidth(Double.MAX_VALUE);
        backBtn.setMaxWidth(Double.MAX_VALUE);

        // GridPane setup
        GridPane gridPane = new GridPane();
        gridPane.setMinSize(600, 400);
        gridPane.setPadding(new Insets(10, 10, 10, 10));
        gridPane.setVgap(10);
        gridPane.setHgap(10);
        gridPane.setAlignment(Pos.CENTER);

        ColumnConstraints col1 = new ColumnConstraints(120);
        ColumnConstraints col2 = new ColumnConstraints(250);
        gridPane.getColumnConstraints().addAll(col1, col2);

        // Add nodes
        gridPane.add(text1,       0, 0);
        gridPane.add(genreBox,    1, 0);

        gridPane.add(text2,       0, 1);
        gridPane.add(nameField,   1, 1);
        gridPane.add(saveBtn,     1, 2);

        gridPane.add(text3,       0, 3);
        gridPane.add(registeredBox, 1, 3);
        gridPane.add(removeBtn,   1, 4);

        gridPane.add(backBtn,     1, 5);

        // Navigation
        backBtn.setOnAction(e -> new Genres().start(stage));

        // Styling
        String btnStyle = "-fx-background-color: darkslateblue; -fx-text-fill: white; -fx-font-size: 13pt;";
        String labelStyle = "-fx-font: normal bold 20px 'serif';";

        saveBtn.setStyle(btnStyle);
        removeBtn.setStyle(btnStyle);
        backBtn.setStyle("-fx-background-color: steelblue; -fx-text-fill: white; -fx-font-size: 11pt;");

        text1.setStyle(labelStyle);
        text2.setStyle(labelStyle);
        text3.setStyle(labelStyle);
        gridPane.setStyle("-fx-background-color: BEIGE;");

        // Scene and Stage
        Scene scene = new Scene(gridPane);
        stage.setTitle("Movies");
        stage.setScene(scene);
        stage.show();
    }
}