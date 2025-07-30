package com.prime.javaintro;

public class OperatorsEg {
	public static void main(String []args) {
		//Arithematic operators
		int a=10,b=5;
		int result=0;
		System.out.println("Addition"+(a+b));
		System.out.println("Sub"+(a-b));
		System.out.println("Mul"+(a*b));
		System.out.println("div"+(a/b));
		System.out.println("moduls"+(a%b));
		System.out.println("increment"+(++a));
		System.out.println("decrement"+(b--));
		//result-=a;
		
        //result+=a;
        System.out.println(result);
	    //result/=a;
		result%=a;
        // Relational operator
        if(a==b) {
        	System.out.println("a and b are equal");
        }
        else {
        	System.out.println("a and b are not equal");
        }
        if(a>=b) {
        	System.out.println("a is greater than b");
        }
        else {
        	System.out.println("b is greater than a");
        }
        if(a<=b) {
        	System.out.println("a is lesser than or equal to b");
        }
        else {
        	System.out.println("b is lesser than or equal to a");
        }
       
        
	}
}
