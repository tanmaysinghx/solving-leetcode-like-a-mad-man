class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder result = new StringBuilder();
        int len = s.length();

        for (int i = 0; i < len; i += 2 * k) {
            int endOfK = Math.min(i + k, len);
            int endOf2K = Math.min(i + 2 * k, len);

            StringBuilder temp = new StringBuilder(s.substring(i, endOfK));
            result.append(temp.reverse());

            result.append(s.substring(endOfK, endOf2K));
        }
        return result.toString();
    }
}