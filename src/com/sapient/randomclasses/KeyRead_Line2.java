package com.sapient.randomclasses;

import java.util.Arrays;
import java.util.Scanner;

public class KeyRead_Line2 {

	private int[] arr;

	public KeyRead_Line2(int number) {
		// TODO Auto-generated constructor stub
		this.arr=new int[number];
		System.out.println("Enter the numbers : ");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<number;i++)
		{
			arr[i]=sc.nextInt();
		}	
	}

	public void displayData() {
		// TODO Auto-generated method stub
		System.out.println("The array is :");
		System.out.println(Arrays.toString(arr));
		
	}

	public void sortData() {
		// TODO Auto-generated method stub
		Arrays.sort(arr);
		
	}

	public void findData(int findNumber) {
		// TODO Auto-generated method stub
		int f=0;
		for(int i:arr)
		{
			if(i==findNumber)
				{System.out.println("Found");
				f=1;
				break;}
		}
		if(f==0)
		System.out.println("Not Found");
	}

	public int callData(int index2) {
		// TODO Auto-generated method stub
		return arr[index2];
	}

}
