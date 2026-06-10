class Solution {
    public long maxTotalValue(int[] nums, int k) {
        long mx = 0;
        long mn = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num > mx) mx = num;
            if (num < mn) mn = num;
        }

        return (mx - mn) * 1L * k;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna