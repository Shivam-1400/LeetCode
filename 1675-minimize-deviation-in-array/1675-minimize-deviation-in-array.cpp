class Solution {
public:
    int minimumDeviation(vector<int>& nums) {
        priority_queue<int> pq;
        int mn = INT_MAX, res = INT_MAX;
        for (int num : nums) {
            if (num % 2 == 1) num *= 2;
            pq.push(num);
            mn = min(mn, num);
        }
        while (true) {
            int mx = pq.top(); pq.pop();
            res = min(res, mx - mn);
            if (mx % 2 == 1) break;
            pq.push(mx / 2);
            mn = min(mn, mx / 2);
        }
        return res;
    }
};
