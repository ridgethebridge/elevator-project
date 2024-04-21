
/*
 * 
 * traverse the elevators thorugh the linkedlist of floors
 * express should take all staff before taking patients on floor
 * elevator, passengers, floors, all initilized in building or maybe in Main with multiple params specifying building constructor
 * implement direction and movement, but how????!!!!
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;

public class Main extends Application {


public void start(Stage stage) {
	Settings s = new Settings("init.txt");

	// using const of 300, good width 600 also decent
	Building b = new Building(s.numFloors,300,600,s.numStandard,s.numExpress,s.patientRP,s.staffRP,s.numPatient,s.numStaff,s.standardCapacity,s.expressCapacity,s.standardRP,s.expressRP);
	stage.setResizable(false);
	ElevatorPane p = new ElevatorPane(b);
	stage.setScene(new Scene(p,700,700));
	stage.show();

}


public static void main(String args[]) {
	launch();
}

}
