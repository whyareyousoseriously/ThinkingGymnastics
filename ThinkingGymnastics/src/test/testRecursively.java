package test;

import java.util.Scanner;


import algorithm.Recursively;

public class testRecursively {
	public static void main(String[] args) {
		Recursively r = new Recursively();
		int i;
		Scanner s = new Scanner(System.in);
		i = s.nextInt();
		System.out.println("Integer.MAX_VALUE="+Integer.MAX_VALUE);
		System.out.println("Integer.MAX_VALUE="+Long.MAX_VALUE);
		if(r.checkPositiveInteger(i)) {
			System.out.println(" 1+2+3+...+i recursive("+i+")="+r.recursive1(i));
			System.out.println("Hanoi("+i+")="+r.hanoi(i));
			System.out.println("r.Fibonacci("+i+")="+r.Fibonacci(i));
		}
		if(r.checkNaturalNumber(i)) {
			System.out.println(" 1*2*3*...*i recursive("+i+")="+r.recursive2(i));
		}
		
		
	}
}
