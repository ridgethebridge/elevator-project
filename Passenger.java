
public class Passenger {

	protected Floor startFloor;

	protected Floor endFloor;

	protected double requestPercentage;

	public double getRequestPercentage() {
		return requestPercentage;
	}

	public Passenger(Floor s, Floor e, double p) {
		startFloor = s;
		endFloor = e;
		p = requestPercentage;
	}




}
