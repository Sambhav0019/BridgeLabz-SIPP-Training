package test;
import java.util.*;
public class Day3_15 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=1;
	if(a<0) {
		System.out.println("Number is negative");
	}
	for(int i=a;i>0;i--) {
		b=b*i;
	}
	System.out.println(b);
}
}
