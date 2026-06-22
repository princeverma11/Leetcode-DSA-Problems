class Solution {
    public int mySqrt(int x) {

        int l = 0;
        int r = x;
        int m = l+(r-l)/2;
        int ans = -1;

        if (x == 0 || x == 1) {  // edge case handling
            return x;
        }

        while(l<=r)
        {
            if(m == x/m)
            {
                return m;
            }
            if(m > x/m)
            {
                r = m-1;
                m = l+ (r-l)/2;
            }
            if(m < x/m)
            {
                ans = m;
                l = m+1;
                m = l+(r-l)/2;
                
            }
        }
        return ans;
    }
}