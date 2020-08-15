package day05;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 创建一个队列，存入Integer类型元素1,2,3,4,5
 * 然后遍历队列并输出每个元素
 * @author Bonnie
 *
 */
public class Test01 {
    public static void main(String[] args) {
        Queue<Integer> qq = new LinkedList<>();
        Collections.addAll(qq,1,2,3,4,5);
        for (Integer i:qq) {
            System.out.println(i);
        }
        QueueTest<Integer> q = new QueueTest<>();
        for (int i = 1; i < 6; i++) {
            q.enqueue(i);
        }

        for (int i = 0; i < q.getSize(); i++) {
            System.out.println("此队列第" + (i+1)  + "个元素为：" + q.get(i));
        }
    }
static class QueueTest<E>{
    //继承链表类来定义队列，链表提供队列先进先出的数据结构
    private LinkedList<E> list = new LinkedList<E>();

    public void enqueue(E e) {
        list.addLast(e);
    }

    public E dequeue() {
        return list.removeFirst();
    }

    public int getSize() {
        return list.size();
    }

    public E get(int i) {
        return list.get(i);
    }

    @Override
    public String toString(){
        return list.toString();
    }
}
}
