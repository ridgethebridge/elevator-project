

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;

public class Main extends Application {


public void start(Stage stage) {
	Building b = new Building(20,800,800);
	ElevatorPane p = new ElevatorPane(b);
	stage.setScene(new Scene(p,700,700));
	stage.show();

}


public static void main(String args[]) {
	launch();
}

}