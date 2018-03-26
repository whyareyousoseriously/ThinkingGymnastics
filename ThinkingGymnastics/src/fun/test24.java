/**
 * 下午12:23:43
 * power
 */
package fun;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * @author cz
 * 2018年3月26日下午12:23:43
 */
public class test24 {
	public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        
        while(sc.hasNext()){
        	ArrayList<Integer> al = new ArrayList<Integer>();
            char[] c = sc.nextLine().toString().toCharArray();
            for(int i =2;i<c.length;i++){
                if(c[i]>='A'&&c[i]<='F'){
                     al.add(c[i]-'A'+10);
                    continue;
                }
                if(c[i]>='a'&&c[i]<='f'){
                    al.add(c[i]-'a'+10);
                    continue;
                }
                if(c[i]>='0'&&c[i]<='9'){
                    al.add(c[i]-'0');
                    continue;
                }else{
                    throw new Exception("ERROR");
                }
            }
            int sum =0;
            for(int i =0;i<al.size();i++){
                sum = sum + (int)(al.get(al.size()-i-1)*Math.pow((double)16,(double)i));
            }
            System.out.println(sum);
        }
    }
}
