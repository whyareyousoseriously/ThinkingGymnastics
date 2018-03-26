/**
 * 下午11:38:54
 * power
 */
package fun;

import java.util.Scanner;

/**
 * 
 * @author cz
 * 2018年3月25日下午11:38:54
 */
public class test19 {
	public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);  
        while (sc.hasNext()) {  
            String line = sc.nextLine();  
            String[] firstStr = line.split("\\s");  
            int N = Integer.parseInt(firstStr[0]);  
            int M = Integer.parseInt(firstStr[1]);  
  
            // 将学生成绩保存下来  
            line = sc.nextLine();  
            String[] gdStrings = line.split("\\s");  
  
            int[] grades = new int[N];  
            for (int i = 0; i < N; i++) {  
                grades[i] = Integer.parseInt(gdStrings[i]);  
            }  
  
            // 处理QU问题  
            for (int k = 0; k < M; k++) {  
                String ss = sc.nextLine();  
                String[] strings = ss.split("\\s");  
                String flag = strings[0];  
                int from = Integer.parseInt(strings[1]);  
                int to = Integer.parseInt(strings[2]);  
  
                if (flag.equals("Q")) {  
                    // 此处有坑-------from有可能小于to  
                    int maxValue = max(from - 1, to - 1, grades);// 从成绩中从from-1到to-1的最大值  
                    System.out.println(maxValue);  
                } else if (flag.equals("U")) {  
                    // 出现U时，更新数组的成绩  
                    grades[from - 1] = to;  
                }  
            }  
        }  
    }  
  
    /** 
     * 从成绩数组中从start到end的最大值 
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
