

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Settings {

	// fields for the settings
	public int numIterations;
	public int numStandard;
	public int numExpress;
	public int standardCapacity;
	public int expressCapacity;

	public double patientRP;
	public double staffRP;

	public double standardRP;
	public double expressRP;

	public int numFloors;

	public int numPatient;
	public int numStaff;

	// initializes all settings after parsing file, using BufferedReader cause its faster
	public Settings(String file) {

try {
BufferedReader reader = new BufferedReader(new FileReader(file));

	reader.mark(25);
	while(reader.read() !=-1) {
		
		reader.reset();
		String line = reader.readLine();
			reader.mark(25);
		System.out.println(line);
		if(line.startsWith("#"))
				continue;
				
		else {
			String arr[] = line.split("\\s+");
			if(arr[0].equals("floors"))
				numFloors = Integer.parseInt(arr[1]);

			else if(arr[0].equals("elevator")) {
				if(arr[1].equals("StandardElevator")) {
					standardCapacity = Integer.parseInt(arr[2]);
					standardRP = Double.parseDouble(arr[3]);
					numStandard = Integer.parseInt(arr[4]);
				}
				else if(arr[1].equals("ExpressElevator")) {
			expressCapacity = Integer.parseInt(arr[2]);
					expressRP = Double.parseDouble(arr[3]);
					numExpress = Integer.parseInt(arr[4]);
					
				}
			}
			else if(arr[0].equals("rp")) {
				if(arr[1].equals("Patient"))
					patientRP = Double.parseDouble(arr[2]);
			
			else if(arr[1].equals("Staff"))
				staffRP = Double.parseDouble(arr[2]);
		}
		else if(arr[0].equals("run_simulation"))
			numIterations = Integer.parseInt(arr[1]);
		
		else if(arr[0].equals("num_passenger")) {
			if(arr[1].equals("Patient"))
				numPatient = Integer.parseInt(arr[2]);
			else if(arr[1].equals("Staff"))
				numStaff = Integer.parseInt(arr[2]);
		}
	
	}
	}
reader.close();
}
catch(IOException e) {
	e.printStackTrace();
}


	}

}
