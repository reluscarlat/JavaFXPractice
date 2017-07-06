import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Created by relu on 06.07.2017.
 */
public class V1CreatBasicWindow extends Application {
    public static void main(String [] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Button button = new Button(" ");

        StackPane layout=new StackPane();
        layout.getChildren().add(button);

        Scene scene=new Scene(layout,640,480);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
