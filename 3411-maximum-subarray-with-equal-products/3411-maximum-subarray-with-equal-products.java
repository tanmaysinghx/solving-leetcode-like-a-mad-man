class Solution {
    public int maxLength(int[] nums) {
        int n = nums.length;
        int maxLen = 0;

        long overallLcm = 1;
        long maxVal = 0;
        for (int num : nums) {
            overallLcm = getLcm(overallLcm, num);
            if (num > maxVal) {
                maxVal = num;
            }
        }
        long maxProdBound = overallLcm * maxVal;

        for (int i = 0; i < n; i++) {
            long prod = 1;
            long g = 0;
            long l = 1;

            for (int j = i; j < n; j++) {
                long curr = nums[j];
                prod *= curr;
                g = getGcd(g, curr);
                l = getLcm(l, curr);

                if (prod == l * g) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }

                if (prod > maxProdBound) {
                    break;
                }
            }
        }

        return maxLen;
    }

    public static long getProd(int[] nums) {
        long productOfArray = 1;
        for (int num : nums) {
            productOfArray *= num;
        }
        return productOfArray;
    }

    public static long getGcd(long a, long b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static long getLcm(long a, long b) {
        if (a == 0 || b == 0) {
            return 0;
        }
        long absA = Math.abs(a);
        long absB = Math.abs(b);
        return (absA / getGcd(absA, absB)) * absB;
    }
}