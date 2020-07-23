package day02;

import java.util.Scanner;

/**
 * 输入一个数学计算表达式，如:1+2
 * 然后输出计算后的结果:1+2=3
 * 这里计算表达式只计算一次即可，可以使用加减乘除任意一个,可以进行小数运算。
 * @author Bonnie
 *
 */
public class Test07 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("请输入第一个数字:");
        String s1 = s.next();
        System.out.print("请输入数学运算符:");
        String s2 = s.next();
        System.out.print("请输入第二个数字:");
        String s3 = s.next();

        String regex2 = "[+]";//\d
        String regex3 = "[-]";//\d
        String regex4 = "[*]";//\d
        String regex5 = "[/]";//\d
            if (s2.matches(regex2)){
                System.out.println(Double.valueOf(s1)+Double.valueOf(s3));
            }else if (s2.matches(regex3)){
                System.out.println(Double.valueOf(s1)-Double.valueOf(s3));
            }else if (s2.matches(regex4)){
                System.out.println(Double.valueOf(s1)*Double.valueOf(s3));
            }else if(s2.matches(regex5)){
                System.out.println(Double.valueOf(s1)/Double.valueOf(s3));
            }else{
                System.out.println("请输入正确的数学运算符");
            }

    }

}
