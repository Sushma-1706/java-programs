public class posnumbers{
    public static void main (String args[]){
int n=5;
for(int i=1;i<=n;i++){
    for(int j=1;j<=n;j++){
        int value=i*j;
        if(value<10){
            System.out.print("0"+value+" ");
        }
        else{
            System.out.print(value+" ");
  
        }
        

    }

    System.out.println();
}
    }
}