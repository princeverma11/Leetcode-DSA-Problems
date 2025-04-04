class Solution {
    public int findUnsortedSubarray(int[] nums) {
     int n= nums.length;

     int startindex =-1;
     int endindex =-1;

     for(int i=0 ; i<n-1 ; i++)
     {
        if(nums[i+1]<nums[i])
        {
             startindex =i;
             break; 
        }
     }

     if(startindex == -1) // if array is already sorted
     {
        return 0;
     }

     for(int i=n-1 ; i>0 ; i--)
     {
        if(nums[i-1]>nums[i])
        {
             endindex = i;
             break;
        }
     }

     int min = Integer.MAX_VALUE;
     int max = Integer.MIN_VALUE;
     for(int i = startindex ; i<=endindex ; i++)
     {
        min = Math.min(min , nums[i]);
        max = Math.max(max , nums[i]);

     }

     for(int i=0 ; i<startindex ; i++)
     {
        if(nums[i] > min)
        {
            startindex = i;
            break;
        }
     }

     for(int i=n-1 ; i>endindex ;i--)
     {
        if(nums[i]<max)
        {
            endindex = i;
            break;
        }
     }


    return endindex-startindex+1;
    }
}