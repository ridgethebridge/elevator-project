

import java.util.ArrayList;
import javafx.scene.control.TextArea;
public abstract class Elevator {

	protected double requestPercentage;
	protected int capacity;
	protected int numPassenger;
	protected Floor currentFloor;
	protected Floor destFloor;
	protected boolean firstPicked;
public Direction direction;

protected ArrayList<Passenger> passengerList = new ArrayList<Passenger>();

public Elevator( double r, int c, Floor f) {

	numPassenger = 0;
capacity = c;
		requestPercentage = r;
		currentFloor = f;
		currentFloor.elevatorList.add(this);
		direction = (int)(Math.random()*2) == 1 ? Direction.UP: Direction.DOWN;
		firstPicked = false;
}


	public int getCapacity() {
		return capacity;
	}
	public double getRequestPercentage() {
		return requestPercentage;
	}
	public abstract void pickup(TextArea a);
	
	public void drop(TextArea a) {
		for(int i = 0; i < passengerList.size(); ++i) {
			Passenger p = passengerList.get(i);
		if(p.getEndFloor().equals(currentFloor)) {
			currentFloor.completedQueue.add(p);
			passengerList.remove(p);
			--numPassenger;
			a.setText(a.getText() + p + "was dropped on " + currentFloor + " by " + this + "\n");
}
		}


}

	public void move(Floor newFloor, TextArea a) {
	newFloor.elevatorList.add(this);
	newFloor.setColor();
	currentFloor.elevatorList.remove(this);
	currentFloor.setColor();
	currentFloor = newFloor;
	drop(a);
	pickup(a);
	currentFloor.setPassengerCounter();
	resetFirstPicked();
	}


public void resetFirstPicked() {
	if (destFloor != null && currentFloor.equals(destFloor)) {
		if(!passengerList.isEmpty()) {
		destFloor = passengerList.get(0).getEndFloor();
		setDirection(destFloor);
		}
		else {
			firstPicked = false;
		}
	}
}


public void setDirection(Floor f) {
		direction  = currentFloor.compareTo(f) > 0 ? Direction.DOWN: Direction.UP;
}
}

