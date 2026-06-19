class Solution {
    public int largestAltitude(int[] gain) {
        int max = 0;
        int prev = 0;
        for(int i = 0; i < gain.length; i++){
            int val = gain[i]+prev;
            prev = val;
            max = Math.max(max,val);
        }
        return max;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna