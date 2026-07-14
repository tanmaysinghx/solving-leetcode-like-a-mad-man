class Solution {
    public String toGoatLatin(String sentence) {
        String[] inputWords = sentence.split(" ");

        for (int i = 0; i < inputWords.length; i++) {
            if (startsWithVowel(inputWords[i])) {
                inputWords[i] = inputWords[i] + "ma";
            } else {
                inputWords[i] = inputWords[i].substring(1) 
                              + inputWords[i].charAt(0) 
                              + "ma";
            }
            inputWords[i] += "a".repeat(i + 1);
        }

        return String.join(" ", inputWords);
    }

    public static boolean startsWithVowel(String word) {
        char first = Character.toLowerCase(word.charAt(0));

        return first == 'a' || first == 'e' || first == 'i' ||
               first == 'o' || first == 'u';
    }
}