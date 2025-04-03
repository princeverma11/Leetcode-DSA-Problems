class Solution {
    public int[][] generateMatrix(int n) {
        
        int[][] ans = new int[n][n];

        int flag = 1;

        int top = 0;
        int left = 0;
        int right = n-1;
        int bottom = n-1;

        while(top<=bottom && left<=right)
        {
            for(int i=left ; i<=right ; i++)
            {
                ans[top][i] = flag;
                flag++;
            }
            for(int i = top+1 ; i<=bottom ; i++)
            {
                ans[i][right] = flag;
                flag++;
            }
            for(int i= right-1 ; i>=left ; i--)
            {
                ans[bottom][i] = flag;
                flag++;
            }
            for(int i = bottom-1 ; i>=top+1 ; i--)
            {
                ans[i][left] = flag;
                flag++;
            }

            top++;
            right--;
            bottom--;
            left++;



        }
        return ans;
    }
}