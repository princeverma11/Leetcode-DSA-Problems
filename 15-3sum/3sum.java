class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int[] arr = nums;
        int n = arr.length;
        
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);

        for(int i=0 ; i<n-2; i++)
        {
            if(i>0 && arr[i] == arr[i-1])
                continue;
            
        int l = i+1;
        int r = n-1;

       

        while(l<r)
        {
           
            
            if(arr[l]+arr[r] == -arr[i])
            {
                List<Integer> temp = new ArrayList<>();
                temp.add(arr[i]);
                temp.add(arr[l]);
                temp.add(arr[r]);
                ans.add(temp);
                l++;
                r--;
                while(l<r && arr[l] == arr[l-1])
                {
                    l++;
                }
                while(l<r && arr[r] == arr[r+1])
                {
                    r--;
                }
            }
            
            if(arr[l]+arr[r]<-arr[i])
            {
                l++;
            }    
            if(arr[l]+arr[r]>-arr[i])
            {
                r--;
            }
            
        
        }
    }
    return ans;

    }
}