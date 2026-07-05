class Solution {
    public String reverseVowels(String s) {
        char[] charArray = s.toCharArray();

        int slow = 0;
        int fast = charArray.length - 1;

        while (slow < fast) {
            if (!isVowel(charArray[slow])) {
                slow++;
            } else if (!isVowel(charArray[fast])) {
                fast--;
            } else {
                char temp = charArray[slow];
                charArray[slow] = charArray[fast];
                charArray[fast] = temp;

                slow++;
                fast--;
            }
        }

        return new String(charArray);
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
               c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}