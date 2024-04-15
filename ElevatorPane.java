
import javafx.scene.layout.Pane;
public class ElevatorPane extends Pane {

public ElevatorPane(Building b) {
	int num = b.getFloorNum();
	
	for(int i = 0; i < num; ++i) {
		getChildren().add(b.floors.get(i).getFigure());
	}
}

}
