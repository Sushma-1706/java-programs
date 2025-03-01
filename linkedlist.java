import java.util.*;
public class linkedlist{
    public static void main(String[] args) {
    LinkedList<Integer>num=new LinkedList<Integer>();
    num.add(10);
    num.add(20);
    num.add(30);
    num.add(40);
    num.addFirst(0);
    num.addLast(50);
    System.out.println(num);
System.out.println("removed:"+num.remove(2));


    
    }
}