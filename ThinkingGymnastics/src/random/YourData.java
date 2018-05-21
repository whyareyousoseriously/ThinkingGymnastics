/**
 * ����9:38:14
 * power
 */
package random;

/**
 * 
 * @author cz
 * 2018��5��21������9:38:14
 */
public class YourData implements Comparable<YourData>{
	private int firstData;//��һ����
	private int secondData;//�ڶ�����
	private float thridData;//��������
	public int getFirstData() {
		return firstData;
	}
	public int getSecondData() {
		return secondData;
	}
	public float getThridData() {
		return thridData;
	}
	public void setFirstData(int firstData) {
		this.firstData = firstData;
	}
	public void setSecondData(int secondData) {
		this.secondData = secondData;
	}
	public void setThridData(float thridData) {
		this.thridData = thridData;
	}
	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 * @author cz
	 * @time 2018��5��21������9:40:42
	 */
	@Override
	public int compareTo(YourData o) {
		// TODO Auto-generated method stub
		int compare =0;
		int firstResult = this.firstData - o.firstData;
		float thridResult = this.thridData - o.thridData;
		if(firstResult>0) {
			compare = 1;
		}
		if(firstResult<0) {
			compare = -1;
		}
		if(firstResult==0){
			if(thridResult>0) {
				compare = -1;
			}
			if(thridResult<0){
				compare = 1;
			}
			if(thridResult==0) {
				compare = 0;
			}
		}
		return compare;
	}
	@Override
	public String toString() {
		return "YourData [firstData=" + firstData + ", secondData=" + secondData + ", thridData=" + thridData + "]";
	}
	

}
