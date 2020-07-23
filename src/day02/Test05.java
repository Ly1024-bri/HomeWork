package day02;

import java.util.Date;
import java.util.Scanner;

/**
 * 实现文件重命名。
 * 要求用户输入一个文件名称，例如:abc.jpg
 * 然后对该名字进行重新命名，输出的格式为:系统时间毫秒值.jpg
 * 例如:1465266796279.jpg
 * @author Bonnie
 *
 */
public class Test05 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("请输入文件名字:");
		String str = s.next();
		String reg = "^\\w+\\.[a-z]+$";
		if (!str.matches(reg)){
			System.out.println("请输入正确的文件名");
		}else {
			Date date = new Date();
			String s1 = str.replaceAll(reg,String.valueOf(date.getTime()));
			System.out.println(s1);
		}

	}
}
