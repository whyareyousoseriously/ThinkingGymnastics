/**
 * 下午5:48:15
 * power
 */
package fun;

import java.util.Scanner;

/**
 * 
 * @author cz 2018年3月26日下午5:48:15
 */
public class test25 {
	public static void main(String[] args) {
		// A，B,C,D,E,错误IP地址或错误掩码，私有IP的个数
		int typeA = 0;
		int typeB = 0;
		int typeC = 0;
		int typeD = 0;
		int typeE = 0;
		int errorIpOrMask = 0;

		int privateIp = 0;
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String[] str = sc.nextLine().toString().split("~");
			try {
				int[] ip = changeInt(str[0].toString().split("\\."));
				int[] mask = changeInt(str[1].toString().split("\\."));
				if (isErrorIpOrMask(ip, mask))
					errorIpOrMask++;
				else {
					if (isPrivateA(ip))
						privateIp++;

					if (isA(ip))
						typeA++;

					if (isPrivateB(ip))
						privateIp++;

					if (isB(ip))
						typeB++;

					if (isPrivateC(ip))
						privateIp++;

					if (isC(ip))
						typeC++;

					if (isD(ip))
						typeD++;
					if (isE(ip))
						typeE++;
				}

			} catch (Exception e) {
				errorIpOrMask++;
			}

		}
		System.out.println(
				typeA + " " + typeB + " " + typeC + " " + typeD + " " + typeE + " " + errorIpOrMask + " " + privateIp);

	}

	public static int[] changeInt(String[] str) {
		int[] result = new int[str.length];
		for (int i = 0; i < str.length; i++) {
			result[i] = Integer.parseInt(str[i]);
		}
		return result;
	}

	public static boolean isPrivateA(int[] ip) {
		if (ip[0] == 10)
			return true;
		else
			return false;
	}

	public static boolean isPrivateB(int[] ip) {
		if (ip[0] == 172 && ip[1] == 16)
			return true;
		else
			return false;
	}

	public static boolean isPrivateC(int[] ip) {
		if (ip[0] == 192 && ip[1] == 168)
			return true;
		else
			return false;
	}

	public static boolean isA(int[] ip) {
		if (ip[0] >= 1 && ip[0] <= 126 && ip[1] >= 0 && ip[1] <= 255 && ip[2] >= 0 && ip[2] <= 255 && ip[3] >= 0
				&& ip[3] <= 255)
			return true;
		else
			return false;
	}

	public static boolean isB(int[] ip) {
		if (ip[0] >= 128 && ip[0] <= 191 && ip[1] >= 0 && ip[1] <= 255 && ip[2] >= 0 && ip[2] <= 255 && ip[3] >= 0
				&& ip[3] <= 255)
			return true;
		else
			return false;
	}

	public static boolean isC(int[] ip) {
		if (ip[0] >=192 && ip[0] <= 223 && ip[1] >= 0 && ip[1] <= 255 && ip[2] >= 0 && ip[2] <= 255 && ip[3] >= 0
				&& ip[3] <= 255)
			return true;
		else
			return false;
	}

	public static boolean isD(int[] ip) {
		if (ip[0] >= 224 && ip[0] <= 239 && ip[1] >= 0 && ip[1] <= 255 && ip[2] >= 0 && ip[2] <= 255 && ip[3] >= 0
				&& ip[3] <= 255)
			return true;
		else
			return false;
	}

	public static boolean isE(int[] ip) {
		if (ip[0] >= 240 && ip[0] <= 255 && ip[1] >= 0 && ip[1] <= 255 && ip[2] >= 0 && ip[2] <= 255 && ip[3] >= 0
				&& ip[3] <= 255)
			return true;
		else
			return false;
	}

	public static boolean isErrorIpOrMask(int[] ip, int[] mask) {
		StringBuffer sb = new StringBuffer();
		if (ip.length == 4 || mask.length == 4) {
			for (int i = 0; i < 4; i++) {
				if (ip[i] < 0 || ip[i] > 255 || "".equals(ip[i])) {
					return true;
				}
				if (mask[i] < 0 || mask[i] > 255 || "".equals(mask[i])) {
					return true;
				}
				sb.append(binaryString(mask[i]));
			}
			// 掩码转为2进制，看看是否出错
			int index1 = sb.toString().indexOf('0');
			int index2 = sb.toString().lastIndexOf('1');
			if (index1 < index2)
				return true;
			else
				return false;
		}

		else
			return true;

	}

	public static String binaryString(int num) {
		int temp = 1 << 7;
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < 8; i++) {
			int val = (temp & num) == 0 ? 0 : 1;
			sb.append(val);
			num = num << 1;
		}
		return sb.toString();
	}
}
