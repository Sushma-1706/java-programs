import java.util.Arrays;

public class array2large {
    static int Array2large(int[]arr){
      
        
        int max=arr[arr.length-1];
        int secmax=0;
        for(int i=arr.length-1;i>0;i--){
            if(arr[i]< max){
               secmax=arr[i];
               break;
            }

        }
                return secmax;
    }
        public static void main(String[]args){
            int arr[]={3,4,52,65,1,8};
            Arrays.sort(arr);
           int secmax= Array2large(arr);
           if(secmax!= 0){
            System.out.print("secmax:"+secmax);
           }else{
            System.out.println("no num");
           }
           

        }

    
    
}           
        
    
    

