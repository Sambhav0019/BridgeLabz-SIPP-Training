package test;
import java.util.*;
public class Day3_11 {
public static void main(String[] args) {
	int a=0;
	boolean s=true;
	Scanner sc=new Scanner(System.in);
	int b=sc.nextInt();
	if(b<=0) {
	s=false;
}
	while(true) {
		a=a+b;
		b=sc.nextInt();
		if(b<=0) {
			break;
		}else {
			continue;
		}
	}
	System.out.println(a);
}
}
