import java.util.*;
//minimum steps needed for hulk to move at certain position

class Ques11{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int testcases=sc.nextInt();
        for(int i=0;i<testcases;i++){
            int val=sc.nextInt();
            System.out.println(findsteps(val));
        }
    }
   static int findsteps(int val){
        // int []arr={2,4,8,16,32,64,128,256,512,1024,2048};
        // for(int i=10;i>=0;i++){
        //     if(val%arr[i]==0){
        //         return 1;
        //     }
        //     else{

        //     }
        // }
        int ans=0;
        while(val!=0){
            if((val & 1) != 0){
                ans++;
            }
            val=val>>1;
        }
        return ans;
    }
}