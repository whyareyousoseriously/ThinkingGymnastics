package algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class BruteForceMethod {

	/*
	 * selectionSort
	 * @param A[0..n-1],a Array
	 * @return A[0..n],a Array that have sorted by ascending(ÉýÐò).
	 *
	 * this algorithm is O(n*n)
	 * 
	 * */
	public static int[] selectionSortByAscending(int [] A) {
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
	public static int[] bubbleSortByDescending(int [] a) {
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
	public static int bruteForceStringMatch(char [] T,char [] P) {
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
	 * the traveling salesman problem.TSP;use brute force;an optimal Hamilton loop
	 * @param a[0..n][0..n],a two-dimensional array that storage the distance data.
	 * @return a array that have an optimal distance scheme.
	 * */
	public static HashMap<LinkedList<Integer>,Integer> optimalHamiltonLoop(int [][]a){
		//this linkedList storage one or more optimal sequence.
		HashMap<LinkedList<Integer>,Integer> a_gather = new HashMap<LinkedList<Integer>,Integer>();
		//this HashMap storage every possiblility;
		HashMap<LinkedList<Integer>,Integer> hashMap = new HashMap<LinkedList<Integer>,Integer>();
		hashMap = Hamilton(a);
		Iterator<Entry<LinkedList<Integer>, Integer>> iter = hashMap.entrySet().iterator();
		//get initial value;
		Entry<LinkedList<Integer>, Integer> entry;
		int min_value = 0;
		if(iter.hasNext()) {
			entry = iter.next();
			min_value = entry.getValue();
		}
		while(iter.hasNext()) {
			entry = iter.next();
			int temp = entry.getValue();
			if(min_value>temp) {
				min_value=temp;
			}
		}
		//find the optimal sequence on basis of min_value;
		Iterator<Entry<LinkedList<Integer>, Integer>> iter_sequence = hashMap.entrySet().iterator();
		while(iter_sequence.hasNext()) {
			Entry<LinkedList<Integer>,Integer> entry_sequence = (Entry<LinkedList<Integer>,Integer>) iter_sequence.next();
			if(entry_sequence.getValue()==min_value) {
				a_gather.put(entry_sequence.getKey(), entry_sequence.getValue());
			}
		}
		return a_gather;
	}
	/*
	 * The famous problem -- Hamilton loop
	 * @param a[0..n][0..n],a two-dimensional array that storage the distance data.
	 * @return a HashMap that hava all posiblity.
	 * */
	public static HashMap<LinkedList<Integer>,Integer> Hamilton(int [][] a) {
		//this LinkedList storage a sequence
		LinkedList<Integer> a_single = new LinkedList<Integer>();
		//this HashMap  storage every LinkedList.
		HashMap<LinkedList<Integer>,Integer> a_gather = new HashMap<LinkedList<Integer>,Integer>();
		//this is a full permutation problem.I want to use decrease-and-conquer.
		//get a initial sequence
		a_single.addLast(0);
		for(int i=1;i<a.length;i++) {
			//get a inner loop times;
			int times = Recursively.recursive2(i+1)-1;
			a_single.addLast(i);
			//if it is a sequence,put it into a_gather.
			if(i==a.length-1) {
				//take out the first element of sequence then put it in the last position of sequence.
				//so that can make up a crycle, which means a Hamilton loop
				sequenceAndDistancePutInHashMap(a_single,a_gather,a);
			}
			//exchange from right to left, so the initial pointer is i; 
			int index = i;
			//use swap to get full permutation
			for(int j=0;j<times;j++) {
				
				if(index==0) {
					index=i;
					if(a_single.size()>=2)
						swap(a_single,index,index-1);
					if(i==a.length-1) {
						//take out the first element of sequence then put it in the last position of sequence.
						//so that can make up a crycle, which means a Hamilton loop
						sequenceAndDistancePutInHashMap(a_single,a_gather,a);
					}
				}else {
					if(a_single.size()>=2)
						swap(a_single,index,index-1);
					if(i==a.length-1) {
						//take out the first element of sequence then put it in the last position of sequence.
						//so that can make up a crycle, which means a Hamilton loop
						sequenceAndDistancePutInHashMap(a_single,a_gather,a);
					}
				}
				index = index -1;
			}
		}
		return a_gather;
	}
	private static void sequenceAndDistancePutInHashMap(LinkedList<Integer> a_single,HashMap<LinkedList<Integer>,Integer> a_gather,int[][] a) {
		// TODO Auto-generated method stub
		a_single.addLast(a_single.getFirst());
		LinkedList<Integer> temp = new LinkedList<Integer>();
		Iterator<Integer> iter = a_single.iterator();
		while(iter.hasNext()) {
			temp.add((Integer) iter.next());
		}
		a_gather.put(temp, distance(temp,a));
		a_single.removeLast();
	}
	/*
	 * this method that can use to exchange two element of linkedList
	 * @param linkedList {LinkedList<Integer>}
	 * 			a{Integer},b{Integer}, the location of two element.
	 * 
	 * */
	public static void swap(LinkedList<Integer> linkedList,int a,int b) {
		// TODO Auto-generated method stub
		int temp;
		temp = linkedList.get(a);
		linkedList.set(a, linkedList.get(b));
		linkedList.set(b,temp);
	}
	/*
	 * this is a method that can calculate an distance of the way.
	 * @param a_single{LinkedList}
	 * @return distance{int}
	 * */
	public static int distance(LinkedList<Integer> a_single,int [][] distance_map) {
		// TODO Auto-generated method stub
		//this variable storage the distance of the way;
		int distance = 0;
		//take into account the error input,first do a input check.
		if(a_single.size()==1||a_single.size()==0) {
			distance = 0;
		}else {
			for(int i=0;i<a_single.size()-1;i++) {
				
				distance=distance+distance_map[a_single.get(i)][a_single.get(i+1)];
				/*System.out.print(distance_map[a_single.get(i)][a_single.get(i+1)]+"+");*/
			}
			//System.out.println();
		}
		return distance;
		
	}
	/*
	 * iterate and output arrays
	 * */
	public static void iterateInt(int [] a) {
		for(int i : a) {
			System.out.print(i+"\t");
		}
		System.out.println();
	}
	
}
