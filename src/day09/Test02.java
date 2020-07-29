package day09;
/**
 * 使用线程方式二创建两个线程:分别输出1000次，你好和再见
 * @author Bonnie
 *
 */
public class Test02{
    public static void main(String[] args) {
       Runnable r1 = new Runnable() {
           @Override
           public void run() {
               for (int i = 0; i <1000 ; i++) {
                   System.out.println("第"+i+"次你好");
               }
           }
       };
       Runnable r2 = new Runnable() {
           @Override
           public void run() {
               for (int i = 0; i <1000 ; i++) {
                   System.out.println("第"+i+"次再见");
               }
           }
       };
        Thread t1 = new Thread(r1,"一线程");
        Thread t2 = new Thread(r2,"二线程");
        t1.start();
        t2.start();
    }
}
