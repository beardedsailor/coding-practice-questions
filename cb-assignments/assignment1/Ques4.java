import java.util.*;
//invert numbers
class Ques4{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str=sc.next();
        char [] a=str.toCharArray();
        for(int i=0;i<a.length;i++){
            if(i==0 && a[i]=='9'){
                // i++;
                continue;
            }
            else if(a[i]>='5'){
               a[i]=((char)(9-(int)a[i]));
            }
        
        }
System.out.println(a);
    }
    
}