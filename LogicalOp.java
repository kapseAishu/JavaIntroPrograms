package com.prime.javaintro;

public class LogicalOp {

	public static void main(String[] args){
		int a=10,b=5;
		if((a>0)||(a>b)) {
			System.out.println("Either one of condition is true");
		}
		else {
			System.out.println("both conditions are false");
			}
		if((a>0)&&(b>a)) {
			System.out.println("Both condition is true");
		}
			else {
			System.out.println("Both condition is false");
			}
		if(!(a>=0)){
			System.out.println("a is less than or equal to 0");
		}
		else {
			System.out.println("a is greater than or equal to 0");
		}
		}
	}

