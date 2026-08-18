class Solution {
    public String defangIPaddr(String address) {
        StringBuilder resultString = new StringBuilder();

        for (int i = 0; i <  address.length(); i++) {
            if (address.charAt(i) == '.') {
                resultString.append("[.]");
            } else {
                resultString.append(address.charAt(i));
            }
        }

        return new String(resultString);
    }
}