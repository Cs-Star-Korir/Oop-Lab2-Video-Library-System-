import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * Rentals screen for the Video Library System.
 * Allows a customer to rent and return movies.
 * Customer selects their name, picks a genre to filter movies,
 * then saves a rental or returns a borrowed movie.
 */
public class Rentals {

    /**
     * Displays the Rentals GUI on the given stage.
     * @param stage the JavaFX stage
     */
    public void start(Stage stage) {

        // Labels
        Text text1 = new Text("Customer:");
        Text text2 = new Text("Genre:");
        Text text3 = new Text("Movies:");
        Text text4 = new Text("Borrowed:");
        Text text5 = new Text("Returned:");

        // ComboBoxes — all full width
        ComboBox<String> customerBox = new ComboBox<>();
        ComboBox<String> genreBox    = new ComboBox<>();
        ComboBox<String> moviesBox   = new ComboBox<>();
        ComboBox<String> borrowedBox = new ComboBox<>();
        ComboBox<String> returnedBox = new ComboBox<>();

        customerBox.setMaxWidth(Double.MAX_VALUE);
        genreBox.setMaxWidth(Double.MAX_VALUE);
        moviesBox.setMaxWidth(Double.MAX_VALUE);
        borrowedBox.setMaxWidth(Double.MAX_VALUE);
        returnedBox.setMaxWidth(Double.MAX_VALUE);

        // Buttons
        Button saveRental  = new Button("Save Rental");
        Button returnMovie = new Button("Return Movie");
        Button backBtn     = new Button("Back");

        saveRental.setMaxWidth(Double.MAX_VALUE);
        returnMovie.setMaxWidth(Double.MAX_VALUE);
        backBtn.setMaxWidth(Double.MAX_VALUE);

        // GridPane setup
        GridPane gridPane = new GridPane();
        gridPane.setMinSize(700, 500);
        gridPane.setPadding(new Insets(10, 10, 10, 10));
        gridPane.setVgap(10);
        gridPane.setHgap(10);
        gridPane.setAlignment(Pos.CENTER);

        ColumnConstraints col1 = new ColumnConstraints(120);
        ColumnConstraints col2 = new ColumnConstraints(250);
        gridPane.getColumnConstraints().addAll(col1, col2);

        // Add nodes in order matching the lab diagram
        gridPane.add(text1,       0, 0);
        gridPane.add(customerBox, 1, 0);

        gridPane.add(text2,    0, 1);
        gridPane.add(genreBox, 1, 1);

        gridPane.add(text3,     0, 2);
        gridPane.add(moviesBox, 1, 2);

        gridPane.add(saveRental, 1, 3);

        gridPane.add(text4,       0, 4);
        gridPane.add(borrowedBox, 1, 4);

        gridPane.add(returnMovie, 1, 5);

        gridPane.add(text5,       0, 6);
        gridPane.add(returnedBox, 1, 6);

        gridPane.add(backBtn, 1, 7);

        // Navigation
        backBtn.setOnAction(e -> new Genres().start(stage));

        // Styling — matching teacher's lab output
        String btnStyle   = "-fx-background-color: darkslateblue; -fx-text-fill: white; -fx-font-size: 13pt;";
        String labelStyle = "-fx-font: normal bold 20px 'serif';";

        saveRental.setStyle(btnStyle);
        returnMovie.setStyle(btnStyle);
        backBtn.setStyle("-fx-background-color: steelblue; -fx-text-fill: white; -fx-font-size: 11pt;");

        text1.setStyle(labelStyle);
        text2.setStyle(labelStyle);
        text3.setStyle(labelStyle);
        text4.setStyle(labelStyle);
        text5.setStyle(labelStyle);
        gridPane.setStyle("-fx-background-color: BEIGE;");

        // Scene and Stage
        Scene scene = new Scene(gridPane);
        stage.setTitle("Rentals");
        stage.setScene(scene);
        stage.show();
    }
}