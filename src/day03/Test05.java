package day03;

import java.sql.SQLOutput;
import java.util.Calendar;
import java.util.Scanner;

/**
 * 实现时间的计算: 要求用户输入身份证号，若格式有误，要求其重新输入。然后根据身份证号码输出20岁生日
 * 所在周的周三的日期。
 * 例如:
 * 出生日期:1992-07-15。
 * 20岁生日:2012-07-15
 * 当周的周三为:2012-07-18
 * @author Bonnie
 *
 */
public class Test05 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("请输入一个身份证号码:");
        String str = s.next();
        String regex = "^\\w\\d{17}$";//\w{1}\d{17}
         while (!str.matches(regex)) {
             System.out.print("你输入的身份证号码有误，请重新输入:");
             str = s.next();
         }
        String s1 = str.substring(6,14);
        int a1 = Integer.parseInt(s1.substring(0,4));
        int a2 = Integer.parseInt(s1.substring(4,6));
        int a3 = Integer.parseInt(s1.substring(6,8));
        System.out.println("出生日期:"+a1+"-"+a2+"-"+a3);
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR,a1);
        c.add(Calendar.YEAR,20);
        System.out.println("20岁生日:"+c.get(Calendar.YEAR)+"-"+a2+"-"+a3);
        c.set(Calendar.MONTH,a2);
        c.set(Calendar.DATE,a3);
        c.add(Calendar.DAY_OF_WEEK,Calendar.WEDNESDAY);
        System.out.println("当周的周三为:"+c.get(Calendar.YEAR)+"-"+c.get(Calendar.MONTH)+"-"+c.get(Calendar.DATE));

    }

}
