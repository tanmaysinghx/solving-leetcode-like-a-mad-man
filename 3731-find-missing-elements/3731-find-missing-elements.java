class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> resultList = new ArrayList<>();

        Arrays.sort(nums);

        int min = nums[0];

        for (int i = 0; i < nums.length; i++) {
            while (min < nums[i]) {
                resultList.add(min);
                min++;
            }
            min = nums[i] + 1;
        }

        return resultList;
    }
}