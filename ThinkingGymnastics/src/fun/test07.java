/**
 * 下午10:41:49
 * power
 */
package fun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * •连续输入字符串，请按长度为8拆分每个字符串后输出到新的字符串数组；
	•长度不是8整数倍的字符串请在后面补数字0，空字符串不处理。
	连续输入字符串(输入2次,每个字符串长度小于100)
	输出描述:
	输出到长度为8的新字符串数组
	
	输入
	abc
	123456789
	输出
	abc00000
	12345678
	90000000


 * @author cz
 * 2018年3月22日下午10:41:49
 */
public class test07 {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //读入两行数据
        String str1 = br.readLine().toString();
        String str2 = br.readLine().toString();
        //进行处理
        doSomething(str1);
        doSomething(str2);
    }
    public static void doSomething(String str){
    	//暂存数组
        char[] c = new char[8];
    	//首先判断长度是否够8
        if(str.length()<=8){
            
            for(int i = 0;i<str.length();i++){
                //赋值
                c[i] = str.charAt(i);
            }
            for(int i = str.length();i<8;i++){
                //补零
                c[i] = '0';
            }
            //输出
            for(int k =0;k<8;k++){
                System.out.print(c[k]);
            }
            System.out.println();
        }
        if(str.length()>8){
            //确定分割次数,除以8，向下取整
            int count = (int)Math.floor(str.length()/8);
            //整个串的index
            int index = 0;
            
            for(int i =0;i<count;i++){
                //循环count次
                for(int j =0;j<8;j++){
                    //赋值
                    c[j] = str.charAt(index);
                    index++;
                }
                //输出
                for(int k =0;k<8;k++){
                    System.out.print(c[k]);
                }
                System.out.println();
            }
            //最后补零
            if(str.length()-index>0) {
            	 //先赋值
                for(int i =index;i<str.length();i++){
                    c[i-index] = str.charAt(i);
                }
                //再补零
                for(int i = str.length()-index;i<8;i++){
                    c[i] = '0';
                }
              //输出
                for(int k =0;k<8;k++){
                    System.out.print(c[k]);
                }
                System.out.println();
            }
           
        }
    }
}
