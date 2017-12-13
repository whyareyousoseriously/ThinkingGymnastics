package algorithm;

public class DecreaseAndConquer {
	/*
	 * straight insertion sort
	 * @param A[0...n-1], a array
	 * @return A[0...n-1], a array of non-descending order;
	 * */
	public static int [] InsertionSort(int [] a) {
		int temp1=0,temp2=0,temp_index=0;
		for(int i=1;i<a.length;i++) {
			temp1 = a[i];
			temp_index = i-1;
			while(temp_index>=0&&a[temp_index]>temp1) {
				a[temp_index+1] = a[temp_index];
				temp_index = temp_index-1;
			}
			a[temp_index+1]= temp1;
		}
		return a;
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
