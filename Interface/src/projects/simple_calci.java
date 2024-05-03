package projects;

import java.util.Scanner;

public class simple_calci {
	public static void main(String[]args) {
		System.out.println("SIMPLE CALCULATOR!!!");
		System.out.println("ENTER FIRST NUMBER: ");
		Scanner sc=new Scanner(System.in);
		double n1=sc.nextDouble();
		System.out.println("ENTER SECEND NUMBER:");
		double n2=sc.nextDouble();
		System.out.println("select any operator");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
		int operator=sc.nextInt();
		double result=0;
		switch(operator) {
		case 1:
			result=n1+n2;
			break;
		case 2:
			result=n1-n2;
			break;
		case 3:
			result=n1*n2;
			break;
		case 4:
			result=n1/n2;
			break;
		default:
			System.out.println("Entered operator is not valid!!!!!1");
		}
		System.out.println("Result is:"+result);	
	}
}
