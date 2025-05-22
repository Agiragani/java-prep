package Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class DupHash {
    public static void main(String[] args) {

        ArrayList<Object> result = new ArrayList<>();
        int[] nums = {1, 1, 1, 1, 2, 2, 2, 3, 3};
        int j = 0;
        int k = 0;

        for(int i=0;i<nums.length;i++){
            result.add(nums[i]);
        }

        System.out.println(result);

        for (int i = 1; i < result.size(); i++) {
            if (result.get(j) == result.get(i)) {
                k = k + 1;
            } else if (result.get(j) != result.get(i)) {
                j = i;
                k = 0;
            }
            if (k > 1) {
                result.set(i,"_");
            }

        }
        System.out.println(result);

        while(result.contains("_")){
            result.remove("_");
        }
        System.out.println(" ");
        System.out.println(result);

        for(int i=0;i<result.size();i++ ){
            nums[i] = (int)result.get(i);
        }
        int p = result.size();
    }
}
