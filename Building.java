
import java.util.LinkedList;
import java.util.ArrayList;
public class Building {

	// fields
public LinkedList<Floor> floors;
	private ArrayList<StandardElevator> standardElevators; 
	private ArrayList<ExpressElevator> expressElevators; 
	private int floorNum;
	private int width, height;

	public Building(int n,int w, int h, int sn, int en) {
		floors = new LinkedList<Floor>();
		standardElevators = new ArrayList<StandardElevator>();
		expressElevators = new ArrayList<ExpressElevator>();
	
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
				standardElevators.add(new StandardElevator(40,10,1));
			if(i < en)
				expressElevators.add(new ExpressElevator(20,10,1));
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
