
/*
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
	Settings s = new Settings("init.txt");

	Building b = new Building(s.numFloors,1600,600,s.numStandard,s.numExpress,s.patientRP,s.staffRP,s.numPatient,s.numStaff,s.standardCapacity,s.expressCapacity,s.standardRP,s.expressRP);
	ElevatorPane p = new ElevatorPane(b);
	stage.setScene(new Scene(p,700,700));
	stage.show();

}


public static void main(String args[]) {
	launch();
}

}
