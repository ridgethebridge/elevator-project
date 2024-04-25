
import javafx.animation.AnimationTimer;
import javafx.scene.layout.Pane;
public class ElevatorPane extends Pane {

	AnimationTimer timer;
public ElevatorPane(Building b) {



	int num = b.getFloorNum();
	b.floors.get(0).elevatorList.add(new StandardElevator(50.0,10,b.floors.get(0)));
	
	for(int i = 0; i < num; ++i) {
		getChildren().addAll(b.floors.get(i).getFigure(),b.floors.get(i).getTextBox());

	}
		// anon class for animation

	timer = new AnimationTimer() {
	
		public void handle(long t) {
			if((int)(Math.random()*10) == 9) {
		b.moveElevator();	
			}
		}


	};

	timer.start();


}

}
