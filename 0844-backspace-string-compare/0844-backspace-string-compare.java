class Solution {
    public boolean backspaceCompare(String s, String t) {
        String sx="";
        String tx="";
        
        Stack<Character> st1= new Stack<>();
        for(int i=0; i< s.length(); i++){
            if(s.charAt(i)== '#' ){
                if(st1.empty()== false){
                    st1.pop();
                }
                
            }
            else{
                st1.push(s.charAt(i));
            }
        }
        Stack<Character> st2= new Stack<>();
        for(int i=0; i< t.length(); i++){
            if(t.charAt(i)== '#'){
                if(st2.empty()== false){
                    st2.pop();
                }
            }
            else{
                st2.push(t.charAt(i));
            }
        }
        
        if(st1.size() != st2.size()){
            return false;
        }
        while(st1.empty() == false){
            if(st1.pop()== st2.pop()){
                
            }
            else{
                return false;
            }
        }
        return true;
    }
}