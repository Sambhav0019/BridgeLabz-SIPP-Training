package test;
import java.util.*;
public class Day3_14 {
 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 int a=sc.nextInt();
	 if(a<0) {
		 System.out.println("Number is negative");
	 }
	 int b=1;
	 while(a>0) {
		 b=b*a;
		 a--;
	 }
	 System.out.println(b);
 }
}
