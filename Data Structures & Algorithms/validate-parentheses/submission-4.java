class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c: s.toCharArray()){
            if(isOpen(c)==true){
                stack.push(c);
            }
            else if(stack.isEmpty()!=true){
                if(validPair(stack.peek(),c)==true){
                    stack.pop();
                }
                else stack.push(c);
            }
            else stack.push(c);
        }
        if(stack.isEmpty()==true){
            return true;
        }
        else return false;

    }
    public boolean isOpen(char c){
        if(c=='('||c=='{'||c=='['){
            return true;
        }
        else return false;
    }
    public boolean validPair(char a, char b){
        if(a=='(' && b==')' || a=='{' && b=='}' || a=='[' && b==']' ){
            return true;
        }
        else return false;
    }
}
