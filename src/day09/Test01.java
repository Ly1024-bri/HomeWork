package day09;
/**
 * 使用线程方式一创建两个线程:分别输出1000次，你好和再见
 * @author Bonnie
 *
 */
public class Test01 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <1000 ; i++) {
            System.out.println("第"+i+"次你好");
        }
    }

    public static void main(String[] args) {
        Test01 t = new Test01();
        t.start();
        for (int i = 0; i <1000 ; i++) {
            System.out.println("第"+i+"次再见");

        }
    }
}
