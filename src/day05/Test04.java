package day05;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *创建一个Map，保存某个学生的成绩:
 *在控制台输入该学生成绩，格式:
 *科目:成绩;科目:成绩;...
 *例如:  
 *语文:99;数学:98;英语:97;物理:96;化学:95
 *然后输出物理的成绩。
 *然后将化学的成绩设置为96
 *然后删除英语这一项。
 *然后遍历该Map分别按照遍历key，Entry，value
 *的形式输出该Map信息。
 * @author Bonnie
 *
 */
public class Test04 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("语文",99);
        map.put("数学",98);
        map.put("英语",97);
        map.put("物理",96);
        map.put("化学",95);
        System.out.println(map.get("物理"));
        map.put("化学",96);
        map.remove("英语");
        Set<String> keySet = map.keySet();
        for (String s:keySet){
            System.out.println(s+"="+map.get(s));
        }

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String,Integer> s :entries){
//            System.out.println(s);
            System.out.println(s.getKey()+"="+s.getValue());
        }

        Collection<Integer> values = map.values();
        for (Integer i:values){
            System.out.println(i);
        }
    }

}
