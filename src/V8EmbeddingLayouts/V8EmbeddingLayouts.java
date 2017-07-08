package V8EmbeddingLayouts;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Created by relu on 06.07.2017.
 */
public class V8EmbeddingLayouts extends Application {

    Stage window;
    Scene scene;

    public static void main(String [] args){
        launch(args);

    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        HBox topMenu=new HBox();

        Button button1=new Button("File");
        Button button2=new Button("Edit");
        Button button3=new Button("View");
        topMenu.getChildren().addAll(button1,button2,button3);

        VBox leftMenu=new VBox();

        Button buttonD=new Button("D");
        Button buttonE=new Button("E");
        Button buttonF=new Button("F");
        leftMenu.getChildren().addAll(buttonD,buttonE,buttonF);

        BorderPane borderPane=new BorderPane();
        borderPane.setTop(topMenu);
        borderPane.setLeft(leftMenu);

        scene=new Scene(borderPane,640,480);

        window=primaryStage;
        window.setScene(scene);
        window.setTitle("App");
        window.show();

    }
}