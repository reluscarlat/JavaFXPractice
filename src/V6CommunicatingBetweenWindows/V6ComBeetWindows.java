package V6CommunicatingBetweenWindows;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Created by relu on 06.07.2017.
 */
public class V6ComBeetWindows extends Application {
    Button button;
    Stage window;
    Scene scene;

    public static void main(String [] args){
        launch(args);

    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        button=new Button("Go to next scene");
        button.setOnAction(e->{
            boolean result=ConfirmBox.display("title","Are you sure you want to send pics?");
            System.out.println(result);
        });

        StackPane layout=new StackPane();
        layout.getChildren().add(button);
        scene=new Scene(layout,640,480);

        window=primaryStage;
        window.setScene(scene);
        window.setTitle("App");
        window.show();

    }
}
