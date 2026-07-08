class Solution {
    public String reverseWords(String s) {
        String[] wordsArray = s.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < wordsArray.length; i++) {
            StringBuilder temp = new StringBuilder(wordsArray[i]);
            temp = temp.reverse();
            wordsArray[i] = temp.toString();
            result = result.append(wordsArray[i]);

            if (i != wordsArray.length - 1) {
                result = result.append(" ");
            }
        }

        return result.toString();
    }
}