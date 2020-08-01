package day06;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * 要求用户输入一个文件名并使用File在当前目录下创建出来。
 * 若该文件已经存在，则提示用户该文件已经存在。并创建该文件副本：
 * 例如:用户输入"test.txt".若该文件已存在，提示用户存在后，创建名为：test_副本1.txt 的文件
 * 若该文件也存在了，则创建名为:test_副本2.txt 的文件，以此类推
 * @author Bonnie
 *
 */
public class Test02 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入文件名:");
        String input = scan.nextLine().trim();
        File file = new File("src/day06/test.txt");
        boolean flag = file.exists();
        if (!flag) {//若不存在
            file.createNewFile();
        } else {
            int index = 0;
            while (flag) {
                index++;
                file = new File("src/day06/test_副本" + index + ".txt");
                flag = file.exists();
            }
            file.createNewFile();
        }
        System.out.println("文件名:" + file.getName());
    }
}