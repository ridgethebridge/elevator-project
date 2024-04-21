

public class StandardElevator extends Elevator {

	public StandardElevator(double requests, int capacity, Floor f) {
		this.capacity = capacity;
		requestPercentage = requests;
		currentFloor = f;
		direction = Direction.UP;
	}



//implement
public void pickup() {

	for(int i = 0; i < currentFloor.waitingQueue.size(); ++i)
		if(numPassenger < capacity) {
		Passenger p = currentFloor.waitingQueue.get(i);
		if((currentFloor.compare(p.getEndFloor()) < 0 && direction == Direction.UP) || (currentFloor.compare(p.getEndFloor())>0 && direction == Direction.DOWN)) {
			passengerList.add(p);
		currentFloor.waitingQueue.remove(p);
		
		++numPassenger;
	}
		}
}


}




