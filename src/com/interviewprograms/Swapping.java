package com.interviewprograms;

public class Swapping {
	public static void main(String[] args) {
		int a = 10;
		int b =20;
		System.out.println("Before swapping");
		System.out.println("a is "+ a);
		System.out.println("b is "+ b);
		int c=a;//c = 10
		a=b;	//a = 20
		b=c;	//b = 10
		System.out.println("After swapping");
		System.out.println("a is "+ a);
		System.out.println("b is "+ b);
	
		//Without using new Variable
	int d = 10;
	int e =20;
	System.out.println("Before swapping");
	System.out.println("d is "+ d);
	System.out.println("e is "+ e);
	d=d+e;	//d = 10+20=> d=30
	e=d-e;	//e = 30-20=> e=10
	d=e-d;	//d = 10-30=> d=20
	System.out.println("After swapping");
	System.out.println("d is "+ d);
	System.out.println("e is "+ e);
	}
}
