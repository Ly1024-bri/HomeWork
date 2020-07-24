package day04;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 通过控制台输入3个日期(yyyy-MM-dd格式)，然后转换为Date对象后存入
 * 集合，然后对该集合排序后输出所有日期。
 * @author Bonnie
 *
 */
public class Test08 {
    public static void main(String[] args) throws ParseException {
        System.out.println("提示：日期格式是“2020-12-12”");
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入第一个日期:");
        String s1 = scanner.next();
        System.out.print("请输入第二个日期:");
        String s2 = scanner.next();
        System.out.print("请输入第三个日期:");
        String s3 = scanner.next();
        String regex = "^\\d+-\\d{1,2}-\\d{1,2}$";//\d[-]\d{1,2}[-]\d{1,2}
        if (s1.matches(regex)&&s2.matches(regex)&&s3.matches(regex)){
            SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
            List<Date> l = new ArrayList<>();
            l.add(s.parse(s1));
            l.add(s.parse(s2));
            l.add(s.parse(s3));
            Collections.sort(l);
            for (Date d:l){
                System.out.println(s.format(d));
            }
        }else{
            System.out.println("请输入正确的年月日格式");
        }
    }
}
