package sort;

public class C03_InsertionSort {
    public static void main(String[] args) {
        int[] arr = {-71,35,38,3,48,-5,55,-69,5,17,34,-43,7,-14,21,26,-34,19};
        System.out.print("原数组：");
        printArray(arr);
        insertionSort(arr);
        System.out.print("排序后：");
        printArray(arr);
        // 运行结果：
        // 原数组：[ -71 35 38 3 48 -5 55 -69 5 17 34 -43 7 -14 21 26 -34 19 ]
        // 排序后：[ -71 -69 -43 -34 -14 -5 3 5 7 17 19 21 26 34 35 38 48 55 ]
    }

    // 插入排序
    public static void insertionSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return; // 如果数组为空或只有一个元素，无需排序
        }

        for (int i = 1; i < arr.length; i++) {
            // 从第二个元素开始，逐个将其插入到已排序区间
            for (int j = i - 1; j >= 0 && arr[j] > arr[j + 1]; j--) {
                // 内层循环用于比较和交换元素，直到找到适当的插入位置

                // 如果当前元素比前一个元素大，交换它们的位置
                swap(arr, j, j + 1);
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
