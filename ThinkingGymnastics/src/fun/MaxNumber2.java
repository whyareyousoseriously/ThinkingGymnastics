/**
 * 下午7:44:45
 * power
 */
package fun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author cz
 * 2018年3月21日下午7:44:46
 */
public class MaxNumber2 {
	
	public static void main(String[] arg) throws NumberFormatException, IOException {
		//读入数据
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//读入数字的个数
		int br_count = Integer.parseInt(br.readLine().toString());
		//读入具体的数字
		String[] str = br.readLine().toString().split(" ");
		StringBuffer sb = sort(str,br_count);
		
		System.out.println(sb.toString());
	}
	public static StringBuffer sort(String[] str,int br_count) {
		//用冒泡排序
		StringBuffer sb = new StringBuffer();
		for(int i =0;i<br_count;i++) {
			for(int j =i+1 ;j<br_count;j++) {
				//如果i的优先级比j低
				if(!comp2(str[i],str[j])) {
					String temp = str[j];
					str[j] = str[i];
					str[i] = temp;
				}
			}
			//每次一外循环，优先级最高的就会到数组头，加入StringBuffer中
			sb.append(str[i]);
			System.out.println(str[i]+"\t");
		}
		return sb;
	}
	public static boolean comp(String str1,String str2) {
		//取得str1的长度
		int len1 = str1.length();
		//取得str2的长度
		int len2 = str2.length();
		//取得两者中长度较短的作为最短长度
		int min = len1>len2 ? len2 : len1;
		//第一种情况,循环遍历min次，可以区分一批数据，但是不能区分如 96 963这样，短字符是长字符的子集的
		for(int i = 0; i<min;i++) {
			//遍历取字符
			char c1 = str1.charAt(i);
			char c2 = str2.charAt(i);
			if(c1>c2) {
				//这表明Str1>Str2
				return true;
			}else if(c1<c2) {
				return false;
			}
		}
		if (min == len2 && min < len1)
        {
            if (str1.charAt(0) > str1.charAt(min))
            {
                return false;
            } else if (str1.charAt(0) == str1.charAt(min))
            {
                if (min + 1 <= len1 - 1)
                {
                    if (str1.charAt(0) > str1.charAt(min + 1))
                    {
                        return false;
                    } else
                    {
                        return true;
                    }
                }
            } else
            {
                return true;
            }
        } else if (min == len1 && min < len2)
        {
            if (str2.charAt(0) > str2.charAt(min))
            {
                return true;
            } else if (str2.charAt(0) == str2.charAt(min))
            {
                if (min + 1 <= len2 - 1)
                {
                    if (str2.charAt(0) > str2.charAt(min + 1))
                    {
                        return true;
                    } else
                    {
                        return false;
                    }
                }
  
            } else
            {
                return false;
            }
        }
        return true;
  
	}
	public static boolean comp2(String str1,String str2) {
		//方法二：运行时间52ms 占用内存11476K
		StringBuffer sb1 = new StringBuffer();
		sb1.append(str1);
		sb1.append(str2);
		StringBuffer sb2 = new StringBuffer();
		sb2.append(str2);
		sb2.append(str1);
		return Integer.valueOf(sb2.toString()) > Integer.valueOf(sb1.toString())? false : true;
	}
}
