class Solution {
    public String reversePrefix(String s, int k) {
        StringBuilder part = new StringBuilder(s.substring(0, k));
        String secondPart = s.substring(k, s.length());

        return part.reverse() + secondPart;
    }
}