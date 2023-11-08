package sort;

public class C02_BubbleSort {
    public static void main(String[] args) {
        int[] arr = {52,-1,-19,24,-49,30,24,23,24,0,14,-48,9,14,3,-20,6,2,22,10,53,21,-14,9};
        System.out.print("原数组：");
        printArray(arr);
        bubbleSort(arr);
        System.out.print("排序后：");
        printArray(arr);
        // 运行结果：
        // 原数组：[ 52 -1 -19 24 -49 30 24 23 24 0 14 -48 9 14 3 -20 6 2 22 10 53 21 -14 9 ]
        // 排序后：[ -49 -48 -20 -19 -14 -1 0 2 3 6 9 9 10 14 14 21 22 23 24 24 24 30 52 53 ]
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        if(arr == null || n < 2) {
            return;
        }
        for(int i = n-1; i>=1; i-- ) {
            for(int j = 0; j<i; j++) {
                if(arr[j] > arr[j+1]) {
                    swap(arr, j, j+1);
                }
            }
        }
    }

    private static void swap(int[] arr, int j, int i) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void printArray(int[] arr) {
        if (arr == null) {
            return;
        }
        System.out.print("[ ");
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println("]");
    }
}
