package algorithm;

import java.util.Scanner;

public class Recursively {
	/*
	 * this algorithm is a simple recursive function
	 * @param i	{int}
	 * @return {1+2+3+...+i}
	 * 
	 * 这是一个非常简单的递归计算1+2+3+。。i的值
	 */
	public int recursive1(int i) {
		if(i==1) {
			return 1;
		}
		else {
			return recursive1(i-1)+i;
		}
	}
	/*
	 * this algorithm is a simple recursive function about big number
	 * consider Integer.MAX_VALUE=2147483647
	 * we chose long
	 * @param i {long}
	 * @return 
	 * */
	public long recursive1Plus(long i) {
		if(i==1) {
			return 1;
		}
		else {
			return recursive1Plus(i-1)+i;
		}
	}
	/*
	 * this algorithm is a simple recursive function
	 * @param i {int}
	 * @return {1*2*3*...*i}={i!}
	 * 
	 * 这是一个非常简单的递归计算阶乘
	 */
	public int recursive2(int i) {
		if(i==0) {
			//according definition 0!=1
			return 1;
		}
		else {
			return recursive2(i-1)*i;
		}
	}
	
	/*
	 * this is a Tower of Hanoi.
	 * @param i {int} is number of dish
	 * @return number of move
	 * */
	public int hanoi(int i) {
		if(i==1) {
			return 1;
		}
		else {
			return 2*hanoi(i-1)+1;
		}
	}
	/*
	 * this is a Fibonacci problem.
	 * @param i {int}
	 * @return the number of ith.
	 * */
	public int Fibonacci(int i) {
		if(i==0) {
			return 0;
		}
		if(i==1) {
			return 1;
		}
		else{
			//System.out.println("Fibonacci("+i+")"+"Fibonacci("+(i-1)+")+Fibonacci("+(i-2)+")="+Fibonacci(i-1)+"+"+Fibonacci(i-2));
			return Fibonacci(i-1)+Fibonacci(i-2);
			
		}
	}
	/*
	 * Input check positive Integer.
	 * @param i {int}
	 * @return true or false.
	 *
	 * */
	public boolean checkPositiveInteger(int i) {
		if(i<=0) {
			System.out.println("Input error! cann't be 0 or negative");
			return false;
		}else {
			return true;
		}
	}
	/*
	 * Input check natural number
	 * @param i {int}
	 * @return true or false
	 * */
	public boolean checkNaturalNumber(int i) {
		if(i<0) {
			System.out.println("Input error! cann't be negative");
			return false;
		}else {
			return true;
		}
		
	}
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
