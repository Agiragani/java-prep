public class LongSubString {

    public static int main(String args[]) {
        String str = "abcabcabc";
        char[] arr = str.toCharArray();
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < str.length(); j++) {
                temp = temp + 1;
                if (arr[i] == arr[j]) {
                    return temp;
                }
            }
        }
        return temp;
    }
}
