package algorithm;



public class Recursively {
	/*
	 * this algorithm is a simple recursive function
	 * @param i	{int}
	 * @return {1+2+3+...+i}
	 * 
	 * ����һ���ǳ��򵥵ĵݹ����1+2+3+����i��ֵ
	 */
	public static int recursive1(int i) {
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
	public static long recursive1Plus(long i) {
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
	 * ����һ���ǳ��򵥵ĵݹ����׳�
	 */
	public static int recursive2(int i) {
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
	public static int hanoi(int i) {
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
	public static int Fibonacci(int i) {
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
	public static boolean checkPositiveInteger(int i) {
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
	public static boolean checkNaturalNumber(int i) {
		if(i<0) {
			System.out.println("Input error! cann't be negative");
			return false;
		}else {
			return true;
		}
		
	}
}
