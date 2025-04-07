//seegfg code , its good there - 
//link - https://www.geeksforgeeks.org/problems/overlapping-intervals--170633/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card



class Solution {
    public int[][] merge(int[][] intervals) {
        
                Arrays.sort(intervals, (a, b) -> {
            if (a[0] != b[0]) {
                return Integer.compare(a[0], b[0]);  // Compare first elements
            } else {
                return Integer.compare(a[1], b[1]);  // If first elements are equal, compare second
            }
        });

        // Use a list to store the merged intervals
        List<int[]> ans = new ArrayList<>();

        for (int i = 0; i < intervals.length; i++) {
            // If the list is empty or the current interval does not overlap with the last interval in the list
            if (ans.isEmpty() || ans.get(ans.size() - 1)[1] < intervals[i][0]) {
                // Add the current interval to the list
                ans.add(new int[]{intervals[i][0], intervals[i][1]});
            } else {
                // If there is an overlap, merge the intervals by updating the end value
                ans.get(ans.size() - 1)[1] = Math.max(ans.get(ans.size() - 1)[1], intervals[i][1]);
            }
        }

        // Convert the list to a 2D array
        return ans.toArray(new int[ans.size()][]);
    }
}