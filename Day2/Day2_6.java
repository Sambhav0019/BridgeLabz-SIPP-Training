package test;

public class Day2_6 {
	public static void main(String[] args) {
		int fee=125000;
		int discount=10;
		int discountedFee=fee-((fee*discount)/100);
		System.out.println("The discount is"+discount+"and the discounted fees is"+discountedFee);
	}

}
