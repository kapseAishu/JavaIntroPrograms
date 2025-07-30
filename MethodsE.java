package com.prime.javaintro;

public class MethodsE {
	    public static void main(String[] args) {
	   System.out.println("Area of Rectangle:"+AreaofRectangle(20,30));
	   System.out.println(AreaofSquare() );
	   MethodsE m=new MethodsE();
	  m.wish();
	  m.add(40, 50);
	   
	   
	    }
	    
	public void wish() {
	    System.out.println("Welcome to Java Class...");
	}// 1.passing nothing and returning nothing

	public static double AreaofRectangle(int length,int breadth) {
	    return length*breadth;//4 bytes->8 bytes type casting // 2.passing something and returning someting
	    
	}
	public void add(int a,int b) {
	    int total=a+b;
	    System.out.println("Addition:"+total);// 3.passing something and returning nothing
	}
	public static boolean AreaofSquare() {
	    int a=20;
	    System.out.println("Area of Square:"+a*a);// 4.passing nothing and returning something
	    return true;
	    
	    
	}


}
