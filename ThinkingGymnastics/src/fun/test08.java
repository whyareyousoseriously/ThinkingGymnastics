/**
 * 下午11:49:29
 * power
 */
package fun;

import java.util.Scanner;

/**
 * 写出一个程序，接受一个十六进制的数值字符串，输出该数值的十进制字符串。（多组同时输入 ）
 * 
	输入
	0xA
	输出
	10
 * @author cz
 * 2018年3月22日下午11:49:29
 */
public class test08 {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String str = sc.next();
			//先判断是否合法
			if(str==null || str.length()<=2) {
				throw new Exception("输入为："+str+" 格式异常");
			}
			if(!(str.charAt(0)=='0'&&str.charAt(1)=='x')) {
				throw new Exception("输入为："+str+"格式异常");
			}
			int[] count = new int[str.length()-2];
			for(int i =2;i<str.length();i++) {
				if(str.charAt(i)=='a'||str.charAt(i)=='A') {
					//十进制的10
					count[i-2] = 10;
					continue;
				}
				if(str.charAt(i)=='b'||str.charAt(i)=='B') {
					//十进制的10
					count[i-2] = 11;
					continue;
				}
				if(str.charAt(i)=='c'||str.charAt(i)=='C') {
					//十进制的10
					count[i-2] = 12;
					continue;
				}
				if(str.charAt(i)=='d'||str.charAt(i)=='D') {
					//十进制的10
					count[i-2] = 13;
					continue;
				}
				if(str.charAt(i)=='e'||str.charAt(i)=='E') {
					//十进制的10
					count[i-2] = 14;
					continue;
				}
				if(str.charAt(i)=='f'||str.charAt(i)=='F') {
					//十进制的10
					count[i-2] = 15;
					continue;
				}
				if(str.charAt(i)>='0'&&str.charAt(i)<='9') {
					//十进制的0~9
					count[i-2] = str.charAt(i)-'0';
					continue;
				}else {
					throw new Exception("格式错误,读入了非0~9,a~f,A~F的值");
				}
			}
			
			//计算权重
			int[] fac = new int[count.length];
			int f = 1;
			fac[count.length-1] = 1;
			
			for(int i =count.length-2;i>=0;i--) {
				f = f * 10;
				fac[i] = f;
			}
			
			//计算十进制数
			int sum = 0;
			for(int i =count.length-1;i>=0;i--) {
				//计算十进制数
				sum = sum + count[i]*fac[i];
				
				
			}
			//输出
			System.out.println(sum);
		}
	}
}
