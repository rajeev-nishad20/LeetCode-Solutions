class Solution {
    public int minElement(int[] nums) {
        int ans = Integer.MAX_VALUE;

        for(int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int sum = 0;

            while(num > 0) {
                sum += (num % 10);
                num /= 10;
            }

            ans = Math.min(ans, sum);
        }

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna