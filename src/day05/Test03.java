package day05;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 要求用户输入若干员工信息，格式为：
 * name,age,gender,salary,hiredate;name,age,gender,salary,hiredate;....
 * 例如:
 * 张三,25,男,5000,2006-02-15;李四,26,女,6000,2007-12-24;...
 * 然后将每个员工信息解析成Emp对象。并存入到一个List集合中。
 * 并对集合排序，然后输出每个员工信息。
 * 
 * 再根据员工的入职时间排序，入职晚的在前，早的在后并
 * 输出每个员工的信息。
 * @author Bonnie
 *
 */
public class Test03 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat ss = new SimpleDateFormat("yyyy-MM-dd");
        List<Emp> l = new ArrayList<>();
        l.add(new Emp("张三",25,"男",5000,ss.parse("2006-02-15")));
        l.add(new Emp("王五",20,"男",7000,ss.parse("2008-03-15")));
        l.add(new Emp("李四",26,"女",6000,ss.parse("2007-12-24")));
        Collections.sort(l);
        System.out.println(l);
        Collections.sort(l, new Comparator<Emp>() {
            @Override
            public int compare(Emp o1, Emp o2) {
                return  o2.getHiredate().compareTo(o1.getHiredate());
            }
        });
        System.out.println(l);


    }
}
