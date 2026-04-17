class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int width = height.length - 1;
        int right = width;

        int totalMaxWater = 0;

        while(left < right){
            int minHeight = Math.min(height[left], height[right]);

            int currWater = minHeight*width;
            totalMaxWater = Math.max(currWater, totalMaxWater);

            if(height[left] < height[right]) left++;
            else right--;

            width--;
        }

       return totalMaxWater;
        
    }
}