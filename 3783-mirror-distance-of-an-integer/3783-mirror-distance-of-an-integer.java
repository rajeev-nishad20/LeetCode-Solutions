class Solution {
    public int mirrorDistance(int n) {

        int reverse = 0;
        int  t  = n;
        while(t != 0){

            int digit = t%10;
            reverse = 10*reverse + digit;
            t /= 10;      
        } 
        System.out.println(reverse);
        return Math.abs(n - reverse);    
    }
}