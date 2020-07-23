package day03;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

/**
 * 要求用户首先输入员工数量，然后输入相应员工信息，格式为：
 * name,age,gender,salary,hiredate
 * 例如:
 * 张三,25,男,5000,2006-02-15
 * 每一行为一个员工信息，然后将每个员工信息解析成Emp对象。并存入到一个集合中。
 * 在解析成Emp对象后要先查看当前集合是否包含该员工，若包含则提示该用于已存在，
 * 否则才存入集合。
 * 然后输出集合查看每个员工信息.
 * @author Bonnie
 *
 */
public class Test07 {
    public static void main(String[] args) {
        Emp e1 = new Emp("张三",25,"男",5000,new Date());
        Emp e2 = new Emp("李四",20,"女",6000,new Date());
        Collection<Emp> c = new ArrayList<>(2);

        if (!c.contains(e1)){
            c.add(e1);
        }else{
            System.out.println("用户已存在");
        }
        if (!c.contains(e2)){
            c.add(e2);
        }else{
            System.out.println("用户已存在");
        }
        System.out.println(c);
    }

}
