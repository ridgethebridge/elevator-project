
import java.util.ArrayList;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

public class Floor implements Comparable<Floor> {


	// fields for floors graphics and passengers on floor
	public ArrayList<Passenger> waitingQueue;
	public ArrayList<Passenger> completedQueue;
	public ArrayList<Elevator> elevatorList;
	private Text text;

	private int floorNum;
	private Rectangle floorFigure;

	public Floor(int n) {
	floorNum = n;
	waitingQueue = new ArrayList<Passenger>();
	 completedQueue = new ArrayList<Passenger>();
	 elevatorList = new ArrayList<Elevator>();
	}

	// method for checking for 2 equal floors
	@Override
	public boolean equals(Object o) {
		return floorNum == ((Floor)o).getFloorNum();
	}

	@Override
	// comapres floors
	public int compareTo(Floor f) {
		int result = floorNum - f.getFloorNum();
			return result;
	}

	// sets floors graphics binds text box
	public void setFigure(double x, double y, double l, double w) {
	
		floorFigure = new Rectangle(x,y,l,w);
		text = new Text(0,y + 20,"passengers: " +waitingQueue.size());
		text.xProperty().bind(floorFigure.widthProperty().add(20));
		floorFigure.setStroke(Color.BLACK);
		floorFigure.setFill(Color.WHITE);
	}

	public Rectangle getFigure() {
		return floorFigure;
	}

	public int getFloorNum() {
		return floorNum;
	}


	// sets color of rectangle graphic, blue for standard elevator, red for express, purple for both
	public void setColor() {
		if(elevatorList.isEmpty()) {
			floorFigure.setFill(Color.WHITE);
			return;
		}
		int n = 0;
		for(int i = 0; i < elevatorList.size(); ++i) {
			if(elevatorList.get(i) instanceof StandardElevator) { 
				++n;
			}
			else if( elevatorList.get(i) instanceof ExpressElevator && n > 0) {
			floorFigure.setFill(Color.PURPLE);
			return;
			}
		}

			switch(n) {
				case 0 -> floorFigure.setFill(Color.RED);
				default -> floorFigure.setFill(Color.BLUE);
			}
		}

	// changes requests based on percent for all passengers on floor
	public void changeRequests() {
		for( int i = 0; i < waitingQueue.size(); ++i) {
			Passenger p = waitingQueue.get(i);
			p.setRequest();
		}
	}

	public void setPassengerCounter() {
		text.setText("waiting: " + waitingQueue.size() + " completed: " + completedQueue.size());
	}
	

	public Text getTextBox() {
		return text;
}


}

