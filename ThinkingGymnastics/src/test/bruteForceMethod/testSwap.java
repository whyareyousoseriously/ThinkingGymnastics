package test.bruteForceMethod;

import java.util.LinkedList;

import org.junit.Test;

import algorithm.BruteForceMethod;

public class testSwap {
	@Test
	public void testBruteForceMethodSwap() {
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		linkedList.add(10);
		linkedList.add(20);
		BruteForceMethod.swap(linkedList, 0, 1);
		int temp = linkedList.get(1);
		org.junit.Assert.assertEquals("swap pass",10,temp);
	}
}
