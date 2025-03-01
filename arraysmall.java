import java.util.*;
public class arraysmall {
  public static int Arraysmall (int num[]){
    Arrays.sort(num);
     int min=num[0];
      return min;  
    } 
  public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                    int size=sc.nextInt();
                     int[] num = new int[size];
                    for(int i=0;i<size;i++){
                        num[i]=sc.nextInt();
                    }
                    int min=Arraysmall(num);
                System.out.println("arr:"+min);
                 sc.close();
        }
        
}
