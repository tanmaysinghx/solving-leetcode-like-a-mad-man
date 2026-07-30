class Solution {
    public int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> left = new HashMap<>();
        Map<Integer, Integer> right = new HashMap<>();
        Map<Integer, Integer> count = new HashMap<>();

        int maxFreq = 0;
        
        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            if (!left.containsKey(x)) {
                left.put(x, i);
            }
            right.put(x, i);
            count.put(x, count.getOrDefault(x, 0) + 1);
            
            maxFreq = Math.max(maxFreq, count.get(x));
        }

        int minLength = nums.length;
        for (int x : count.keySet()) {
            if (count.get(x) == maxFreq) {
                int subarrayLen = right.get(x) - left.get(x) + 1;
                minLength = Math.min(minLength, subarrayLen);
            }
        }

        return minLength;
    }
}