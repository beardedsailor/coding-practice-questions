import java.util.Scanner;

class LinearSearch{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int find=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    for (int i = 0; i < n; i++) {
        if (arr[i] == find) {
            System.out.println(i);
            break;
        }
    }
    sc.close();
}
}