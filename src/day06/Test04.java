package day06;

import java.io.File;
import java.io.FileFilter;

/**
 * 获取并输出当前目录下的所有文件和目录的名字
 * @author Bonnie
 *
 */
public class Test04 {
    public static void main(String[] args) {
        File file = new File(".");
        File[] files = file.listFiles(f -> f.isFile());
        for (File f:files){
            System.out.println(f);
        }
        System.out.println("=========");
        File file1 = new File(".");
        File[] files1 = file1.listFiles(f -> f.isDirectory());
        for (File f:files1){
            System.out.println(f);
        }

    }
	
}
