package day06;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


/**
 * 要求用户输入一个文件名，并复制当前目录中该文件，并取名为"原文件名_copy.后缀名"
 * 定义两个方法分别使用单字节形式复制，以及字节数组形式复制
 * @author Bonnie
 *
 */
public class Test07 {
	public static void main(String[] args) throws IOException {
		String name = "src/day06/A.txt";
		copy1(name);
		copy2(name);
	}
	/**
	 * 使用单字节方式复制
	 * @param name 要复制的文件名
	 */
	public static void copy1(String name) throws IOException {
		FileInputStream is = new FileInputStream(name);

		String nameCopy1 = name.substring(0,name.indexOf("."));
		String nameCopy2 = name.substring(name.indexOf("."));

		FileOutputStream os = new FileOutputStream(nameCopy1+"_copy"+nameCopy2);
		int len;
		while ((len = is.read()) != -1){
			os.write(len);
		}
		os.close();
		is.close();

	}
	/**
	 * 使用字节数组形式复制
	 * @param name 要复制的文件名
	 */
	public static void copy2(String name) throws IOException {
		FileInputStream is = new FileInputStream(name);

		String nameCopy1 = name.substring(0,name.indexOf("."));
		String nameCopy2 = name.substring(name.indexOf("."));

		FileOutputStream os = new FileOutputStream(nameCopy1+"_copy"+nameCopy2);


		byte[] b = new byte[1024];
		int len;
		while((len = is.read(b)) != -1){
			os.write(b,0,len);
		}
		os.close();
		is.close();

	}
}
