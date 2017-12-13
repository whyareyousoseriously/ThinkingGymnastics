package test.DecreaseAndConquer;

import algorithm.BruteForceMethod;
import algorithm.DecreaseAndConquer;

public class TestInsertionSort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test array;
		int [] a = {103,7,23,144,11,323,99,2,1100,222,125};
		
		int [] result_a = DecreaseAndConquer.InsertionSort(a);
		DecreaseAndConquer.iterateInt(result_a);
	}
}	
