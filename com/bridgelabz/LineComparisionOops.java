package com.bridgelabz;

public class LineComparisionOops {
	
//	instance variable
	int x1;
	int y1;
	int x2;
	int y2;
	int x3;
	int y3;
	int x4;
	int y4;
	double lengthOfLine1;
	double lengthOfLine2;
	
//	parameterized constructor
	public LineComparisionOops(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4 ) {
		this.x1=x1;
		this.y1=y1;
		this.x2=x2;
		this.y2=y2;
		this.x3=x3;
		this.y3=y3;
		this.x4=x4;
		this.y4=y4;
	}
	
//	static method
	public static void LineComparisionOops() {
		System.out.println("Welcome to the Line Computation Program");
	}
	
//	non-static method
	public void LenghtOfLineOne() {
		lengthOfLine1 =  Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
		System.out.println("The length of line one is:   " +lengthOfLine1);
	}
	
//	non-static method
	public void LenghtOfLineTwo() {
		lengthOfLine2 = Math.sqrt(Math.pow(x4-x3,2) + Math.pow(y4-y3,2));
		System.out.println("The length of line two is:  " +lengthOfLine2);
	}
	
//	non-static method
	public void EqualityOfLines() {
		if(lengthOfLine1==lengthOfLine2)
	        System.out.println("Length of the lines are equal");
	    else 
	        System.out.println("Lengths are not equal ");
	}
	
//	non-static method
	public void ComparisionOfLines() {
		if(lengthOfLine1 > lengthOfLine2){
	        System.out.println("Length of line 1 is greater then from line 2");
	    }
	    else if(lengthOfLine2 > lengthOfLine1) {
	        System.out.println("Lengths of line 1 is lesser then from line 2 ");
	    }
	    else {
	        System.out.println("Length of lines are equal");
	    }
		
	}
	public static void main(String[] args) {
		
		LineComparisionOops();
		LineComparisionOops obj=new LineComparisionOops(7, 4, 11, 9, 8, 3, 12, 16);
		obj.LenghtOfLineOne();
		obj.LenghtOfLineTwo();
		obj.EqualityOfLines();
		obj.ComparisionOfLines();
	}
		
		
	}


