package algorithm;

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
	public static void main(String[] args) {
		Recursively r = new Recursively();
		int i=10;
		System.out.println("Integer.MAX_VALUE="+Integer.MAX_VALUE);
		System.out.println("Integer.MAX_VALUE="+Long.MAX_VALUE);
		System.out.println(" 1+2+3+...+i recursive("+i+")="+r.recursive1(i));
		System.out.println(" 1*2*3*...*i recursive("+i+")="+r.recursive2(i));
		System.out.println("Hanoi("+i+")="+r.hanoi(i));
	}

}
