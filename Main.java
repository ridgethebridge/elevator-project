
/*
 * 
 *
 * IMPORTANT STUFF!!!!
 * use requested field, and getRequestChoice method,
 * every frame choice of each passenger changes
 * probable done in building
 *
 * elevators should have dest floors based on 1st passenger
 * if dest floor = currentFloor then next passenger takes pririoty and direction is based on dest floor relation to current floor
 *
 * put labels next to floor showing num of passengers on floor
 *
 * put large label on the right showing text stating drop offs and pick ups, then write that info to file
 * properly switch directions
 * add iterations
 * then add a start button to start animation, maybe a puse button
 * properly add passengers to floors
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
	stage.setTitle("elevator simulator");
	stage.show();

}


public static void main(String args[]) {
	launch();
}

}
