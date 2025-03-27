class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
         Arrays.sort(arr);
        int n = arr.length;
        int minDiff = Integer.MAX_VALUE;

        List<List<Integer>> ans = new ArrayList<>();

       for(int i=1 ; i<= n-1; i++)
       {
             minDiff = Math.min(minDiff , arr[i]-arr[i-1]);
       }

       for (int i=1;i<=n-1;i++)
        {
            if( arr[i]-arr[i-1] == minDiff )
            {
                List<Integer> temp = new ArrayList<>();
                temp.add(arr[i-1]);
                temp.add(arr[i]);
                ans.add(temp);
            }        
        }
        return ans;   
    }
}