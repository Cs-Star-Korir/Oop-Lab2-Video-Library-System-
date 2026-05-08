import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Movies {

    public void start(Stage stage) {

        Text text1 = new Text("Title:");
        Text text2 = new Text("Genre:");
        Text text3 = new Text("Registered:");

        TextField titleField = new TextField();

        ComboBox<String> genreBox = new ComboBox<>();
        genreBox.getItems().addAll("Action", "Comedy", "Drama");

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
        gridPane.add(titleField, 1, 0);

        gridPane.add(text2, 0, 1);
        gridPane.add(genreBox, 1, 1);

        gridPane.add(saveBtn, 1, 2);

        gridPane.add(text3, 0, 3);
        gridPane.add(registeredBox, 1, 3);

        gridPane.add(removeBtn, 1, 4);
        gridPane.add(backBtn, 1, 5);

        backBtn.setOnAction(e -> new Genres().start(stage));

        Scene scene = new Scene(gridPane);
        stage.setTitle("Movies");
        stage.setScene(scene);
        stage.show();
    }
}