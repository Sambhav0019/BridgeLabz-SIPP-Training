package test;
import java.util.*;
public class Day2_10 {
	public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
 double height=sc.nextInt();
 double inch = 2.54*height;
 double foot=inch*12;
 System.out.println("Your height in cm is"+height+"while in feet"+foot+"and inches is"+inch);
	}
}
