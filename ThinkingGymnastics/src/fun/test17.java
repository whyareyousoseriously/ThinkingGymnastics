/**
 * 下午2:47:19
 * power
 */
package fun;

import java.util.TreeMap;

/**
 * 
 * @author cz
 * 2018年3月25日下午2:47:19
 */
public class test17 {
	public static void main(String[] args) {
		int i = 123321;
		String str = String.valueOf(i);
		
		
		int len = str.length();
		
		
		if(len%2!=0)
			System.out.println(false);
		else {
			for(int k =0 ,j=len-1;k<len/2;k++,j--) {
				if(str.charAt(k)!=str.charAt(j))
					System.out.println(false);
			}
			System.out.println(true);
		}
	}
}
