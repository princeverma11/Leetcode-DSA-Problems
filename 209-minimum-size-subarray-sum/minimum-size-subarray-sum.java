class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0;
        int r=0;
        int currsum = 0;
        int minLength = Integer.MAX_VALUE;
        
        

        while(r<nums.length)
        {
            currsum = currsum + nums[r];
           
            while(currsum>=target)
            {
                 minLength = Math.min(minLength, r-l+1);
                currsum = currsum - nums[l];
                l++;
            } 
            r++;
        }

         if(minLength == Integer.MAX_VALUE) {
            minLength = 0;
        }
       

        return minLength;


    }
}

// class Solution {
//     public int minSubArrayLen(int target, int[] nums) {
        
//         //preprocessing
//         int sum = 0; 
//         int[] cs = new int[nums.length];
//         for(int i=0 ; i<nums.length ; i++)
//         {
//             sum = sum+nums[i];
//             cs[i] = sum; 
//         }

//         int i = 0;
//         int j = 0;
//         int currentsum = 0;
//         int minsum = Integer.MAX_VALUE;
//         int minLength = Integer.MAX_VALUE;
//         while(i<nums.length && j<nums.length )
//         {
//             currentsum = cs[j] - (i>0?cs[i-1]:0);
            
//             if(currentsum >= target)
//             {
//                 minsum = Math.min(minsum , currentsum);
//                 minLength = Math.min(minLength , j-i+1);
//                 if(i==j)j++;
//                 else i++;
//             }
//             if(currentsum< target)
//             {
//                 j++;
//             }
            
//         }
//         if(minLength == Integer.MAX_VALUE)
//         {
//             return 0;
//         }
//         else
//         {
//             return minLength;
//         }
//     }
// }