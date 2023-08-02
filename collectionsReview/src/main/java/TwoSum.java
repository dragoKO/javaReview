import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int target = -100;
        int[] number = {-2, 11, -20, 11};
        System.out.println(Arrays.toString(sumTillTarget1(number, target)));
        System.out.println(Arrays.toString(sumTillTargetOptimized(number, target)));
    }


    public static int[] sumTillTarget1(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {
            int num_1 = arr[i];

            for (int i2 = i + 1; i2 < arr.length; i2++) {
                int num_2 = arr[i2];
                if (num_1 + num_2 == target) {
                    return new int[]{i, i2};
                }
            }

        }
        return null;

    }

    public static int[] sumTillTargetOptimized(int[] arr, int target) {
        Map<Integer, Integer> memo = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int potentialMatch =  target -arr[i];
            if (memo.containsKey(potentialMatch)) return new int[]{memo.get(potentialMatch), i};
            memo.put(arr[i], i);
        }

        return new int[]{};
    }
}
