class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int total = 0;
        int countOfLines = 1;

        for (int i = 0; i < s.length(); i++) {
            int asciiValue = s.charAt(i) - 'a';
            int width = widths[asciiValue];

            if (total + width <= 100) {
                total += width;
            } else {
                countOfLines++;
                total = width;
            }
        }

        return new int[]{countOfLines, total};
    }
}