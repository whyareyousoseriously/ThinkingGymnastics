/**
 * ����3:55:35
 * power
 */
package fun;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author cz
 * 2018��3��22������3:55:35
 */
public class test001 {
	public static void main(String[] arg) throws IOException {
		//�����ж�������
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//����Ӳ�Ҹ�������Ҫ���ĳ���
		String[] a =br.readLine().split(" ");
		int count =Integer.parseInt(a[0]);
		int money =Integer.parseInt(a[1]);
		//�������е�Ӳ��
		String[] b = br.readLine().split(" ");
		int[] coins = new int[count];
		//ת��Ϊint��
		for(int i =0 ;i< count ;i++) {
			coins[i] = Integer.parseInt(b[i]);
		}
		
		System.out.println(count+"\t"+money);
		//����
		int[] order = sort(coins);
		//ȡ����֧����Ӳ�Ҹ���
		System.out.println(getCoinCount(order, money));
	}
	public static int[] sort(int[] in) {
		for(int i =0;i<in.length;i++) {
			for(int j =i; j<in.length;j++) {
				int temp = 0;
				if(in[i]>in[j]) {
					temp = in[i];
					in[i] = in[j];
					in[j] = temp;
				}
			}
		}
		return in;
	}
	public static int getCoinCount(int[] order,int money) {
		if(order[order.length-1]==money) {
			return 1;
		}
		int sum = 0;
		int maxCount = 0;
		int count;
		for(int i =0;i<order.length;i++) { 
			sum = order[i];
			count = 1;
			for(int j =i+1;j<order.length;j++){
				sum = sum+order[j];
				count++;
				if(sum>=money) {
					int temp = count;
					for(int k = i;k<temp;k++) {
						if(order[k]<=(sum-money)) {
							sum = sum - order[k];
							count--;
						}
					}
					if(maxCount<count)
						maxCount = count;
					break;
				}
			}
			
		}
		return maxCount;
		
	}
}
