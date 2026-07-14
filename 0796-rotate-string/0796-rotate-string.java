class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) return false;

        StringBuilder inputString = new StringBuilder(s);
        inputString.append(s);
        
        for (int i = 0; i < s.length(); i++) {
            String temp = inputString.substring(i, i + s.length());

            if (goal.equals(temp)) return true;
        }
        return false;
    }
}