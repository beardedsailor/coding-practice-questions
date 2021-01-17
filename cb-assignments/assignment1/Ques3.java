import java.util.*;
//Selection sort
class Ques3{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int length=sc.nextInt();
        int arr[]=new int[length];
        for(int i=0;i<length;i++){
            arr[i]=sc.nextInt();
        }
        int idx_j=0;
        for(int i=0;i<length-1;i++){
            int val=arr[i];
            for(int j=i+1;j<length;j++){
                if(val>arr[j]){
                    val=arr[j];
                    idx_j=j;
                }                
            }
            if(val<arr[i]){
               arr[idx_j]=arr[i];
                arr[i]=val;
            }
        }
    for(int i=0;i<length;i++){
            System.out.println(arr[i]);
        }
    }
     
}