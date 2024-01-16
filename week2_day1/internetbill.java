package week2_day1;

import java.util.Scanner;

public class internetbill {

	public static void main(String[] args) {
		int data ; 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter you consumed data : ");
		data = sc.nextInt();
		if(data < 10)
			System.out.println("Your bill amount will be Rs. 300.(Basic charge)");
		else if (data < 30)
			System.out.println("Your bill amount will be Rs. "+ (300+5*(data-10)));
		else
			System.out.println("Your bill amount will be Rs. "+ (400+3*(data-30)));
	}

}
