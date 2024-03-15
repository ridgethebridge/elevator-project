<<<<<<< HEAD
// add stuff!!!!



public class Elevator {




=======

public abstract class Elevator {

	protected double requestpercentage;
	protected int capacity;

	public int getCapacity() {
		return capacity;
	}
	public double getRequestPercentage() {
		return requestpercentage;
	}
	public boolean pickup(Passenger p);
	
	public Passenger drop(Floor f);
>>>>>>> refs/remotes/elevate/master


}
