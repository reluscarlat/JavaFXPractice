import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import static javafx.application.Application.launch;

/**
 * Created by relu on 06.07.2017.
 */
public class V4SwitchingScene extends Application {

    Button button1;
    Button button2;

    Stage window;
    Scene scene1;
    Scene scene2;

    public static void main(String [] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

       window=primaryStage;

       Label label=new Label("Welcome to first scene!");
       label.setTranslateX(-200);
       label.setTranslateY(150);

       Label label2=new Label("Welcome to first scene!");
       label2.setTranslateX(-100);
       label2.setTranslateY(750);

       button1=new Button("Go to second scene");
       StackPane layout1=new StackPane();
       layout1.getChildren().addAll(button1,label);
       scene1=new Scene(layout1,640,320);
       button1.setOnAction(e->window.setScene(scene2));

       button2=new Button("Go back to firs scene");
       StackPane layout2=new StackPane();
       layout2.getChildren().addAll(button2,label2);
       scene2=new Scene(layout2,320,240);
       button2.setOnAction(e->window.setScene(scene1));

       window.setScene(scene1);
       window.show();
    }

}
