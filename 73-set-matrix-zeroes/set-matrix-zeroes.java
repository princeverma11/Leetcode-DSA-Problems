class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int col0 = matrix[0][0];
        for (int i=0 ; i<m ; i++)
        {
            for(int j = 0 ; j<n ; j++)
            {
                if(matrix[i][j] == 0)
                {
                    matrix[i][0] = 0;
                    if (j == 0)
                        col0 = 0;
                    else
                        matrix[0][j] = 0;
                }
            }
         }


            for(int i=1 ; i<m ; i++)
            {
                for (int j=1 ; j<n ;j++)
                {
                    if(matrix[i][0] == 0 || matrix[0][j] == 0)
                    {
                        matrix[i][j] = 0;
                    }
                }
            }
        
        
            //step 3: Finally mark the 1st col & then 1st row:
            if (matrix[0][0] == 0) 
            {
                for (int t = 1; t < n; t++) 
                {
                    matrix[0][t] = 0;
                }
            }

            if (col0 == 0) 
            {
                for (int l = 0; l < m; l++) 
                {
                    matrix[l][0] = 0;
                }
            }
        
    }
}