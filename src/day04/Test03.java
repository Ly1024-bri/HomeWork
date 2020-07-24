package day04;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建一个List集合(ArrayList,LinkedList均可)
 * 存放元素"one","two","three","four"。
 * 获取集合第二个元素并输出。
 * 将集合第三个元素设置为"3"
 * 在集合第二个位置上插入元素"2"
 * 删除集合第三个元素。
 * @author Bonnie
 *
 */
public class Test03 {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        l.add("one");
        l.add("two");
        l.add("three");
        l.add("four");
        System.out.println("第二个元素:"+l.get(1));
        l.set(2,"3");
        System.out.println("第三个元素设置为\"3\":"+l);
        l.add(1,"2");
        System.out.println("第二个位置上插入元素\"2\":"+l);
        l.remove(2);
        System.out.println("删除集合第三个元素:"+l);
    }

}
