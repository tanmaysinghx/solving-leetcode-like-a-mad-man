class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> inputSet = new HashSet<>();
        Set<Integer> intersectionSet = new HashSet<>();

        for (int num : nums1) {
            inputSet.add(num);
        }

        for (int num : nums2) {
            if (inputSet.contains(num)) {
                intersectionSet.add(num);
            }
        }

        return intersectionSet.stream().mapToInt(Integer::intValue).toArray();
    }
}