/**
 * 下午11:54:27
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
 * 链接：https://www.nowcoder.com/questionTerminal/67df1d7889cf4c529576383c2e647c48
来源：牛客网

开发一个简单错误记录功能小模块，能够记录出错的代码所在的文件名称和行号。
处理:
1.记录最多8条错误记录，对相同的错误记录(即文件名称和行号完全匹配)只记录一条，错误计数增加；(文件所在的目录不同，文件名和行号相同也要合并)
2.超过16个字符的文件名称，只记录文件的最后有效16个字符；(如果文件名不同，而只是文件名的后16个字符和行号相同，也不要合并)
3.输入的文件可能带路径，记录文件名称不能带路径
一行或多行字符串。每行包括带路径文件名称，行号，以空格隔开。

    文件路径为windows格式

    如：E:\V1R2\product\fpgadrive.c 1325
    链接：https://www.nowcoder.com/questionTerminal/67df1d7889cf4c529576383c2e647c48
来源：牛客网

将所有的记录统计并将结果输出，格式：文件名代码行数数目，一个空格隔开，如: fpgadrive.c 1325 1
结果根据数目从多到少排序，数目相同的情况下，按照输入第一次出现顺序排序。
如果超过8条记录，则只输出前8条记录.
如果文件名的长度超过16个字符，则只输出后16个字符

输入

E:\V1R2\product\fpgadrive.c 1325

输出

fpgadrive.c 1325 1


 * @author cz
 * 2018年3月25日下午11:54:27
 */
public class test20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String key;
		int value;
		Map m = new LinkedHashMap<String,Integer>();
		while(sc.hasNext()) {
			//读入
			
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
			//排序
			List<Map.Entry<String, Integer>> l = new LinkedList<Map.Entry<String,Integer>>(m.entrySet());
			Collections.sort(l, 
					new Comparator<Map.Entry<String, Integer>>() {

						@Override
						public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
							// TODO Auto-generated method stub
							
							return (o2.getValue()-o1.getValue()) == 0? (o1.getValue()-o2.getValue()) : (o2.getValue()-o1.getValue());
						}
			});
			//输出
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
