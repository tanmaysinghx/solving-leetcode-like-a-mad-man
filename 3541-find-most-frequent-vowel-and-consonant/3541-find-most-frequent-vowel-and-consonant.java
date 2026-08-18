class Solution {
    public int maxFreqSum(String s) {
        int[] cnt = new int[26];
        
        for (char c : s.toCharArray()) {
            ++cnt[c - 'a'];
        }
        
        int maxVowel = 0;
        int maxConsonant = 0;
        
        for (int i = 0; i < 26; ++i) {
            char c = (char) (i + 'a');
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                maxVowel = Math.max(maxVowel, cnt[i]);
            } else {
                maxConsonant = Math.max(maxConsonant, cnt[i]);
            }
        }
        
        return maxVowel + maxConsonant;
    }
}