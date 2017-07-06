package V7ClosingTheProgramProperly;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Created by relu on 06.07.2017.
 */
public class V7ClosingTheProgramProperly extends Application {
    Button button;
    Stage window;
    Scene scene;

    public static void main(String [] args){
        launch(args);

    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        button=new Button("Close Program");
        button.setOnAction(e->closeProgram());

        StackPane layout=new StackPane();
        layout.getChildren().add(button);
        scene=new Scene(layout,640,480);

        window=primaryStage;
        window.setScene(scene);
        window.setTitle("Tilte of the app");
        window.show();

        //X red button append closeProgram method to close
        window.setOnCloseRequest(e->{
            e.consume();  //Consume the event because I dont want to be realised. If the event from this method is realised the program will be closed, and I don't want this.
            closeProgram();
        });
    }
    public void closeProgram(){
        Boolean answer=ConfirmBox.display("title","Sure you want to exit?");
        if(answer) {
            window.close();
            System.out.println("File saved");
        }
    }
}
