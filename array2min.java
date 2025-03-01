import java.util.*;
public class array2min {
    public static int find2small(int[]num){
        Arrays.sort(num);
        int min=num[0];
        int secmin=0;
        for(int i=0;i<num.length-1;i++){
            if(num[i]>min){
                 secmin=num[i] ;
                 break;
                }
            }
            return secmin;
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int num[]=new int[size];
        for(int i=0;i<size;i++){
            num[i]=sc.nextInt();
         }
       int secmin= find2small(num);
                if(secmin!=0){
            System.out.println("second min" +secmin);
        }
        sc.close();
    }
}
