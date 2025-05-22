public class QuickSort {
    public void qsort(int[] array, int low, int high)
    {
        if (low < high) {
            int pivotIndex = partition(array, low, high);

            // Recursively sort partitions
            qsort(array, low, pivotIndex - 1);
            qsort(array, pivotIndex + 1, high);
        }
    }

    private int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;

                // Swap
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // Swap pivot into correct position
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;

    }

    // navin reddy code

//        if(low<high){
//
//            int pi = partition(arr, low, high);
//
//            quickSort(array,low, pi-1);
//            quickSort(array,pi+1 ,high);
//        }
//    }
//
//    private static int partition(int[] array, int low, int high) {
//
//        int pivot = array[high];
//        int i = low-1;
//
//        for(int j=low;j<high;j++)
//        {
//        if (array[j] < pivot)
//            {
//                i++;
//                int temp = array[i];
//                array[i] = array[j];
//                array[j] = temp;
//
//            }
//        }
//        int temp = array[i+1];
//        array[i+1] = array[high];
//        array[high] = temp;
//
//        return  i+1;
//    }
//
//    public void qsort(int[] array, int i, int i1) {
//
//        int arr[] = {5,6,2,3,1,8,4};
//        System.out.println("before sorting");
//        for (int num : arr) {
//            System.out.print(num + " ");
//        }
//        quickSort(arr, 0, arr.length-1);
//
//        System.out.println();
//        System.out.println("after sorting");
//        for (int num: arr)
//        {
//            System.out.print(num + " ");
//        }
}
