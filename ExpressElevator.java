
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

	return true;

}

 public Passenger drop(Passenger p) {
	return p;

}




}
