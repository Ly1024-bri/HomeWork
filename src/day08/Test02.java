package day08;

import java.io.*;

/**
 * 使用异常捕获完成下述操作
 * 将控制台输入的每一行字符串使用缓冲字符输出流PrintWriter
 * 按行以GBK编码写入到文件note.txt中
 * @author Bonnie
 *
 */
public class Test02 {
    public static void main(String[] args) {
        BufferedWriter bw = null;
        BufferedReader br = null;
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            bw = new BufferedWriter(new PrintWriter(new OutputStreamWriter(new FileOutputStream("note.txt",true),"GBK")));

            while (true){
                System.out.print("请输入(exit或者0结束):");
                String s = br.readLine();
                if (s.equalsIgnoreCase("exit")||s.equals("0")){
                    break;
                }
                bw.write("\n"+s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
	
}
