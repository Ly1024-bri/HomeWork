package day04;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 创建一个List集合并添加元素0-9
 * 然后获取子集[3,4,5,6]
 * 然后将子集元素扩大10倍
 * 然后输出原集合。
 * 之后删除集合中的[7,8,9]
 * @author Bonnie
 *
 */
public class Test04 {
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
        List<Integer> l1 = l.subList(3,7);
        Iterator<Integer> i = l1.iterator();
        while (i.hasNext()){
            int num = i.next()*10;
            System.out.println(num);
        }
        System.out.println(l);
        l.remove((Integer) 7);
        l.remove((Integer) 8);
        l.remove((Integer) 9);
        System.out.println(l);
    }

}
