class Solution {
    public int maxChunksToSorted(int[] arr) {
        int n = arr.length;
        int maxsofar = arr[0];
        int chunks=0;
        for(int i=0 ; i<n ; i++)
        {
            maxsofar = Math.max(maxsofar , arr[i]);
            if(maxsofar == i)
            chunks++;
        }
        return chunks;
    }
}