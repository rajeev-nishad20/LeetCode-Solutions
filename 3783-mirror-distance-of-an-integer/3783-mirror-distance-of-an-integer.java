class Solution {
    public int mirrorDistance(int n) {

        if(n <= 9) return 0;
        
        StringBuilder  s = new StringBuilder(String.valueOf(n));
        int   reverseNum = Integer.parseInt(s.reverse().toString());
        return Math.abs(n - reverseNum);
        

    }
}