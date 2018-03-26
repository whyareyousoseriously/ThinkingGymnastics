/**
 * 下午9:22:02
 * power
 */
package fun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 题目描述
	写出一个程序，接受一个有字母和数字以及空格组成的字符串，和一个字符，然后输出输入字符串中含有该字符的个数。不区分大小写。
	输入描述:
	输入一个有字母和数字以及空格组成的字符串，和一个字符。	
	输出描述:
	输出输入字符串中含有该字符的个数。

	示例1
	输入
	ABCDEF A
	输出
	1
 * @author cz
 * 2018年3月22日下午9:22:02
 */
public class test04 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int count = 0;
        for(int i =0 ;i<str[0].length();i++){
            if((str[0].charAt(i)==str[1].toLowerCase().charAt(0))||
               (str[0].charAt(i)==str[1].toUpperCase().charAt(0))
            ){
               count++;
            }
        }
        System.out.println(count);
	}
}
