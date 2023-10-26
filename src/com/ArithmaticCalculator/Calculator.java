package com.ArithmaticCalculator;

import java.util.Scanner;

public class Calculator 
{

	public static void main(String[] args) 
	{
		int option;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st Number :");
		int a= sc.nextInt();
		System.out.println("Enter 2nd Number :");
		int b= sc.nextInt();
		do {
			System.out.println("Choose Operation :\n1.Addition \n2.Subtraction \n3.Multiplication \n4.Division \n5.End Operation");
			option =sc.nextInt();

			switch(option) {
			case 1:
				System.out.println("Addition Of Two Numbers is : "+a+ "+" +b+" is :"+(a+b));
				break;
			case 2:
				System.out.println("Subtraction Of Two Numbers is : "+a+ "-" +b+" is :"+(a-b));
				break;
			case 3:
				System.out.println("Multiplication Of Two Numbers is : "+a+ "*" +b+" is :"+(a*b));
				break;
			case 4:
				System.out.println("Division Of Two Numbers is : "+a+ "/" +b+" is :"+(a/b));
				break;
			case 5:
				System.out.println("Your Operation Was End \nThank You");
				break;
			default:
				System.out.println("Please Enter Currect Option");
			}
		}
			while(option!=5);
	
	sc.close();
	}

}
