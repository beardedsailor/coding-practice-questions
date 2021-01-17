import java.util.*;
//odd one out
class Ques2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();
        int a[]=new int[no];

        for(int i=0;i<no;i++){
            a[i]=sc.nextInt();
        }
        int i,x,j,sum,result;
        for (i = 0; i < no; i++)
    {
      sum = 0;
      x = (1 << i);
      for (j=0; j< no; j++)
      {
          if (a[j] & x)
            sum++;
      }
      if (sum % 3){
        result |= x;
        }
    }
    System.out.println(result);   

    
}
}