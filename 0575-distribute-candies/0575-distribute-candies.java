class Solution {
    public int distributeCandies(int[] candyType) {
        int maxCandy = candyType.length / 2;
        Set<Integer> uniqueCandies = new HashSet<>();        
        int result = 0;

        for (int i : candyType) {
            uniqueCandies.add(i);
        }

        if (maxCandy <= uniqueCandies.size()) {
            return maxCandy;
        }

        return uniqueCandies.size();
    }
}