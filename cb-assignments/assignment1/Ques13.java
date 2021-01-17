import java.util.*;
//check whether the number is armstrong

class Ques12{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();
        checkArmstrong(no);
    }
    static void checkArmstrong(int no){
        int val;
        String a=String.valueOf(no);
        int length=a.length();
        int sum=0;
        while(no!=0){
            val=no%10;
            sum+=Math.pow(val,length);
            no/=10;
        }
       
        no=Integer.valueOf(a);
        if(sum==no){
             System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}