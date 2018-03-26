/**
 * 下午9:45:43
 * power
 */
package fun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * 明明想在学校中请一些同学一起做一项问卷调查，为了实验的客观性，
 * 他先用计算机生成了N个1到1000之间的随机整数（N≤1000），
 * 对于其中重复的数字，只保留一个，把其余相同的数去掉，
 * 不同的数对应着不同的学生的学号。然后再把这些数从小到大排序，
 * 按照排好的顺序去找同学做调查。请你协助明明完成“去重”与“排序”的工作。
 * 
 * 输入多行，先输入随机整数的个数，再输入相应个数的整数
 * 返回多行，处理后的结果
 * @author cz
 * 2018年3月22日下午9:45:43
 */
public class test06 {
	public static void main(String[] args) throws IOException {
		//采用Scanner获取输入
		Scanner sc = new Scanner(System.in);
		TreeSet<Integer> ts = new TreeSet<Integer>();
        while(sc.hasNext()){
        	
            int count = sc.nextInt();
            for(int i=0;i<count;i++){
                ts.add(sc.nextInt());
            }
            break;
        }
        sc.close();
        for(Integer i :ts){
            System.out.println(i);
        }
	}
}
