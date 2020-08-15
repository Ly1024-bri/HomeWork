package day08;

import java.io.*;
import java.nio.charset.IllegalCharsetNameException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * 使用异常捕获机制完成下述读取操作
 * 读取emp.txt文件，并将每个员工信息读取出来，以一个Emp实例保存，然后将
 * 这些Emp实例存入到一个Map集合中。其中key为字符串，是该员工名字，而value
 * 是该Emp实例。
 * 存入后，要求用户输入一个员工的名字,如:张三
 * 若该员工存在则输出该员工所有信息(Emp的toString方法返回的字符串)
 * 输入的员工名若是英文，不要求区分大小写。
 * 若输入的员工名字不存在，则显示"查无此人"
 * 
 * @author Bonnie
 *
 */
public class Test04 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String str = s.nextLine();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        BufferedReader ois = null;
        try {
            ois = new BufferedReader(new InputStreamReader(new FileInputStream("src/day08/emp.txt")));
            String ss;
            Map<String,Emp> map = new HashMap<>();
            Emp emp;
            while ((ss = ois.readLine()) != null){
                String[] e = ss.split(",");
                emp = new Emp(e[0],Integer.parseInt(e[1]),e[2],Integer.parseInt(e[3]),sdf.parse(e[4]));
                map.put(emp.getName(),emp);
            }
            Set<Map.Entry<String, Emp>> entries = map.entrySet();
            for (Map.Entry<String, Emp> e:entries){
                if (str.equalsIgnoreCase(e.getKey())){
                    System.out.println(e);
                    return;
                }
            }

        } catch (IOException | ParseException e) {
            e.printStackTrace();
        } finally {
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("查无此人");
    }

}
