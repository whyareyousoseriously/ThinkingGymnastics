/**
 * ����9:44:11
 * power
 */
package random;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/**
 * ���ļ��ж�ȡ���ݣ�������5W�У�����һֵ���򣬵���ֵ��������
 * @author cz 2018��5��21������9:44:11
 */
public class SortYou {
	private YourData yourData;

	// ����ʼ
	public static void main(String[] args) {
		try {
			ArrayList<YourData> yourDataList = ReadData.readData("D:\\1.txt");
			
			//����ǰ����
			for (YourData yourData : yourDataList) {
				
				System.out.println(yourData.toString());
				
			}
			System.out.println("------------------");
			//����
			Collections.sort(yourDataList);
			
			//������
			int flag = 0;
			int indexTemp = 1;
			ArrayList<YourData> yourDataSelectList = new ArrayList<YourData>();
			
			for(YourData yourData : yourDataList) {
				if(yourData.getFirstData() == indexTemp) {
					flag++;
					yourDataSelectList.add(yourData);
					if(flag>=20) {
						flag = 0;
						indexTemp++;
					}
				}
				if(yourData.getFirstData()>indexTemp) {
					//�����������˵�����ݲ���20������ô
					indexTemp++;
					flag = 0;
					if(yourData.getFirstData() == indexTemp) {
						flag++;
						yourDataSelectList.add(yourData);
					}
				}
			}
			
			//�����֤
			
			for (YourData yourData : yourDataSelectList) {
				
				System.out.println(yourData.toString());
				

			}
			
			//д���ļ�
			WriteData.writeData(yourDataSelectList, "D:\\out.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
