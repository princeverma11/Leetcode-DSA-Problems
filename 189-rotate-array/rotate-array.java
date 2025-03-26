
class Solution {
    public void rotate(int[] nums, int k) 
    {
        int[] arr = nums;
        int[] temp = new int[2*arr.length];
        int n= arr.length;

        
        // so now net_rotations will be always <= arr.length
        int net_right_rotations = k % arr.length;  

        int lr = n - net_right_rotations; // lr = left_rotaioons
        
        // below is code for doing left rotations
         for (int i = 0; i <= n - 1; i++) {
            temp[i] = arr[i];
            temp[i + arr.length] = arr[i];
        }
        

           
        
        for( int i=0 ; i<arr.length ; i++)
        {
            arr[i] = temp[i+lr];   
        }
            
        
        
    }
        
    }
