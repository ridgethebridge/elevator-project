

import java.util.ArrayList;
public abstract class Elevator {

	protected double requestPercentage;
	protected int capacity;
	protected int numPassenger = 0;
	protected Floor currentFloor;
public Direction direction;
protected ArrayList<Passenger> passengerList = new ArrayList<Passenger>();

	public int getCapacity() {
		return capacity;
	}
	public double getRequestPercentage() {
		return requestPercentage;
	}
	public abstract void pickup();
	
	public void drop() {
		for(int i = 0; i < passengerList.size(); ++i) {
			Passenger p = passengerList.get(i);
		if(p.getEndFloor().equals(currentFloor)) {
			currentFloor.completedQueue.add(p);
			passengerList.remove(p);
			--numPassenger;
}
		}


}

	public void move(Floor newFloor) {
	newFloor.elevatorList.add(this);
	newFloor.setColor();
	currentFloor.elevatorList.remove(this);
	currentFloor.setColor();
	currentFloor = newFloor;
}
}
