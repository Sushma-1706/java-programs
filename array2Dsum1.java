import java.util.Scanner;
public class array2Dsum1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int arr[][]=new int [3][3];
   int columsum;
    int rowsum;
    for( int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
            arr[i][j]= sc.nextInt();
        }
    }
for(int i=0;i<arr.length;i++){
    rowsum=0;
    for(int j = 0;j<arr.length;j++){
        rowsum +=arr[i][j];
    }
    System.out.println("Row " + (i + 1) + " sum: " + rowsum);
}
for(int j=0;j<arr.length;j++){
    columsum=0;
    for(int i=0;i<arr.length;i++){
        columsum=arr[j][i];
    }
    System.out.println("Column " + (j + 1) + " sum: " + columsum);
}
  sc.close();         
            
 }  
}
