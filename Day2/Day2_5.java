package test;

public class Day2_5 {
	public static void main(String[] args) {
		int Pens=14;
		int Students=3;
		int penPerStudent=Pens/Students;
		int remainingPen=Pens%Students;
		System.out.print("The Pen per student is"+penPerStudent + " and remaining pens is" + remainingPen);
	}
}
