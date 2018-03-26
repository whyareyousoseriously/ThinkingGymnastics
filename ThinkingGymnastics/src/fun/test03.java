/**
 * 下午9:15:46
 * power
 */
package fun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author cz
 * 2018年3月22日下午9:15:46
 */
public class test03 {
	public static void main(String[] arg) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		System.out.println(str[str.length-1].length());
	}
}
