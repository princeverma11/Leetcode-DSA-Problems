class Solution {
    public int mySqrt(int x) {
       int l = 0;
       int r = x;
       int ans = -1;
       if (x == 0 || x == 1) {  // edge case handling
            return x;
        }
       while(l<=r)
       {
        int mid = l + (r-l)/2;

        
        if(mid == x/mid)
        {
            return mid;
        }
        if(mid > x/mid)
        {
            r = mid-1;
        }

        if(mid < x/mid)
        {
            ans = mid;
            l = mid+1;
        }
       }
       
       return ans;
       
    }
}