
public class Patient extends Passenger {


	public Patient(Floor s, Floor e, double p) {
		super(s,e,p);
	}

	@Override
	public String toString() {
		return "patient ";
	}

}
