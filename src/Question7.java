import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Question7 extends Application{
    int x = 0;
    @Override
    public void start(Stage primaryStage) throws Exception {


       HBox h1 = new HBox();
       Button myButton = new Button("Click Here");
       TextField input = new TextField();
       myButton.setOnAction(e -> { clicker(input); });
       BorderPane myPane = new BorderPane();
       h1.getChildren().addAll(myButton, input);
       myPane.setCenter(h1);
       Scene myScene = new Scene(myPane, 300, 250);
       primaryStage.setTitle("clicker");
       primaryStage.setScene(myScene);
       primaryStage.show();
    }


    public static void main(String[] args){
       launch(args);
    }
    public void clicker(TextField input){
       x++;
       if(x == 1){
           input.setText("You have clicked " + x + " time");
       }
       else if(x > 1){
           input.setText("You have clicked " + x + " times");
       }
    }
}

