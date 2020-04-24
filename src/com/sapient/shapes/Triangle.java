package com.sapient.shapes;

import java.math.BigDecimal;

public class Triangle {
	public void calculateArea(int side) 
	{
		BigDecimal constant =new BigDecimal("0.433");
		BigDecimal area=constant.multiply(new BigDecimal(side)).multiply(new BigDecimal(side));
		System.out.println("The area of the triangle is "+ area);		
	}

}
