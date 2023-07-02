// class Solution {
//     int ans= 0;
//     void count(int i, int[][] req, int l, int[] temp){
//         if(i== req.length){
//             for(int x: temp){
//                 if(x !=0){
//                     return;
//                 }
//             }
//             ans= Math.max(l, ans);
//             return;
//         }
        
        
//         temp[req[i][0]]--;
//         temp[req[i][1]]++;
//         count(i+1, req, l, temp);
        
//         temp[req[i][0]]++;
//         temp[req[i][1]]--;
//         count(i+1, req, l+1, temp);
        
//     }
//     public int maximumRequests(int n, int[][] requests) {
//         int[] temp= new int[requests.length];
//         count(0, requests, 0, temp);
//         return ans;
//     }
// }

class Solution {
    int answer = 0;

    void maxRequest(int[][] requests, int[] indegree, int n, int index, int count) {
        if (index == requests.length) {
            // Check if all buildings have an in-degree of 0.
            for (int i = 0; i < n; i++) {
                if (indegree[i] != 0) {
                    return;
                }
            }
            
            answer = Math.max(answer, count);
            return;
        }
        
        // Consider this request, increment and decrement for the buildings involved.
        indegree[requests[index][0]]--;
        indegree[requests[index][1]]++;
        // Move on to the next request and also increment the count of requests.
        maxRequest(requests, indegree, n, index + 1, count + 1);
        // Backtrack to the previous values to move back to the original state before the second recursion.
        indegree[requests[index][0]]++;
        indegree[requests[index][1]]--;
        
        // Ignore this request and move on to the next request without incrementing the count.
        maxRequest(requests, indegree, n, index + 1, count);
    }
    
    public int maximumRequests(int n, int[][] requests) {
        int[] indegree = new int[n];
        maxRequest(requests, indegree, n, 0, 0);
        
        return answer;
    }
}
