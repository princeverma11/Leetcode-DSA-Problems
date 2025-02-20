class Solution {
    public int search(int[] nums, int target) {
        int l=0;
        int r= nums.length-1;
        int k = target;

        while(l<=r)
        {
            int mid = l + (r-l)/2; 
            if(nums[mid]== k) return mid;

            if(nums[l]<=nums[mid]) //  if left side is sorted
            {
                if(nums[l]<=k && nums[mid]>k) //if k lies in left side of the array
                {
                    r=mid-1;
                }
                else //else k right side m lie krta h
                {
                    l = mid+1;
                }
            }
            else //right side is sorted
            {
                if(k<=nums[r] && nums[mid]<k) 
                {
                    l=mid+1;
                }
                else //else k right side m lie krta h
                {
                    r = mid-1;
                }

            }
        }
        return -1;

    }
}