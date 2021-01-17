import java.util.*;
//insertion sort
class Ques9{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int length=sc.nextInt();
        int arr[]=new int[length];
        for(int i=0;i<length;i++){
            arr[i]=sc.nextInt();
        }
        int arr1[]=insertionsortarray(arr,length);
        for(int a:arr1){
            System.out.println(a);
        }
    }
    static int [] insertionsortarray(int []arr,int length){
        int j,temp,idx_n=0,flag=0;
        for(int i=1;i<length;i++){
            int key=arr[i];
            j=i-1;
            while(j>=0 && j<i){
                if(key<arr[j]){
                    idx_n=j;
                    flag=1;
                    key=arr[j];
                }
                j--;
            }
            if(flag==1){
                temp=arr[idx_n];
                arr[idx_n]=arr[i];
                arr[i]=temp;
            }
            flag=0;
        }
        // for(int a:arr){
        //     System.out.println(a);
        // }
        return arr;
    }
}