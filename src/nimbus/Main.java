/**
 * 
 */
package nimbus;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * @author loganrooper
 *
 */
public class Main extends Application {
	Stage stage;
	Group root;
	Scene scene;

	public static void main(String[] args) {
		launch(args);
	}

	public void start(Stage theStage) {
		theStage.setTitle("Project Nimbus");
		stage = theStage;
		root = new Group();
		scene = new Scene(root, 450, 250);
		stage.setScene(scene);
		initializeInterface();
	}

	public void initializeInterface() {
		GridPane grid = new GridPane();
		grid.setVgap(4);
		grid.setHgap(10);
		grid.setPadding(new Insets(5, 5, 5, 5));
		final ComboBox drop = new ComboBox();
		drop.setPromptText("Select a recent zipcode:");
		drop.getItems().addAll("...");
		grid.add(drop, 1, 0);
		Button button = new Button();
		button.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				if (drop.getValue() != null) {

				} else {

				}
			}
		});
		button.setText("Submit");
		grid.add(button, 2, 0);
		Group root = (Group)scene.getRoot();
        root.getChildren().add(grid);
        stage.setScene(scene);
        stage.show();
	}

}
