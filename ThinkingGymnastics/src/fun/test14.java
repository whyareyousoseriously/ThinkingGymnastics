/**
 * 下午6:45:43
 * power
 */
package fun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;

/**
 * 描述：

输入一个整数，将这个整数以字符串的形式逆序输出

程序不考虑负数的情况，若数字含有0，则逆序形式也含有0，如输入为100，则输出为001
 * @author cz
 * 2018年3月23日下午6:45:43
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
