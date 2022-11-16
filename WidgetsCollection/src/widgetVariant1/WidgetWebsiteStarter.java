package widgetVariant1;

import javafx.application.Application;
import javafx.event.*;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.*;

/*
 * The program provides a widget for launching special websites.
 * 
 * In Eclipse IDE set the "VM arguments" in the "Run Configuration..." to: 
 * --module-path="C:\Program Files\javafx-sdk-13.0.1\lib" --add-modules=javafx.controls,javafx.fxml
 */
public class WidgetWebsiteStarter extends Application {
	
	//style the appearance of the widget, layout
	@Override
	public void start(Stage stage) {
			VBox vBox = new VBox();
			vBox.setSpacing(10.0);
			vBox.setAlignment(Pos.CENTER);
			
			Button btnOne = new Button();
			Button btnTwo = new Button();
			Button btnThree = new Button();
			Button btnFour = new Button();
			Button btnFive = new Button();
			
			btnOne.setPrefSize(50.0, 50.0);
			btnTwo.setPrefSize(50.0, 50.0);
			btnThree.setPrefSize(50.0, 50.0);
			btnFour.setPrefSize(50.0, 50.0);
			btnFive.setPrefSize(50.0, 50.0);
			
			btnOne.getStyleClass().add("btnOne");
			btnTwo.getStyleClass().add("btnTwo");
			btnThree.getStyleClass().add("btnThree");
			btnFour.getStyleClass().add("btnFour");
			btnFive.getStyleClass().add("btnFive");
			
			vBox.getChildren().addAll(btnOne, btnTwo, btnThree, btnFour, btnFive);
			
			//handle the button clicks on the icons and launch the websites
			btnOne.setOnAction(new EventHandler<ActionEvent>() {		
				@Override
				public void handle(ActionEvent arg0) {
					getHostServices().showDocument("https://github.com");
				}
			});
			
			btnTwo.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent arg0) {
					getHostServices().showDocument("https://commons.wikimedia.org/wiki/Main_Page");
				}
			});
			
			btnThree.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent arg0) {
					getHostServices().showDocument("https://en.wikibooks.org/wiki/Main_Page");
				}
			});
			
			btnFour.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent arg0) {
					getHostServices().showDocument("https://docs.oracle.com/en/java/");					
				}
			});
			
			btnFive.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent arg0) {
					System.exit(0);				
				}
			});
			
			//set the stage and the scene and their properties
			Rectangle2D screenSize = Screen.getPrimary().getVisualBounds();
			stage.setX((screenSize.getWidth() - 90)); 	
			stage.setY(120);
			stage.initStyle(StageStyle.TRANSPARENT);
			Scene scene = new Scene(vBox, 50.0, 310.0);
			scene.setFill(Color.TRANSPARENT);
			scene.getStylesheets().add(getClass().getResource("styles.css").toExternalForm());
			stage.setScene(scene);
			stage.show();
	}
		
	public static void main(String[] args) {
		launch(args);
	}
}
