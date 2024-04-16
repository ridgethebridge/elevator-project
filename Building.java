

import java.util.LinkedList;
import java.util.ArrayList;
/* put some methods to initialize passengers in floors, and elevators in floors, then cook 
 */


public class Building {

	// fields
public LinkedList<Floor> floors;
	private int floorNum;
	public Settings s;
	private int width, height;

	public Building(int n,int w, int h, int sn, int en, double pRP, double sRP, int nP, int nS,int sC, int eC ) {
		floors = new LinkedList<Floor>();
	
		floorNum = n;
		double fw = w/n;
		double fh = h/n;
		for(int i = 0; i < n; ++i) {
			Floor temp = new Floor(i+1);
			temp.setFigure(0,h-(i*fh),fw,fh);
			floors.add(temp);
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
