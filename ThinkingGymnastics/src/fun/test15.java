/**
 * ����10:38:48
 * power
 */
package fun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * ����n���ַ��������n���ַ��������ֵ������С�
 * @author cz
 * 2018��3��23������10:38:48
 */
public class test15 {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine().toString());

        String[] str = new String[count];
        for(int i =0;i<count;i++){
            str[i] = br.readLine().toString();
        }
        Arrays.sort(str);
        for(int i = 0;i<count;i++) {
        	System.out.println(str[i]);
        }
    }
}
