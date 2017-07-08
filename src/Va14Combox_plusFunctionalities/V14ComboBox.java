package Va14Combox_plusFunctionalities;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Created by relu on 08.07.2017.
 */
public class V14ComboBox  extends Application {
    Stage window;
    Scene scene;
    Button button;
    ComboBox<String> comboBox;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = new Stage();
        window.setTitle("ChoiceBox Example");
        button = new Button("Submit");
        Label label = new Label("Chose your favorite fruit");

        comboBox = new ComboBox<>();
        comboBox.getItems().addAll(
                "Good Will Hunting",
                "St. Vincent",
                "Blackhat"
        );
        comboBox.setPromptText("Movies");
        comboBox.setOnAction(e->printMovie());

        button.setOnAction(e->printMovie());
        comboBox.setEditable(true); // Now, I can edit what to chose from comboBox

        VBox layout = new VBox(10);
        layout.getChildren().addAll(label, button,comboBox);
        layout.setPadding(new Insets(20, 20, 20, 20));

        scene = new Scene(layout, 480, 320);
        window.setScene(scene);
        window.show();
    }
        private void printMovie(){
        System.out.println(comboBox.getValue());

        }
}
