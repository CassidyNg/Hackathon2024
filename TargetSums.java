public class TargetSums {
    public static String sumPairs(int[] nums, int target) {
        String result = "";
        for (int i = 0; i < nums.length / 2 + 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    if (!(result.equals(""))){
                        result += ", ";
                    }
                    result += "(" + nums[i] + ", " + nums[j] + ")";
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5};
        System.out.println(sumPairs(input, 6));

        int[] input2 = {9, 7, 8, 11, 6, 5};
        System.out.println(sumPairs(input2, 17));

        int[] input3 = {8, 4, 9, 7, 2, 5, 3};
        System.out.println(sumPairs(input3, 12));
    }
}