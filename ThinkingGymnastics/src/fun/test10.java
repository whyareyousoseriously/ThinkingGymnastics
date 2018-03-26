/**
 * 上午9:53:15
 * power
 */
package fun;

import java.util.Scanner;

/**
 *  功能:输入一个正整数，按照从小到大的顺序输出它的所有质数的因子（如180的质数因子为2 2 3 3 5 ）
	最后一个数后面也要有空格 
 * @author cz
 * 2018年3月23日上午9:53:15
 */
public class test10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLong()) {

			Long l = sc.nextLong();
			System.out.println(getResult(l));
		}
	}
	public static String getResult(long in) {
		StringBuffer sb = new StringBuffer();
		int index=2;
        while(index<=in)
            {
            if(in%index==0){
                 if(index==in){
                 sb.append(index).append(" ");
                     break;
                }else{
                      sb.append(index).append(" ");
                      in=in/index;
            }
            }else
                {
                index++; 
            }
            
        }  
		return sb.toString();
	}
}
