import java.util.*;
//pairs of numbers in an array with specific sum
class Ques14{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int length=sc.nextInt();
        int arr[]=new int[length];
        for(int i=0;i<length;i++){
            arr[i]=sc.nextInt();
        }
        int value=sc.nextInt();
        for(int i=0;i<length;i++){
            for(int j=i;j<length;j++){
                if(arr[j]+arr[i]==value){
                    System.out.print(arr[i]+" ");
                     System.out.println(arr[j]);
                }
            }
        }
    }
}