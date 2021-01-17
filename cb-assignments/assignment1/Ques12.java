import java.util.*;
//lowerbound and upperbound for a number in an array

class Ques12{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int length=sc.nextInt();
        int array[]=new int[length];
        for(int i=0;i<length;i++)
        {
            array[i]=sc.nextInt();
        }
        int queryno=sc.nextInt();
        int flag=0;
        
        for(int i=0;i<queryno;i++){
            int val=sc.nextInt();
            int lowerBound=-1,upperBound=-1;
            for(int j=0;j<length;j++){
                if(val==array[j]&&flag==0){
                    lowerBound=j;
                    flag=1;
                }
                if(val==array[j]){
                    upperBound=j;
                }
            }
            flag=0;
            System.out.println();
             System.out.println(lowerBound);
        System.out.println(upperBound);
        }
       
    }
}