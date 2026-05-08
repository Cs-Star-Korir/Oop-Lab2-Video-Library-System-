import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Genres {

    public void start(Stage stage) {

        Text text1 = new Text("Genre:");
        Text text2 = new Text("Registered:");

        TextField textField1 = new TextField();
        ComboBox<String> comboBox = new ComboBox<>();
        comboBox.getItems().addAll("Yes", "No");

        Button button1 = new Button("Save");
        Button button2 = new Button("Remove");

        // ✅ NEW: Navigation buttons
        Button customersBtn = new Button("Customers");
        Button moviesBtn = new Button("Movies");
        Button rentalsBtn = new Button("Rentals");

        GridPane gridPane = new GridPane();
        gridPane.setMinSize(600, 400);
        gridPane.setPadding(new Insets(10));
        gridPane.setVgap(10);
        gridPane.setHgap(10);
        gridPane.setAlignment(Pos.CENTER);

        gridPane.add(text1, 0, 0);
        gridPane.add(textField1, 1, 0);
        gridPane.add(button1, 1, 1);
        gridPane.add(text2, 0, 2);
        gridPane.add(comboBox, 1, 2);
        gridPane.add(button2, 1, 3);

        // ✅ NEW: Add buttons to layout
        gridPane.add(customersBtn, 0, 4);
        gridPane.add(moviesBtn, 1, 4);
        gridPane.add(rentalsBtn, 1, 5);

        // ✅ NEW: Navigation logic
        customersBtn.setOnAction(e -> new Customers().start(stage));
        moviesBtn.setOnAction(e -> new Movies().start(stage));
        rentalsBtn.setOnAction(e -> new Rentals().start(stage));

        gridPane.setStyle("-fx-background-color: BEIGE;");

        Scene scene = new Scene(gridPane);
        stage.setTitle("Genres");
        stage.setScene(scene);
        stage.show();
    }
}