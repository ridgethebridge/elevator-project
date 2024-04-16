
import java.util.ArrayList;

public class ExpressElevator extends Elevator {

	/* use currentFloor field to check floors for passengers, and go through building array */

ArrayList<Passenger> passengerList = new ArrayList<Passenger>();



public ExpressElevator(double r, int c, Floor f) {
	capacity =c;
	requestPercentage = r;
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


 public Passenger drop(Passenger p) {
	return p;

}




}
