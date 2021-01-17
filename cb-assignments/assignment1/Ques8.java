// subarray 
// by O(n)
// is ques me cummulative sum nikalange
//pending
import java.util.*;

class Ques8{
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int length=sc.nextInt();
            int a[]=new int[length];
            for(int i=0;i<length;i++){
                a[i]=sc.nextInt();
            }
            int divisible=sc.nextInt();
            int cmarray[]= new int[length+1];
            cmarray[0]=0;
            int sum=cmarray[0];
            for(int i=0;i<length;i++){
                sum=sum+a[i];
                cmarray[i+1]=sum;
            }
            for(int ab:cmarray){
                int value=ab%divisible;
            }
    }
}