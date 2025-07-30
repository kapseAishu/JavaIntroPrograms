package com.prime.javaintro;

import java.util.Scanner;

public class ControlStatementsElseif {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a value");
		int value=sc.nextInt();
		//double marks=sc.nextDouble();
		//if((marks>50)||(marks>=80)) {
		//	System.out.println("you scored well");
		//}
		//else if(marks==36){
		//	System.out.println("you passed");
			
		//}
		//else {
		//	System.out.println("you have failed ,give retest");
		//}
	
	switch(value) {
	case 1:System.out.println("Going for movie");
	break;
	case 2:System.out.println("Going for shopping. ");
	break;
	case 3:System.out.println("Going out");
	break;
	default:
	System.out.println("no plan ");
	}

} 
}
