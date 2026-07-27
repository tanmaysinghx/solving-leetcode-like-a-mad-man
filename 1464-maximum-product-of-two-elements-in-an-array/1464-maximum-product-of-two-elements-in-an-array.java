class Solution {
    public int maxProduct(int[] nums) {
        int maxNumber = nums[0];
        int secondMaxNumber = Integer.MIN_VALUE;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > maxNumber) {
                secondMaxNumber = maxNumber;
                maxNumber = nums[i];
            } else if (nums[i] > secondMaxNumber) {
                secondMaxNumber = nums[i];
            }
        }

        return (maxNumber - 1) * (secondMaxNumber - 1);
    }
}