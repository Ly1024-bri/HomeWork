package day02;

import java.util.Scanner;

/**
 * 测试正则表达式，并尝试编写规则: 电话号码可能有3-4位区号，
 * 7-8位号码:0415-5561111
 * @author Bonnie
 *
 */
public class Test06 {
    public static void main(String[] args) {
        String regex = "\\d{3,4}-\\d{7,8}";//\d{3,4}-\d{7,8}
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入电话号码:");
        String s = scanner.next();
        if (s.matches(regex)){
            System.out.println("电话号码是:"+s);
        }else{
            System.out.println("你输入的电话不正确");
        }
    }

}
