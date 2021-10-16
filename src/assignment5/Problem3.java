package assignment5;

import java.util.Stack;

public class Problem3 {



    /**
     * Time Complexity : O(n)
     * Space Complexity : O(n)
     */
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        for(char c: s.toCharArray()){
            if(c=='('){
                stack.push(')');
            }else if(c=='{'){
                stack.push('}');
            }
            else if(c=='['){
                stack.push(']');
            }
            else{
                if(stack.isEmpty()|| stack.pop()!=c)
                    return false;
            }
        }
        return stack.isEmpty();
    }

}
