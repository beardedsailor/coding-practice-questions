import java.util.*;
public class goodSubArrays {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        for (int i = 0; i < testCases; i++) {
            int lengthOfArray = sc.nextInt();
            int array[] = new int[lengthOfArray];
            for (int j = 0; j < lengthOfArray; j++) {
                array[j] = sc.nextInt();
            }
            noOfGoodsubarr(array,lengthOfArray);
        }

        sc.close();
    }

    noOfGoodsubarr(int [] array,int length){
        // int length=array.length;
        int sum=0,subarray;
        for(int i=0;i<length;i++){
            if(array[i]%length==0){
                subarray+=1;
            }
        }
        for(int i=0;i<length;i++){
            for(int j=i;j<length;j++){
                sum+=array[j];
                
            }
            // if(sum)
        }

    }
}
