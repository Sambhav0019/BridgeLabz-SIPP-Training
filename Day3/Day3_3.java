package test;
import java.util.*;
public class Day3_3 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	if(a>b && a>c) {
		System.out.println("First number is largest");
	}else if(b>a && b>c) {
		System.out.println("Second number is largest");
	}else {
		System.out.println("Third number is largest");
	}
}
}
