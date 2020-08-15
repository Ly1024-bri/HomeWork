package day06;

import com.sun.jdi.Value;

import java.io.*;

/**
 * 创建一个文件"note.txt",然后通过控制台输入的每一行字符串都按行写入到(new FileInputStream("src/day06/note.txt"))
 * note.txt中。当输入的字符串为"exit"时退出程序。
 * @author Bonnie
 *
 */
public class Test09 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("src/day06/note.txt")));

        while (true){
                String s = br.readLine();
                bw.write(s);
             if (s.equals("exit")){
                bw.close();
                br.close();
                return;
            }
        }

        }
 }

