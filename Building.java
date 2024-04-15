
import java.util.LinkedList;
public class Building {

	// fields
	private LinkedList<Floor> floors;
	private ArrayList<Elevator> elevators; 
	private int floorNum;
	private int width, height;

	public Building(int n,int w, int h int sn, int en) {
		floors = new LinkedList<Floor>();
		elevators = new ArrayList<Elevator>();

		floorNum = n;
		double fw = w/n;
		double fh = h/n;
		for(int i = 0; i < n; ++i) {
			Floor temp = new Floor(i+1);
			temp.setFigure(0,h-(i*fh),fw,fh);
			floors.add(temp);
		}


		// fills building with elevators
		int l = sn > en ? sn:en;
		for(int i = 0; i < l; ++i) {
			if(i < sn)
				elevators.add(new StandardElevator());
			if(i < en)
				elevators.add(new ExpressElevator());
		}

	width = w;
	height = h;
	}

	public int getFloorNum() {
		return floorNum;
	}

	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}




}
