package com.sapient.randomclasses;

import java.math.BigDecimal;
import java.util.Scanner;

public class Command_Line1Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("How many numbers you want to enter ");
		int number =sc.nextInt();
		Command_Line1 c=new Command_Line1(number);
		int sum=c.getSum();
		BigDecimal average=c.getAverage();
		int maximum=c.getMaximum();
		int minimum=c.getMinimum();
		System.out.println("Sum is : "+sum);
		System.out.println("Average is : "+average);
		System.out.println("Maximum is : "+maximum);
		System.out.println("Minimum is : "+minimum);
		System.out.println("Enter the index and value to set data : ");
		int index=sc.nextInt();
		int value=sc.nextInt();
		c.setData(index,value);
		System.out.println("The set value is : "+c.callData(index));
		System.out.println("Enter the index to call data: ");
		int index2=sc.nextInt();
		int value2=c.callData(index2);
		System.out.println("The read value is : "+value2);
		c.displayData();

	}

}
