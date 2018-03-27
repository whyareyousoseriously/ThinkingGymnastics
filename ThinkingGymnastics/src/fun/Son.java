/**
 * 下午4:17:01
 * power
 */
package fun;

import java.lang.reflect.Field;

/**
 * 
 * @author cz
 * 2018年3月27日下午4:17:01
 */
public class Son extends Father{
	public void changeFatherPrivate() throws IllegalArgumentException, IllegalAccessException {
		//修改前父类属性。
		System.out.println("父类私有属性i: "+super.getI()+"\n父类私有属性s: "+super.getS()+"\n父类私有属性c: "+super.getC());
		//使用父类私有属性不行，
		Field[] privateAttribute = super.getClass().getDeclaredFields();
		//权限开关
		System.out.println(privateAttribute.length);
		privateAttribute[0].setAccessible(true);
		privateAttribute[0].set(super.getClass(),1);
	    System.out.println("父类私有属性i: "+super.getI()+"\n父类私有属性s: "+super.getS()+"\n父类私有属性c: "+super.getC());
	}
	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		/*Father f = new Father();
		Son son = new Son();
		//修改前父类属性。
		System.out.println("父类私有属性i: "+f.getI()+"\n父类私有属性s: "+f.getS()+"\n父类私有属性c: "+f.getC());
		//使用子类修改父类私有属性不行，
		Field[] privateAttribute = f.getClass().getDeclaredFields();
		//权限开关
		System.out.println(privateAttribute.length);
		privateAttribute[0].setAccessible(true);
		privateAttribute[0].set(f,1);
		System.out.println("父类私有属性i: "+f.getI()+"\n父类私有属性s: "+f.getS()+"\n父类私有属性c: "+f.getC());*/
		Son son = new Son();
		son.changeFatherPrivate();
	}
}
