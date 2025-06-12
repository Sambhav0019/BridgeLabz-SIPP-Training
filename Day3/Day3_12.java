package test;
import java.util.*;
public class Day3_12 {
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  int a=sc.nextInt();
	  int b=0;
	  int c=(a*(a+1))/2;
	  if(a<0) {
		  System.out.println("This number is not natural number");
	  }
	  while(a>0) {
		  b=b+a;
		  a--;
	  }
	  if(b==c) {
		  System.out.println("Answer is same using both methods");
	  }
	  System.out.println(b);
	
  }
}
