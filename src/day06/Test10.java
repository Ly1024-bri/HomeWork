package day06;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 要求用户输入一个员工信息，格式为：
 * name,age,gender,salary,hiredate
 * 例如:
 * 张三,25,男,5000,2006-02-15
 * 然后将输入的员工信息解析成Emp对象。
 * 然后将该Emp对象的toString返回的字符串写入到文件中，该文件的
 * 名字为:name.emp,以上面的例子，那么该文件名为:张三.emp
 * 至少运行5次该程序，输入五个员工信息，并生成5个文件。

 * @author Bonnie
 *
 */
public class Test10 {
    public static void main(String[] args) throws ParseException, IOException {
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
        int i =0;

        while (true){
            i++;
            if (i>5){
                break;
            }
            Scanner ss = new Scanner(System.in);
            String[] str = ss.nextLine().split(" ");

            Emp e1 = new Emp(str[0],Integer.parseInt(str[1]),str[2],Integer.parseInt(str[3]),new Date());

            e1.setHiredate(s.parse(str[4]));
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/day06/"+e1.getName()+".emp"));
            oos.writeObject(e1);
            oos.close();
        }
    }
}
