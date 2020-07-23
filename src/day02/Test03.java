package day02;

import java.util.Arrays;

/**
 * 输入一个IP地址，然后将4段数字分别输出
 * @author Bonnie
 *
 */
public class Test03 {
    public static void main(String[] args) {
        String s = "168.16.6.123";
        String regex = "\\D";
        System.out.println(Arrays.toString(s.split(regex)));
    }

}
