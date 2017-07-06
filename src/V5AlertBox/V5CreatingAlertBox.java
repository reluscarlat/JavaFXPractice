package V5AlertBox;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Created by relu on 06.07.2017.
 */
public class V5CreatingAlertBox extends Application {
    Button button;
    Stage window;
    Scene scene;

    public static void main(String [] args){
        launch(args);

    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        button=new Button("OLE");
        button.setOnAction(e->AlertBox.display("Title of the App","Wow, this alert box is awsome"));

        StackPane layout=new StackPane();
        layout.getChildren().add(button);
        scene=new Scene(layout,640,480);

        window=primaryStage;
        window.setScene(scene);
        window.setTitle("App");
        window.show();

    }
}
