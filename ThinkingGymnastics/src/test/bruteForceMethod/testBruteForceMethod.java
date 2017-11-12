package test.bruteForceMethod;

import algorithm.BruteForceMethod;

public class testBruteForceMethod {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test array;
		int [] a = {3,7,23,44,11,33,99,2,100,222,125};
		
		//selectionSortByAscending
		int [] a_sortBySelectionByAscending = BruteForceMethod.selectionSortByAscending(a);
		BruteForceMethod.iterateInt(a_sortBySelectionByAscending);
		
		//bubbleSortByDescending
		int [] a_sortByBubbleByDescending = BruteForceMethod.bubbleSortByDescending(a);
		BruteForceMethod.iterateInt(a_sortByBubbleByDescending);
		
		char [] t = {'a','b','a','b','a','b','a','b','c','d','f','a','d'};
		char [] p = {'c','d','f'};
		System.out.println(BruteForceMethod.bruteForceStringMatch(t, p));
	}
}
