/**
 * ����9:53:15
 * power
 */
package fun;

import java.util.Scanner;

/**
 *  ����:����һ�������������մ�С�����˳����������������������ӣ���180����������Ϊ2 2 3 3 5 ��
	���һ��������ҲҪ�пո� 
 * @author cz
 * 2018��3��23������9:53:15
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
