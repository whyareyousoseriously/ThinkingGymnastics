/**
 * ����9:45:17
 * power
 */
package random;

import java.io.BufferedReader;
import java.io.FileReader;

import java.io.IOException;
import java.util.ArrayList;


/**
 * ���ļ�������
 * @author cz
 * 2018��5��21������9:45:17
 */
public class ReadData {
	
	
	public static ArrayList<YourData> readData(String inPath) throws IOException {
        String line = "";
       
        BufferedReader bufferReader = null;
       
        try {
            bufferReader = new BufferedReader(new FileReader(inPath));
            //���弯������
            ArrayList<YourData> yourDataList = new ArrayList<YourData>();
            while ((line = bufferReader.readLine()) != null) {
                
                //��lineһ�����ݽ��зָ�
                String[] data = line.split("\t");
                
                //������ʱ����
                YourData yourData = new YourData();
                yourData.setFirstData(Integer.valueOf(data[0]));
                yourData.setSecondData(Integer.valueOf(data[1]));
                yourData.setThridData(Float.valueOf(data[2]));
                
                //���뼯��
                yourDataList.add(yourData);
            }
            return yourDataList;
            
        } finally {
            if (bufferReader != null) {
                bufferReader.close();
            }
        }

    }

    public static void main(String[] args) {
        try {
            ArrayList<YourData> yourDataList = ReadData.readData("D:\\1.txt");
            int index = 0;
            for(YourData yourData : yourDataList) {
            	index++;
            	System.out.println(yourData.toString());
            	
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	
}
