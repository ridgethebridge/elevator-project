

import javafx.scene.control.TextArea;
public class ExpressElevator extends Elevator {

public ExpressElevator(double r, int c, Floor f) {
	super(r,c,f);
}

@Override
public String toString() {
	return "express elevator";
}

public void pickup(TextArea a) {
	// first looks for staff
	for(int i = 0; i < currentFloor.waitingQueue.size(); ++i) {
		Passenger p = currentFloor.waitingQueue.get(i);
	if(numPassenger < capacity && p.getRequestChoice()) {
		if((currentFloor.compareTo(p.getEndFloor()) > 0 && direction == Direction.DOWN) || (currentFloor.compareTo(p.getEndFloor())<0 && direction == Direction.UP)) {
		if(p instanceof Staff) {
			passengerList.add(p);
			currentFloor.waitingQueue.remove(p);
			a.setText(a.getText() + p + " was picked up by " + this + " on " + currentFloor +"\n");
	++numPassenger;
	if(!firstPicked) {
		firstPicked = true;
		setDirection(p.getEndFloor());
		destFloor = p.getEndFloor();

	}
		}

}
	}
	}

// now it looks for patients

	for(int i = 0; i < currentFloor.waitingQueue.size(); ++i) {
		Passenger p = currentFloor.waitingQueue.get(i);
	if(numPassenger < capacity && p.getRequestChoice()) {
		if((currentFloor.compareTo(p.getEndFloor()) > 0 && direction == Direction.DOWN) || (currentFloor.compareTo(p.getEndFloor())<0 && direction == Direction.UP)) {
			passengerList.add(p);
			currentFloor.waitingQueue.remove(p);
			a.setText(a.getText() + p + " was picked up by " + this + " on " + currentFloor +"\n");
	++numPassenger;
	if(!firstPicked) {
		firstPicked = true;
		setDirection(p.getEndFloor());
		destFloor = p.getEndFloor();

	}
}
	}

	}



}



}
