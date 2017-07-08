package V9GridPane;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;



/**
 * Created by relu on 07.07.2017.
 */
public class V9GridPane extends Application {
    Stage window;
    public static void main(String [] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window=primaryStage;
        window.setTitle("JavaFx-Demo");

        GridPane grid=new GridPane();
        grid.setPadding(new Insets(10,10,10,10));
        grid.setVgap(8);
        grid.setHgap(10);

        //Name label
        Label nameLabel= new Label("Username");
        GridPane.setConstraints(nameLabel,0,0);

        //Name imput
        TextField nameInput=new TextField("Relu");
        GridPane.setConstraints(nameInput,1,0);

        //Pasword label
        Label passLabel=new Label("Password");
        GridPane.setConstraints(passLabel,0,1);
        window.show();

        //Pasword input
        TextField passInput=new TextField();
        passInput.setPromptText("password");
        GridPane.setConstraints(passInput,1,1);

        //Log In button
        Button loginButton =new Button("Log In");
        GridPane.setConstraints(loginButton,1,2);

        grid.getChildren().addAll(nameLabel,nameInput,passLabel,passInput,loginButton);

        Scene scene=new Scene(grid,300,200);
        window.setScene(scene);
        window.show();
    }
}
