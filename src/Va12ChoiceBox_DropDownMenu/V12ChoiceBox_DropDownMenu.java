package Va12ChoiceBox_DropDownMenu;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Created by relu on 08.07.2017.
 */
public class V12ChoiceBox_DropDownMenu  extends Application {
    Stage window;
    Scene scene;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = new Stage();
        window.setTitle("ChoiceBox Example");
        Button button = new Button("Chose");

        ChoiceBox<String> choiceBox = new ChoiceBox<>();

        Label label = new Label("Chose your favorite fruit");

        //getItems returns the ObservableList object which you can add items to
        choiceBox.getItems().addAll("Apple", "Bananas", "Bacon", "Ham", "Meatballs");
        choiceBox.getSelectionModel().select(2); // se prefera folosirea acestei metode cand stochez obiecte in baza de date
        //sau mai pot sa folosesc choiceBox.setValue("Apple");

        button.setOnAction(e -> {
            String result = choiceBoxHandler(choiceBox);
            System.out.println(result);
        });

        VBox layout = new VBox(10);
        layout.getChildren().addAll(label, button, choiceBox);
        layout.setPadding(new Insets(20, 20, 20, 20));

        scene = new Scene(layout, 480, 320);
        window.setScene(scene);
        window.show();
    }
    private String choiceBoxHandler(ChoiceBox<String> choiceBox){
        return choiceBox.getValue().toString();
    }
}
