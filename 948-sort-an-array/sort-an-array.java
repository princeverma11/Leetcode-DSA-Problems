class Solution 
{
    public int[] sortArray(int[] nums) 
    {
        int l = 0 ;
        int r = nums.length-1;
        int[] arr = nums;

        mergeSort(arr , l , r);
        return arr;
        
      
    }

    public void mergeSort(int arr[], int l, int r) {
        // if length ie even the the right middle is choosen
        int m = l+(r-l+1)/2; // note that +1 is done here because anuj 
                             //goes from l to m-1 and m to r whiile calling merSort()
        if(l<r)
        {
            // Sort first and second halves
            mergeSort(arr, l, m-1);
            mergeSort(arr, m, r);
            // Merge the sorted halves
            merge(arr , l , m , r);
        }
    }
    public void merge(int[] arr, int l, int m, int r)
    {
        int Lsize = (m-1) - (l) +1;
        int Rsize = r-m+1;
        int[] L = new int[Lsize];
        int[] R = new int[Rsize];
        
        // Copy data to temp arrays
        for(int i=0; i<Lsize ; i++)
        {
            L[i] = arr[l+i];
        }
        for(int j=0; j<Rsize ; j++)
        {
            R[j] = arr[m+j];  
        }
        
        // Merge the temp arrays
        
        int i=0; //for left array
        int j=0; // for right array
        int k=l; // 'l' is the Initial index of merged subarray
        
        
        // Copy remaining elements of L[] if any
        while(i<Lsize && j<Rsize)
        {
            if(L[i]<R[j])
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        
        // Copy remaining elements of R[] if any
        while(i<Lsize)
        {
            arr[k] = L[i];
            i++;
            k++;
        }
        while(j<Rsize)
        {
            arr[k] = R[j];
            j++;
            k++;
        }
        
 
        
    }
    
}