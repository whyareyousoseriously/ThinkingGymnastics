/**
 * ����2:18:16
 * power
 */
package fun;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * ����n�������������������ӳ�һ�ţ����һ�����Ķ�λ������
	��:n=3ʱ��3������13,312,343,���ɵ��������Ϊ34331213��
	��:n=4ʱ,4������7,13,4,246���ӳɵ��������Ϊ7424613��
	δ���
	���뷨
 * @author cz 2018��3��21������2:18:16
 */
public class MaxNumberConnect {
	public static void main(String[] arg) throws Exception {
		// �����ַ�������BufferReader����
		BufferedReader bf_in = new BufferedReader(new InputStreamReader(System.in));
		// ��һ�н���Ϊ���ִ�������,���պ�תΪInt
		int string_count = Integer.parseInt(bf_in.readLine().toString());
		// �ڶ��н���Ϊ������ַ���,��ȥ���ո�
		String[] string = bf_in.readLine().toString().split(" ");
		// ���ú������MaxNumber;
		StringBuffer sb = getMaxNumber(string_count, string);
		System.out.println(sb);
	}

	public static StringBuffer getMaxNumber(int string_count, String[] string) {
		StringBuffer sb = new StringBuffer();
		
		double[] d = new double[string_count];
		int[] power = new int[string_count];
		for (int i = 0; i < string_count; i++) {
			power[i] = 1;
		}
		for (int i = 0; i < string_count; i++) {
			double data_int = Double.parseDouble(string[i]);

			for (int j = 0; j < string[i].length() - 1; j++) {

				power[i] = power[i] * 10;
			}
			d[i] = data_int / power[i];
		}
		for (int i = 0; i < string_count; i++) {
			for (int j = i + 1; j < string_count; j++) {
				double temp = 0.0;
				String temp2;
				if (d[i] < d[j]) {
					temp = d[j];
					d[j] = d[i];
					d[i] = temp;
					temp2 = string[j];
					string[j] = string[i];
					string[i] = temp2;
				}
			}
			sb.append(string[i]);
		}
		//�����������
		for(int i=0;i<d.length;i++)
		System.out.println(d[i]);
		
		//���ƣ���Ϊ����
		Double[][] dou = new Double[9][];
		for(int i = 0;i<string_count;i++) {
			for(int j =0 ;j<9;j++) {
				
			}
		}
		return sb;
	}
}
