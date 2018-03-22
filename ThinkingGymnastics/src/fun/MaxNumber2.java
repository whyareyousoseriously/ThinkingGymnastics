/**
 * ����7:44:45
 * power
 */
package fun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author cz
 * 2018��3��21������7:44:46
 */
public class MaxNumber2 {
	
	public static void main(String[] arg) throws NumberFormatException, IOException {
		//��������
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//�������ֵĸ���
		int br_count = Integer.parseInt(br.readLine().toString());
		//������������
		String[] str = br.readLine().toString().split(" ");
		StringBuffer sb = sort(str,br_count);
		
		System.out.println(sb.toString());
	}
	public static StringBuffer sort(String[] str,int br_count) {
		//��ð������
		StringBuffer sb = new StringBuffer();
		for(int i =0;i<br_count;i++) {
			for(int j =i+1 ;j<br_count;j++) {
				//���i�����ȼ���j��
				if(!comp2(str[i],str[j])) {
					String temp = str[j];
					str[j] = str[i];
					str[i] = temp;
				}
			}
			//ÿ��һ��ѭ�������ȼ���ߵľͻᵽ����ͷ������StringBuffer��
			sb.append(str[i]);
			System.out.println(str[i]+"\t");
		}
		return sb;
	}
	public static boolean comp(String str1,String str2) {
		//ȡ��str1�ĳ���
		int len1 = str1.length();
		//ȡ��str2�ĳ���
		int len2 = str2.length();
		//ȡ�������г��Ƚ϶̵���Ϊ��̳���
		int min = len1>len2 ? len2 : len1;
		//��һ�����,ѭ������min�Σ���������һ�����ݣ����ǲ��������� 96 963���������ַ��ǳ��ַ����Ӽ���
		for(int i = 0; i<min;i++) {
			//����ȡ�ַ�
			char c1 = str1.charAt(i);
			char c2 = str2.charAt(i);
			if(c1>c2) {
				//�����Str1>Str2
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
		//������������ʱ��52ms ռ���ڴ�11476K
		StringBuffer sb1 = new StringBuffer();
		sb1.append(str1);
		sb1.append(str2);
		StringBuffer sb2 = new StringBuffer();
		sb2.append(str2);
		sb2.append(str1);
		return Integer.valueOf(sb2.toString()) > Integer.valueOf(sb1.toString())? false : true;
	}
}
