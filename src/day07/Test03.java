package day07;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 * 要求用户控制台输入想输入的员工人数（至少5个），然后依序输入员工信息，每行为
 * 一条员工信息，格式如:张三,25,男,5000,2006-3-18
 * 然后将该对象写入到文件<name>.obj并保存到当前项目根目录中，例如:张三.obj。
 * @author Bonnie
 *
 */
public class Test03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("请输入想要输出的人数个数(至少5个):");
        int num = s.nextInt();


        int i =0;
        ObjectOutputStream oos = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (i<num&&num>=5){
            i++;
            try {
                System.out.println("请输入emp信息:");
                String[] str = br.readLine().split(",");
                Emp emp = new Emp(str[0],Integer.parseInt(str[1]),str[2],Integer.parseInt(str[3]),sdf.parse(str[4]));
                oos = new ObjectOutputStream(new FileOutputStream(emp.getName()+".obj"));
                oos.writeObject(emp);
            } catch (IOException | ParseException e) {
                e.printStackTrace();
            } finally {
                if (oos != null) {
                    try {
                        oos.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

    }

}
