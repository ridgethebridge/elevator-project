

import java.util.LinkedList;
import java.util.ArrayList;


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
			temp.setFigure(0,h-(i*fh),w,fh);
			floors.add(temp);
		}

		// adds patients and staff to first n floors
		addPatient(nP,pRP);

		addStaff(nS,sRP);

		//adds elevators to first n floors
		addStandard(sn,stRP,sC);

		addExpress(en,eRP,eC);

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
		int start, end;

		for(int i = 0; i < num; ++i) {
			 while((start = (int)(Math.random()*floors.size())) == (end = (int)(Math.random()*floors.size()))) {

			 }

				Passenger p = new Patient(floors.get(start),floors.get(end),percent);
			floors.get(start).waitingQueue.add(p);
			}
		}

	private void addStaff(int num, double percent) {


		int start, end;
		for(int i = 0; i < num; ++i) {
			 while((start = (int)(Math.random()*floors.size())) == (end = (int)(Math.random()*floors.size()))) {
			 }
				Passenger p = new Staff(floors.get(start),floors.get(end),percent);
			floors.get(start).waitingQueue.add(p);
			}
		}


	// elevator add methods now added to random floors
	private void addStandard(int num, double rp, int c) {

		for(int i = 0; i < num; ++i) {
			int f = (int)(Math.random()*floors.size());
			Elevator s = new StandardElevator(rp,c,floors.get(f));
		}
	}

	private void addExpress(int num, double rp, int c) {
	for(int i = 0; i < num; ++i) {
			int f = (int)(Math.random()*floors.size());
			Elevator e = new ExpressElevator(rp,c,floors.get(f));
		}
	}

	// moves elevators from floor to floor
	public void moveElevator() {

for(int i =  0; i < floors.size(); ++i) {

				Floor f = floors.get(i);
				if(f.elevatorList.isEmpty())
						continue;

				for(int d = 0; d <f.elevatorList.size(); ++d) {
				       Elevator e = f.elevatorList.get(d);
			       switch(e.direction) {
			case UP -> { 
				if(i < floors.size()-1)
				       	e.move(floors.get(i+1));
				else e.setDirection(floors.get(0));
			}
	 		case DOWN-> {
				if( i > 0)
			       		e.move(floors.get(i-1));
				else
					e.setDirection(floors.get(1));

			       }		
	}

		}
		floors.get(i).changeRequests();
}
	}


//changes requests for all passengers on floor

	
	}
