import java.util.*;
//unique numbers using bitwise xor means ^ -> 1|1=>0,0|0=>0,others will contain 1

class Ques10{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();
        int arr[]=new int[no];
        for(int i=0;i<no;i++){
            arr[i]=sc.nextInt();
        }
        int res=arr[0];
        for(int i=1;i<no;i++){
            res=res^arr[i];
            // System.out.println(res);
        }
    System.out.println(res);
    }

}