class Solution {
    public long maxAlternatingSum(int[] nums) {
        long[] arr1 = new long[nums.length];
        long result = 0;

        for (int i = 0; i < nums.length; i++) {
            long num = 1L * nums[i] * nums[i];
            arr1[i] = num;
        }

        Arrays.sort(arr1);

        for (int i = 0; i < nums.length / 2; i++) {
            result = result - arr1[i];
        }

        for (int i = (nums.length / 2); i < nums.length; i++) {
            result = result + arr1[i];
        }

        return result;
    }
}