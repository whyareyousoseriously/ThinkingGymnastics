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
import java.util.Scanner;
import java.util.TreeSet;

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
public class test06 {
	public static void main(String[] args) throws IOException {
		//����Scanner��ȡ����
		Scanner sc = new Scanner(System.in);
		TreeSet<Integer> ts = new TreeSet<Integer>();
        while(sc.hasNext()){
        	
            int count = sc.nextInt();
            for(int i=0;i<count;i++){
                ts.add(sc.nextInt());
            }
            break;
        }
        sc.close();
        for(Integer i :ts){
            System.out.println(i);
        }
	}
}
