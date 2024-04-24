
public class Passenger {

	protected Floor startFloor;

	protected Floor endFloor;

	protected double requestPercentage;

	protected boolean requested;

	public double getRequestPercentage() {
		return requestPercentage;
	}

	public Passenger(Floor s, Floor e, double p) {
		startFloor = s;
		endFloor = e;
		p = requestPercentage;
		setRequest();
	}

	public Floor getStartFloor() {
		return startFloor;
	}

	public Floor getEndFloor() {
		return endFloor;
	}

	public void setRequest() {
		requested = ((int)(Math.random() * requestPercentage) > 15);
	}

	public boolean getRequestChoice() {
		return requested;
	}




}
