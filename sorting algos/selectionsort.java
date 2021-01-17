import java.util.Scanner;

public class selectionsort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        selectionsort ob = new selectionsort();
        int no = sc.nextInt();
        
        int arr[] = new int[no];
        // System.out.print(arr.length);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int arr1[] = ob.sortedarray(arr);
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]);
        }
        sc.close();
        
    }

    int[] sortedarray(int arr[]){
        int idx_j=0;
        int arr_length= arr.length;
        for(int i=0;i<arr_length-1;i++){
            int dig= arr[i];
            for(int j=i+1;j<arr_length;j++){
                if(dig>arr[j]){
                    dig=arr[j];
                    idx_j=j;
                }
            }
            if (dig < arr[i]) {
                arr[idx_j] = arr[i];
                arr[i]=dig;
            }

        }
        return arr;
    }
}
