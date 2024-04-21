
import javafx.animation.AnimationTimer;
import javafx.scene.layout.Pane;
public class ElevatorPane extends Pane {

	AnimationTimer timer;
public ElevatorPane(Building b) {



	int num = b.getFloorNum();
	b.floors.get(0).elevatorList.add(new StandardElevator(50.0,10,b.floors.get(0)));
	
	for(int i = 0; i < num; ++i) {
		getChildren().add(b.floors.get(i).getFigure());

	}
		// anon class for animation

	timer = new AnimationTimer() {
	
		public void handle(long t) {
		b.moveElevator();	
		}


	};

	timer.start();


}

}
