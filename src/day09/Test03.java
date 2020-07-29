package day09;
/**
 * 使用匿名内部类方式创建两个线程:分别输出1000次，你好和再见
 * @author Bonnie
 *
 */
public class Test03 {
    public static void main(String[] args) {
        Thread t = new Thread(){
            public void run(){
                for (int i = 0; i <1000 ; i++) {
                    System.out.println("第"+i+"次你好");
                }
            }
        };
        Thread t1 = new Thread(){
            public void run(){
                for (int i = 0; i <1000 ; i++) {
                    System.out.println("第"+i+"次再见");

                }
            }
        };
        t.start();
        t1.start();
    }

}
