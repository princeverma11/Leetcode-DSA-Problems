// notes page no. - 13
//dont reed any gfg just watch striver video - https://www.youtube.com/watch?v=bR7mQgwQ_o8
class Solution {
    public List<List<Integer>> generate(int numRows) {

        
        List<List<Integer>> ans = new ArrayList<>();
        // Create the first elem inner list and add 1 to it
        List<Integer> firstelem_innerList = new ArrayList<>();
        firstelem_innerList.add(1);
        ans.add(firstelem_innerList);




        // here we use < because numRows is not zero based indexing
        for (int row = 1; row < numRows; row++) 
        {
            ans.add(findRow(row)); // row is zero based indexing
        }
        return ans;
    }

    
    public List<Integer> findRow(int row)  
    {       
        long elem = 1; 
        List<Integer> tempList = new ArrayList<>();
        tempList.add(1);                               
        for(int col=1 ; col<=row; col++)// because row is zero based indexing
        {
            elem = elem * (row-col +1);
            elem = elem / col;

            tempList.add((int)elem);
        }
        return tempList;
    }
}