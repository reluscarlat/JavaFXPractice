package V10ExtractAndValidateInput;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * Created by relu on 08.07.2017.
 */
public class V10ExtractAndValidateInput extends Application {
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
            grid.setVgap(10);
            grid.setHgap(10);

            //Name label
            Label nameLabel= new Label("Username");
            GridPane.setConstraints(nameLabel,0,0);

            //Name imput
            TextField nameInput=new TextField("Relu");
            GridPane.setConstraints(nameInput,1,0);
            int a;
            //Age label
            Label ageLabel=new Label("Age");
            GridPane.setConstraints(ageLabel,0,1);
            window.show();

            //Age input
            TextField ageInput=new TextField();
            ageInput.setPromptText("age");
            GridPane.setConstraints(ageInput,1,1);

            //Log In button
            Button loginButton =new Button("Log In");
            GridPane.setConstraints(loginButton,1,2);

            grid.getChildren().addAll(nameLabel,nameInput,ageLabel,ageInput,loginButton);

            //Extracting and validating data:
            loginButton.setOnAction(e->{
                if(isInt(ageInput,ageInput.getText())) {
                    System.out.println("name:" + nameInput.getText());
                    System.out.println("age:" + ageInput.getText());
                }
            });

            Scene scene=new Scene(grid,300,200);
            window.setScene(scene);
            window.show();
        }

        private boolean isInt(TextField input, String message){
            try{
                int age= Integer.parseInt(input.getText());
                return true;
            }catch(NumberFormatException e){
                System.out.println(message+" is not a number");
                return false;
            }
    }
}
