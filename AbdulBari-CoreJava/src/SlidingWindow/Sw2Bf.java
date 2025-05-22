package SlidingWindow;

public class Sw2 {

    public static void longestSubarray(int[] arr, int k) {
        int left = 0, right = 0, sum = 0, maxLength = 0;
        int start = 0, end = 0;  // To store the start and end indices of the longest subarray

        while (right < arr.length) {
            sum += arr[right];

            // Shrink the window if sum > k
            while (sum > k && left <= right) {
                sum -= arr[left];
                left++;
            }

            // Update max length if valid window
            if (sum <= k) {
                if (right - left + 1 > maxLength) {
                    maxLength = right - left + 1;
                    start = left;
                    end = right;
                }
            }
            right++;
        }

        // Display the results
        System.out.println("Longest subarray length: " + maxLength);
        System.out.print("Longest subarray: ");
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 3, 8, 7};
        int k = 12;
        longestSubarray(arr, k);
    }
}