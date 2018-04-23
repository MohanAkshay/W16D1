package d1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class OneScreenToAnother extends Application{

	
	public final static double WINDOW_WIDTH = 400;
	public final static double WINDOW_HEIGHT = 400;
	
		
	public void UI(Pane theRoot)
	{	
      
		Label lblHead = new Label("Click Here");
		Button button = new Button("ON ME");
				
		lblHead.setLayoutX(150); lblHead.setLayoutY(70);
		lblHead.setFont(Font.font("Georgia",24));
		
		button.setLayoutX(180); button.setLayoutY(100);
		button.setOnAction((event) -> { submitAction(); });
		
		theRoot.getChildren().addAll(lblHead, button);
		
	}
	
	
	@Override 
	
	   public void start(Stage stage) 
	{
		stage.setTitle("One Screen to Another Screen");			// Label the stage (a window)
		Pane theRoot = new Pane();
        UI(theRoot);
		Scene scene = new Scene(theRoot,400,300);               //Creating a scene object
		stage.setScene(scene);                                  //Adding scene to the stage 
	    stage.show();                                           //Displaying the contents of the stage
	}
	
	
	 public static void main(String args[]){ 
	      launch(args); 
	   } 
	
	
	public void submitAction() 
	{	
		      Stage theStage = new Stage();
		      theStage.setTitle("I'am The Other Screen");       	// Label the stage (a window)
			  Pane theRoot = new Pane();						            	// Create a pane within the window
			  Scene theScene = new Scene(theRoot, WINDOW_WIDTH, WINDOW_HEIGHT);	// Create the scene
			  theStage.setScene(theScene);						             	// Set the scene on the stage
			  theStage.show();							            			// Show the stage to the user            	
	}  
}