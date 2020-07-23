package day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**2018-03-25
 * 输入一个生产日期格式"yyyy-MM-dd",再输入一个数字(保质期的天数)。
 * 然后经过计算输出促销日期，促销日期为:该商品过期日前2周的周三
 * @author Bonnie
 * 
 */
public class Test04 {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入生产日期:");
        String str = scanner.next();
        String regex = "^\\d+-\\d{1,2}-\\d{1,2}$";//\d{4}-\d{2}-\d{2}

        if (str.matches(regex)) {
            System.out.print("请输入保质期天数:");
            int i = scanner.nextInt();
            String regex1 ="\\D";
            String[] a = str.split(regex1);

            Calendar c = Calendar.getInstance();

            c.set(Calendar.MONTH,Integer.parseInt(a[1])-1);
            c.set(Calendar.YEAR,Integer.parseInt(a[0]));
            c.set(Calendar.DATE,Integer.parseInt(a[2]));
            c.add(Calendar.DATE,i);
            c.add(Calendar.WEEK_OF_YEAR,-2);
            c.set(Calendar.DAY_OF_WEEK,Calendar.WEDNESDAY);
            Date date = c.getTime();
            SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
            System.out.println(s.format(date));

        }else{
            System.out.println("你输入的生产日期格式不正确");
        }
    }
}
