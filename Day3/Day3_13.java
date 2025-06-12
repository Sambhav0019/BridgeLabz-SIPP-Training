package test;
import java.util.*;
public class Day3_13 {
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  int a=sc.nextInt();
	  if(a<0) {
		  System.out.println("Number is not natural");
	  }
	  int b=0;
	  int c=(a*(a+1))/2;
	  for(int i=0;i<=a;i++) {
		  b=b+i;
	  }
	  if(b==c) {
		  System.out.println("Answer matched");
	  }
	  System.out.println(b);
  }
}
