public class SumTwoNum {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        int[] test = {2, 7, 11, 15};
        int target = 9;
        System.out.println("结果->" + twoSum(test, target));
    }

    public static int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        int[] result = new int[2];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (i < j && nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }
}
