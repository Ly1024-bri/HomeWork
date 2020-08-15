package day06;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 编写一个程序，将当前目录下所有的员工文件进行读取，并解析出所有员工为Emp
 * 对象并存入Map。其中key为该员工的名字，value为该员工的emp对象。
 * 然后，要求用户输入一个员工名字，若该员工存在，则输出该员工的名字，年龄，工资，以及入职20周年的纪念日当周的周六的日期。
 * 即:输入名字"张三"
 * 若该员工存在，则输出如下格式:
 * 张三,25,5000,2006-02-14
 * 入职20周年纪念日派对日期: 2026-02-14  （注:若入职日期为:2006-02-14）
 * 若该员工不存在，则输出:"查无此人"
 * @author Bonnie
 *
 */
public class Test12 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File f = new File("src/day06");
        File[] files = f.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.getName().endsWith(".emp");
            }
        });

        Map<String,Emp> list = new HashMap();

        for (File f1:files){
            ObjectInputStream fis = new ObjectInputStream(new FileInputStream(f1));

            Emp e = (Emp) fis.readObject();
            list.put(e.getName(),e);
            fis.close();
        }
        Scanner scanner = new Scanner(System.in);
        String s =  scanner.next();

        Set<String> name = list.keySet();
        for (String str:name){
            if (s.equals(str)) {
                Calendar c = Calendar.getInstance();

                System.out.println(list.get(str));
                c.setTime(list.get(str).getHiredate());
                c.add(Calendar.YEAR, 20);
                SimpleDateFormat ss = new SimpleDateFormat("yyyy-MM-dd");
                System.out.println("20年纪念日:" + ss.format(c.getTime()));
            }
        }
    }
}
