/**
 * 下午2:49:23
 * power
 */
package fun;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 
 * @author cz
 * 2018年3月22日下午2:49:23
 */
public class Encrypt {
	public static void main(String[] arg) throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        if(!validator(str)) {
        	System.out.println("字符过长");
        }else {
        	System.out.println(encrypt(str));
        }
        
    }
    public static Boolean validator(String str){
        if(str.length()>=80){
            return false;
        }else{
            return true;
        }
    }
    public static StringBuffer encrypt(String str){
        StringBuffer sb = new StringBuffer();
        for(int i = 0;i< str.length();i++){
            if((str.charAt(i)>='A'&&str.charAt(i)<='Z')||(str.charAt(i)>='a'&&str.charAt(i)<='z')) {
            	if(str.charAt(i) == 'Z')
            		sb.append('A');
            	if(str.charAt(i) == 'z')
            		sb.append('a');
            	else {
            		sb.append((char)(str.charAt(i)+1));
            	}
            }else {
            	sb.append(str.charAt(i));
            }
            
        }
        return sb;
    }
}
