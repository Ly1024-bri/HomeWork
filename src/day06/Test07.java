package day06;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.util.Scanner;

/**
 * 要求用户输入一个文件名，并复制当前目录中该文件，并取名为"原文件名_copy.后缀名"
 * 定义两个方法分别使用单字节形式复制，以及字节数组形式复制
 * @author Bonnie
 *
 */
public class Test07 {
	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		copy1(str);

	}
	/**
	 * 使用单字节方式复制
	 * @param name 要复制的文件名
	 */
	public static void copy1(String name) throws IOException {
		File f = new File(name);
		f.createNewFile();
		String ss = name.substring(0,name.indexOf("."));
		String s = name.substring(name.indexOf("."));
		File ff = new File(ss+"_copy"+s);
		System.out.println(ff.getName());
	}
	/**
	 * 使用字节数组形式复制
	 * @param name 要复制的文件名
	 */
	public static void copy2(String name){
		
	}
}
