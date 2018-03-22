/**
 * 下午2:18:16
 * power
 */
package fun;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 设有n个正整数，将他们连接成一排，组成一个最大的多位整数。
	如:n=3时，3个整数13,312,343,连成的最大整数为34331213。
	如:n=4时,4个整数7,13,4,246连接成的最大整数为7424613。
	未完成
	此想法
 * @author cz 2018年3月21日下午2:18:16
 */
public class MaxNumberConnect {
	public static void main(String[] arg) throws Exception {
		// 接收字符串采用BufferReader接收
		BufferedReader bf_in = new BufferedReader(new InputStreamReader(System.in));
		// 第一行接收为数字串的数量,接收后转为Int
		int string_count = Integer.parseInt(bf_in.readLine().toString());
		// 第二行接收为具体的字符串,并去除空格
		String[] string = bf_in.readLine().toString().split(" ");
		// 调用函数获得MaxNumber;
		StringBuffer sb = getMaxNumber(string_count, string);
		System.out.println(sb);
	}

	public static StringBuffer getMaxNumber(int string_count, String[] string) {
		StringBuffer sb = new StringBuffer();
		
		double[] d = new double[string_count];
		int[] power = new int[string_count];
		for (int i = 0; i < string_count; i++) {
			power[i] = 1;
		}
		for (int i = 0; i < string_count; i++) {
			double data_int = Double.parseDouble(string[i]);

			for (int j = 0; j < string[i].length() - 1; j++) {

				power[i] = power[i] * 10;
			}
			d[i] = data_int / power[i];
		}
		for (int i = 0; i < string_count; i++) {
			for (int j = i + 1; j < string_count; j++) {
				double temp = 0.0;
				String temp2;
				if (d[i] < d[j]) {
					temp = d[j];
					d[j] = d[i];
					d[i] = temp;
					temp2 = string[j];
					string[j] = string[i];
					string[i] = temp2;
				}
			}
			sb.append(string[i]);
		}
		//初步排序完成
		for(int i=0;i<d.length;i++)
		System.out.println(d[i]);
		
		//完善，分为九类
		Double[][] dou = new Double[9][];
		for(int i = 0;i<string_count;i++) {
			for(int j =0 ;j<9;j++) {
				
			}
		}
		return sb;
	}
}
