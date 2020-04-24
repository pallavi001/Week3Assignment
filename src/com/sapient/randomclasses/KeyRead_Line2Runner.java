package com.sapient.randomclasses;

import java.util.Scanner;

public class KeyRead_Line2Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("How many numbers you want to enter ");
		int number =sc.nextInt();
		KeyRead_Line2 k=new KeyRead_Line2(number);
		k.displayData();
		k.sortData();
		k.displayData();
		System.out.println("Enter the number you want to find ");
		int findNumber =sc.nextInt();
		k.findData(findNumber);
		System.out.println("Enter the index to read data: ");
		int index2=sc.nextInt();
		int value2=k.callData(index2);
	

	}

}
