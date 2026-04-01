class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        List<List<Integer>> ans = new ArrayList<>();

        for(int i = 0 ; i<n-2 ; i++)
         {
            // Skip duplicate values for i
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            

            int l = i+1;
            int r = n-1;
            
            while(l<r)
            {
                List<Integer> temp = new ArrayList<>();
                if(nums[l] + nums[r] == -nums[i])
                {
                    
                    
                    temp.add(nums[i]);
                    temp.add(nums[l]);
                    temp.add(nums[r]); 

                    ans.add(temp);
                    
                    l++;
                    r--;
                    

                    while(l<r && nums[l] == nums[l-1])
                    {
                        l++;
                        continue;
                    }
                    while(r>l && nums[r] == nums[r+1])
                    {
                        r--;
                        continue;
                    }

                }
                else if(nums[l] + nums[r] < -nums[i])
                {
                    l++;
                }
                else
                {
                    r--;
                }
            
            }
        }

     return ans;
    }
     

}
