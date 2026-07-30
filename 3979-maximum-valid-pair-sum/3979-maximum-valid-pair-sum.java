class Solution {
    public int maxValidPairSum(int[] nums, int k) {
        int mini = 0;
        int ans =0;
        int n = nums.length;
        for(int i = k;i<n;i++){
            mini = Math.max(nums[i-k],mini);
            ans = Math.max(ans, nums[i]+mini);
        }
        return ans;
    }
}