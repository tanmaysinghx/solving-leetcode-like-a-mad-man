class Solution {
    public boolean detectCapitalUse(String word) {
        int capitalCount = 0;
        int len = word.length();

        // Count total uppercase characters
        for (int i = 0; i < len; i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                capitalCount++;
            }
        }

        // Case 1: All letters are capitals (e.g., "USA")
        // Case 2: No letters are capitals (e.g., "leetcode")
        if (capitalCount == len || capitalCount == 0) {
            return true;
        }

        // Case 3: Only the first letter is capital (e.g., "Google")
        return capitalCount == 1 && Character.isUpperCase(word.charAt(0));
    }
}