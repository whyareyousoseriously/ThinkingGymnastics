/**
 * 下午10:52:53
 * power
 */
package fun;

import java.util.Scanner;

/**
 * 输入一个int型的正整数，计算出该int型数据在内存中存储时1的个数。 
 * @author cz
 * 2018年3月23日下午10:52:53
 */
public class test16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int number = sc.nextInt();
            int count = 0;
            int a=0;
            do{
                a = number%2;
                number = number/2;
                if(a==1)
                    count++;
            }while(number!=0);
            System.out.println(count);
        }
	}
}
