import java.util.Arrays;
import java.util.LinkedList;

public class linkedsearch {
    public static void main(String[] args) {
            LinkedList<Integer>List=new LinkedList<Integer>(Arrays.asList(10,20,30,30,50));
            int num=30;
            if(List.contains(num)){
                System.out.println("number found");
            }else{
                System.out.println("not found");
            }
        
    }
}
