package day01;

import java.util.Scanner;

/**
 * 随机生成一个5位的英文字母验证码(大小写混搭)
 * 然后将该验证码输出给用户，然后要求用户输入该验证码，大小写不限制。
 * 然后判定用户输入的验证码是否有效(无论用户输入大小写，只要字母都正确即可)。
 * @author Bonnie
 *
 */
public class Test05 {
	public static void main(String[] args) {
		char[] a = yanZenMaRandom();
		Scanner s = new Scanner(System.in);
		System.out.print("请输入验证码:");
		String str = s.next();

		yanZen(str,a);

	}
	public static char[] yanZenMaRandom(){
		char[] c = new char[5];
		int x = 0;
		for (int i = 0; i <c.length ; i++) {

			x++;
			if (x%2==0) {
				c[i] = (char) (Math.random() * 26 + 65);
			}else {
				c[i] = (char) (Math.random() * 26 + 97);
			}
		}
		System.out.println(String.valueOf(c));
		return c;
	}
	public static void yanZen(String s,char[] a){
		if (s.equalsIgnoreCase(String.valueOf(a))){
			System.out.println("验证成功");
		}else{
			System.out.println("验证失败");
		}

	}
}
