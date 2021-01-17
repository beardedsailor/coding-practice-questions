import java.util.*;
//no of set bits bw specific range
class Ques15{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int queries=sc.nextInt();
        int l,u;
        for(int i=0;i<queries;i++){
           l= sc.nextInt();
           u= sc.nextInt();
          int ans= noOfSetBits(l,u);
          System.out.println(ans);      
        }
    }
    static int noOfSetBits(int l,int u){
       int ans=0; 
        for(int i=l;i<=u;i++){
            int j=i;
            while(i>0){
                if((i&1)!=0)
            {    ans++;
            }
            i=i>>1;
            }
            i=j;
        }
        return ans;
    }
}