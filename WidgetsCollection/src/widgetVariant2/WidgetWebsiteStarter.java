package widgetVariant2;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.Reflection;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/*
 * The program provides a widget for launching special websites.
 * 
 * In Eclipse IDE set the "VM arguments" in the "Run Configuration..." to: 
 * --module-path="C:\Program Files\javafx-sdk-13.0.1\lib" --add-modules=javafx.controls,javafx.fxml
 */
public class WidgetWebsiteStarter extends Application {
	
	String[] paths = {
			"https://github.com",
			"https://commons.wikimedia.org/wiki/Main_Page",
			"https://en.wikibooks.org/wiki/Main_Page",
			"https://docs.oracle.com/en/java/"
	};
	
	String[] images = {
		"images/github-circle.png",
		"images/wikimedia-commons-logo.png",
		"images/wikibooks-logo.png",
		"images/java-mascot.png",
		"images/red-cancel-btn.png"
	};
	
	//style the appearance of the widget, layout
	@Override
	public void start(Stage stage) throws Exception {
		Group group = new Group();		
		ImageView imgBoard = new ImageView(new Image("images/black-board-5.png"));
		imgBoard.setFitHeight(110);
		imgBoard.setFitWidth(620);
		imgBoard.setY(130);	
		group.getChildren().add(imgBoard);
		//set the position of the images
		for(int imgIdx = 0; imgIdx < images.length; imgIdx++) {
			ImageView img = new ImageView(new Image(images[imgIdx]));
			img.setFitWidth(65.0);
			img.setFitHeight(65.0);
			img.setX(110 + imgIdx * 90);
			img.setY(140);
			img.setScaleX(0.9);
			img.setScaleY(0.9);
			img.setEffect(new Reflection());
			
			//call methods to zoom in or zoom out the website images 
			makeItLarger(img);
			makeItSmaller(img);
			//call method clickImage() to handle mouse clicks
			clickImage(imgIdx, img);
			
			group.getChildren().add(img);
		}
		
		//set the stage and the scene and their properties
		stage.initStyle(StageStyle.TRANSPARENT);
		stage.setResizable(false);
		int sceneWidth = 600;
		int sceneHeight = 300;
		Scene scene = new Scene(group, sceneWidth, sceneHeight);
		Rectangle2D screen2D = Screen.getPrimary().getVisualBounds();
		stage.setX((screen2D.getWidth() / 2) - sceneWidth / 2);
		stage.setY(screen2D.getHeight() - sceneHeight);
		scene.setFill(Color.TRANSPARENT);
		stage.setScene(scene);
		stage.show();	
	}
	
	//handle the mouse clicks on the icons and launch the websites
	public void clickImage(int imgIdx, ImageView img) {
		img.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent mouseEvent) {
				switch (imgIdx) {
				case 0:
					getHostServices().showDocument(paths[0]);
					break;
				case 1:
					getHostServices().showDocument(paths[1]);
					break;
				case 2:
					getHostServices().showDocument(paths[2]);
					break;
				case 3:
					getHostServices().showDocument(paths[3]);
					break;
				case 4:
					System.exit(0);
				default:
					System.err.println("Error!");
				}
			}
		});
	}
	
	//zoom in images 
	public void makeItLarger(ImageView img) {
		img.setOnMouseEntered(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent mouseEvent) {
				img.setScaleX(1.4);
				img.setScaleY(1.4);				
			}
		});
	}
	
	//zoom out images
	public void makeItSmaller(ImageView img) {
		img.setOnMouseExited(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent mouseEvent) {
				img.setScaleX(0.9);
				img.setScaleY(0.9);				
			}
		});
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
