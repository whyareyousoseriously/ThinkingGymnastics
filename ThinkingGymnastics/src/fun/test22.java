/**
 * 上午9:19:17
 * power
 */
package fun;

import java.io.InputStream;
import java.util.Scanner;

/**
 * 
 * @author cz
 * 2018年3月26日上午9:19:17
 */
public class test22 {
	public static String poker = "345678910JQKA2jokerJOKER";
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String cards = sc.nextLine();
			if(cards.contains("joker JOKER")) {
				System.out.println("joker JOKER");
			}else {
				String[] str = cards.split("-");
				String[] left = str[0].split(" ");
				String[] right = str[1].split(" ");
				if(left.length!=4&&right.length==4) {
					System.out.println(str[1]);
				}else if(left.length==4&&right.length!=4) {
					System.out.println(str[0]);
				}else if(left.length==right.length) {
					String lager = poker.indexOf(left[0])>poker.indexOf(right[1]) ? str[0]:str[1];
					System.out.println(lager);
				}else {
					System.out.println("ERROR");
				}
			}
		}
		
		
		
	}

	
}
