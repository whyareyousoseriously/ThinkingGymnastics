package algorithm;

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
	 * iterate and output arrays
	 * */
	public void iterateInt(int [] a) {
		for(int i : a) {
			System.out.print(i+"\t");
		}
		System.out.println();
	}
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
