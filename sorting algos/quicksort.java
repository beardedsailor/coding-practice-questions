public class quicksort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        quicksort ob = new quicksort();
        int no = sc.nextInt();

        int arr[] = new int[no];
        // System.out.print(arr.length);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int sorted_array[] = ob.sortedarray(arr);
        for (int i : sorted_array) {
            System.out.print(i);
        }
        sc.close();
    }

    int[] sortedarray(int arr[]){
        int arr_length = arr.length;
        int temp;
        for (int i = 0; i < arr_length-1; i++) {
            for (int j = 0; j < arr_length-i-1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}
