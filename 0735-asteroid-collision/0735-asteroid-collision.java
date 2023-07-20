class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int n = asteroids.length;
        Deque<Integer> stk = new ArrayDeque<>();
        
        for (int i = 0; i < n; i++) {
            if (stk.isEmpty() || asteroids[i] > 0) {
                stk.push(asteroids[i]);
            } else {
                while (!stk.isEmpty() && stk.peek() > 0 && stk.peek() < Math.abs(asteroids[i])) {
                    stk.pop();
                }

                if (!stk.isEmpty() && stk.peek() == Math.abs(asteroids[i])) {
                    stk.pop();
                } else {
                    if (stk.isEmpty() || stk.peek() < 0) {
                        stk.push(asteroids[i]);
                    }
                } 
            }
        }
        
        int[] ans = new int[stk.size()];
        int size = stk.size();
        while (!stk.isEmpty()) {
            ans[--size] = stk.pop();
        }
        
        return ans;
    }
}

// class Solution {
//     public int[] asteroidCollision(int[] astr) {
//         Stack<Integer> st= new Stack<>();
        
//         int n= astr.length;
        
// //         for(int i=0; i< n; i++){
// //             int ax= asteroids[i];
            
// //         }
        
//         int i=0;
//         st.push(astr[i]);
//         i++;
//         while(i< n){
//             int top= st.pop();
//             int front= astr[i];
//             i++;
            
//             if(isSameSign(top, front)){
//                 st.push(top);
//                 st.push(front);
//             }
//             else{
//                 while(st.size()> 0 && ! isSameSign(top, front)){
//                     if(Math.abs(top)== Math.abs(front)){
//                         break;
//                     }
//                     else{
//                         st.push(getGreater(top, front));
//                         top= getGreater(top, front);
//                         front= astr[i];
//                         i++;
//                     }
//                 }
//                 st.push(top);
//             }
//         }
//         System.out.println(st);
//         return astr;
        
        
//     }
//     boolean isSameSign(int top, int front){
//         if((top >=0 && front>=0) && (top<0 && front<0)){
//             return true;
//         }
//         return false;
//     }
//     int getGreater(int a, int b){
//         if(Math.abs(a) > Math.abs(b)){
//             return a;
//         }
//         else if(Math.abs(a) < Math.abs(b)){
//             return b;
//         }
//         return a;
//     }
// }