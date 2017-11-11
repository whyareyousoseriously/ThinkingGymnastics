package algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BruteForceMethod {

	/*
	 * selectionSort
	 * @param A[0..n-1],a Array
	 * @return A[0..n],a Array that have sorted by ascending(ÉýÐò).
	 *
	 * this algorithm is O(n*n)
	 * 
	 * */
	public int[] selectionSortByAscending(int [] A) {
		for(int i=0;i<=A.length-2;i++) {
			int min=i;
			for(int j=i+1;j<=A.length-1;j++) {
				if(A[min]>A[j]) {
					int temp = A[j];
					A[j] = A[min];
					A[min] = temp;
				}
			}
		}
		return A;
	}
	/*
	 * bubbleSort
	 * @param a[0..n-1],a array;
	 * @return a[0..n-1],a array that have sorted by descending(½µÐò).
	 * */
	public int[] bubbleSortByDescending(int [] a) {
		for(int i=0;i<=a.length-2;i++) {
			for(int j=0;j<=a.length-2-i;j++) {
				if(a[j+1]>a[j]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		return a;
	}
	/*
	 * Brute force String Match
	 *@param T[0..n-1],a Array that represent a piece of text.
	 *@param p[0..m-1],a Array that represent a pattern.
	 *@return if check success,return location of a first character that first matching substring.
	 * 
	 * this algorithm is O(nm);
	 * */
	public int bruteForceStringMatch(char [] T,char [] P) {
		for(int i=0;i<=T.length-P.length;i++) {
			int j=0;
			while(j<T.length&&P[j]==T[i+j]) {
				j=j+1;
				if(j==P.length)
					return i;
			}
		}
		return -1;
	}
	/*
	 * the traveling salesman problem.TSP;use brute force
	 * @param a[0..n][0..n],a two-dimensional array that storage the distance data.
	 * @return a array that have an optimal distance scheme.
	 * */
	public ArrayList TSP(int [][] a) {
		//every ArrayList storage a sequence.this ArrayList storage a sequence
		ArrayList a_single = new ArrayList();
		//this HashMap  storage everything else ArrayList.
		Map a_gather = new HashMap();
		//this ArrayList storage a sequence that have a optimal distance scheme.
		ArrayList a_best_single = new ArrayList();
		//this is not a simple for loop can solve. this need a dynamic loop. so I want to choose recursion.
		
		return a_best_single;
	}
	/*
	 * this is we need dynamic loop can solve a full permutation problem.
	 * @param ArrayList that want to do a full permutation
	 * @return HashMap that storage everything possible permutation
	 * 
	 * */
	
	/*
	 * iterate and output arrays
	 * */
	public void iterateInt(int [] a) {
		for(int i : a) {
			System.out.print(i+"\t");
		}
		System.out.println();
	}
	
}
