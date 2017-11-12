package test.bruteForceMethod;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import algorithm.BruteForceMethod;

public class testHamilton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int ROW=3,COL=3;
		int  [][] distance = new int[ROW][COL];
		//give distance[][] values;
		for(int i=0;i<ROW;i++) {
			for(int j=0;j<COL;j++) {
				if(i==j)
					distance[i][j]=0;
				else
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
		
		HashMap<LinkedList<Integer>,Integer> hashMap = new HashMap<LinkedList<Integer>,Integer>();
		hashMap = BruteForceMethod.Hamilton(distance);
		Iterator<Entry<LinkedList<Integer>, Integer>> iter_hashMap = hashMap.entrySet().iterator();
		while(iter_hashMap.hasNext()) {
			Map.Entry<LinkedList<Integer>, Integer> entry = (Entry<LinkedList<Integer>, Integer>) iter_hashMap.next();
			LinkedList<Integer> temp_linkedList = entry.getKey();
			int temp_value = entry.getValue();
			System.out.println(temp_linkedList+"\t"+temp_value);
		}
		/*//-----------------LinkedList------equal sign assignment just object reference,cann't generate a new object in memory.
		//等号赋值只赋值对象的引用，不能在内存中生成新的对象，
		HashMap<LinkedList<Integer>,Integer> testHashMap = new HashMap<LinkedList<Integer>,Integer>();
		testHashMap = BruteForceMethod.Hamilton(distance);
		LinkedList<Integer> testLinkedList = new LinkedList<Integer>();
		LinkedList<Integer> testLinkedList1 = new LinkedList<Integer>();
		testLinkedList.add(0);testLinkedList.add(1);testLinkedList.add(2);testLinkedList.add(3);
		testHashMap.put(testLinkedList, 7);
		Iterator iter_ = testLinkedList.iterator();
		while(iter_.hasNext()) {
			testLinkedList1.add((Integer) iter_.next());
		}
		testLinkedList1.clear();
		testLinkedList1.add(1);testLinkedList1.add(1);testLinkedList1.add(2);testLinkedList1.add(3);
		testHashMap.put(testLinkedList1, 7);
		Iterator iter = testHashMap.entrySet().iterator();
		while(iter.hasNext()) {
			Map.Entry entry = (Map.Entry) iter.next();
			Object key = entry.getKey();
			Object val = entry.getValue();
			System.out.println(key+"\t"+val);
		}
		
		//-----------------------------test----------
		HashMap testHashMap1 = new HashMap();
		int a = 111;
		testHashMap1.put(a,7);
		a = 222;
		testHashMap1.put(a, 7);
		
		Iterator iter2 = testHashMap1.entrySet().iterator();
		while(iter2.hasNext()) {
			Map.Entry entry = (Map.Entry) iter2.next();
			Object key = entry.getKey();
			Object val = entry.getValue();
			System.out.println(key+"\t"+val);
		}
	*/	
	}

}
