class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums , 0 , nums.length-1);
        return nums;
    }

    void mergeSort(int[] nums, int l , int h)
    {
        if(l<h)
        {
            int mid = l + (h-l)/2;
            // Sort first and second halves
            mergeSort(nums, l, mid);
            mergeSort(nums, mid+1, h);
        
            // Merge the sorted halves
            merge(nums, l, mid, h);
        }
       
    }


    // Merges two subarrays of nums[].
    // First subarray is nums[l..m]
    // Second subarray is nums[m+1..r]
    void merge(int[] nums, int l, int mid , int h)
    {
        // Find sizes of two subarrays to be merged
        int n1 = mid-l+1;
        int n2 = h-(mid+1)+1;

        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copy data to temp arrays
        for(int i=0;i<n1;i++)
        {
            L[i]=nums[l+i];
        }
        for(int i=0;i<n2;i++)
        {
            R[i]= nums[mid+1+i];
        }


        // Initial indices of first and second 
        int i = 0;
        int j = 0;
        int k = l; // Initial index of merged subarray array


        // Merge the temp arrays
        while(i<n1 && j<n2)
        {
            if(L[i]<=R[j])
            {
                nums[k] = L[i];
                i++;
            }else{
                nums[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of L[] if any
        while(i<n1)
        {
            nums[k] = L[i];
            i++;
            k++;
        }
        // Copy remaining elements of R[] if any
        while(j<n2)
        {
            nums[k] = R[j];
            j++;
            k++;
        }

    }
}