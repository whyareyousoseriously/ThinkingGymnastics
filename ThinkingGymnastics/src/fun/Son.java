/**
 * ����4:17:01
 * power
 */
package fun;

import java.lang.reflect.Field;

/**
 * 
 * @author cz
 * 2018��3��27������4:17:01
 */
public class Son extends Father{
	public void changeFatherPrivate() throws IllegalArgumentException, IllegalAccessException {
		//�޸�ǰ�������ԡ�
		System.out.println("����˽������i: "+super.getI()+"\n����˽������s: "+super.getS()+"\n����˽������c: "+super.getC());
		//ʹ�ø���˽�����Բ��У�
		Field[] privateAttribute = super.getClass().getDeclaredFields();
		//Ȩ�޿���
		System.out.println(privateAttribute.length);
		privateAttribute[0].setAccessible(true);
		privateAttribute[0].set(super.getClass(),1);
	    System.out.println("����˽������i: "+super.getI()+"\n����˽������s: "+super.getS()+"\n����˽������c: "+super.getC());
	}
	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		/*Father f = new Father();
		Son son = new Son();
		//�޸�ǰ�������ԡ�
		System.out.println("����˽������i: "+f.getI()+"\n����˽������s: "+f.getS()+"\n����˽������c: "+f.getC());
		//ʹ�������޸ĸ���˽�����Բ��У�
		Field[] privateAttribute = f.getClass().getDeclaredFields();
		//Ȩ�޿���
		System.out.println(privateAttribute.length);
		privateAttribute[0].setAccessible(true);
		privateAttribute[0].set(f,1);
		System.out.println("����˽������i: "+f.getI()+"\n����˽������s: "+f.getS()+"\n����˽������c: "+f.getC());*/
		Son son = new Son();
		son.changeFatherPrivate();
	}
}
