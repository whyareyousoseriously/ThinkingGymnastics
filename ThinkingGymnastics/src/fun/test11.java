/**
 * ����10:37:53
 * power
 */
package fun;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.io.IOException;

/**
 * ���ݱ��¼��������������ֵ����Ա�������ͬ�ļ�¼���кϲ���������ͬ��������ֵ����������㣬�������keyֵ������������
 * 
 * @author cz 2018��3��23������10:37:53
 */
public class test11 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine().toString());
		int[][] data = new int[count][2];
		for (int i = 0; i < count; i++) {
			String[] str = br.readLine().toString().split(" ");
			for (int j = 0; j < 2; j++) {
				data[i][j] = Integer.parseInt(str[j]);
			}
		}
		
		int temp = 0;
		for (int i = 0; i < count; i++) {
			for (int j = i + 1; j < count; j++) {
				if (data[i][0] > data[j][0]) {
					temp = data[i][0];
					data[i][0] = data[j][0];
					data[j][0] = temp;
				}
				if (data[i][0] == data[j][0]) {
					data[i][1] = data[i][1] + data[j][1];
				}
			}
		}
		TreeSet<Integer> ts = new TreeSet<Integer>();
		for (int i = 0; i < count; i++) {
			ts.add(data[i][0]);
		}
		Iterator<Integer> iter = ts.iterator();
		int comp = 0;
		if (iter.hasNext())
			comp = iter.next();
		for (int i = 0; i < count; i++) {

			if (comp == data[i][0]) {
				System.out.println(data[i][0] + " " + data[i][1]);
				if (iter.hasNext()) {
					comp = iter.next();

				}
			}
		}
		
	}
}
