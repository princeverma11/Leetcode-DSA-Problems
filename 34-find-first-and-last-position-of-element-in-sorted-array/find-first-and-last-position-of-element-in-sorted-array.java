class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int[] arr = nums;
        int k = target;
        int[] ans = new int[2];

        int l = 0;
        int r = arr.length-1;
        int leftindex = -1;
        
        
        while(l<=r)
        {
            int mid = l + (r-l)/2;
            
            if(k == arr[mid])
            {
                leftindex = mid;
                r = mid-1;
            }
            else if(k < arr[mid])
            {
                r = mid-1;
            }
            else
            {
                l = mid+1;
            }
        }

        ans[0] = leftindex;
        


        l = 0;
        r = arr.length-1;
        int rightindex = -1;
        
        
        while(l<=r)
        {
            int mid = l + (r-l)/2;
            
            if(k == arr[mid])
            {
                rightindex = mid;
                l = mid+1;
            }
            else if(k < arr[mid])
            {
                r = mid-1;
            }
            else
            {
                l = mid+1;
            }
        }
        ans[1] = rightindex;






        if(rightindex == -1 && leftindex == -1)
       {
        return new int[]{-1, -1};
       }
       else return ans;
    }
}