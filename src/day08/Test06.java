package day08;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;

/**
 * 使用异常捕获机制完成下述IO操作
 * 编写程序，要求下面的类实现功能:
 * 添加新员工
 * 要求用户输入一个员工信息，格式如下:
 * jackson,25,男,5000,2008-12-22
 * 用户输入后需要做下述验证:
 * 要求用户名长度在1-20个字符之间且必须是英文
 * 年龄在0-100之间的整数
 * 性别只能是:"男"或"女"
 * 当发现用户输入有不符合规定时，提醒用户
 * 相关内容输入不符合要求，并要求重新输入。
 * 都输入正确后，将该员工添加到emp.txt文件
 * 的最后一行。
 * 
 * @author Bonnie
 *
 */
public class Test06 {
    public static void main(String[] args) {
        BufferedReader br = null;
        BufferedWriter bw = null;
        Emp emp = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            br = new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8));
            bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("src/day08/emp.txt",true)));
            while (true) {
                String[] split = br.readLine().split(",");
                emp = new Emp(split[0], Integer.parseInt(split[1]), split[2], Integer.parseInt(split[3]), sdf.parse(split[4]));
                if (emp.getName().matches("[a-zA-Z]+") &&
                    emp.getName().length()<=20 &&
                    emp.getAge()<=100 &&
                    emp.getAge()>=0 &&
                    (emp.getGender().equals("男") || emp.getGender().equals("女"))
                ){
                    bw.write("\n"+String.valueOf(emp));
                        break;
                }else {
                    System.out.println("你输入的信息不正确");
                }
            }

        } catch (Exception e) {
            System.out.println("你输入的信息不正确");
        }finally {
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
