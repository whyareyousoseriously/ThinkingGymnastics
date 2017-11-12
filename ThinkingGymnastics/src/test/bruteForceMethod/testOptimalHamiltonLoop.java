package test.bruteForceMethod;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map.Entry;

import algorithm.BruteForceMethod;

public class testOptimalHamiltonLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("this a initial matrix of the distance!");
		final int ROW=4,COL=4;
		int  [][] distance = new int[ROW][COL];
		//give distance[][] values;
		int temp = 1;
		for(int i=0;i<ROW;i++) {
			for(int j=0;j<COL;j++) {
				if(i==j)
					distance[i][j]=0;
				else
					distance[i][j] = distance[j][i] = i*3+(int)Math.random();
				temp++;
			}
		}
		
		//print distance[][] values;
		for(int i=0;i<ROW;i++) {
			for(int j=0;j<COL;j++) {
				System.out.print(distance[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("this the set of the all HamiltonLoop!");
		HashMap<LinkedList<Integer>,Integer> hashMap = new HashMap<LinkedList<Integer>,Integer>();
		hashMap = BruteForceMethod.Hamilton(distance);
		Iterator<Entry<LinkedList<Integer>,Integer>> iter_hashMap = hashMap.entrySet().iterator();
		while(iter_hashMap.hasNext()) {
			Entry<LinkedList<Integer>,Integer> entry_hashMap = iter_hashMap.next();
			System.out.println(entry_hashMap.getKey()+"\t"+entry_hashMap.getValue());
		}
		System.out.println("this the set of the optimalHamiltonLoop!");
		HashMap<LinkedList<Integer>,Integer> optimalHashMap = new HashMap<LinkedList<Integer>, Integer>();
		optimalHashMap = BruteForceMethod.optimalHamiltonLoop(distance);
		Iterator<Entry<LinkedList<Integer>, Integer>> iter_optimalHashMap = optimalHashMap.entrySet().iterator();
		while(iter_optimalHashMap.hasNext()) {
			Entry<LinkedList<Integer>, Integer> entry_optimalHashMap = iter_optimalHashMap.next();
			System.out.println(entry_optimalHashMap.getKey()+"\t"+entry_optimalHashMap.getValue());
		}
	}

}
