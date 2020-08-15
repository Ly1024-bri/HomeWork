package day06;

import java.io.*;
import java.util.*;

/**
 * 编写一个程序，将当前目录下所有员工文件进行读取，并解析出所有员工为Emp
 * 对象并存入集合。然后排序该集合，按照员工的年龄排序，年龄大的靠前，年龄小
 * 的靠后。排序完毕后输出结果。
 * @author Bonnie
 *
 */
public class Test11 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File f = new File("src/day06");
        File[] files = f.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.getName().endsWith(".emp");
            }
        });

        List<Emp> list = new ArrayList<>();

        for (File f1:files){
            ObjectInputStream fis = new ObjectInputStream(new FileInputStream(f1));

            Emp e = (Emp) fis.readObject();
            list.add(e);
            fis.close();
        }

        Collections.sort(list, new Comparator<Emp>() {
            @Override
            public int compare(Emp o1, Emp o2) {
                return o1.getName().length()-o2.getName().length();
            }
        });
        for (Emp emp:list){
            System.out.println(emp.toString());
        }
    }
}
