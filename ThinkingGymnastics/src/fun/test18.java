/**
 * ����7:57:55
 * power
 */
package fun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * ��Ŀ���� ��ʦ��֪����ĳĳͬѧ���У�������ߵ��Ƕ��٣�����������ģ����ʦ��ѯ�ʡ���Ȼ����ʦ��ʱ����Ҫ����ĳλͬѧ�ĳɼ�.  
 * ��������: 
 * �����������������ݡ� ÿ�������һ��������������N��M��0 < N <= 30000,0 < M < 5000��,�ֱ����ѧ������Ŀ�Ͳ�������Ŀ�� 
 * ѧ��ID��Ŵ�1�ൽN�� �ڶ��а���N��������������N��ѧ���ĳ�ʼ�ɼ������е�i��������IDΪi��ѧ���ĳɼ� 
 * ��������M�У�ÿһ����һ���ַ�C��ֻȡ��Q����U������������������A,B,��CΪ'Q'��ʱ��, 
 * ��ʾ����һ��ѯ�ʲ�������ѯ��ID��A��B������A,B����ѧ�����У��ɼ���ߵ��Ƕ��� 
 * ��CΪ��U����ʱ�򣬱�ʾ����һ�����²�����Ҫ���IDΪA��ѧ���ĳɼ�����ΪB��  
 *  
 * �������: ����ÿһ��ѯ�ʲ�������һ�����������߳ɼ�.  
 * ʾ��1 ���� 
 * 5 7  
 * 1 2 3 4 5  
 * Q 1 5  
 * U 3 6  
 * Q 3 4  
 * Q 4 5  
 * U 4 5  
 * U 2 9  
 * Q 1 5 
 * ��� 
 * 5 6 5 9 
 * @author cz
 * 2018��3��25������7:57:55
 */
public class test18 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			
			String[] str = sc.nextLine().toString().split(" ");
			
			int student_number = Integer.parseInt(str[0]);
			int count = Integer.parseInt(str[1]);
			int[] array = new int[student_number];
			//����5��ѧ���ĳɼ�
			String[] str1 = sc.nextLine().toString().split(" ");
			for(int i =0;i<student_number;i++) {
				array[i] = Integer.parseInt(str1[i]);
			}
			//������ʦ������
			//�ݴ����ֵ
			int temp;
			ArrayList<Integer> out = new ArrayList<Integer>();
			//��ʦ���ʿ�ʼ����
			int begin;
			//��ʦ���ʽ�������
			int end;
			for(int j =0;j<count;j++) {
				String[] str2 = sc.nextLine().toString().split(" ");
				if("Q".equals(str2[0])) {
					//��ʦ����
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
					//��ʦ����
					begin = Integer.parseInt(str2[1]);
					end = Integer.parseInt(str2[2]);
					array[begin-1] = end;
				}
			}
			//������
			for(int i =0;i<out.size();i++)
				System.out.println(out.get(i));
			System.out.println();
		}
		
	}
}
