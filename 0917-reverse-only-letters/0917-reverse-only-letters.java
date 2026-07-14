class Solution {
    public String reverseOnlyLetters(String s) {
        char[] charArray = s.toCharArray();

        int slow = 0;
        int fast = charArray.length - 1;

        while (slow < fast) {
            if (Character.isLetter(charArray[slow]) && Character.isLetter(charArray[fast])) {
                char temp = charArray[slow] ;
                charArray[slow] = charArray[fast];
                charArray[fast] = temp;
                slow++;
                fast--;
            } else if (Character.isLetter(charArray[slow]) && !Character.isLetter(charArray[fast])) {
                fast--;
            } else {
                slow++;
            }
        }
        return new String(charArray);
    }
}