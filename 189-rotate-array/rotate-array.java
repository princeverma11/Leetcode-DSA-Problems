class Solution {
    public void rotate(int[] nums, int k) {
         int[] doublearr = new int[nums.length*2];
        
        for(int i=0 ; i<nums.length ; i++)
        {
            doublearr[i] = nums[i];
            doublearr[i+nums.length] = nums[i];
        }
        int realrotations = k%nums.length;

        int lr = nums.length - realrotations;
        
        for(int i=0 ; i<nums.length ; i++ )
        {
            nums[i] = doublearr[lr];
            lr++;
        }
    }
}