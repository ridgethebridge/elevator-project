

import java.util.ArrayList;

public class StandardElevator extends Elevator {

	private ArrayList<Passenger> passengerList = new ArrayList<Passenger>();

	public StandardElevator(double requests, int capacity, Floor f) {
		this.capacity = capacity;
		requestPercentage = requests;
		currentFloor = f;
	}



//implement
public boolean pickup(Passenger p) {
	if(numPassenger < capacity) {
		passengerList.add(p);
		++numPassenger;
		return true;
	}
	return false;
}



//implement
public Passenger drop(Passenger p) {
	passengerList.remove(p);
	--numPassenger;
	return p;


}
}




