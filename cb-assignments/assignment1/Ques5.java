import java.util.*;
//Bubble sort
class Ques5{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();
        int a[]=new int[no];
        for(int i=0;i<no;i++){
            a[i]=sc.nextInt();
            }
            int temp;
        for(int i=0;i<no-1;i++){
            for(int j=i+1;j<no;j++){
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        for(int val: a){
            System.out.println(val);
        }
    }
}