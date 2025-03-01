import java.util.*;
public class arraymid {
    public static void findarraymid(int []num){
          int mid=num.length/2;
          System.out.println(mid + "is the mid number");
        return ;

    }
    public static void main(String[]args){
            Scanner sc = new Scanner(System.in);
            int size =sc.nextInt();
            int[]num=new int [size];
            for(int i=0;i<size;i++){
            num[i]=sc.nextInt();
            }
           findarraymid(num);
           sc.close();

        }
    }
    

