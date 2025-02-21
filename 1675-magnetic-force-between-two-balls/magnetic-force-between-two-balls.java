class Solution {
    public int maxDistance(int[] position, int m) {
        
        int[] stalls = position.clone();
        int k = m;


    int low =0;
        int high = (int)1e9;
        int ans = -1;
        
        Arrays.sort(stalls);
        
        while (low<=high)
        {
            int mid = low + (high-low)/2; // hr cow k beech ka distance is mid
            
            if (isPossible(stalls ,k, mid))  //possible bhi h ya nhi mid distance pr rkhna   // mtlb ki -   is it possible to place all cows , separated by distance mid
            {
                ans = mid;  // agr possibleh toh ans hojayega mid
                low = mid+1; // but ek baar fir check krte h right side because humko distance ko maximise krna h    
            }
            else
            {
                high = mid-1;
            }
        }
        return ans;
    }
        
         static boolean isPossible(int[] stallsDuplicate, int k, int dis) // dis is the distance, jitni doori pr sari cows rahengi
        {
            
            int previousStallNumber = stallsDuplicate[0]; // here previousStallNumber means "pehli cow hamesha index 0 pr rahegi of stall sarray "
            int count = 1; // kyuki pehli cow toh pehle stall pr h hee
                // see, count mtlb ki the number of cows that are placed at VALID locations,
                
            
            
            for(int i=1;i<stallsDuplicate.length;i++) // i 1 se chl raha because pehle index r toh ek cow baithi hee h
            {
               if(stallsDuplicate[i] - previousStallNumber  >= dis)
               {
                    count++;
                    previousStallNumber = stallsDuplicate[i];  
               }
            }
         return count>=k;  //if count >= k, that means agr apn ne 5 cow rkhdi and total 3 k liye check krna tha , so its also valid as humko toh bas 3 cow rkhni thi but aagyi 5 cows, thats why we are returning true in this case  

            
        }
}