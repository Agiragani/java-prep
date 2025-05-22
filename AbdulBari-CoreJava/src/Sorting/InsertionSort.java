public class InsertionSort {

    public void insort(int[] array) {

        int n = array.length;
        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;

            // Shift elements
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
        // navin reddy code
//        int arr[] = {5, 6, 2, 3, 1};
//        System.out.println("before sorting");
//        for (int num : arr) {
//            System.out.print(num + " ");
//        }
//        for (int i = 1; i < arr.length; i++) {
//            int temp = arr[i];
//            int j = i - 1;
//
//            while (j >= 0 && arr[j] > temp) {
//                arr[j + 1] = arr[j];
//                j--;
//            }
//            arr[j + 1] = temp;
//        }
//        System.out.println();
//        System.out.println("after sorting");
//        for (int num : arr) {
//            System.out.print(num + " ");
//        }
        }

}
