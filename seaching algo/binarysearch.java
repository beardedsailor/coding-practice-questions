import java.util.Scanner;

public class binarysearch {
    public static void main(String[] args) {
        binarysearch ob = new binarysearch();
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        int find = sc.nextInt();
        int arr[] = new int[no];
        for (int i = 0; i < no; i++) {
            arr[i] = sc.nextInt();
        }
        int ansidx = ob.findelement(arr, 0, no - 1, find);
        if (ansidx == -1) {
            System.out.print("Not found");
        }
        else {
            System.out.print(ansidx);
        }        
        sc.close();
    }

    int findelement(int arr[], int startidx, int endidx, int find) {
        if (endidx >= startidx) {
            int mid = startidx + (endidx - startidx) / 2;
            if (arr[mid] == find) {
                return mid;
            }
            if (arr[mid] > find) {
                // endidx = mid - 1;
                return findelement(arr, startidx, mid - 1, find);
            }
            return findelement(arr, mid + 1, endidx, find);

         }
            
        return -1;
        }
}
