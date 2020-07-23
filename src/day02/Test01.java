package day02;

import java.util.Scanner;

/**
 * 要求用户输入一个字符串，然后若该字符串是一个整数，则转换为整数后输出乘以10后的结果
 * 若是小数，则转换为一个小数后输出乘以5后的结果，若不是数字则输出"不是数字"
 * 需要使用正则表达式进行判断。
 * @author Bonnie
 *
 */
public class Test01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("请输入一串字符串:");
        String str = s.next();
        String regex = "^\\d+$";
        String regex1 = "^\\d+\\.\\d+$";
        if (str.matches(regex1)){
            double y =Double.parseDouble(str);
            System.out.println(y*5);
        }else if (str.matches(regex)){

            int i = Integer.parseInt(str);
            System.out.println(i*10);

        }else{
            System.out.println("你输入的字符串不是数字");
        }
    }

}
