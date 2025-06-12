package test;
import java.util.*;
public class Day2_9 {
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  double fees=sc.nextInt();
	  double discount =sc.nextInt();
	 double  discountFees= fees-((fees*discount)/100);
	  System.out.println("The discount amount in INR is"+discount+"and the discounted fees"+discountFees);
	}
}
