
/* try adding settings to building so building can get info
 * put elevators in building, in a list
 * traverse the elevators thorugh the linkedlist of floors
 * express should take all staff before taking patients on floor
 * elevator, passengers, floors, all initilized in building or maybe in Main with multiple params specifying building constructor
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;

public class Main extends Application {


public void start(Stage stage) {

	Building b = new Building(20,800,800,10,10);
	ElevatorPane p = new ElevatorPane(b);
	stage.setScene(new Scene(p,700,700));
	stage.show();

}


public static void main(String args[]) {
	launch();
}

}
