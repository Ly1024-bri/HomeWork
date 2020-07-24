package day04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 创建一个字符串数组:{"one","two","three"}
 * 然后将该数组转换为一个List集合
 * @author Bonnie
 *
 */
public class Test06 {
    public static void main(String[] args) {
        String[] s = {"one","two","three"};
        List<String> l = Arrays.asList(s);
        for (String s1:l){
            System.out.println(s1);
        }
    }

}
