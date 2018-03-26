/**
 * 下午10:38:48
 * power
 */
package fun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 给定n个字符串，请对n个字符串按照字典序排列。
 * @author cz
 * 2018年3月23日下午10:38:48
 */
public class test15 {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine().toString());

        String[] str = new String[count];
        for(int i =0;i<count;i++){
            str[i] = br.readLine().toString();
        }
        Arrays.sort(str);
        for(int i = 0;i<count;i++) {
        	System.out.println(str[i]);
        }
    }
}
