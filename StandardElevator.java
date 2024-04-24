

public class StandardElevator extends Elevator {

	public StandardElevator(double requests, int capacity, Floor f) {
		super(requests,capacity,f);
	}



//implement
public void pickup() {

	for(int i = 0; i < currentFloor.waitingQueue.size(); ++i) {
		Passenger p = currentFloor.waitingQueue.get(i);
		if(numPassenger < capacity && p.getRequestChoice()) {
		if((currentFloor.compareTo(p.getEndFloor()) > 0 && direction == Direction.UP) || (currentFloor.compareTo(p.getEndFloor())<0 && direction == Direction.DOWN)) {
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


}


