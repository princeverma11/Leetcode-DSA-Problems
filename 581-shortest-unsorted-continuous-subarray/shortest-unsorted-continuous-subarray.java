class Solution {
    public int findUnsortedSubarray(int[] nums) {
     int n= nums.length;

     int startindex =-1;
     int endindex =-1;

    
    
    // Step 1: Find the starting index where the order breaks
     for(int i=0 ; i<n-1 ; i++)
     {
        if(nums[i+1]<nums[i])
        {
             startindex =i;
             break; // We only need the first break point
        }
     }


     // If no break point found, array is already sorted  
     if(startindex == -1) 
     {
        return 0;
     }
     

     // Step 2: Find the ending index where the order breaks
     for(int i=n-1 ; i>0 ; i--)
     {
        if(nums[i-1]>nums[i])
        {
             endindex = i;
             break;
        }
     }
     

     // Step 3: Find the min and max in the unsorted subarray we've identified
     int min = Integer.MAX_VALUE;
     int max = Integer.MIN_VALUE;
     for(int i = startindex ; i<=endindex ; i++)
     {
        min = Math.min(min , nums[i]);
        max = Math.max(max , nums[i]);

     }


     // Step 4: Expand the startindex to left if needed
     // Check if any element before startindex is greater than our mi
     for(int i=0 ; i<startindex ; i++)
     {
        if(nums[i] > min)
        {
            startindex = i; // Need to include this element in our subarray
            break;  // We only need the first such element
        }
     }
     

     // Step 5: Expand the endindex to right if needed
     // Check if any element after endindex is smaller than our ma
     for(int i=n-1 ; i>endindex ;i--)
     {
        if(nums[i]<max)
        {
            endindex = i; // Need to include this element in our subarray
            break; // We only need the first such element
        }
     }

     // Return the length of the unsorted subarray 
     return endindex-startindex+1;
    }
}