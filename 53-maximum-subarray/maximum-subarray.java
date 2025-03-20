class Solution 
{
    public int maxSubArray(int[] nums) 
    {
        int mss = Integer.MIN_VALUE;
        int currsum = 0;
        for(int i=0 ; i<nums.length ; i++)
        {
            currsum = currsum+nums[i];
            mss = Math.max(mss , currsum);
            
            if(currsum<0)
            currsum = 0;
            
        }
        return mss;
    }
}