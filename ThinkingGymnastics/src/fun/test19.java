/**
 * ����11:38:54
 * power
 */
package fun;

import java.util.Scanner;

/**
 * 
 * @author cz
 * 2018��3��25������11:38:54
 */
public class test19 {
	public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);  
        while (sc.hasNext()) {  
            String line = sc.nextLine();  
            String[] firstStr = line.split("\\s");  
            int N = Integer.parseInt(firstStr[0]);  
            int M = Integer.parseInt(firstStr[1]);  
  
            // ��ѧ���ɼ���������  
            line = sc.nextLine();  
            String[] gdStrings = line.split("\\s");  
  
            int[] grades = new int[N];  
            for (int i = 0; i < N; i++) {  
                grades[i] = Integer.parseInt(gdStrings[i]);  
            }  
  
            // ����QU����  
            for (int k = 0; k < M; k++) {  
                String ss = sc.nextLine();  
                String[] strings = ss.split("\\s");  
                String flag = strings[0];  
                int from = Integer.parseInt(strings[1]);  
                int to = Integer.parseInt(strings[2]);  
  
                if (flag.equals("Q")) {  
                    // �˴��п�-------from�п���С��to  
                    int maxValue = max(from - 1, to - 1, grades);// �ӳɼ��д�from-1��to-1�����ֵ  
                    System.out.println(maxValue);  
                } else if (flag.equals("U")) {  
                    // ����Uʱ����������ĳɼ�  
                    grades[from - 1] = to;  
                }  
            }  
        }  
    }  
  
    /** 
     * �ӳɼ������д�start��end�����ֵ 
     *  
     * @param start 
     * @param end 
     * @param students 
     * @return 
     */  
    public static int max(int start, int end, int[] scores) {  
        if (start > end)  
            return max(end, start, scores);  
        else {  
            int max = scores[start];  
            for (int i = start + 1; i <= end; i++) {  
                if (scores[i] > max)  
                    max = scores[i];  
            }  
            return max;  
        }  
  
    }  
}
