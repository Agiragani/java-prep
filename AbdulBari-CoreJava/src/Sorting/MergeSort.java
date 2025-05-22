public class MergeSort {
        public void msort(int[] array) {
            if (array.length < 2) {
                return; // Base case: array is already sorted if it has less than 2 elements
            }

            int mid = array.length / 2;

            // Split the array into two halves
            int[] left = new int[mid];
            int[] right = new int[array.length - mid];

            // Copy elements to the left and right arrays
            for (int i = 0; i < mid; i++) {
                left[i] = array[i];
            }
            for (int i = mid; i < array.length; i++) {
                right[i - mid] = array[i];
            }

            // Recursively sort the left and right halves
            msort(left);
            msort(right);

            // Merge the sorted halves
            merge(array, left, right);
        }

        private void merge(int[] array, int[] left, int[] right) {
            int i = 0, j = 0, k = 0;

            // Merge the two arrays into the original array
            while (i < left.length && j < right.length) {
                if (left[i] <= right[j]) {
                    array[k++] = left[i++];
                } else {
                    array[k++] = right[j++];
                }
            }

            // Copy remaining elements from the left array
            while (i < left.length) {
                array[k++] = left[i++];
            }

            // Copy remaining elements from the right array
            while (j < right.length) {
                array[k++] = right[j++];
            }
        }
    }

