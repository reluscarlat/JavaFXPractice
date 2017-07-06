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

public class V3AnonymousClassLambdaClass extends Application implements EventHandler<ActionEvent> {

    Button button;

    public static void main(String [] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        button = new Button("Click me");
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("hi hi hi, ha ha ha ");
            }
        });

        Button button1=new Button("Buton2");
        button1.setOnAction(e -> System.out.println("HOHOHOHOHO"));
        button1.setTranslateX(100);
        button1.setTranslateY(100);

        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        layout.getChildren().add(button1);


        Scene scene=new Scene(layout,640   ,480);
        primaryStage.setTitle("Title of the window");
        primaryStage.setScene(scene);
        primaryStage.show();

    }


    @Override
    public void handle(ActionEvent event) {

    }
}



