package SlidingWindow;

public class SW1 {
    public static int length(String args){
       String s = "abcdabcbb";
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (!hasDuplicate(s, i, j)) {
                    maxLength = Math.max(maxLength, j - i + 1);
                } else {
                    break; // stop early if duplicate found
                }
            }
        }
        return maxLength;
    }

    // Helper method to check for duplicates in a substring
    private static boolean hasDuplicate(String s, int start, int end) {
        for (int i = start; i <= end; i++) {
            for (int j = i + 1; j <= end; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String input = "abcabcbb";
        System.out.println("Longest length: " + length(input));
    }
}
