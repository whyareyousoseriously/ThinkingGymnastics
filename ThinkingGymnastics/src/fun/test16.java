/**
 * ����10:52:53
 * power
 */
package fun;

import java.util.Scanner;

/**
 * ����һ��int�͵����������������int���������ڴ��д洢ʱ1�ĸ����� 
 * @author cz
 * 2018��3��23������10:52:53
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
