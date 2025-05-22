import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Strings {

    public static void main(String[] args) {
        String str = "PRASHANTH";
        char[] arr = str.toCharArray();
        List<Character> al = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int num = 0;
            for (int j = 0; j < al.size(); j++) {
                if (al.get(j) == arr[i]) {
                    num = 1;
                    temp.add(i);
                    break;
                }
            }
            if (num == 0) {
                al.add(arr[i]);
            }
        }
        System.out.print("Leftover string without duplicates: ");
        for (char c : al) {
            System.out.print(c);
        }
        System.out.println();
        System.out.print("Duplicate character indices: ");

        for (int x : temp) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
    }

