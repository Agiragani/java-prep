public class BubbleSort {
public void bsort(int[] array)

    {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        //Navin reddy code
//        int nums[] = {6, 5, 2, 8, 9, 4};
//        int size = nums.length;
//        int temp = 0;
//
//        System.out.println("before sorting");
//        for (int num : nums) {
//            System.out.print(num + " ");
//        }
//
//        for (int i = 0; i < size; i++) {
//            for (int j = 0; j < size - i - 1; j++) {
//                if (nums[j] > nums[j + 1]) {
//                    temp = nums[j];
//                    nums[j] = nums[j + 1];
//                    nums[j + 1] = temp;
//                }
//            }
//            System.out.println();
//            for (int num : nums) {
//                System.out.print(num + " ");
//            }
//        }
//        System.out.println();
//        System.out.println("after sorting");
//        for (int num : nums) {
//            System.out.print(num + " ");
//
//        }



    }
}
