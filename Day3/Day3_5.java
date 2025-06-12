package test;
import java.util.*;
public class Day3_5 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a= sc.nextInt();
	if(a>18) {
		System.out.println("The person's age is"+ a +"and he can vote");
	}else {
		System.out.println("The person's age is"+a+"and he can't vote");
	}
}
}
