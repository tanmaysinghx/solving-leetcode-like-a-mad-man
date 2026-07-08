class Solution {
    public String licenseKeyFormatting(String s, int k) {
        String cleanedInputString = s.replaceAll("-", "").toUpperCase();
        String reversedCleaned = new StringBuilder(cleanedInputString).reverse().toString();

        StringBuilder resultString = new StringBuilder();

        for (int i = 1; i <= reversedCleaned.length(); i++) {
            resultString.append(reversedCleaned.charAt(i - 1));
            
            if (i % k == 0 && i < reversedCleaned.length()) {
                resultString.append("-");
            }
        }
        
        return resultString.reverse().toString();
    }
}