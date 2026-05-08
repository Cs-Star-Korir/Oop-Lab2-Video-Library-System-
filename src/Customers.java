import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Customers {

    public void start(Stage stage) {

        Text text1 = new Text("Full Name:");
        Text text2 = new Text("Registered:");

        TextField nameField = new TextField();
        ComboBox<String> registeredBox = new ComboBox<>();
        registeredBox.getItems().addAll("Yes", "No");

        Button saveBtn = new Button("Save");
        Button removeBtn = new Button("Remove");

        Button backBtn = new Button("Back");

        GridPane gridPane = new GridPane();
        gridPane.setMinSize(600, 400);
        gridPane.setPadding(new Insets(10));
        gridPane.setVgap(10);
        gridPane.setHgap(10);
        gridPane.setAlignment(Pos.CENTER);

        gridPane.add(text1, 0, 0);
        gridPane.add(nameField, 1, 0);
        gridPane.add(saveBtn, 1, 1);

        gridPane.add(text2, 0, 2);
        gridPane.add(registeredBox, 1, 2);
        gridPane.add(removeBtn, 1, 3);

        gridPane.add(backBtn, 1, 4);

        backBtn.setOnAction(e -> new Genres().start(stage));

        Scene scene = new Scene(gridPane);
        stage.setTitle("Customers");
        stage.setScene(scene);
        stage.show();
    }
}