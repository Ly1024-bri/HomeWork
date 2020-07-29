package day05;

import java.text.DateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 有下列字符串:
 * 销售:张三;财务:李四;销售:王五;财务:赵六;程序:mike;程序:jerry;美工:jackson;前端:green;前端:nick;程序:钱七;销售:alice
 * 分析上述字符串然后统计每个职位总共多少人?
 * 使用Map保存统计的结果，其中key:职位,value为该职位人数
 * 然后分别输出各职位的名称(keySet),各职位人数(entrySet)
 * @author Bonnie
 *
 */
public class Test05 {
    public static void main(String[] args) {
        String s ="销售:张三;财务:李四;销售:王五;财务:赵六;程序:mike;程序:jerry;" +
                "美工:jackson;前端:green;前端:nick;程序:钱七;销售:alice";
        String[] str = s.split("[;]");
        System.out.println(Arrays.toString(str));
        Map<String,Integer> map = new HashMap<>();

        for (String string:str){
            String ss = string.substring(0,2);
            Integer i = map.get(ss);
            if (i == null){
                i=0;
            }
            map.put(ss,i+1);
        }
        Set<String> s11 = map.keySet();
        for (String s1:s11){
            System.out.println(s1);
        }

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String,Integer> e:entries){
            System.out.println(e.getKey()+"="+e.getValue());
        }


    }
}
