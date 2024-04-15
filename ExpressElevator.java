
import java.util.ArrayList;

public class ExpressElevator extends Elevator {

ArrayList<Passenger> passengerList = new ArrayList<Passenger>();

public ExpressElevator(int c, double r, int f) {
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
