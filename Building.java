

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

	public Building(int n,int w, int h, int sn, int en, double pRP, double sRP, int nP, int nS,int sC, int eC,double stRP,double eRP ) {
		floors = new LinkedList<Floor>();
	
		floorNum = n;
		double fw = w/n;
		double fh = h/n;
		// puts floors in building
		for(int i = 0; i < n; ++i) {
			Floor temp = new Floor(i+1);
			temp.setFigure(0,h-(i*fh),fw,fh);
			floors.add(temp);
		}

		// adds patients and staff to floor
		addPatient(nP,pRP);
		addStaff(nS,sRP);

		//addStandard(stRP,sC);

		//addExpress(eRP,eC);

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


	// methods to add patients and staff to floors
	private void addPatient(int num, double percent) {

		for(int i = 0; i < num; ++i) {
				Passenger p = new Patient(floors.get(i),floors.get((int)(Math.random()*floors.size())),percent);
			floors.get(i).waitingQueue.add(p);
			}
		}

	private void addStaff(int num, double percent) {

		for(int i = 0; i < num; ++i) {
				Passenger p = new Staff(floors.get(i),floors.get((int)(Math.random()*floors.size())),percent);
			floors.get(i).waitingQueue.add(p);
			}
		}


		}
	




