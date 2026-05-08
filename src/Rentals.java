import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Rentals {

    public void start(Stage stage) {

        Text text1 = new Text("Customer:");
        Text text2 = new Text("Genre:");
        Text text3 = new Text("Movies:");
        Text text4 = new Text("Borrowed:");
        Text text5 = new Text("Returned:");

        ComboBox<String> customerBox = new ComboBox<>();
        ComboBox<String> genreBox = new ComboBox<>();
        ComboBox<String> moviesBox = new ComboBox<>();
        ComboBox<String> borrowedBox = new ComboBox<>();
        ComboBox<String> returnedBox = new ComboBox<>();

        borrowedBox.getItems().addAll("Yes", "No");
        returnedBox.getItems().addAll("Yes", "No");

        Button saveRental = new Button("Save Rental");
        Button returnMovie = new Button("Return Movie");
        Button backBtn = new Button("Back");

        GridPane gridPane = new GridPane();
        gridPane.setMinSize(700, 500);
        gridPane.setPadding(new Insets(10));
        gridPane.setVgap(10);
        gridPane.setHgap(10);
        gridPane.setAlignment(Pos.CENTER);

        gridPane.add(text1, 0, 0);
        gridPane.add(customerBox, 1, 0);

        gridPane.add(text2, 0, 1);
        gridPane.add(genreBox, 1, 1);

        gridPane.add(text3, 0, 2);
        gridPane.add(moviesBox, 1, 2);

        gridPane.add(saveRental, 1, 3);

        gridPane.add(text4, 0, 4);
        gridPane.add(borrowedBox, 1, 4);

        gridPane.add(returnMovie, 1, 5);

        gridPane.add(text5, 0, 6);
        gridPane.add(returnedBox, 1, 6);

        gridPane.add(backBtn, 1, 7);

        backBtn.setOnAction(e -> new Genres().start(stage));

        Scene scene = new Scene(gridPane);
        stage.setTitle("Rentals");
        stage.setScene(scene);
        stage.show();
    }
}