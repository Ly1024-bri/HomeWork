package day04;

import java.util.*;

/**
 * 创建一个List集合，并存放10个随机数，然后排序该集合
 * 后输出
 * @author Bonnie
 *
 */
public class Test07 {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();

       Random r = new Random();
       l.add(r.nextInt());
       l.add(r.nextInt());
       l.add(r.nextInt());
       l.add(r.nextInt());
       l.add(r.nextInt());
       l.add(r.nextInt());
       l.add(r.nextInt());
       l.add(r.nextInt());
       l.add(r.nextInt());
       l.add(r.nextInt());
        Collections.sort(l);
        for(int i:l){
            System.out.println(i);
        }
    }

}
