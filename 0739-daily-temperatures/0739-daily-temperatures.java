class Solution {
//     public int[] dailyTemperatures(int[] temp) {
//         int n= temp.length;
//         int ans[]= new int[n];
        
//         ans[n-1]= 0;
//         int mx= temp[n-1];
//         // for(int i= n-1; i>=0; i--){
//         //     if(mx > temp[i]){
//         //         ans[i]= 1;
//         //         mx= temp[i];
//         //         cnt= ans[i+1]+1 ;
//         //     }
//         //     else{
//         //         mx= temp[i];
//         //         cnt= 1;
//         //         ans[i]= 0;
//         //     }
//         // }
//         for(int i=0; i< n-1; i++){
//             int cnt= 1;
//             int j= i+1;
//             while(j< n && temp[i]> temp[j]){
//                 j++;
//                 cnt++;
//             }
//             if(j< n && temp[j]> temp[i]){
//                 ans[i]= cnt;
//             }
//             else{
//                 ans[i]= 0;
//             }
//         }
//         ans[n-1]= 0;
//         return ans;
//     }
  
///----------------  
    public int[] dailyTemperatures(int[] temperatures) {
        Deque<Integer> deque = new ArrayDeque<>();
        
        int[] res = new int[temperatures.length];

        for (int i = temperatures.length - 1; i >= 0; --i) {
            if (deque.isEmpty()) {
                deque.offerFirst(i);
                res[i] = 0;
            } else {
                while (!deque.isEmpty() && temperatures[i] >= temperatures[deque.peekFirst()]) {
                    deque.pollFirst();
                }

                if (deque.isEmpty()) {
                    res[i] = 0;
                } else {
                    res[i] = deque.peekFirst() - i;
                }

                deque.offerFirst(i);
            }
        }

        return res;
    }
}
