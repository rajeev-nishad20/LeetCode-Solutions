class Solution {
    public boolean canPartitionGrid(int[][] grid) {

        int n = grid.length;
        int m = grid[0].length;

        long totalSum = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                totalSum += grid[i][j];
            }
        }

        if(totalSum % 2 != 0) return false;

        long target = totalSum / 2;

        long currSum = 0;

        for(int i = 0; i < n-1; i++){
            long rowSum = 0;
            for(int j = 0; j < m; j++){
                rowSum += grid[i][j];
            }
            currSum += rowSum;
            if(currSum == target) return true;
        }

        currSum = 0;
        for(int j = 0; j < m-1; j++){
            long colSum = 0;
            for(int i = 0; i < n; i++){
                colSum += grid[i][j];
            }
            currSum += colSum;
            if(currSum == target) return true;
        }


        return false;

        
    }
}