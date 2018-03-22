/**
 * 下午3:55:35
 * power
 */
package fun;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author cz
 * 2018年3月22日下午3:55:35
 */
public class test001 {
	public static void main(String[] arg) throws IOException {
		//命令行读入数据
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//读入硬币个数和需要付的车费
		String[] a =br.readLine().split(" ");
		int count =Integer.parseInt(a[0]);
		int money =Integer.parseInt(a[1]);
		//读入所有的硬币
		String[] b = br.readLine().split(" ");
		int[] coins = new int[count];
		//转换为int型
		for(int i =0 ;i< count ;i++) {
			coins[i] = Integer.parseInt(b[i]);
		}
		
		System.out.println(count+"\t"+money);
		//排序
		int[] order = sort(coins);
		//取最多可支付的硬币个数
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
