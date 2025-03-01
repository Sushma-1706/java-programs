import java.util.Arrays;
import java.util.*;
public class arraysort {
   public static int[] Arraysorts(int[]num){
               return num;
            }
public static void main(String[]args){
    Scanner sc = new Scanner(System.in); {
        int size=sc.nextInt();
               int num[]=new int[size]; 
               for(int i =0;i<num.length;i++){
        num[i] = sc.nextInt();
               }
               Arrays.sort(num);
                Arraysorts(num);
               System.out.println("sorted array"+Arrays.toString(num));
    }
    sc.close();

}
}

    

