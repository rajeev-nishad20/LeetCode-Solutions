class Solution {
    public int findMin(int[] nums) {
      int min = nums[0];
      int n = nums.length;
      int i = 0;
        while(i <= (n-1-i)){
        if(nums[i] < nums[n-1-i]){
                 min = Math.min(min,nums[i]);
            
        }
        else{
           min  = Math.min(nums[n-1-i],min) ;
        }
        i++;
      } 
      return min; 
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna