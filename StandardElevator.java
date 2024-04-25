
import javafx.scene.control.TextArea;

public class StandardElevator extends Elevator {

	public StandardElevator(double requests, int capacity, Floor f) {
		super(requests,capacity,f);
	}


	@Override
	public String toString() {
		return "standard elevator";
	}

//implement
public void pickup(TextArea a) {

	for(int i = 0; i < currentFloor.waitingQueue.size(); ++i) {
		Passenger p = currentFloor.waitingQueue.get(i);
		if(numPassenger < capacity && p.getRequestChoice()) {
		if((currentFloor.compareTo(p.getEndFloor()) > 0 && direction == Direction.DOWN) || (currentFloor.compareTo(p.getEndFloor())<0 && direction == Direction.UP)) {
			passengerList.add(p);
		currentFloor.waitingQueue.remove(p);
			a.setText(a.getText() + p + " was picked up by " + this + " on " + currentFloor + "\n");
		
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


