// class Solution {
//     public String minRemoveToMakeValid(String s) {
//         Stack<Character> st= new Stack<>();
//         List<Character> ls= new ArrayList<>();
//         for(char x: s.toCharArray()){
//             if(x=='(' || x==')'){
//                 ls.add(x);
//             }
//         }
//         Stack<Character> valid= new Stack<>();
//         for(char x: ls){
//             if(x=='('){
//                 st.add(x);
//             }
//             else if(x==')'){
//                 if(st.size()> 0){
//                     char top= st.peek();
//                     if(top=='('){
//                         valid.add(st.peek());
//                         valid.add(x);
//                         st.pop();
//                     }
//                     else{                        
//                         st.add(x);
//                     }
//                 }
//                 else{
//                     st.add(x);
//                 }
//             }
//         }
//         Stack<Character> rev= new Stack<>();
//         while(valid.size()> 0){
//             rev.add(valid.pop());
//         }
//         st= rev;
//         System.out.println(st);
//         String ans="";
//         for(char x: s.toCharArray()){
//             if(x=='(' || x==')'){
//                 System.out.println(x+" "+ st.peek());
//                 if(st.size()> 0 && x== st.peek()){
//                     st.pop();
//                     ans+= x;
//                 }              
//             }
//             else{
//                 ans+= x;
//             }
//         }
        
//         return ans;   
//     }
// }

class Solution {
    public String minRemoveToMakeValid(String s) {
       StringBuilder result = new StringBuilder(s);
        int openCount = 0;
        int removeCount = 0;

        // First pass: remove invalid closing parentheses and count unmatched opening parentheses
        for (int i = 0; i < result.length(); i++) {
            char c = result.charAt(i);
            if (c == '(') {
                openCount++;
            } else if (c == ')' && openCount == 0) {
                result.setCharAt(i, '*'); // Mark invalid closing parenthesis for removal
                removeCount++;
            } else if (c == ')') {
                openCount--;
            }
        }

        // Second pass: remove extra unmatched opening parentheses if any
        int index = result.length() - 1;
        while (openCount > 0 && index >= 0) {
            if (result.charAt(index) == '(') {
                result.setCharAt(index, '*');
                openCount--;
                removeCount++;
            }
            index--;
        }

        // Remove marked characters from the StringBuilder
        int j = 0;
        for (int i = 0; i < result.length(); i++) {
            if (result.charAt(i) != '*') {
                result.setCharAt(j++, result.charAt(i));
            }
        }
        result.setLength(result.length() - removeCount); // Adjust the length of the StringBuilder

        return result.toString();
    }
}