package day05;

import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

/**
 * 创建一个栈，存入Integer类型元素1,2,3,4,5
 * 然后遍历队列并输出每个元素
 * @author Bonnie
 *
 */
public class Test02 {
    public static void main(String[] args) {
        Stack<Integer> ss = new Stack<>();
        Collections.addAll(ss,1,2,3,4,5);
        for (Integer i:ss){
            System.out.println(i);
        }

        StackTest<Integer> s = new StackTest<>(5);
        Integer a = 1;
        while (!s.isFull()){
            s.push(a++);
            System.out.println(s);
        }
        while (!s.isEmpty()){
            s.pop();
            System.out.println(s);
        }

    }
    public static class StackTest<E>{
        private Object[] date;
        private Integer size=0;
        private void push(E a){
            date[size++] = a;
        }
        private E pop(){
            return (E)date[--size];
        }
        private boolean isFull(){
            return size == date.length;
        }
        private boolean isEmpty(){
            return size==0;
        }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            for (int i = 0; i <size ; i++) {
                sb.append(date[i]);
                sb.append(",");
            }
            sb.append("]");
            return sb.toString();
        }

        public Object[] getDate() {
            return date;
        }

        public void setDate(Object[] date) {
            this.date = date;
        }

        public Integer getSize() {
            return size;
        }

        public void setSize(Integer size) {
            this.size = size;
        }

        public StackTest() {
        }

        public StackTest(Integer index) {
            date = new Object[index];
        }
    }
}
