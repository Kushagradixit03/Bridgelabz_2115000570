import java.util.HashSet;

public class PairWithGivenSum {

    public boolean hasPairWithSum(int[] nums, int target) {
        HashSet<Integer> visitedNumbers = new HashSet<>();

        for (int num : nums) {
            int complement = target - num;

            if (visitedNumbers.contains(complement)) {
                return true;
            }

            visitedNumbers.add(num);
        }

        return false;
    }

    public static void main(String[] args) {
        PairWithGivenSum solution = new PairWithGivenSum();
        int[] nums = {10, 15, 3, 7};
        int target = 17;

        boolean result = solution.hasPairWithSum(nums, target);
        if (result) {
            System.out.println("Pair found.");
        } else {
            System.out.println("No pair found.");
        }
    }
}
