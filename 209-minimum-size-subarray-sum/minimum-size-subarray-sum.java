// this is sliding window technique

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        //preprocessing
        int sum = 0; 
        int[] cs = new int[nums.length];
        for(int i=0 ; i<nums.length ; i++)
        {
            sum = sum+nums[i];
            cs[i] = sum; 
        }

        int i = 0;
        int j = 0;
        int currentsum = 0;
        int minsum = Integer.MAX_VALUE;
        int minLength = Integer.MAX_VALUE;
        while(i<nums.length && j<nums.length )
        {
            currentsum = cs[j] - (i>0?cs[i-1]:0);
            
            if(currentsum >= target)
            {
                minsum = Math.min(minsum , currentsum);
                minLength = Math.min(minLength , j-i+1);
                if(i==j)j++;
                else i++;
            }
            if(currentsum< target)
            {
                j++;
            }
            
        }
        if(minLength == Integer.MAX_VALUE)
        {
            return 0;
        }
        else
        {
            return minLength;
        }
    }
}