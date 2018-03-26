/**
 * 下午7:57:55
 * power
 */
package fun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * 题目描述 老师想知道从某某同学当中，分数最高的是多少，现在请你编程模拟老师的询问。当然，老师有时候需要更新某位同学的成绩.  
 * 输入描述: 
 * 输入包括多组测试数据。 每组输入第一行是两个正整数N和M（0 < N <= 30000,0 < M < 5000）,分别代表学生的数目和操作的数目。 
 * 学生ID编号从1编到N。 第二行包含N个整数，代表这N个学生的初始成绩，其中第i个数代表ID为i的学生的成绩 
 * 接下来又M行，每一行有一个字符C（只取‘Q’或‘U’），和两个正整数A,B,当C为'Q'的时候, 
 * 表示这是一条询问操作，他询问ID从A到B（包括A,B）的学生当中，成绩最高的是多少 
 * 当C为‘U’的时候，表示这是一条更新操作，要求把ID为A的学生的成绩更改为B。  
 *  
 * 输出描述: 对于每一次询问操作，在一行里面输出最高成绩.  
 * 示例1 输入 
 * 5 7  
 * 1 2 3 4 5  
 * Q 1 5  
 * U 3 6  
 * Q 3 4  
 * Q 4 5  
 * U 4 5  
 * U 2 9  
 * Q 1 5 
 * 输出 
 * 5 6 5 9 
 * @author cz
 * 2018年3月25日下午7:57:55
 */
public class test18 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			
			String[] str = sc.nextLine().toString().split(" ");
			
			int student_number = Integer.parseInt(str[0]);
			int count = Integer.parseInt(str[1]);
			int[] array = new int[student_number];
			//读入5个学生的成绩
			String[] str1 = sc.nextLine().toString().split(" ");
			for(int i =0;i<student_number;i++) {
				array[i] = Integer.parseInt(str1[i]);
			}
			//读入老师的问题
			//暂存最大值
			int temp;
			ArrayList<Integer> out = new ArrayList<Integer>();
			//老师提问开始序列
			int begin;
			//老师提问结束序列
			int end;
			for(int j =0;j<count;j++) {
				String[] str2 = sc.nextLine().toString().split(" ");
				if("Q".equals(str2[0])) {
					//老师提问
					begin = Integer.parseInt(str2[1]);
					end = Integer.parseInt(str2[2]);
					temp = array[begin-1];
					for(int i =begin;i<end;i++) {
						if(temp<array[i]) {
							temp = array[i];
						}
					}
					out.add(temp);
					
				}
				if("U".equals(str2[0])) {
					//老师更新
					begin = Integer.parseInt(str2[1]);
					end = Integer.parseInt(str2[2]);
					array[begin-1] = end;
				}
			}
			//输出结果
			for(int i =0;i<out.size();i++)
				System.out.println(out.get(i));
			System.out.println();
		}
		
	}
}
