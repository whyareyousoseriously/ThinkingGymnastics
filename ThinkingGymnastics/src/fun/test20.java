/**
 * ����11:54:27
 * power
 */
package fun;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 * ���ӣ�https://www.nowcoder.com/questionTerminal/67df1d7889cf4c529576383c2e647c48
��Դ��ţ����

����һ���򵥴����¼����Сģ�飬�ܹ���¼����Ĵ������ڵ��ļ����ƺ��кš�
����:
1.��¼���8�������¼������ͬ�Ĵ����¼(���ļ����ƺ��к���ȫƥ��)ֻ��¼һ��������������ӣ�(�ļ����ڵ�Ŀ¼��ͬ���ļ������к���ͬҲҪ�ϲ�)
2.����16���ַ����ļ����ƣ�ֻ��¼�ļ��������Ч16���ַ���(����ļ�����ͬ����ֻ���ļ����ĺ�16���ַ����к���ͬ��Ҳ��Ҫ�ϲ�)
3.������ļ����ܴ�·������¼�ļ����Ʋ��ܴ�·��
һ�л�����ַ�����ÿ�а�����·���ļ����ƣ��кţ��Կո������

    �ļ�·��Ϊwindows��ʽ

    �磺E:\V1R2\product\fpgadrive.c 1325
    ���ӣ�https://www.nowcoder.com/questionTerminal/67df1d7889cf4c529576383c2e647c48
��Դ��ţ����

�����еļ�¼ͳ�Ʋ�������������ʽ���ļ�������������Ŀ��һ���ո��������: fpgadrive.c 1325 1
���������Ŀ�Ӷൽ��������Ŀ��ͬ������£����������һ�γ���˳������
�������8����¼����ֻ���ǰ8����¼.
����ļ����ĳ��ȳ���16���ַ�����ֻ�����16���ַ�

����

E:\V1R2\product\fpgadrive.c 1325

���

fpgadrive.c 1325 1


 * @author cz
 * 2018��3��25������11:54:27
 */
public class test20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String key;
		int value;
		Map m = new LinkedHashMap<String,Integer>();
		while(sc.hasNext()) {
			//����
			
			String temp = sc.next();
			int index = temp.lastIndexOf('\\');
			key = index>0 ? temp.substring(index+1) : temp;
			int linenum = sc.nextInt();
			key = key + " " + linenum;
			if(m.containsKey(key)) {
				m.put(key,(Integer)m.get(key)+1);
			}else {
				m.put(key,1);
			}
		}
		sc.close();
			//����
			List<Map.Entry<String, Integer>> l = new LinkedList<Map.Entry<String,Integer>>(m.entrySet());
			Collections.sort(l, 
					new Comparator<Map.Entry<String, Integer>>() {

						@Override
						public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
							// TODO Auto-generated method stub
							
							return (o2.getValue()-o1.getValue()) == 0? (o1.getValue()-o2.getValue()) : (o2.getValue()-o1.getValue());
						}
			});
			//���
			int count = 0;
			for(Map.Entry<String, Integer> m1:l) {
				count++;
				if(count<=8) {
					String[] s = m1.getKey().split(" ");
					String sub = s[0].length()>16 ? s[0].substring(s[0].length()-16) : s[0];
					String n = s[1];
					System.out.println(sub+" "+n+" "+m1.getValue());
				}else {
					break;
				}
			}
			
		
	}
}
