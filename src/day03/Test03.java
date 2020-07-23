package day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 输入某人生日，格式为"yyyy-MM-dd"，输出到现在为止经过了多少周。
 * @author Bonnie
 *
 */
public class Test03 {
    public static void main(String[] args) throws ParseException {
        Scanner s = new Scanner(System.in);
        System.out.print("请输入生日:");
        String bir = s.next();
        SimpleDateFormat ss = new SimpleDateFormat("yyyy-MM-dd");
        Date d = ss.parse(bir);
        Date d1 = new Date();
        System.out.println((d1.getTime()-d.getTime())/1000l/60/60/7/24);
    }

}
