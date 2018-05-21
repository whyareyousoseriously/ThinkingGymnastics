/**
 * 上午9:44:11
 * power
 */
package random;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/**
 * 从文件中读取数据，数据量5W行，按第一值升序，第三值降序排列
 * @author cz 2018年5月21日上午9:44:11
 */
public class SortYou {
	private YourData yourData;

	// 排序开始
	public static void main(String[] args) {
		try {
			ArrayList<YourData> yourDataList = ReadData.readData("D:\\1.txt");
			
			//处理前数据
			for (YourData yourData : yourDataList) {
				
				System.out.println(yourData.toString());
				
			}
			System.out.println("------------------");
			//排序
			Collections.sort(yourDataList);
			
			//挑数据
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
					//这种情况就是说，数据不足20条，那么
					indexTemp++;
					flag = 0;
					if(yourData.getFirstData() == indexTemp) {
						flag++;
						yourDataSelectList.add(yourData);
					}
				}
			}
			
			//输出验证
			
			for (YourData yourData : yourDataSelectList) {
				
				System.out.println(yourData.toString());
				

			}
			
			//写入文件
			WriteData.writeData(yourDataSelectList, "D:\\out.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
