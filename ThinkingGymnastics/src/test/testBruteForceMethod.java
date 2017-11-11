package test;

import algorithm.BruteForceMethod;

public class testBruteForceMethod {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BruteForceMethod b = new BruteForceMethod();
		//test array;
		int [] a = {3,7,23,44,11,33,99,2,100,222,125};
		
		//selectionSortByAscending
		int [] a_sortBySelectionByAscending = b.selectionSortByAscending(a);
		b.iterateInt(a_sortBySelectionByAscending);
		
		//bubbleSortByDescending
		int [] a_sortByBubbleByDescending = b.bubbleSortByDescending(a);
		b.iterateInt(a_sortByBubbleByDescending);
		
		char [] t = {'a','b','a','b','a','b','a','b','c','d','f','a','d'};
		char [] p = {'c','d','f'};
		System.out.println(b.bruteForceStringMatch(t, p));
	}
}
