class Solution {
    public int findUnsortedSubarray(int[] nums) {
        
        int[] arr = nums;
        int max_elem = Integer.MIN_VALUE;
        int min_elem = Integer.MAX_VALUE;
        int startIndex=0 ;
        int endIndex=0 ;
        int i=0;
        
        
        for( i=0 ; i<arr.length-1 ; i++)
        {
            if(arr[i]>arr[i+1])
            {
                startIndex = i;
                break;
            }
        }
        if(i == arr.length-1)
        {
           
            return 0;
        }
        
        for( i=arr.length-1 ; i>0 ; i--)
        {
            if(arr[i]<arr[i-1])
            {
                endIndex = i;
                break;
            }
        }
        
        for( i=startIndex ; i<=endIndex ; i++)
        {
            if(arr[i]<min_elem)
            {
                min_elem = arr[i];
            }
            if(arr[i]>max_elem)
            {
                max_elem = arr[i];
            }
        }
        
        for( i=0 ; i<startIndex ; i++)
        {
            if(arr[i]>min_elem)
            {
                startIndex = i;
                break;
            }
        }
        for( i=arr.length-1 ; i>endIndex ; i--)
        {
            if(arr[i]<max_elem)
            {
                endIndex = i;
                break;
            }
        }
        
        
        
        return endIndex-startIndex+1;
    }
}