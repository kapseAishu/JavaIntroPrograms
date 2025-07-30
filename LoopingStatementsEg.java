package com.prime.javaintro;

public class LoopingStatementsEg {
	public static void main(String []args) {
		 
	int num=0;
	while(num<5) {
	num=num+1;
	System.out.println(num);	
	}
	
	
	int j=1;
	do{
		System.out.println(j);
		j++;
	}
	while(j<10);
	
	
	for(int i=0;i<=20;i++) {
		System.out.println(i);
	}
	
	
	
	int arr[]= {10,20,30};
	for(int arrays:arr){
		System.out.println(arrays);
	}
	
	
	int number=1;
	while(number<=20) {
		System.out.println("odd number:"+number);
		number+=2;
	}
	
		
	}

}
