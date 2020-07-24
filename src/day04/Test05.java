package day04;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建一个List集合，并添加元素0-9
 * 将集合转换为一个Integer数组并输出数组每一个元素
 * @author Bonnie
 *
 */
public class Test05 {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(0);
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);
        l.add(7);
        l.add(8);
        l.add(9);
        Object[] i = l.toArray();
        for (Object o:i){
            System.out.println(o);
        }
    }

}
