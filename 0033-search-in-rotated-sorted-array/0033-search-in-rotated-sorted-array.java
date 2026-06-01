class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int i;
        for (i = 0; i < n; i++) {
            if (nums[i] == target) {
                break;
            }
        }
        if (i >= 0 && i < n)
            return i;
        else
            return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna