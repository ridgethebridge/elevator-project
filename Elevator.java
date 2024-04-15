// add stuff!!!!



public abstract class Elevator {

	protected double requestPercentage;
	protected int capacity;
	protected int numPassenger = 0;

	public int getCapacity() {
		return capacity;
	}
	public double getRequestPercentage() {
		return requestPercentage;
	}
	public abstract boolean pickup(Passenger p);
	
	public abstract Passenger drop(Passenger p);
}
