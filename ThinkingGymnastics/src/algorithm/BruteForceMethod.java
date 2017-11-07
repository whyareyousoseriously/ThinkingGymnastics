package algorithm;

public class BruteForceMethod {

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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BruteForceMethod b = new BruteForceMethod();
		char [] t = {'a','b','a','b','a','b','a','b','c','d','f','a','d'};
		char [] p = {'c','d','f'};
		System.out.println(b.bruteForceStringMatch(t, p));
	}

}
