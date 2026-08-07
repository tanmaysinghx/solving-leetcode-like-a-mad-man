import java.util.List;
import java.util.ArrayList;

class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        List<Integer> asciiValues = new ArrayList<>();
        StringBuilder resultString = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            int asciiSum = 0;
            for (int j = 0; j < words[i].length(); j++) {
                int asciiValue = words[i].charAt(j) - 'a';
                asciiSum = asciiSum + weights[asciiValue];
            }
            asciiValues.add(asciiSum % 26);
        }

        for (int num : asciiValues) {
            char c =  (char) ('z' - num);
            resultString.append(c);
        }

        return resultString.toString();
    }
}