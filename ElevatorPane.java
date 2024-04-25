
import javafx.animation.AnimationTimer;
import javafx.scene.layout.Pane;
import javafx.scene.control.TextArea;
public class ElevatorPane extends Pane {

	AnimationTimer timer;
	TextArea wordArea;
public ElevatorPane(Building b) {

wordArea = b.text;

	int num = b.getFloorNum();
	
	for(int i = 0; i < num; ++i) {
		getChildren().addAll(b.floors.get(i).getFigure(),b.floors.get(i).getTextBox());

	}
	getChildren().add(wordArea);
	wordArea.setTranslateX(wordArea.getTranslateX() + 470);
	wordArea.setTranslateY(wordArea.getTranslateY() + 100);
	wordArea.setPrefWidth(200);
	wordArea.setPrefHeight(500);


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
