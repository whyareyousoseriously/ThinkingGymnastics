/**
 * ����6:45:43
 * power
 */
package fun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;

/**
 * ������

����һ��������������������ַ�������ʽ�������

���򲻿��Ǹ���������������ֺ���0����������ʽҲ����0��������Ϊ100�������Ϊ001
 * @author cz
 * 2018��3��23������6:45:43
 */
public class test14 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] a = br.readLine().toCharArray();
		for(int i = a.length-1;i>=0;i--) {
			System.out.println(a[i]);
		}
	}
}
