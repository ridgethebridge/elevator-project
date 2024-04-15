
import java.util.LinkedList;
public class Building {

	LinkedList<Floor> floors = new LinkedList<Floor>();
	private int floorNum;
	private int width, height;

	public Building(int n,int w, int h) {
		// 800 / 800
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
