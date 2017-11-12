package test.recursively;

import java.util.Scanner;


import algorithm.Recursively;

public class testRecursively {
	public static void main(String[] args) {
		int i;
		Scanner s = new Scanner(System.in);
		i = s.nextInt();
		s.close();
		System.out.println("Integer.MAX_VALUE="+Integer.MAX_VALUE);
		System.out.println("Integer.MAX_VALUE="+Long.MAX_VALUE);
		if(Recursively.checkPositiveInteger(i)) {
			System.out.println(" 1+2+3+...+i recursive("+i+")="+Recursively.recursive1(i));
			System.out.println("Hanoi("+i+")="+Recursively.hanoi(i));
			System.out.println("r.Fibonacci("+i+")="+Recursively.Fibonacci(i));
		}
		if(Recursively.checkNaturalNumber(i)) {
			System.out.println(" 1*2*3*...*i recursive("+i+")="+Recursively.recursive2(i));
		}
		
		
	}
}
