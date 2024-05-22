public class TargetSums {
    public static String sumPairs(int[] nums, int target) {
        String result = "";
        for (int i = 0; i < nums.length / 2; i++) {
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
        int[] example = {1, 2, 3, 4, 5};
        System.out.println(sumPairs(example, 6));
    }
}