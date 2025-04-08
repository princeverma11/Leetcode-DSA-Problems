class Solution {
    public void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int k = -1;

        for(int i = 0 ; i<rows ; i++)
        {
            if(matrix[i][0] == 0)
            {
                k=0;
                //matrix[i][0] = 0; // this is already zero;
            } 
        }

        for(int i =0 ; i<rows ; i++)
        {
            for(int j=1 ; j<columns; j++)
            {
                if(matrix[i][j] == 0)
                {
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }



        //doing zeroes except the row zero and column zero;
        for(int i=1 ; i<rows ; i++)
        {
            for(int j=1 ; j<columns ; j++)
            {
                if(matrix[0][j] == 0 || matrix[i][0] == 0)
                {
                    matrix[i][j] = 0;
                }
            }
        }

        //doing zeroes for the row zero
       for(int j = 0 ; j<columns ; j++)
       {
        if(matrix[0][j] == 0 || matrix[0][0] == 0)
        {
            matrix[0][j] = 0;
        }
       }

        //doing zeroes for the column zero
        for(int i=0 ; i<rows ; i++)
        {
            if(matrix[i][0] == 0 || k==0) 
            {
                matrix[i][0] = 0;
            }
        }

    }
}