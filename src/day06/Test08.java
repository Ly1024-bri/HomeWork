package day06;


import java.io.*;

/**
 * 创建一个"raf.dat"的文件，并在其中写出一个int的最大值，long的最大值，
 * 然后将其分别读取出来并输出
 * @author Bonnie
 *
 */
public class Test08 {
    public static void main(String[] args) throws IOException {
         FileWriter w = new FileWriter("src/day06/raf.dat");
        w.write("int最大");
        w.write("\n");
        w.write("long最大");
        w.flush();

        w.close();
        FileReader br = new FileReader("src/day06/raf.dat");

        char[] b = new char[4];
        int len;
        while ((len = br.read(b)) != -1){
//            w.write(new String(b,0,len));
            System.out.println(new String(b,0,len));
        }

        br.close();


    }
}
