package test;
import java.util.*;
public class Day3_10 {
public static void main(String[] args) {
	int a=0;
	Scanner sc=new Scanner(System.in);
	int b=sc.nextInt();
	while(b>0) {
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
