/**
 * ����3:27:14
 * power
 */
package fun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ��дһ�������������ַ����к��еĲ�ͬ�ַ��ĸ������ַ���ACSII�뷶Χ��(0~127)�����ڷ�Χ�ڵĲ���ͳ�ơ�
 * @author cz
 * 2018��3��23������3:27:14
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
