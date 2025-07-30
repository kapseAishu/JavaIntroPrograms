package com.prime.javaintro;

public class BlocksE {
	{
		System.out.println("hello everyone!");
	}
	public BlocksE() {
		System.out.println("prime members");
	}
	static {
		System.out.println("welcome");
	}
	public static void main(String []args)
	{
		BlocksE b=new BlocksE();
		System.out.println("java class");
	}
}
