/**
 * 上午10:41:02
 * power
 */
package random;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * 
 * @author cz
 * 2018年5月21日上午10:41:02
 */
public class WriteData {
	public static void writeData(ArrayList<YourData> yourDataList,String outPath) throws IOException {
       
        FileWriter fileWriter = null;
        try {
   
            File outFile = new File(outPath);
            if (outFile.exists()) {
                outFile.delete();
            }
            outFile.createNewFile();

            fileWriter = new FileWriter(outFile);
            
            //写
            for(YourData yourData : yourDataList) {
            	String newLine = String.valueOf(yourData.getFirstData())+"\t"+String.valueOf(yourData.getSecondData())+"\t"+String.valueOf(yourData.getSecondData());
            	fileWriter.write(newLine);
            	fileWriter.write("\r\n");
            }
            
        } finally {
            
            if (fileWriter != null) {
                fileWriter.close();
            }
        }

    }
}
