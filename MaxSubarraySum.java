public class MaxSubarraySum {
    public static int maxSubarraySum(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int num : nums) {
            currentSum = Math.max(currentSum + num, num);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubarraySum(nums)); 

        int[] nums2 = {-2, -3, -4, -1, -2};
        System.out.println(maxSubarraySum(nums2)); 

        int[] nums3 = {1, -2, 3, 4, -5, 6};
        System.out.println(maxSubarraySum(nums3)); 
    }
}
