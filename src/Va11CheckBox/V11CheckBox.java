package Va11CheckBox;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Created by relu on 08.07.2017.
 */
public class V11CheckBox extends Application {
    Stage window;
    Scene scene;
    public static void main(String [] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window=new Stage();
        window.setTitle("CheckBox Example");

        //CheckBoxes
        CheckBox box1=new CheckBox("Bacon");
        CheckBox box2=new CheckBox("Tuna");
        box2.setSelected(true);

        //buton
        Button button=new Button("Order now");
        button.setOnAction(e->{
            handleOptions(box1,box2);

        });

        //layout
        VBox layout=new VBox(10);
        layout.getChildren().addAll(box1,box2,button);
        layout.setPadding(new Insets(20,20,20,20));

        scene=new Scene(layout,480,320);
        window.setScene(scene);
        window.show();
    }

    private void handleOptions(CheckBox box1,CheckBox box2){
        String message="User order: ";
        if(box1.isSelected()){
            message+="Bacon ";
        }
        if(box2.isSelected()){
            message+="Tuna ";
        }
        System.out.println(message);
    }
}
