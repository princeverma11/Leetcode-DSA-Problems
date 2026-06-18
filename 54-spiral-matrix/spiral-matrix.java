class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        int r = matrix.length;        // number of rows
        int c = matrix[0].length;     // number of columns (assumes at least 1 row)
        
        List<Integer> ans = new ArrayList<>();

        int L = 0;
        int R = c-1;
        int T = 0;
        int B = r-1;
        
        while(L<=R && T<=B)
        {
            for(int i=L ; i<=R ; i++)
            {
                ans.add(matrix[T][i]);
            }
            T++;
         
            for(int i=T ; i<=B ; i++)
            {
                ans.add(matrix[i][R]);
            }
            R--;
            
            if(T<=B)
            {
                for(int i = R; i>=L ;i--)
                {
                    ans.add(matrix[B][i]);
                }
                B--;
            }

            
            if(L<=R)
            {
                for(int i = B ; i>=T ; i--)
                {
                    ans.add(matrix[i][L]);
                }
                L++;
            }
            
            


        }

    
    
    return ans;
    }
}