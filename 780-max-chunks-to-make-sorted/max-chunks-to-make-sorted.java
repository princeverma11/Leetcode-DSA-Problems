class Solution {
    public int maxChunksToSorted(int[] arr) {
        
        int n= arr.length;
        
        int totalchunks = 0;
        int maxi = arr[0];

        for(int i=0 ; i<n ; i++)
        {
            maxi = Math.max(maxi , arr[i]);
            if(maxi == i)
            {
                totalchunks++;
            }
        }
return totalchunks;
    
    }
}