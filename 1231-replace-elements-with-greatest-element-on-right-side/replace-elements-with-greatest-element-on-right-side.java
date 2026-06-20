class Solution {
    public int[] replaceElements(int[] arr) {
        
        int n = arr.length;
        int maxSoFar = -1;
        for(int i=n-2 ; i>=0 ; i--)
        {
            
            
            maxSoFar = Math.max(arr[i+1] , maxSoFar);
            int temp = arr[i]; 
            arr[i] = maxSoFar;
            maxSoFar = Math.max(temp , maxSoFar);
        }
        arr[n-1] = -1;

        return arr;
    }
}