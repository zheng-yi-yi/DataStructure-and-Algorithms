package sort;

public class C01_SelectionSort {

    public static void main(String[] args) {
        int[] arr = {-26,-42,0,-9,54,24,17,63,89,-21,8,-55,-61,31,16,9,-48,-56,25,-18,35,-43,-17,-34};
        System.out.print("原数组：");
        printArray(arr);
        selectionSort(arr);
        System.out.print("排序后：");
        printArray(arr);
        // 运行结果：
        // 原数组：[ -26 -42 0 -9 54 24 17 63 89 -21 8 -55 -61 31 16 9 -48 -56 25 -18 35 -43 -17 -34 ]
        // 排序后：[ -61 -56 -55 -48 -43 -42 -34 -26 -21 -18 -17 -9 0 8 9 16 17 24 25 31 35 54 63 89 ]
    }

    // 选择排序
    public static void selectionSort(int[] arr) {

        // 数组的长度为 n
        int n = arr.length;

        // 处理特殊情况
        if(arr == null || n < 2) {
            return;
        }

        // i 指向当前已排序区间的末尾位置
        for(int i = 0; i <= n-2; i++) {

            // 在未排序区间中寻找最小元素的下标，并记录到 minIndex 中
            int minIndex = i;

            // j 用于遍历未排序区间
            for(int j = i+1; j <= n-1; j++) {

                // 寻找最小值元素的下标
                minIndex = arr[j] < arr[minIndex] ? j : minIndex;

            }

            // 在每轮遍历完未排序区间后，minIndex 指向的就是未排序区间中最小元素的下标，将其放到已排好序的序列的末尾
            // 也就是 arr[i] 与 arr[minIndex] 进行交换
            swap(arr, i, minIndex);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
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
