package Va13ListenerForSelectionChanges;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Created by relu on 08.07.2017.
 */
public class ListenerForSelectionChanges extends Application {
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

        //Listen for selection changes
        choiceBox.getSelectionModel().selectedItemProperty().addListener( (v,oldValue,newValeu)->System.out.println(newValeu) );
        /*
        * v = list of values from choiceBox
        * oldValue = the preselected value
        * newValue = value that I click on
        * */


        VBox layout = new VBox(10);
        layout.getChildren().addAll(label, button, choiceBox);
        layout.setPadding(new Insets(20, 20, 20, 20));

        scene = new Scene(layout, 480, 320);
        window.setScene(scene);
        window.show();
    }


}
