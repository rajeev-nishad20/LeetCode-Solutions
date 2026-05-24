class Solution {
    public int maxJumps(int[] arr, int d) {
        int max = 0;
        int n = arr.length;
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        for (int i = 0; i < n; i++) {
            max = Math.max(max, 1 + recurse(arr, d, i, dp));
        }
        return max;
    }
    private int recurse(int[] arr, int d, int pos, int dp[]) {
        if (dp[pos] != -1) {
            return dp[pos];
        }
        int n = arr.length;
        int val = arr[pos];
        int rtnVal = 0;
        for (int i = pos + 1; i <= pos + d && i < n; i++) {
            if (arr[i] < val) {
                rtnVal = Math.max(rtnVal, 1 + recurse(arr, d, i, dp));
            } else {
                // Cannot cross a higher point
                break;
            }
        }
        for (int i = pos - 1; i >= pos - d && i >= 0; i--) {
            if (arr[i] < val) {
                rtnVal = Math.max(rtnVal, 1 + recurse(arr, d, i, dp));
            } else {
                // Cannot cross a higher point
                break;
            }
        }
        dp[pos] = rtnVal;
        return rtnVal;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna