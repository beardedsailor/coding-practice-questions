import java.util.*;
//count the frequency of continuos number
class Ques1{
     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        char a[]=str.toCharArray();
        String newa="";
        int count=0,k;
        Arrays.sort(a);
        // System.out.println(a);
        for(int i=0;i<a.length;i++){
            k=i;
            // for(int j=i;j<a.length;j++){
            //     if(a[i]==a[j]){
            //         count++;
            //     }
            // }
            while(k<a.length&&(a[i]==a[k])){
                k++;
                count++;
            }
            newa=newa+String.valueOf(a[i]);
            newa=newa+String.valueOf(count);
            count=0;
            i=k-1;
        }
        System.out.println(newa);
    }
}