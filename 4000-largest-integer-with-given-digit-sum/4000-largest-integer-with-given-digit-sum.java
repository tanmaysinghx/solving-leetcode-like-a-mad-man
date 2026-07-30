class Solution {
    public int largestInteger(int n, int s) {
        if (s > 9 * n || s < 0) {
            return -1;
        }

        int result = 0;
        int remainingSum = s;

        for (int i = 0; i < n; i++) {
            int digit = Math.min(9, remainingSum);

            result = result * 10 + digit;
            
            remainingSum = remainingSum - digit;
        }

        if (remainingSum > 0) {
            return -1;
        }

        return result;
    }
}