import java.util.*;

class Ques6{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();
        int arr[]=new int[no];
        for(int i=0;i<no;i++){
            arr[i]=sc.nextInt();
        }
        int find_value=sc.nextInt();
        int index=binarySearch(arr,find_value,0,no);
        System.out.println(index);
    }

    static int binarySearch(int[]arr,int val,int l,int r){
        // int length=arr.length;
       int mid=l+(r-l)/2;
        if(arr[mid]==val){
            return mid;
        }
        else if(arr[mid]>val){
            return binarySearch(arr,val,l,mid-1);
        }
        else{
            return binarySearch(arr,val,mid+1,r);
        }

    }
}