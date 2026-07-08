class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> resultStrings = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                resultStrings.add("FizzBuzz");
            } else if (i % 3 == 0) {
                resultStrings.add("Fizz");
            } else if (i % 5 == 0) {
                resultStrings.add("Buzz");
            } else {
                resultStrings.add(Integer.toString(i));
            }
        }

        return resultStrings;
    }
}