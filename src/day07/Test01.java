package day07;

import java.io.*;

/**
 * 使用文件流复制myfile.txt文件为myfile_cp.txt
 * @author Bonnie
 *
 */
public class Test01 {
    public static void main(String[] args) {
        FileReader br = null;
        FileWriter bw = null;
        try {
             br = new FileReader("myfile.txt");
             bw = new FileWriter("myfile_cp.txt",false);
            int s;
            while ((s =br.read()) != -1){
                bw.write(s);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
