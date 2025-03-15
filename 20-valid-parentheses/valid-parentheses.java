class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
       
       for(int i=0 ; i<s.length() ; i++)
       {
           char curr = s.charAt(i);
           if(curr == '(' || curr == '{' || curr == '[')
           {
               stack.push(curr);
           }
           else
           {
               if(stack.isEmpty()) return false;
               
               char opening = stack.pop();
               if((opening == '(' && curr == ')') || (opening == '{' && curr == '}') || (opening == '[' && curr == ']'))
               {
                   continue;
               }
               else return false;
               
           }
       }
       return stack.isEmpty();
    }
}