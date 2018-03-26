/**
 * 下午7:39:13
 * power
 */
package fun;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.io.IOException;
/**
 * 	输入描述:
	输入一个字符串。
	输出描述:
	输出字符串中最长的数字字符串和它的长度。如果有相同长度的串，则要一块儿输出，但是长度还是一串的长度
	示例1
	输入
	abcd12345ed125ss123058789
	输出
	123058789,9
 * @author cz
 * 2018年3月22日下午7:39:13
 */
public class test02 {
	public static void main(String[] arg) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> al = new ArrayList<String>();
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		String str0 = br.readLine().replaceAll("[^0-9]", " ");
		/*System.out.println(str0);*/
		String[] str = str0.split(" ");
		/*for(int i = 0;i<str.length;i++) {
			System.out.println("i:"+str[i]);
		}
		*/
		for(int i =0;i<str.length;i++) {
			if(" ".equals(str[i])) {
				
			}else {
				al.add(str[i]);
				
			}
		}
		for(int i = 1;i<al.size();i++) {
			al2.add(al.get(i).length());
		}
		/*Iterator<String> iter = al.iterator();
		while(iter.hasNext()) {
			al2.add(iter.next().length());
		}*/
		int max = al2.get(0);
		int temp = 0;
		for(int i = 1;i<al2.size();i++) {
			if(max<al2.get(i)) {
				temp = max;
				max = al2.get(i);
				al2.set(i, temp);
			}
			
		}
		for(int i = 0;i<al.size();i++) {
			if(al.get(i).length()==max) {
				System.out.print(al.get(i)+",");
			}
		}
		System.out.println(max);
	}
}
