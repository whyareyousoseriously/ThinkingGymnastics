/**
 * ����11:49:29
 * power
 */
package fun;

import java.util.Scanner;

/**
 * д��һ�����򣬽���һ��ʮ�����Ƶ���ֵ�ַ������������ֵ��ʮ�����ַ�����������ͬʱ���� ��
 * 
	����
	0xA
	���
	10
 * @author cz
 * 2018��3��22������11:49:29
 */
public class test08 {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String str = sc.next();
			//���ж��Ƿ�Ϸ�
			if(str==null || str.length()<=2) {
				throw new Exception("����Ϊ��"+str+" ��ʽ�쳣");
			}
			if(!(str.charAt(0)=='0'&&str.charAt(1)=='x')) {
				throw new Exception("����Ϊ��"+str+"��ʽ�쳣");
			}
			int[] count = new int[str.length()-2];
			for(int i =2;i<str.length();i++) {
				if(str.charAt(i)=='a'||str.charAt(i)=='A') {
					//ʮ���Ƶ�10
					count[i-2] = 10;
					continue;
				}
				if(str.charAt(i)=='b'||str.charAt(i)=='B') {
					//ʮ���Ƶ�10
					count[i-2] = 11;
					continue;
				}
				if(str.charAt(i)=='c'||str.charAt(i)=='C') {
					//ʮ���Ƶ�10
					count[i-2] = 12;
					continue;
				}
				if(str.charAt(i)=='d'||str.charAt(i)=='D') {
					//ʮ���Ƶ�10
					count[i-2] = 13;
					continue;
				}
				if(str.charAt(i)=='e'||str.charAt(i)=='E') {
					//ʮ���Ƶ�10
					count[i-2] = 14;
					continue;
				}
				if(str.charAt(i)=='f'||str.charAt(i)=='F') {
					//ʮ���Ƶ�10
					count[i-2] = 15;
					continue;
				}
				if(str.charAt(i)>='0'&&str.charAt(i)<='9') {
					//ʮ���Ƶ�0~9
					count[i-2] = str.charAt(i)-'0';
					continue;
				}else {
					throw new Exception("��ʽ����,�����˷�0~9,a~f,A~F��ֵ");
				}
			}
			
			//����Ȩ��
			int[] fac = new int[count.length];
			int f = 1;
			fac[count.length-1] = 1;
			
			for(int i =count.length-2;i>=0;i--) {
				f = f * 10;
				fac[i] = f;
			}
			
			//����ʮ������
			int sum = 0;
			for(int i =count.length-1;i>=0;i--) {
				//����ʮ������
				sum = sum + count[i]*fac[i];
				
				
			}
			//���
			System.out.println(sum);
		}
	}
}
