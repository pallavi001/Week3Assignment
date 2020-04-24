package com.sapient.shapes;

public class Shapes {
	private int noOfSides;

	public int getNoOfSides() {
		return noOfSides;
	}

	public void setNoOfSides(int noOfSides) {
		this.noOfSides = noOfSides;
	}
	
	public static void main (String[] args)
	{
		Shapes shape=new Shapes();
		shape.calculateShapeArea(3,12);
		shape.calculateShapeArea(4,15);
		shape.calculateShapeArea(5,15);
		shape.calculateShapeArea(1,12);
	}
	 void calculateShapeArea(int noOfSides,int sideLength)
	 {
		 if (noOfSides==1)
		 {
			Circle c=new Circle();
			c.calculateArea(sideLength);
			
		 }
		 else if (noOfSides==3)
		 {
			 Triangle t=new Triangle();
			 t.calculateArea(sideLength); 
		 }
		 else if (noOfSides==4)
		 {
			 Square s= new Square();
			 s.calculateArea(sideLength);
			 
		 }
		 else
		 {
			 System.out.println("No Shapes Present");
		 }
	 }

}
