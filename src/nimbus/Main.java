/**
 * 
 */
package nimbus;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;

/**
 * @author loganrooper
 *
 */
public class Main extends Application {
	Stage myStage;
	Group root;
	Scene currentWorldScene;

	public static void main(String[] args) {
		launch(args);
	}

	public void start(Stage theStage) {
		theStage.setTitle("Project Nimbus");
		myStage = theStage;
		root = new Group();
		currentWorldScene = new Scene(root);
		myStage.setScene(currentWorldScene);
		initializeInterface();
	}

	public void initializeInterface() {
		ObservableList<String> options = FXCollections.observableArrayList("Option 1", "Option 2", "Option 3");
		final ComboBox comboBox = new ComboBox(options);
		
	}

}
