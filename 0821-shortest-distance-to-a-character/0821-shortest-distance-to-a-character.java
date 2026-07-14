class Solution {
    public int[] shortestToChar(String s, char c) {
        char[] charArray = s.toCharArray();
        int n = charArray.length;
        int[] result = new int[n];
        int lastFoundIndex = -1; // -1 indicates we haven't found the first 'c' yet

        for (int i = 0; i < n; i++) {
            if (charArray[i] == c) {
                if (lastFoundIndex == -1) {
                    // First 'c' found: all characters before it only look forward to index i
                    for (int j = 0; j <= i; j++) {
                        result[j] = i - j;
                    }
                } else {
                    // Subsequent 'c' found: fill the interval between lastFoundIndex and i
                    for (int j = lastFoundIndex + 1; j <= i; j++) {
                        result[j] = Math.min(j - lastFoundIndex, i - j);
                    }
                }
                lastFoundIndex = i;
            }
        }

        // Handle trailing characters after the very last 'c'
        if (lastFoundIndex != -1) {
            for (int j = lastFoundIndex + 1; j < n; j++) {
                result[j] = j - lastFoundIndex;
            }
        }

        return result;
    }
}