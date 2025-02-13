import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ZeroSumSubarrays {

    public List<List<Integer>> findSubarraysWithZeroSum(int[] nums) {
        HashMap<Integer, List<Integer>> sumMap = new HashMap<>();
        List<List<Integer>> result = new ArrayList<>();
        int currentSum = 0;

        // Traverse the array
        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];

            // If the currentSum is zero, it means the subarray from 0 to i is zero-sum
            if (currentSum == 0) {
                List<Integer> subarray = new ArrayList<>();
                for (int j = 0; j <= i; j++) {
                    subarray.add(nums[j]);
                }
                result.add(subarray);
            }

            // If the currentSum has been seen before, then we have a zero-sum subarray
            if (sumMap.containsKey(currentSum)) {
                // Get the indices of the previous occurrences of the same sum
                for (int startIndex : sumMap.get(currentSum)) {
                    List<Integer> subarray = new ArrayList<>();
                    for (int j = startIndex + 1; j <= i; j++) {
                        subarray.add(nums[j]);
                    }
                    result.add(subarray);
                }
            }

            // Add the current index to the list of indices for the current cumulative sum
            sumMap.putIfAbsent(currentSum, new ArrayList<>());
            sumMap.get(currentSum).add(i);
        }

        return result;
    }

    public static void main(String[] args) {
        ZeroSumSubarrays solution = new ZeroSumSubarrays();
        int[] nums = {6, -3, 3, -1, 2, -2, 4, -4};
        List<List<Integer>> result = solution.findSubarraysWithZeroSum(nums);

        // Print all the subarrays with sum zero
        for (List<Integer> subarray : result) {
            System.out.println(subarray);
        }
    }
}
