class Solution {
    public boolean canReach(int[] arr, int start) {
        if (arr[start] == 0) return true;
        final int l = start - arr[start], r = start + arr[start];
        arr[start] = -1;
        if (l >= 0 && arr[l] != -1 && canReach(arr, l)) {
            return true;
        }
        if (r < arr.length && arr[r] != -1 && canReach(arr, r)) {
            return true;
        }
       return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna