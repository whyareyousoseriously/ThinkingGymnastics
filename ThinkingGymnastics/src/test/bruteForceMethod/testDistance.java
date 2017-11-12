package test.bruteForceMethod;

import java.util.LinkedList;

import algorithm.BruteForceMethod;

public class testDistance {
	public static void main(String[] arg) {
		final int ROW=5,COL=5;
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		linkedList.add(0);
		linkedList.add(2);
		linkedList.add(1);
		linkedList.add(4);
		linkedList.add(3);
		linkedList.add(0);
		//print the way
		for(int i=0;i<linkedList.size();i++) {
			System.out.print(linkedList.get(i)+"\t");
		}
		System.out.println();
		System.out.println("-----------·Ö¸îÏß-------------");
		int  [][] distance = new int[ROW][COL];
		//give distance[][] values;
		for(int i=0;i<ROW;i++) {
			for(int j=0;j<COL;j++) {
				distance[i][j] = i+j;
			}
		}
		
		//print distance[][] values;
		for(int i=0;i<ROW;i++) {
			for(int j=0;j<COL;j++) {
				System.out.print(distance[i][j]+"\t");
			}
			System.out.println();
		}
		
		BruteForceMethod.distance(linkedList,distance);
	}
}
	
