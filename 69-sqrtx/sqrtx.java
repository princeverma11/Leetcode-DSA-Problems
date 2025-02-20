class Solution {
    public int mySqrt(int x) {
        int l = 0;
        int r = x;
        int ans = -1;

        if (x == 0 || x == 1) {  // edge case handling
            return x;
        }

        while (l <= r) {
            int mid = l + (r - l) / 2;
            
             if (mid == x/mid) return mid;
            // Avoid overflow by using mid < x / mid instead of mid * mid <= x
            if (mid < x / mid) {
                ans = mid; // Update the answer
                l = mid + 1; // Search the right half
            } else {
                r = mid - 1; // Search the left half
            }
        }

        return ans;
    }
}