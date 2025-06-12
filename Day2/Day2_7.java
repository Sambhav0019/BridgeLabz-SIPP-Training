package test;

public class Day2_7 {
	public static void main(String[] arg) {
		int radius=6378;
		double volume=(4/3)*3.14*(radius^3);
		double volumeInMiles=volume*1.6;
		System.out.println("Volume in km is"+volume+"Volume in miles is"+volumeInMiles);
		
	}

}
