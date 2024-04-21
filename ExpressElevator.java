

public class ExpressElevator extends Elevator {

	/* use currentFloor field to check floors for passengers, and go through building array */


public ExpressElevator(double r, int c, Floor f) {
	capacity =c;
	requestPercentage = r;
	currentFloor = f;
	direction = Direction.UP;
}


//implement
public void pickup() {

	if(numPassenger < capacity) {
	++numPassenger;

}

}



}
