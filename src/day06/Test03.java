package day06;

import java.io.File;
import java.util.Scanner;

/**
 * 要求用户输入一个目录名并使用File在当前目录下创建出来。
 * 若该目录已经存在，则提示用户该目录已经存在。并创建副本，原则与第二题一致。
 * @author Bonnie
 *
 */
public class Test03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入目录名:");
        String input = scan.nextLine().trim();
        File file = new File("src/day06/test");
        boolean flag = file.exists();
        if (!flag) {//若不存在
            file.mkdir();
        } else {
            int index = 0;
            while (flag) {
                index++;
                file = new File("src/day06/test_副本" + index);
                flag = file.exists();
            }
            file.mkdir();
        }
        System.out.println("目录名:" + file.getName());
    }
}
