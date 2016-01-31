package javafxexamples;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;


public class ClickMe extends Application {
	@Override
	public void start(Stage stage) {
		try {
			// Any javafx GUI application extends Application
			// and it has the launch method
			//and there start method is called......and accepts stage object.....
			//Stage is the whole window
			//using the stage u create the title of the window.
			// and u add the button, labels,and the likes
			// then u define the layout....
			// add the elements to the to the layout
			// create the Scene with the layout object, and horizontal and vertical size
			stage.setTitle("Click me");
			Button btn=new Button();
			btn.setText("Click me");
			StackPane pane=new StackPane();
			pane.getChildren().add(btn);
			
			Scene scene=new Scene(pane,300,300);
			stage.setScene(scene);
			stage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
