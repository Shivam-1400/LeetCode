class Solution {
    public int evalRPN(String[] tokens) {
        int ans= 0;
        Stack<Integer> st= new Stack<>();
        for(String a: tokens){
            if(a.equals("/") ||a.equals("*") ||a.equals("+")|| a.equals("-")){
                int b= st.pop();
                int c= st.pop();
                int res;
                if (a.equals("+")) {
                    res= c + b;
                    st.add(res);
                } else if (a.equals("-")) {
                    res= c - b;
                    st.add(res);
                } else if (a.equals("*")) {
                    res= c * b;
                    st.add(res);
                } else if (a.equals("/")) {
                    res= c / b;
                    st.add(res);
                }                
            }
            else{
                st.add(Integer.parseInt(a));
            }           
            
            // System.out.println(st);
        }
        
        
        return st.pop();
        
    }
}