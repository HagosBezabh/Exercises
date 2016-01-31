package javafxexamples;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class SceneChange extends Application {
	
	Stage window;
	Scene scene1,scene2;
	public void start(Stage stage) {
		try {
			 window=stage;
			EnumTest lb1= new EnumTest("This is the first Scene");
			Button btn1=new Button("go to Scene two");
			btn1.setOnAction(e->window.setScene(scene2));
			
			VBox layout1=new VBox(20);
			layout1.getChildren().addAll(lb1,btn1);
			scene1= new Scene(layout1,300,300);
			
			//button2
			Button btn2= new Button("go to scene1");
			btn2.setOnAction(e->window.setScene(scene1));
			
			//layout2
			StackPane layout2=new StackPane();
			layout2.getChildren().add(btn2);
			
			scene2=new Scene(layout2,300,300);
			window.setScene(scene1);
			window.setTitle("TITLE");
			window.show();
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
