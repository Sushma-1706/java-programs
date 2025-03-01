import java.util.Arrays;
import java.util.*;
public class linkedrev {
    public static void main(String[] args) {
        LinkedList<Integer>List=new LinkedList<Integer>(Arrays.asList(10,20,30,40,50));
        System.out.println(List);
        Collections.reverse(List);
        System.out.println(List);
    }
    
}
