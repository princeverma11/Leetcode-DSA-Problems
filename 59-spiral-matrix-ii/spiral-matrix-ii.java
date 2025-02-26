class Solution {
    public int[][] generateMatrix(int n) {
        
        int[][] ans = new int[n][n];
        int top = 0;
        int right = n-1;
        int bottom = n-1;
        int left = 0;
        int index = 1;
        while(left<=right && top<=bottom)
        {
            for(int i=left ; i<=right ;i++)
            {
                ans[top][i] = index;
                index++;
            }
            top++;
            
            for(int i=top;i<=bottom ; i++)
            {
                ans[i][right] = index;
                index++;
            }
            right--;

            for(int i=right ; i>=left ; i--)
            {
                ans[bottom][i] = index;  
                index++;
            }
            bottom--;

            for(int i=bottom;i>=top;i--)
            {
                ans[i][left] = index;
                index++;
            }
            left++;


        }
        return ans;
    }
}