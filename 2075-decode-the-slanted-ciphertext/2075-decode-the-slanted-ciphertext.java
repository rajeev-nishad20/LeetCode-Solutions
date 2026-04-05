class Solution {
    public String decodeCiphertext(String encodedText, int rows) {

        if(rows == 1) return encodedText;

        int n = encodedText.length();
        int cols = n/rows;

        StringBuilder ans = new StringBuilder();
        
        for(int beginCol = 0; beginCol < cols; beginCol++){
            int i = 0, j = beginCol;

            while(i < rows && j < cols){
                ans.append(encodedText.charAt(i*cols + j));
                i++;
                j++;
            }
        }

        int end = ans.length()-1;

        while(end >= 0 && ans.charAt(end) == ' '){
            end--;
        }

        return ans.substring(0, end + 1);

        
    }
}