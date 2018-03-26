/**
 * 下午12:57:53
 * power
 */
package fun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * 
 * @author cz
 * 2018年3月23日下午12:57:53
 */
public class test12 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().toString();
        HashSet<Character> tr = new LinkedHashSet<Character>();
        for(int i =str.length()-1;i>=0;i--){
            tr.add(str.charAt(i));
        }
        StringBuffer sb = new StringBuffer();
        /*Iterator<Character> iter = tr.iterator();
        while(iter.hasNext()){
            sb.append(iter.next());
        }*/
        for(Character c:tr) {
        	sb.append(c);
        }
        System.out.println(Integer.parseInt(sb.toString()));
    }
    
}
