/**
 * ����9:45:43
 * power
 */
package fun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * ��������ѧУ����һЩͬѧһ����һ���ʾ���飬Ϊ��ʵ��Ŀ͹��ԣ�
 * �����ü����������N��1��1000֮������������N��1000����
 * ���������ظ������֣�ֻ����һ������������ͬ����ȥ����
 * ��ͬ������Ӧ�Ų�ͬ��ѧ����ѧ�š�Ȼ���ٰ���Щ����С��������
 * �����źõ�˳��ȥ��ͬѧ�����顣����Э��������ɡ�ȥ�ء��롰���򡱵Ĺ�����
 * 
 * ������У���������������ĸ�������������Ӧ����������
 * ���ض��У������Ľ��
 * @author cz
 * 2018��3��22������9:45:43
 */
public class test05 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine().toString());
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for(int i = 0;i<count;i++) {
			al.add(Integer.parseInt(br.readLine().toString()));
		}
		//ȥ�ؼ�����
		int temp = 0;
		for(int i = 0 ;i<al.size();i++) {
			for(int j=i+1;j<al.size();j++) {
				if(al.get(i)==al.get(j)) {
					//ȥ��
					al.remove(j);
					continue;
				}
				if(al.get(i)>al.get(j)) {
					//����
					temp = al.get(i);
					al.set(i, al.get(j));
					al.set(j, temp);
				}
			}
		}
		for(int i =0 ;i<al.size();i++) {
			System.out.println(al.get(i));
		}
	}
}
