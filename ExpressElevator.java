

public class ExpressElevator extends Elevator {

public ExpressElevator(double r, int c, Floor f) {
	super(r,c,f);
}


public void pickup() {
	// first looks for staff
	for(int i = 0; i < currentFloor.waitingQueue.size(); ++i) {
		Passenger p = currentFloor.waitingQueue.get(i);
	if(numPassenger < capacity && p.getRequestChoice()) {
		if(p instanceof Staff) {
			passengerList.add(p);
			currentFloor.waitingQueue.remove(p);
	++numPassenger;
	if(!firstPicked) {
		firstPicked = true;
		setDirection(p.getEndFloor());
		destFloor = p.getEndFloor();

	}
		}

}
	}

// now it looks for patients

	for(int i = 0; i < currentFloor.waitingQueue.size(); ++i) {
		Passenger p = currentFloor.waitingQueue.get(i);
	if(numPassenger < capacity && p.getRequestChoice()) {
			passengerList.add(p);
			currentFloor.waitingQueue.remove(p);
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
