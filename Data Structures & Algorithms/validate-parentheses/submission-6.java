class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack  = new Stack<>(); 
        if(s.length()==1 || s.isEmpty()) return false;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i); 
            
           if(ch=='(' || ch=='[' || ch=='{'){
            stack.push(ch); 
           }
 if(ch=='}' || ch==']'  || ch==')' ) {
    if(stack.isEmpty()){
        return false; 
    }else if((ch=='}' && stack.peek()=='{') || (ch==']' && stack.peek()=='[') || (ch==')' && stack.peek()=='(')) {
    stack.pop(); 
 }else{
    return false; 
 }

 }
                }
          
 return stack.isEmpty(); 
        }
    }
