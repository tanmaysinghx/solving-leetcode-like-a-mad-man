class Solution {
    public int missingNumber(int[] nums) {
        Set<Integer> inputSet = new HashSet<>();

        for (int num : nums) {
            inputSet.add(num);
        }

        for (int i = 1; i <= nums.length; i++) {
            if (!inputSet.contains(i)) {
                return i;
            }
        }

        return 0;
    }
}