/**
 * ����9:22:02
 * power
 */
package fun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ��Ŀ����
	д��һ�����򣬽���һ������ĸ�������Լ��ո���ɵ��ַ�������һ���ַ���Ȼ����������ַ����к��и��ַ��ĸ����������ִ�Сд��
	��������:
	����һ������ĸ�������Լ��ո���ɵ��ַ�������һ���ַ���	
	�������:
	��������ַ����к��и��ַ��ĸ�����

	ʾ��1
	����
	ABCDEF A
	���
	1
 * @author cz
 * 2018��3��22������9:22:02
 */
public class test04 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int count = 0;
        for(int i =0 ;i<str[0].length();i++){
            if((str[0].charAt(i)==str[1].toLowerCase().charAt(0))||
               (str[0].charAt(i)==str[1].toUpperCase().charAt(0))
            ){
               count++;
            }
        }
        System.out.println(count);
	}
}
