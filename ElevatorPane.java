
import javafx.animation.AnimationTimer;
import javafx.scene.layout.Pane;
public class ElevatorPane extends Pane {

	AnimationTimer timer;
public ElevatorPane(Building b) {



	int num = b.getFloorNum();
	
	for(int i = 0; i < num; ++i) {
		getChildren().add(b.floors.get(i).getFigure());

	}
		// anon class for animation

	timer = new AnimationTimer() {
	
		public void handle(long t) {

		}


	};


}

}
