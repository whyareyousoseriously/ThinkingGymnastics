/**
 * 下午3:27:14
 * power
 */
package fun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 编写一个函数，计算字符串中含有的不同字符的个数。字符在ACSII码范围内(0~127)。不在范围内的不作统计。
 * @author cz
 * 2018年3月23日下午3:27:14
 */
public class test13 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] c = br.readLine().toCharArray();
		int count = 0;
		for(int i =0 ;i<c.length;i++) {
			if((int)c[i]>0&&(int)c[i]<127) {
				System.out.println((int)c[i]);
				count++;
			}
		}
		System.out.println(count);
	}
}
