package code.examples.javafxmaven;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JavaFXAppWithMaven extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    
    private int counter;
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("JavaFX with Maven Example");
        
        final Button btn = new Button();
        btn.setText(text());
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent event) {
                counter++;
                btn.setText(text());
            }
        });
        
        final StackPane root = new StackPane();
        root.getChildren().add(btn);
        
        primaryStage.setScene(new Scene(root, 500, 300));
        primaryStage.show();
    }
    
    private String text() {
        return "Click Count: " + counter;
    }
}
