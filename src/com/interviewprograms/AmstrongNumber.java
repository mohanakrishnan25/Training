package com.interviewprograms;

public class AmstrongNumber {
	public static void main(String[] args) {
		int num = 371;
		int i = 0, j = 0, a = num;
		while (a > 0) {
			i = a % 10;
			j = (i*i*i)+j;
			a = a / 10;
		}
	if(j==num) {
	System.out.println("Amstrong num");
	}
	else {
		System.out.println("Not a amstrong");
	}
	}
}
