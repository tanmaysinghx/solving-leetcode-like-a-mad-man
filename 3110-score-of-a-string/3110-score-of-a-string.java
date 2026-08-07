class Solution {
    public int scoreOfString(String s) {
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            if (i != s.length() - 1) {
                int asciiDiff = s.charAt(i) - s.charAt(i + 1);
                sum = sum + Math.abs(asciiDiff);
            }
        }

        return sum;
    }
}