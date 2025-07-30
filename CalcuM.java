package com.prime.javaintro;

public class CalcuM {
	public static void main(String[] args) {
		   System.out.println("multiple:"+multiple(2,3));
		   System.out.println(substraction() );
		   CalcuM m=new CalcuM();
		  m.div();
		  m.add(40, 50);
		   
		   
		    }
		    
		public void div() {
		    System.out.println("div:"+3/3);
		}// 1.passing nothing and returning nothing

		public static double multiple(int n1,int n2) {
		    return n1*n2;// 2.passing something and returning someting
		    
		}
		public void add(int a,int b) {
		    int total=a+b;
		    System.out.println("Addition:"+total);// 3.passing something and returning nothing
		}
		public static int substraction() {
		    int a=20;
		    int b=10;
		    int d=a-b;
		    System.out.println("sub:");// 4.passing nothing and returning something
		    return d;
		    
		    
		}


	

}
