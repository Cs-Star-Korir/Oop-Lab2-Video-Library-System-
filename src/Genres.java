import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * Genres screen for the Video Library System.
 * Allows saving and removing genres.
 */
public class Genres {

    /**
     * Displays the Genres GUI on the given stage.
     * @param stage the JavaFX stage
     */
    public void start(Stage stage) {

        // Step 1: Create labels
        Text text1 = new Text("Name:");
        Text text2 = new Text("Registered:");

        // Step 2: Create input controls
        TextField textField1 = new TextField();
        ComboBox<String> comboBox = new ComboBox<>();
        comboBox.setMaxWidth(Double.MAX_VALUE);

        // Step 3: Create buttons
        Button button1 = new Button("Save");
        Button button2 = new Button("Remove");

        // Navigation buttons
        Button moviesBtn  = new Button("Movies");
        Button customersBtn = new Button("Customers");
        Button rentalsBtn = new Button("Rentals");

        // Step 4: Make buttons fill full column width
        button1.setMaxWidth(Double.MAX_VALUE);
        button2.setMaxWidth(Double.MAX_VALUE);
        moviesBtn.setMaxWidth(Double.MAX_VALUE);
        customersBtn.setMaxWidth(Double.MAX_VALUE);
        rentalsBtn.setMaxWidth(Double.MAX_VALUE);

        // Step 5: Create GridPane
        GridPane gridPane = new GridPane();
        gridPane.setMinSize(600, 400);
        gridPane.setPadding(new Insets(10, 10, 10, 10));
        gridPane.setVgap(10);
        gridPane.setHgap(10);
        gridPane.setAlignment(Pos.CENTER);

        // Step 6: Column widths
        ColumnConstraints col1 = new ColumnConstraints(120);
        ColumnConstraints col2 = new ColumnConstraints(250);
        gridPane.getColumnConstraints().addAll(col1, col2);

        // Step 7: Add nodes to grid
        gridPane.add(text1,    0, 0);
        gridPane.add(textField1, 1, 0);
        gridPane.add(button1,  1, 1);

        gridPane.add(text2,   0, 2);
        gridPane.add(comboBox, 1, 2);
        gridPane.add(button2, 1, 3);

        // Navigation row
        gridPane.add(moviesBtn,    0, 5);
        gridPane.add(customersBtn, 1, 5);
        gridPane.add(rentalsBtn,   1, 6);

        // Step 8: Navigation actions
        moviesBtn.setOnAction(e -> new Movies().start(stage));
        customersBtn.setOnAction(e -> new Customers().start(stage));
        rentalsBtn.setOnAction(e -> new Rentals().start(stage));

        // Step 9: Styling — matching lab output exactly
        String btnStyle = "-fx-background-color: darkslateblue; -fx-text-fill: white; -fx-font-size: 13pt;";
        String navStyle = "-fx-background-color: steelblue; -fx-text-fill: white; -fx-font-size: 11pt;";
        String labelStyle = "-fx-font: normal bold 20px 'serif';";

        button1.setStyle(btnStyle);
        button2.setStyle(btnStyle);
        moviesBtn.setStyle(navStyle);
        customersBtn.setStyle(navStyle);
        rentalsBtn.setStyle(navStyle);

        text1.setStyle(labelStyle);
        text2.setStyle(labelStyle);
        gridPane.setStyle("-fx-background-color: BEIGE;");

        // Step 10: Scene and Stage
        Scene scene = new Scene(gridPane);
        stage.setTitle("Genres");
        stage.setScene(scene);
        stage.show();
    }
}