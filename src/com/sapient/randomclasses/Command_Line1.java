package com.sapient.randomclasses;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Scanner;

public class Command_Line1 {
	
	private int[] arr;

	public Command_Line1(int number) {
		// TODO Auto-generated constructor stub
		this.arr=new int[number];
		System.out.println("Enter the numbers : ");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<number;i++)
		{
			arr[i]=sc.nextInt();
		}	
		
	}
	
	public int getLength() {
		return arr.length;
	}

	public int getSum() {
		int sum=0;
		for(int i:arr)
		{
			sum+=i;
		}
		return sum;
	}

	public BigDecimal getAverage() {
		// TODO Auto-generated method stub
		int sum=getSum();
		int length=getLength();
		BigDecimal avg=new BigDecimal(sum).divide(new BigDecimal(length), 5,RoundingMode.UP);
		
		return avg;
	}

	public int getMaximum() {
		int max=arr[0];
		for(int i:arr)
		{
			if(i>max)
				{max=i;}
		}
		
		return max;
	}

	public int getMinimum() {
		int min=arr[0];
		for(int i:arr)
		{
			if(i<min)
				{min=i;}
		}
		
		return min;
	}

	public void setData(int index,int value) {
		// TODO Auto-generated method stub
		arr[index]=value;
	}

	public int callData(int index2) {
		// TODO Auto-generated method stub
		return arr[index2];
	}

	public void displayData() {
		// TODO Auto-generated method stub
		System.out.println("The array is :");
		System.out.println(Arrays.toString(arr));
		
	}

}
