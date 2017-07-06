import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Created by relu on 04.07.2017.
 * This project is inspired by thenewboston youtube channel.
 */
   /*
        * JavaFX hints:
        * stage= intrega feresatra
        * scene= interiorul ferestrei, unde se pun butoanele, casetee de text, etc
        * stackPane= stiva de panouri, pe care adaug elemente
        * */

public class V2HandleUserEvent extends Application implements EventHandler<ActionEvent> {

    Button button;

    public static void main(String [] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        button = new Button();
        button.setText("Click me");
        button.setOnAction(this);


        StackPane layout = new StackPane();
        layout.getChildren().add(button);

        Scene scene=new Scene(layout,300,200);
        primaryStage.setTitle("Title of the window");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    @Override
    public void handle(ActionEvent event) {
        if(event.getSource()==button){
            System.out.println("Ai apasat pe buton");
        }
    }
}



