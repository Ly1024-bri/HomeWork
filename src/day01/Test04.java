package day01;

import java.util.Scanner;

/**
 * 要求用户从控制台输入一个email地址，然后获取该email的用户名(@之前的内容)
 * @author Bonnie
 *
 */
public class Test04 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("请输入一个email地址:");
		String str = s.next();
		test(str);
	}
	public static void test(String str){
		System.out.println(str.substring(0,str.indexOf("@")));
	}
}
