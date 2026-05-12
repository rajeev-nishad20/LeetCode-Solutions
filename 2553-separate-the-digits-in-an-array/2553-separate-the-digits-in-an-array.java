class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        
        int idx = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < 10){
                list.add(nums[i]);
                
            }
            else{
                String numStr = String.valueOf(nums[i]);
                for (char c : numStr.toCharArray()) {
                   int digit = c - '0';
                   list.add(digit);
                }
                
            }
        }
        int[] arr = list.stream().mapToInt(Integer::intValue).toArray();
        return arr;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna