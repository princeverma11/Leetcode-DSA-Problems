class Solution {
    public int[] sortArray(int[] nums) {
        int l = 0;
        int r = nums.length-1;

        mergeSort(nums , l , r);

        return nums;

        
        
    }

    void mergeSort(int[]nums , int l , int r)
    {
        if(l<r)
        {
            int m = l+(r-l)/2;
            mergeSort(nums , l , m);
            mergeSort(nums , m+1 , r);

            merge(nums , l , m , r);

        }
        
    }
    void merge(int[] nums , int l , int m , int r)
    {
        int Lsize = m-l+1;
        int Rsize = r-m;

        int[] L = new int[Lsize];
        int[] R = new int[Rsize];

        // copy data to L[].........IMP
        for (int i = 0; i < Lsize; i++) {
        L[i] = nums[l + i];//IMP
    }

        // copy data to R[]..........IMP
        for (int j = 0; j < Rsize; j++) {
        R[j] = nums[m + 1 + j];//IMP
    }
        

        //Yaha se neeche l , m , r ki nackchodi chhodod and sabse badiya apne Lsize and Rsize ko leke khelo , NO confusion and easy to use.

        int i = 0;
        int j = 0;
        int k = l;
        while(i < Lsize && j < Rsize) // bhot imp , NUJ ka logic mt dekho .... yeahi h sabse badiya condition
        {
            if(L[i]<=R[j])
            {
                nums[k] = L[i];
                k++;
                i++;
            }
            else
            {
                nums[k] = R[j];
                k++;
                j++;
            }
        }
        
        while(i < Lsize) // notice te condiiton , easy h
        {
            nums[k] = L[i];
            i++;
            k++;
        }
        while(j < Rsize) // notice the condiiton , easy h
        {
            nums[k] = R[j];
            j++;
            k++;
        }
    }

}